import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dpc extends dne implements dup {
   public static final ebx a = dsy.b;
   public static final ebx b = dsy.c;
   public static final ebx c = dsy.d;
   public static final ebx d = dsy.e;
   public static final ebx e = ebw.I;
   public static final Map<jc, ebx> f = dsy.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ag.a());
   private final Function<ebg, fgm> g;
   private final Function<ebg, fgm> h;

   protected dpc(float $$0, float $$1, float $$2, float $$3, float $$4, ebf.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dpc> a();

   protected Function<ebg, fgm> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      fgm $$5 = dne.b((double)$$0, 0.0, (double)$$1);
      Map<jc, fgm> $$6 = fgj.c(dne.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         fgm $$3x = $$5;

         for (Entry<jc, ebx> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fgj.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ecj[]{e});
   }

   @Override
   protected boolean e_(ebg $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(e) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
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
   protected ebg a(ebg $$0, dsh $$1) {
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
