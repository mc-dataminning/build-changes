import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwu extends cwb implements czk {
   public static final MapCodec<cwu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.e.q().fieldOf("turns_into").forGetter(cwu::b),
               kd.b.q().fieldOf("brush_sound").forGetter(cwu::c),
               kd.b.q().fieldOf("brush_comleted_sound").forGetter(cwu::d),
               u()
            )
            .apply($$0, cwu::new)
   );
   private static final dkg c = djw.bv;
   public static final int b = 2;
   private final cwp d;
   private final arq e;
   private final arq f;

   @Override
   public MapCodec<cwu> a() {
      return a;
   }

   public cwu(cwp $$0, arq $$1, arq $$2, djf.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.c_($$2) instanceof dgy $$4) {
         $$4.c();
      }

      if (czl.h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbs $$5 = cbs.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cto $$0, hx $$1, cbs $$2) {
      els $$3 = $$2.cH().f();
      $$0.c(2001, hx.a($$3), cwp.i($$2.u()));
      $$0.a($$2, dnq.f, $$3);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (czl.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jp(jx.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgy($$0, $$1);
   }

   public cwp b() {
      return this.d;
   }

   public arq c() {
      return this.e;
   }

   public arq d() {
      return this.f;
   }
}
