import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cyd(int d, boolean e) implements cyr {
   private static final Codec<cyd> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cyd::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyd::b)).apply($$0, cyd::new)
   );
   public static final Codec<cyd> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cyd($$0, true));
   public static final zb<ByteBuf, cyd> b = zb.a(yz.f, cyd::a, yz.b, cyd::b, cyd::new);
   public static final int c = -6265536;

   public static int a(cvl $$0, int $$1) {
      cyd $$2 = $$0.a(kr.B);
      return $$2 != null ? axn.f($$2.a()) : $$1;
   }

   public static cvl a(cvl $$0, List<cuf> $$1) {
      if (!$$0.a(axb.bD)) {
         return cvl.k;
      } else {
         cvl $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cyd $$8 = $$2.a(kr.B);
         if ($$8 != null) {
            int $$9 = axn.b($$8.a());
            int $$10 = axn.c($$8.a());
            int $$11 = axn.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cuf $$12 : $$1) {
            int $$13 = $$12.c().d();
            int $$14 = axn.b($$13);
            int $$15 = axn.c($$13);
            int $$16 = axn.d($$13);
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
         int $$22 = axn.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kr.B, new cyd($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cvg.b $$0, Consumer<xd> $$1, cxf $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xd.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xd.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cyd a(boolean $$0) {
      return new cyd(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
