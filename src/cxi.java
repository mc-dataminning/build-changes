import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cxi(int d, boolean e) implements cxw {
   private static final Codec<cxi> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cxi::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxi::b)).apply($$0, cxi::new)
   );
   public static final Codec<cxi> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cxi($$0, true));
   public static final yw<ByteBuf, cxi> b = yw.a(yu.f, cxi::a, yu.b, cxi::b, cxi::new);
   public static final int c = -6265536;

   public static int a(cuo $$0, int $$1) {
      cxi $$2 = $$0.a(kq.z);
      return $$2 != null ? axx.b.e($$2.a()) : $$1;
   }

   public static cuo a(cuo $$0, List<cth> $$1) {
      if (!$$0.a(awm.bx)) {
         return cuo.l;
      } else {
         cuo $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cxi $$8 = $$2.a(kq.z);
         if ($$8 != null) {
            int $$9 = axx.b.b($$8.a());
            int $$10 = axx.b.c($$8.a());
            int $$11 = axx.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cth $$12 : $$1) {
            int $$13 = $$12.c().d();
            int $$14 = axx.b.b($$13);
            int $$15 = axx.b.c($$13);
            int $$16 = axx.b.d($$13);
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
         int $$22 = axx.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kq.z, new cxi($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cuj.b $$0, Consumer<wy> $$1, cwk $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(wy.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(wy.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cxi a(boolean $$0) {
      return new cxi(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
