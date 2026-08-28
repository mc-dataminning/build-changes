import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cza(int d, boolean e) implements czp {
   private static final Codec<cza> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cza::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cza::b)).apply($$0, cza::new)
   );
   public static final Codec<cza> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cza($$0, true));
   public static final zh<ByteBuf, cza> b = zh.a(zf.g, cza::a, zf.b, cza::b, cza::new);
   public static final int c = -6265536;

   public static int a(cwm $$0, int $$1) {
      cza $$2 = $$0.a(ku.J);
      return $$2 != null ? axx.f($$2.a()) : $$1;
   }

   public static cwm a(cwm $$0, List<cvk> $$1) {
      if (!$$0.a(axl.bQ)) {
         return cwm.k;
      } else {
         cwm $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cza $$8 = $$2.a(ku.J);
         if ($$8 != null) {
            int $$9 = axx.b($$8.a());
            int $$10 = axx.c($$8.a());
            int $$11 = axx.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cvk $$12 : $$1) {
            int $$13 = $$12.b().d();
            int $$14 = axx.b($$13);
            int $$15 = axx.c($$13);
            int $$16 = axx.d($$13);
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
         int $$22 = axx.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(ku.J, new cza($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xj.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xj.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cza a(boolean $$0) {
      return new cza(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
