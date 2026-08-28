import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dou extends dkl implements drp {
   public static final MapCodec<dou> a = b(dou::new);
   public static final dyl b = dyk.j;
   public static final dyl c = dyk.D;
   protected static final fcr d = fco.a(dkl.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dkl.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fcr e = fco.a(dkl.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dkl.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());

      for (jm $$2 : $$0.f()) {
         if ($$2.o() == jm.a.b) {
            dxu $$3 = this.m().b(b, Boolean.valueOf($$2 == jm.b));
            if ($$3.a((dhk)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jm $$3 = o($$0).g();
      return dkl.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jm o(dxu $$0) {
      return $$0.c(b) ? jm.a : jm.b;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
