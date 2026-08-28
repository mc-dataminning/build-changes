import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cxc(int d, boolean e) implements cxq {
   private static final Codec<cxc> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cxc::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxc::b)).apply($$0, cxc::new)
   );
   public static final Codec<cxc> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cxc($$0, true));
   public static final zj<ByteBuf, cxc> b = zj.a(zh.f, cxc::a, zh.b, cxc::b, cxc::new);
   public static final int c = -6265536;

   public static int a(cuk $$0, int $$1) {
      cxc $$2 = $$0.a(km.y);
      return $$2 != null ? aye.b.e($$2.a()) : $$1;
   }

   public static cuk a(cuk $$0, List<cte> $$1) {
      if (!$$0.a(awu.by)) {
         return cuk.l;
      } else {
         cuk $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cxc $$8 = $$2.a(km.y);
         if ($$8 != null) {
            int $$9 = aye.b.b($$8.a());
            int $$10 = aye.b.c($$8.a());
            int $$11 = aye.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cte $$12 : $$1) {
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
         int $$22 = aye.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(km.y, new cxc($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cuf.b $$0, Consumer<xl> $$1, cwd $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xl.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xl.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cxc a(boolean $$0) {
      return new cxc(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
