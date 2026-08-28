import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dpa extends dnc implements dun {
   public static final ebv a = dsw.b;
   public static final ebv b = dsw.c;
   public static final ebv c = dsw.d;
   public static final ebv d = dsw.e;
   public static final ebv e = ebu.I;
   public static final Map<jb, ebv> f = dsw.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ag.a());
   private final Function<ebe, fgk> g;
   private final Function<ebe, fgk> h;

   protected dpa(float $$0, float $$1, float $$2, float $$3, float $$4, ebd.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dpa> a();

   protected Function<ebe, fgk> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      fgk $$5 = dnc.b((double)$$0, 0.0, (double)$$1);
      Map<jb, fgk> $$6 = fgh.c(dnc.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         fgk $$3x = $$5;

         for (Entry<jb, ebv> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fgh.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ech[]{e});
   }

   @Override
   protected boolean e_(ebe $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(e) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
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
   protected ebe a(ebe $$0, dsf $$1) {
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
