import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dne extends dfh {
   public static final MapCodec<dne> a = b(dne::new);
   private static final wu d = wu.c("container.stonecutter");
   public static final dte b = djd.aE;
   protected static final ewy c = dfh.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.ay);
         return bqg.c;
      }
   }

   @Nullable
   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return new bqq(($$2x, $$3, $$4) -> new crj($$2x, $$3, cpt.a($$1, $$2)), d);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
