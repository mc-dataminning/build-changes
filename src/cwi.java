import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cwi(int d, boolean e) implements cww {
   private static final Codec<cwi> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cwi::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwi::b)).apply($$0, cwi::new)
   );
   public static final Codec<cwi> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cwi($$0, true));
   public static final yv<ByteBuf, cwi> b = yv.a(yt.e, cwi::a, yt.b, cwi::b, cwi::new);
   public static final int c = -6265536;

   public static int a(ctq $$0, int $$1) {
      cwi $$2 = $$0.a(kb.y);
      return $$2 != null ? axp.b.e($$2.a()) : $$1;
   }

   public static ctq a(ctq $$0, List<csk> $$1) {
      if (!$$0.a(awf.bz)) {
         return ctq.i;
      } else {
         ctq $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cwi $$8 = $$2.a(kb.y);
         if ($$8 != null) {
            int $$9 = axp.b.b($$8.a());
            int $$10 = axp.b.c($$8.a());
            int $$11 = axp.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (csk $$12 : $$1) {
            float[] $$13 = $$12.c().d();
            int $$14 = (int)($$13[0] * 255.0F);
            int $$15 = (int)($$13[1] * 255.0F);
            int $$16 = (int)($$13[2] * 255.0F);
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
         int $$22 = axp.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kb.y, new cwi($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(Consumer<wx> $$0, cvj $$1) {
      if (this.e) {
         if ($$1.a()) {
            $$0.accept(wx.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$0.accept(wx.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cwi a(boolean $$0) {
      return new cwi(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
