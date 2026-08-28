import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djv extends dfh implements dmi {
   public static final MapCodec<djv> a = b(djv::new);
   public static final int b = 15;
   public static final dtk c = dta.aP;
   public static final dtb d = dta.C;
   public static final ToIntFunction<dsk> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (!$$1.B && $$3.gw()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqg.a;
      } else {
         return bqg.c;
      }
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return $$3.a(cuf.hC) ? ewv.b() : ewv.a();
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.a;
   }

   @Override
   protected float d(dsk $$0, dbl $$1, ja $$2) {
      return 1.0F;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(d) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cuc a(cuc $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kn.ab, cwm.a.a(c, $$1));
      }

      return $$0;
   }
}
