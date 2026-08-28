import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpv extends dky implements dit, dpr {
   public static final MapCodec<dpv> c = b(dpv::new);
   private static final dwm g = dwl.C;
   public static final dws<jm> d = dwl.R;
   protected static final float e = 6.0F;
   protected static final fas f = diq.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dpv> a() {
      return c;
   }

   public dpv(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwq.b).b(g, Boolean.valueOf(false)).b(d, jm.c));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return f;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(axc.by) || $$1.b_($$2.d()).a(erw.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
      if (!$$0.A_()) {
         jh $$5 = $$1.d();
         dvv $$6 = dky.c($$0, $$5, this.m().b(b, dwq.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(g) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      if ($$0.c(b) == dwq.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jh $$3 = $$2.e();
         dvv $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return true;
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      if ($$3.c(dky.b) == dwq.b) {
         jh $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         din.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jh $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
