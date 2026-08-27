import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dah extends czo implements dcx {
   public static final MapCodec<dah> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ki.e.q().fieldOf("turns_into").forGetter(dah::b),
               ki.b.q().fieldOf("brush_sound").forGetter(dah::c),
               ki.b.q().fieldOf("brush_comleted_sound").forGetter(dah::d),
               u()
            )
            .apply($$0, dah::new)
   );
   private static final dob c = dnr.bv;
   public static final int b = 2;
   private final dac d;
   private final atx e;
   private final atx f;

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public dah(dac $$0, atx $$1, atx $$2, dna.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   public dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   public void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.c_($$2) instanceof dkm $$4) {
         $$4.b();
      }

      if (dcy.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cfd $$5 = cfd.a($$1, $$2, $$0);
         $$5.r();
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, cfd $$2) {
      ept $$3 = $$2.cH().f();
      $$0.c(2001, ib.a($$3), dac.i($$2.s()));
      $$0.a($$2, drp.f, $$3);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (dcy.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ju(kc.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkm($$0, $$1);
   }

   public dac b() {
      return this.d;
   }

   public atx c() {
      return this.e;
   }

   public atx d() {
      return this.f;
   }
}
