import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwv extends cwc implements czl {
   public static final MapCodec<cwv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.e.q().fieldOf("turns_into").forGetter(cwv::b),
               kd.b.q().fieldOf("brush_sound").forGetter(cwv::c),
               kd.b.q().fieldOf("brush_comleted_sound").forGetter(cwv::d),
               u()
            )
            .apply($$0, cwv::new)
   );
   private static final dkh c = djx.bv;
   public static final int b = 2;
   private final cwq d;
   private final arr e;
   private final arr f;

   @Override
   public MapCodec<cwv> a() {
      return a;
   }

   public cwv(cwq $$0, arr $$1, arr $$2, djg.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.c_($$2) instanceof dgz $$4) {
         $$4.c();
      }

      if (czm.h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbt $$5 = cbt.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, cbt $$2) {
      elt $$3 = $$2.cH().f();
      $$0.c(2001, hx.a($$3), cwq.i($$2.u()));
      $$0.a($$2, dnr.f, $$3);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (czm.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jp(jx.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgz($$0, $$1);
   }

   public cwq b() {
      return this.d;
   }

   public arr c() {
      return this.e;
   }

   public arr d() {
      return this.f;
   }
}
