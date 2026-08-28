import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record daj(int d, boolean e) implements day {
   private static final Codec<daj> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(daj::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(daj::b)).apply($$0, daj::new)
   );
   public static final Codec<daj> a = Codec.withAlternative(f, Codec.INT, $$0 -> new daj($$0, true));
   public static final yt<ByteBuf, daj> b = yt.a(yr.g, daj::a, yr.b, daj::b, daj::new);
   public static final int c = -6265536;

   public static int a(cxy $$0, int $$1) {
      daj $$2 = $$0.a(kx.K);
      return $$2 != null ? axu.f($$2.a()) : $$1;
   }

   public static cxy a(cxy $$0, List<cww> $$1) {
      if (!$$0.a(axi.bO)) {
         return cxy.k;
      } else {
         cxy $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         daj $$8 = $$2.a(kx.K);
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

         for (cww $$12 : $$1) {
            int $$13 = $$12.b().d();
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
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kx.K, new daj($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(wv.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(wv.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public daj a(boolean $$0) {
      return new daj(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
