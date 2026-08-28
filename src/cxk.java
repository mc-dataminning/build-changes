import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cxk(int d, boolean e) implements cxy {
   private static final Codec<cxk> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cxk::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxk::b)).apply($$0, cxk::new)
   );
   public static final Codec<cxk> a = Codec.withAlternative(f, Codec.INT, $$0 -> new cxk($$0, true));
   public static final yx<ByteBuf, cxk> b = yx.a(yv.f, cxk::a, yv.b, cxk::b, cxk::new);
   public static final int c = -6265536;

   public static int a(cuq $$0, int $$1) {
      cxk $$2 = $$0.a(kq.z);
      return $$2 != null ? axy.b.e($$2.a()) : $$1;
   }

   public static cuq a(cuq $$0, List<ctj> $$1) {
      if (!$$0.a(awn.bx)) {
         return cuq.l;
      } else {
         cuq $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cxk $$8 = $$2.a(kq.z);
         if ($$8 != null) {
            int $$9 = axy.b.b($$8.a());
            int $$10 = axy.b.c($$8.a());
            int $$11 = axy.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (ctj $$12 : $$1) {
            int $$13 = $$12.c().d();
            int $$14 = axy.b.b($$13);
            int $$15 = axy.b.c($$13);
            int $$16 = axy.b.d($$13);
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
         int $$22 = axy.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(kq.z, new cxk($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(cul.b $$0, Consumer<wz> $$1, cwm $$2) {
      if (this.e) {
         if ($$2.a()) {
            $$1.accept(wz.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$1.accept(wz.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cxk a(boolean $$0) {
      return new cxk(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
