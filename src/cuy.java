import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cuy extends cuf implements cxn {
   public static final MapCodec<cuy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.f.q().fieldOf("turns_into").forGetter(cuy::b),
               jy.c.q().fieldOf("brush_sound").forGetter(cuy::c),
               jy.c.q().fieldOf("brush_comleted_sound").forGetter(cuy::d),
               t()
            )
            .apply($$0, cuy::new)
   );
   private static final dhw c = dhm.bv;
   public static final int b = 2;
   private final cut d;
   private final aqm e;
   private final aqm f;

   @Override
   public MapCodec<cuy> a() {
      return a;
   }

   public cuy(cut $$0, aqm $$1, aqm $$2, dgv.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.c_($$2) instanceof dev $$4) {
         $$4.c();
      }

      if (cxo.h($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cae $$5 = cae.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(crs $$0, ht $$1, cae $$2) {
      eji $$3 = $$2.cG().f();
      $$0.c(2001, ht.a($$3), cut.i($$2.t()));
      $$0.a($$2, dlg.f, $$3);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$3.a(16) == 0) {
         ht $$4 = $$2.d();
         if (cxo.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jk(js.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dev($$0, $$1);
   }

   public cut b() {
      return this.d;
   }

   public aqm c() {
      return this.e;
   }

   public aqm d() {
      return this.f;
   }
}
