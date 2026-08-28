import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dpm extends dno implements duz {
   public static final ech a = dti.b;
   public static final ech b = dti.c;
   public static final ech c = dti.d;
   public static final ech d = dti.e;
   public static final ech e = ecg.I;
   public static final Map<jc, ech> f = dti.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ag.a());
   private final Function<ebq, fgw> g;
   private final Function<ebq, fgw> h;

   protected dpm(float $$0, float $$1, float $$2, float $$3, float $$4, ebp.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dpm> a();

   protected Function<ebq, fgw> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      fgw $$5 = dno.b((double)$$0, 0.0, (double)$$1);
      Map<jc, fgw> $$6 = fgt.c(dno.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         fgw $$3x = $$5;

         for (Entry<jc, ech> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fgt.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ect[]{e});
   }

   @Override
   protected boolean e_(ebq $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(e) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
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
   protected ebq a(ebq $$0, dsr $$1) {
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
