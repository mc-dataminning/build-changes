import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class daf extends czm implements dcv {
   public static final MapCodec<daf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ki.e.q().fieldOf("turns_into").forGetter(daf::b),
               ki.b.q().fieldOf("brush_sound").forGetter(daf::c),
               ki.b.q().fieldOf("brush_comleted_sound").forGetter(daf::d),
               u()
            )
            .apply($$0, daf::new)
   );
   private static final dnz c = dnp.bv;
   public static final int b = 2;
   private final daa d;
   private final atx e;
   private final atx f;

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public daf(daa $$0, atx $$1, atx $$2, dmy.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }

   @Override
   public dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   public void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.c_($$2) instanceof dkk $$4) {
         $$4.b();
      }

      if (dcw.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cfc $$5 = cfc.a($$1, $$2, $$0);
         $$5.r();
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, cfc $$2) {
      epr $$3 = $$2.cH().f();
      $$0.c(2001, ib.a($$3), daa.i($$2.s()));
      $$0.a($$2, drn.f, $$3);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (dcw.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ju(kc.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkk($$0, $$1);
   }

   public daa b() {
      return this.d;
   }

   public atx c() {
      return this.e;
   }

   public atx d() {
      return this.f;
   }
}
