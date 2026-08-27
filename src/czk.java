import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class czk extends cyr implements dca {
   public static final MapCodec<czk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kh.e.q().fieldOf("turns_into").forGetter(czk::b),
               kh.b.q().fieldOf("brush_sound").forGetter(czk::c),
               kh.b.q().fieldOf("brush_comleted_sound").forGetter(czk::d),
               u()
            )
            .apply($$0, czk::new)
   );
   private static final dne c = dmu.bv;
   public static final int b = 2;
   private final czf d;
   private final ato e;
   private final ato f;

   @Override
   public MapCodec<czk> a() {
      return a;
   }

   public czk(czf $$0, ato $$1, ato $$2, dmd.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }

   @Override
   public dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   public void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.c_($$2) instanceof djp $$4) {
         $$4.b();
      }

      if (dcb.m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cek $$5 = cek.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, cek $$2) {
      eov $$3 = $$2.cE().f();
      $$0.c(2001, ib.a($$3), czf.i($$2.u()));
      $$0.a($$2, dqr.f, $$3);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (dcb.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jt(kb.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new djp($$0, $$1);
   }

   public czf b() {
      return this.d;
   }

   public ato c() {
      return this.e;
   }

   public ato d() {
      return this.f;
   }
}
