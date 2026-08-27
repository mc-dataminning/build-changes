import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwe extends cvl implements cyu {
   public static final MapCodec<cwe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.e.q().fieldOf("turns_into").forGetter(cwe::b),
               kb.b.q().fieldOf("brush_sound").forGetter(cwe::c),
               kb.b.q().fieldOf("brush_comleted_sound").forGetter(cwe::d),
               u()
            )
            .apply($$0, cwe::new)
   );
   private static final djp c = djf.bv;
   public static final int b = 2;
   private final cvz d;
   private final arb e;
   private final arb f;

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   public cwe(cvz $$0, arb $$1, arb $$2, dio.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.c_($$2) instanceof dgh $$4) {
         $$4.c();
      }

      if (cyv.h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cbd $$5 = cbd.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(csy $$0, hv $$1, cbd $$2) {
      elb $$3 = $$2.cH().f();
      $$0.c(2001, hv.a($$3), cvz.i($$2.u()));
      $$0.a($$2, dmz.f, $$3);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$3.a(16) == 0) {
         hv $$4 = $$2.d();
         if (cyv.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jn(jv.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgh($$0, $$1);
   }

   public cvz b() {
      return this.d;
   }

   public arb c() {
      return this.e;
   }

   public arb d() {
      return this.f;
   }
}
