import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cxj(int d, boolean e) implements cxx {
   private static final Codec<cxj> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cxj::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxj::b)).apply($$0, cxj::new)
   );
   public static final Codec<cxj> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cxj($$0, true));
   public static final zn<ByteBuf, cxj> b = zn.a(zl.f, cxj::a, zl.b, cxj::b, cxj::new);
   public static final int c = -6265536;

   public static int a(cur $$0, int $$1) {
      cxj $$2 = $$0.a(km.z);
      return $$2 != null ? ayj.b.e($$2.a()) : $$1;
   }

   public static cur a(cur $$0, List<ctl> $$1) {
      if (!$$0.a(awy.by)) {
         return cur.l;
      } else {
         cur $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cxj $$8 = $$2.a(km.z);
         if ($$8 != null) {
            int $$9 = ayj.b.b($$8.a());
            int $$10 = ayj.b.c($$8.a());
            int $$11 = ayj.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (ctl $$12 : $$1) {
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
         int $$22 = ayj.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(km.z, new cxj($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cum.b $$0, Consumer<xp> $$1, cwk $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xp.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xp.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cxj a(boolean $$0) {
      return new cxj(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
