import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwo extends cvv implements cze {
   public static final MapCodec<cwo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.e.q().fieldOf("turns_into").forGetter(cwo::b),
               kd.b.q().fieldOf("brush_sound").forGetter(cwo::c),
               kd.b.q().fieldOf("brush_comleted_sound").forGetter(cwo::d),
               u()
            )
            .apply($$0, cwo::new)
   );
   private static final dka c = djq.bv;
   public static final int b = 2;
   private final cwj d;
   private final arl e;
   private final arl f;

   @Override
   public MapCodec<cwo> a() {
      return a;
   }

   public cwo(cwj $$0, arl $$1, arl $$2, diz.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.c_($$2) instanceof dgs $$4) {
         $$4.c();
      }

      if (czf.h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbn $$5 = cbn.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cti $$0, hx $$1, cbn $$2) {
      elm $$3 = $$2.cH().f();
      $$0.c(2001, hx.a($$3), cwj.i($$2.u()));
      $$0.a($$2, dnk.f, $$3);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (czf.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jp(jx.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgs($$0, $$1);
   }

   public cwj b() {
      return this.d;
   }

   public arl c() {
      return this.e;
   }

   public arl d() {
      return this.f;
   }
}
