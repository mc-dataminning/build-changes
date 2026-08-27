import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cyt extends cya implements dbj {
   public static final MapCodec<cyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.e.q().fieldOf("turns_into").forGetter(cyt::b),
               kf.b.q().fieldOf("brush_sound").forGetter(cyt::c),
               kf.b.q().fieldOf("brush_comleted_sound").forGetter(cyt::d),
               u()
            )
            .apply($$0, cyt::new)
   );
   private static final dmf c = dlv.bv;
   public static final int b = 2;
   private final cyo d;
   private final atj e;
   private final atj f;

   @Override
   public MapCodec<cyt> a() {
      return a;
   }

   public cyt(cyo $$0, atj $$1, atj $$2, dle.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   public det b_(dlf $$0) {
      return det.c;
   }

   @Override
   public void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.c_($$2) instanceof dix $$4) {
         $$4.c();
      }

      if (dbk.m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cdr $$5 = cdr.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, cdr $$2) {
      ens $$3 = $$2.cH().f();
      $$0.c(2001, hz.a($$3), cyo.i($$2.u()));
      $$0.a($$2, dpp.f, $$3);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$3.a(16) == 0) {
         hz $$4 = $$2.d();
         if (dbk.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jr(jz.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dix($$0, $$1);
   }

   public cyo b() {
      return this.d;
   }

   public atj c() {
      return this.e;
   }

   public atj d() {
      return this.f;
   }
}
