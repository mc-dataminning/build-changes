import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cxg(int d, boolean e) implements cxu {
   private static final Codec<cxg> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cxg::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxg::b)).apply($$0, cxg::new)
   );
   public static final Codec<cxg> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cxg($$0, true));
   public static final zm<ByteBuf, cxg> b = zm.a(zk.f, cxg::a, zk.b, cxg::b, cxg::new);
   public static final int c = -6265536;

   public static int a(cuo $$0, int $$1) {
      cxg $$2 = $$0.a(km.z);
      return $$2 != null ? ayi.b.e($$2.a()) : $$1;
   }

   public static cuo a(cuo $$0, List<cti> $$1) {
      if (!$$0.a(awx.by)) {
         return cuo.l;
      } else {
         cuo $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cxg $$8 = $$2.a(km.z);
         if ($$8 != null) {
            int $$9 = ayi.b.b($$8.a());
            int $$10 = ayi.b.c($$8.a());
            int $$11 = ayi.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cti $$12 : $$1) {
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
         int $$22 = ayi.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(km.z, new cxg($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cuj.b $$0, Consumer<xo> $$1, cwh $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(xo.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(xo.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cxg a(boolean $$0) {
      return new cxg(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
