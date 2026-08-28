import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record dbx(int d) implements dcp {
   public static final Codec<dbx> a = ayu.i.xmap(dbx::new, dbx::a);
   public static final yw<ByteBuf, dbx> b = yw.a(yu.g, dbx::a, dbx::new);
   public static final int c = -6265536;

   public static int a(czk $$0, int $$1) {
      dbx $$2 = $$0.a(kk.K);
      return $$2 != null ? axw.f($$2.a()) : $$1;
   }

   public static czk a(czk $$0, List<cyj> $$1) {
      if (!$$0.a(axk.bP)) {
         return czk.k;
      } else {
         czk $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         dbx $$8 = $$2.a(kk.K);
         if ($$8 != null) {
            int $$9 = axw.b($$8.a());
            int $$10 = axw.c($$8.a());
            int $$11 = axw.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cyj $$12 : $$1) {
            int $$13 = $$12.a().d();
            int $$14 = axw.b($$13);
            int $$15 = axw.c($$13);
            int $$16 = axw.d($$13);
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
         int $$22 = axw.a(0, $$17, $$18, $$19);
         $$2.b(kk.K, new dbx($$22));
         return $$2;
      }
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      if ($$2.a()) {
         $$1.accept(wy.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(o.h));
      } else {
         $$1.accept(wy.c("item.dyed").a(o.h, o.u));
      }
   }

   public int a() {
      return this.d;
   }
}
