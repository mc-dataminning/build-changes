import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record czy(int d, boolean e) implements dan {
   private static final Codec<czy> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(czy::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czy::b)).apply($$0, czy::new)
   );
   public static final Codec<czy> a = Codec.withAlternative(f, Codec.INT, $$0 -> new czy($$0, true));
   public static final zt<ByteBuf, czy> b = zt.a(zr.g, czy::a, zr.b, czy::b, czy::new);
   public static final int c = -6265536;

   public static int a(cxk $$0, int $$1) {
      czy $$2 = $$0.a(ku.J);
      return $$2 != null ? ayp.f($$2.a()) : $$1;
   }

   public static cxk a(cxk $$0, List<cwi> $$1) {
      if (!$$0.a(ayd.bR)) {
         return cxk.k;
      } else {
         cxk $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         czy $$8 = $$2.a(ku.J);
         if ($$8 != null) {
            int $$9 = ayp.b($$8.a());
            int $$10 = ayp.c($$8.a());
            int $$11 = ayp.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cwi $$12 : $$1) {
            int $$13 = $$12.b().d();
            int $$14 = ayp.b($$13);
            int $$15 = ayp.c($$13);
            int $$16 = ayp.d($$13);
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
         int $$22 = ayp.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(ku.J, new czy($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xv.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xv.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public czy a(boolean $$0) {
      return new czy(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
