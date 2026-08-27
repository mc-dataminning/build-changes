import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cuf(int d, boolean e) implements cus {
   private static final Codec<cuf> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cuf::a), awu.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cuf::b)).apply($$0, cuf::new)
   );
   public static final Codec<cuf> a = awu.a(f, Codec.INT, $$0 -> new cuf($$0, true));
   public static final yg<ByteBuf, cuf> b = yg.a(ye.e, cuf::a, ye.b, cuf::b, cuf::new);
   public static final int c = -6265536;

   public static int a(crs $$0, int $$1) {
      cuf $$2 = $$0.a(jr.q);
      return $$2 != null ? aww.b.e($$2.a()) : $$1;
   }

   public static crs a(crs $$0, List<cqm> $$1) {
      if (!$$0.a(avm.ba)) {
         return crs.i;
      } else {
         crs $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cuf $$8 = $$2.a(jr.q);
         if ($$8 != null) {
            int $$9 = aww.b.b($$8.a());
            int $$10 = aww.b.c($$8.a());
            int $$11 = aww.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (cqm $$12 : $$1) {
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
         int $$22 = aww.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(jr.q, new cuf($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(Consumer<wi> $$0, cti $$1) {
      if (this.e) {
         if ($$1.a()) {
            $$0.accept(wi.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$0.accept(wi.c("item.dyed").a(n.h, n.u));
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
