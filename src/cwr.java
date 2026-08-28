import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cwr(int d, boolean e) implements cxf {
   private static final Codec<cwr> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cwr::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwr::b)).apply($$0, cwr::new)
   );
   public static final Codec<cwr> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cwr($$0, true));
   public static final ys<ByteBuf, cwr> b = ys.a(yq.f, cwr::a, yq.b, cwr::b, cwr::new);
   public static final int c = -6265536;

   public static int a(cua $$0, int $$1) {
      cwr $$2 = $$0.a(kn.z);
      return $$2 != null ? axo.b.e($$2.a()) : $$1;
   }

   public static cua a(cua $$0, List<csu> $$1) {
      if (!$$0.a(awd.by)) {
         return cua.l;
      } else {
         cua $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cwr $$8 = $$2.a(kn.z);
         if ($$8 != null) {
            int $$9 = axo.b.b($$8.a());
            int $$10 = axo.b.c($$8.a());
            int $$11 = axo.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (csu $$12 : $$1) {
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
         int $$22 = axo.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kn.z, new cwr($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(ctv.b $$0, Consumer<wu> $$1, cvt $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(wu.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(wu.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cwr a(boolean $$0) {
      return new cwr(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
