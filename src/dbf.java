import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record dbf(int d) implements dbx {
   public static final Codec<dbf> a = ays.i.xmap(dbf::new, dbf::a);
   public static final yu<ByteBuf, dbf> b = yu.a(ys.g, dbf::a, dbf::new);
   public static final int c = -6265536;

   public static int a(cys $$0, int $$1) {
      dbf $$2 = $$0.a(kj.K);
      return $$2 != null ? axu.f($$2.a()) : $$1;
   }

   public static cys a(cys $$0, List<cxr> $$1) {
      if (!$$0.a(axi.bO)) {
         return cys.k;
      } else {
         cys $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         dbf $$8 = $$2.a(kj.K);
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

         for (cxr $$12 : $$1) {
            int $$13 = $$12.a().d();
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
         $$2.b(kj.K, new dbf($$22));
         return $$2;
      }
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      if ($$2.a()) {
         $$1.accept(ww.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
      } else {
         $$1.accept(ww.c("item.dyed").a(n.h, n.u));
      }
   }

   public int a() {
      return this.d;
   }
}
