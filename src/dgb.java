import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgb extends dfi implements dir {
   public static final MapCodec<dgb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lt.e.r().fieldOf("turns_into").forGetter(dgb::b),
               lt.b.r().fieldOf("brush_sound").forGetter(dgb::c),
               lt.b.r().fieldOf("brush_comleted_sound").forGetter(dgb::d),
               u()
            )
            .apply($$0, dgb::new)
   );
   private static final dua c = dtq.bv;
   public static final int b = 2;
   private final dfw d;
   private final avn e;
   private final avn f;

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(dfw $$0, avn $$1, avn $$2, dsz.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }

   @Override
   public dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   public void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.c_($$2) instanceof dqj $$4) {
         $$4.b();
      }

      if (dis.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cje $$5 = cje.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dcu $$0, jd $$1, cje $$2) {
      eww $$3 = $$2.cL().f();
      $$0.c(2001, jd.a((jw)$$3), dfw.i($$2.t()));
      $$0.a($$2, dxw.f, $$3);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$3.a(16) == 0) {
         jd $$4 = $$2.d();
         if (dis.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new le(lm.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqj($$0, $$1);
   }

   public dfw b() {
      return this.d;
   }

   public avn c() {
      return this.e;
   }

   public avn d() {
      return this.f;
   }
}
