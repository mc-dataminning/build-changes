import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dov extends dkm implements drq {
   public static final MapCodec<dov> a = b(dov::new);
   public static final dym b = dyl.j;
   public static final dym c = dyl.D;
   protected static final fcs d = fcp.a(dkm.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dkm.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fcs e = fcp.a(dkm.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dkm.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   public dov(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());

      for (jm $$2 : $$0.f()) {
         if ($$2.o() == jm.a.b) {
            dxv $$3 = this.m().b(b, Boolean.valueOf($$2 == jm.b));
            if ($$3.a((dhl)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == ety.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jm $$3 = o($$0).g();
      return dkm.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jm o(dxv $$0) {
      return $$0.c(b) ? jm.a : jm.b;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(c) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
