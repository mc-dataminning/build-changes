import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cyj(int d, boolean e) implements cyy {
   private static final Codec<cyj> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cyj::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyj::b)).apply($$0, cyj::new)
   );
   public static final Codec<cyj> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cyj($$0, true));
   public static final zf<ByteBuf, cyj> b = zf.a(zd.g, cyj::a, zd.b, cyj::b, cyj::new);
   public static final int c = -6265536;

   public static int a(cvx $$0, int $$1) {
      cyj $$2 = $$0.a(kt.I);
      return $$2 != null ? axu.f($$2.a()) : $$1;
   }

   public static cvx a(cvx $$0, List<cuv> $$1) {
      if (!$$0.a(axi.bM)) {
         return cvx.k;
      } else {
         cvx $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cyj $$8 = $$2.a(kt.I);
         if ($$8 != null) {
            int $$9 = axu.b($$8.a());
            int $$10 = axu.c($$8.a());
            int $$11 = axu.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cuv $$12 : $$1) {
            int $$13 = $$12.c().d();
            int $$14 = axu.b($$13);
            int $$15 = axu.c($$13);
            int $$16 = axu.d($$13);
            $$6 += Math.max($$14, Math.max($$15, $$16));
            $$3 += $$14;
            $$4 += $$15;
            $$5 += $$16;
            $$7++;
         }

         int $$17 = $$3 / $$7;
         int $$18 = $$4 / $$7;
         int $$19 = $$5 / $$7;
         float $$20 = (float)$$6 / (float)$$7;
         float $$21 = (float)Math.max($$17, Math.max($$18, $$19));
         $$17 = (int)((float)$$17 * $$20 / $$21);
         $$18 = (int)((float)$$18 * $$20 / $$21);
         $$19 = (int)((float)$$19 * $$20 / $$21);
         int $$22 = axu.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kt.I, new cyj($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xh.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xh.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cyj a(boolean $$0) {
      return new cyj(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
