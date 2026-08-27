import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dce extends cxi implements cvd, dca {
   public static final MapCodec<dce> c = b(dce::new);
   private static final dhz g = dhy.C;
   public static final dic d = dhy.R;
   protected static final float e = 6.0F;
   protected static final ekn f = cva.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dce> a() {
      return c;
   }

   public dce(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, die.b).a(g, Boolean.valueOf(false)).a(d, hx.c));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return f;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(arg.bw) || $$1.b_($$2.c()).a(ect.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if (!$$0.x_()) {
         ht $$5 = $$1.c();
         dhi $$6 = cxi.c($$0, $$5, this.o().a(b, die.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(g) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      if ($$0.c(b) == die.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ht $$3 = $$2.d();
         dhi $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return true;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      if ($$3.c(cxi.b) == die.b) {
         ht $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cux.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ht $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float au_() {
      return 0.1F;
   }
}
