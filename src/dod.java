import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dod extends djn implements dqt {
   public static final MapCodec<dod> a = b(dod::new);
   public static final int b = 15;
   public static final dxx c = dxo.aS;
   public static final dxp d = dxo.J;
   public static final ToIntFunction<dwy> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsl.b;
      } else {
         return bsl.c;
      }
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$3.a(cwu.hZ) ? fbs.b() : fbs.a();
   }

   @Override
   protected boolean e_(dwy $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }

   @Override
   protected float c(dwy $$0, dfo $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(d) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cwq a(cwq $$0, int $$1) {
      $$0.b(kv.am, cys.a.a(c, $$1));
      return $$0;
   }
}
