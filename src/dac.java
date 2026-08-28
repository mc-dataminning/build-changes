import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record dac(int d, boolean e) implements dar {
   private static final Codec<dac> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(dac::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(dac::b)).apply($$0, dac::new)
   );
   public static final Codec<dac> a = Codec.withAlternative(f, Codec.INT, $$0 -> new dac($$0, true));
   public static final zt<ByteBuf, dac> b = zt.a(zr.g, dac::a, zr.b, dac::b, dac::new);
   public static final int c = -6265536;

   public static int a(cxo $$0, int $$1) {
      dac $$2 = $$0.a(ku.J);
      return $$2 != null ? ayp.f($$2.a()) : $$1;
   }

   public static cxo a(cxo $$0, List<cwm> $$1) {
      if (!$$0.a(ayd.bR)) {
         return cxo.k;
      } else {
         cxo $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         dac $$8 = $$2.a(ku.J);
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

         for (cwm $$12 : $$1) {
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
         $$2.b(ku.J, new dac($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xv.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xv.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public dac a(boolean $$0) {
      return new dac(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
