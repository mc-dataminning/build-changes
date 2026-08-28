import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dur extends dpl implements dnf, dun {
   public static final MapCodec<dur> c = b(dur::new);
   private static final ebv e = ebu.I;
   public static final ecc<jb> d = ebu.T;
   private static final fgk f = dnc.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dur> a() {
      return c;
   }

   public dur(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eca.b).b(e, Boolean.valueOf(false)).b(d, jb.c));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return f;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(axe.bA) || $$1.b_($$2.d()).a(exp.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      if (!$$0.A_()) {
         iv $$5 = $$1.d();
         ebe $$6 = dpl.b($$0, $$5, this.m().b(b, eca.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(e) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      if ($$0.c(b) == eca.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iv $$3 = $$2.e();
         ebe $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return true;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      if ($$3.c(dpl.b) == eca.b) {
         iv $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dmz.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iv $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
