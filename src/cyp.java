import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cyp(int d, boolean e) implements cze {
   private static final Codec<cyp> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cyp::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyp::b)).apply($$0, cyp::new)
   );
   public static final Codec<cyp> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cyp($$0, true));
   public static final zg<ByteBuf, cyp> b = zg.a(ze.g, cyp::a, ze.b, cyp::b, cyp::new);
   public static final int c = -6265536;

   public static int a(cwb $$0, int $$1) {
      cyp $$2 = $$0.a(ku.J);
      return $$2 != null ? axv.f($$2.a()) : $$1;
   }

   public static cwb a(cwb $$0, List<cuz> $$1) {
      if (!$$0.a(axj.bP)) {
         return cwb.k;
      } else {
         cwb $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cyp $$8 = $$2.a(ku.J);
         if ($$8 != null) {
            int $$9 = axv.b($$8.a());
            int $$10 = axv.c($$8.a());
            int $$11 = axv.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cuz $$12 : $$1) {
            int $$13 = $$12.b().d();
            int $$14 = axv.b($$13);
            int $$15 = axv.c($$13);
            int $$16 = axv.d($$13);
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
         int $$22 = axv.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(ku.J, new cyp($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xi.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xi.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cyp a(boolean $$0) {
      return new cyp(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
