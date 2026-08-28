import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkj extends djp implements dmz {
   public static final MapCodec<dkj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ma.e.q().fieldOf("turns_into").forGetter(dkj::b),
               ma.b.q().fieldOf("brush_sound").forGetter(dkj::c),
               ma.b.q().fieldOf("brush_completed_sound").forGetter(dkj::d),
               t()
            )
            .apply($$0, dkj::new)
   );
   private static final dyn c = dye.by;
   public static final int b = 2;
   private final dkd d;
   private final awu e;
   private final awu f;

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   public dkj(dkd $$0, awu $$1, awu $$2, dxn.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   @Override
   public dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   public void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.c_($$2) instanceof duu $$4) {
         $$4.a($$1);
      }

      if (dna.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clr $$5 = clr.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dgz $$0, jh $$1, clr $$2) {
      fbr $$3 = $$2.cR().f();
      $$0.c(2001, jh.a((ka)$$3), dkd.j($$2.p()));
      $$0.a($$2, eck.f, $$3);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (dna.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lk(ls.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new duu($$0, $$1);
   }

   public dkd b() {
      return this.d;
   }

   public awu c() {
      return this.e;
   }

   public awu d() {
      return this.f;
   }
}
