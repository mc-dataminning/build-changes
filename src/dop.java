import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dop extends dmr implements duc {
   public static final ebk a = dsl.b;
   public static final ebk b = dsl.c;
   public static final ebk c = dsl.d;
   public static final ebk d = dsl.e;
   public static final ebk e = ebj.I;
   public static final Map<jb, ebk> f = dsl.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ag.a());
   private final Function<eat, ffw> g;
   private final Function<eat, ffw> h;

   protected dop(float $$0, float $$1, float $$2, float $$3, float $$4, eas.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dop> a();

   protected Function<eat, ffw> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      ffw $$5 = dmr.b((double)$$0, 0.0, (double)$$1);
      Map<jb, ffw> $$6 = fft.c(dmr.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         ffw $$3x = $$5;

         for (Entry<jb, ebk> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fft.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ebw[]{e});
   }

   @Override
   protected boolean e_(eat $$0) {
      return !$$0.c(e);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(e) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      switch ($$1) {
         case c:
            return $$0.b(a, $$0.c(c)).b(b, $$0.c(d)).b(c, $$0.c(a)).b(d, $$0.c(b));
         case d:
            return $$0.b(a, $$0.c(b)).b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(a));
         case b:
            return $$0.b(a, $$0.c(d)).b(b, $$0.c(a)).b(c, $$0.c(b)).b(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      switch ($$1) {
         case b:
            return $$0.b(a, $$0.c(c)).b(c, $$0.c(a));
         case c:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
