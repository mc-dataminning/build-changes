import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record cvp(int d, boolean e) implements cwd {
   private static final Codec<cvp> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("rgb").forGetter(cvp::a), axh.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cvp::b)).apply($$0, cvp::new)
   );
   public static final Codec<cvp> a = axh.a(f, Codec.INT, $$0 -> new cvp($$0, true));
   public static final ys<ByteBuf, cvp> b = ys.a(yq.e, cvp::a, yq.b, cvp::b, cvp::new);
   public static final int c = -6265536;

   public static int a(csz $$0, int $$1) {
      cvp $$2 = $$0.a(ka.x);
      return $$2 != null ? axj.b.e($$2.a()) : $$1;
   }

   public static csz a(csz $$0, List<crt> $$1) {
      if (!$$0.a(avz.bz)) {
         return csz.i;
      } else {
         csz $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         cvp $$8 = $$2.a(ka.x);
         if ($$8 != null) {
            int $$9 = axj.b.b($$8.a());
            int $$10 = axj.b.c($$8.a());
            int $$11 = axj.b.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (crt $$12 : $$1) {
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
         int $$22 = axj.b.a(0, $$17, $$18, $$19);
         boolean $$23 = $$8 == null || $$8.b();
         $$2.b(ka.x, new cvp($$22, $$23));
         return $$2;
      }
   }

   @Override
   public void a(Consumer<wu> $$0, cuq $$1) {
      if (this.e) {
         if ($$1.a()) {
            $$0.accept(wu.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(n.h));
         } else {
            $$0.accept(wu.c("item.dyed").a(n.h, n.u));
         }
      }
   }

   public cvp a(boolean $$0) {
      return new cvp(this.d, $$0);
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }
}
