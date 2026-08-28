import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dkm extends dfy implements dna {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final int b = 15;
   public static final duc c = dts.aP;
   public static final dtt d = dts.C;
   public static final ToIntFunction<dtc> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if (!$$1.B && $$3.gv()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqr.a;
      } else {
         return bqr.c;
      }
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return $$3.a(cut.hC) ? exs.b() : exs.a();
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return $$0.u().c();
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.a;
   }

   @Override
   protected float d(dtc $$0, dcc $$1, jd $$2) {
      return 1.0F;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(d) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cuq a(cuq $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kq.ac, cxd.a.a(c, $$1));
      }

      return $$0;
   }
}
