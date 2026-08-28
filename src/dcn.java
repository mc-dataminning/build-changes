import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record dcn(int d) implements ddf {
   public static final Codec<dcn> a = ayy.i.xmap(dcn::new, dcn::a);
   public static final za<ByteBuf, dcn> b = za.a(yy.g, dcn::a, dcn::new);
   public static final int c = -6265536;

   public static int a(daa $$0, int $$1) {
      dcn $$2 = $$0.a(kl.K);
      return $$2 != null ? aya.f($$2.a()) : $$1;
   }

   public static daa a(daa $$0, List<cyz> $$1) {
      if (!$$0.a(axo.bQ)) {
         return daa.k;
      } else {
         daa $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         dcn $$8 = $$2.a(kl.K);
         if ($$8 != null) {
            int $$9 = aya.b($$8.a());
            int $$10 = aya.c($$8.a());
            int $$11 = aya.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cyz $$12 : $$1) {
            int $$13 = $$12.a().d();
            int $$14 = aya.b($$13);
            int $$15 = aya.c($$13);
            int $$16 = aya.d($$13);
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
         int $$22 = aya.a(0, $$17, $$18, $$19);
         $$2.b(kl.K, new dcn($$22));
         return $$2;
      }
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      if ($$2.a()) {
         $$1.accept(xc.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(o.h));
      } else {
         $$1.accept(xc.c("item.dyed").a(o.h, o.u));
      }
   }

   public int a() {
      return this.d;
   }
}
