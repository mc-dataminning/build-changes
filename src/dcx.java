import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record dcx(int d) implements ddp {
   public static final Codec<dcx> a = azg.i.xmap(dcx::new, dcx::a);
   public static final ze<ByteBuf, dcx> b = ze.a(zc.g, dcx::a, dcx::new);
   public static final int c = -6265536;

   public static int a(dak $$0, int $$1) {
      dcx $$2 = $$0.a(kl.K);
      return $$2 != null ? ayh.f($$2.a()) : $$1;
   }

   public static dak a(dak $$0, List<czj> $$1) {
      if (!$$0.a(axv.bQ)) {
         return dak.l;
      } else {
         dak $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         dcx $$8 = $$2.a(kl.K);
         if ($$8 != null) {
            int $$9 = ayh.b($$8.a());
            int $$10 = ayh.c($$8.a());
            int $$11 = ayh.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (czj $$12 : $$1) {
            int $$13 = $$12.a().d();
            int $$14 = ayh.b($$13);
            int $$15 = ayh.c($$13);
            int $$16 = ayh.d($$13);
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
         int $$22 = ayh.a(0, $$17, $$18, $$19);
         $$2.b(kl.K, new dcx($$22));
         return $$2;
      }
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      if ($$2.a()) {
         $$1.accept(xg.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(o.h));
      } else {
         $$1.accept(xg.c("item.dyed").a(o.h, o.u));
      }
   }

   public int a() {
      return this.d;
   }
}
