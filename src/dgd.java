import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgd extends dfk implements dit {
   public static final MapCodec<dgd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lt.e.r().fieldOf("turns_into").forGetter(dgd::b),
               lt.b.r().fieldOf("brush_sound").forGetter(dgd::c),
               lt.b.r().fieldOf("brush_comleted_sound").forGetter(dgd::d),
               u()
            )
            .apply($$0, dgd::new)
   );
   private static final duc c = dts.bv;
   public static final int b = 2;
   private final dfy d;
   private final avo e;
   private final avo f;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dfy $$0, avo $$1, avo $$2, dtb.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   public void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.c_($$2) instanceof dql $$4) {
         $$4.b();
      }

      if (diu.m($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         cjg $$5 = cjg.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dcw $$0, jd $$1, cjg $$2) {
      exc $$3 = $$2.cK().f();
      $$0.c(2001, jd.a((jw)$$3), dfy.i($$2.t()));
      $$0.a($$2, dxz.f, $$3);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$3.a(16) == 0) {
         jd $$4 = $$2.e();
         if (diu.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new le(lm.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dql($$0, $$1);
   }

   public dfy b() {
      return this.d;
   }

   public avo c() {
      return this.e;
   }

   public avo d() {
      return this.f;
   }
}
