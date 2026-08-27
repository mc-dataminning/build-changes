import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cut(int d, boolean e) implements cvg {
   private static final Codec<cut> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cut::a), axe.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cut::b)).apply($$0, cut::new)
   );
   public static final Codec<cut> a = axe.a(f, Codec.INT, $$0 -> new cut($$0, true));
   public static final yq<ByteBuf, cut> b = yq.a(yo.e, cut::a, yo.b, cut::b, cut::new);
   public static final int c = -6265536;

   public static int a(csd $$0, int $$1) {
      cut $$2 = $$0.a(jz.q);
      return $$2 != null ? axg.b.e($$2.a()) : $$1;
   }

   public static csd a(csd $$0, List<cqx> $$1) {
      if (!$$0.a(avw.ba)) {
         return csd.i;
      } else {
         csd $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cut $$8 = $$2.a(jz.q);
         if ($$8 != null) {
            int $$9 = axg.b.b($$8.a());
            int $$10 = axg.b.c($$8.a());
            int $$11 = axg.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cqx $$12 : $$1) {
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
         int $$22 = axg.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(jz.q, new cut($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(Consumer<ws> $$0, ctu $$1) {
      if (this.e) {
         if ($$1.a()) {
            $$0.accept(ws.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$0.accept(ws.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
