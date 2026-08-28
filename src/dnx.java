import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dnx extends dma implements dtj {
   public static final eaq a = drt.b;
   public static final eaq b = drt.c;
   public static final eaq c = drt.d;
   public static final eaq d = drt.e;
   public static final eaq e = eap.I;
   public static final Map<ja, eaq> f = drt.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   private final Function<dzz, ffc> g;
   private final Function<dzz, ffc> h;

   protected dnx(float $$0, float $$1, float $$2, float $$3, float $$4, dzy.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dnx> a();

   protected Function<dzz, ffc> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      ffc $$5 = dma.b((double)$$0, 0.0, (double)$$1);
      Map<ja, ffc> $$6 = fez.c(dma.a((double)$$2, (double)$$3, (double)$$4, 0.0, 8.0));
      return this.a($$2x -> {
         ffc $$3x = $$5;

         for (Entry<ja, eaq> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fez.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new ebc[]{e});
   }

   @Override
   protected boolean e_(dzz $$0) {
      return !$$0.c(e);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(e) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
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
   protected dzz a(dzz $$0, drc $$1) {
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
