import com.mojang.serialization.MapCodec;

public class doa extends dkt {
   public static final MapCodec<doa> b = b(doa::new);
   public static final dwm c = dwl.w;

   @Override
   public MapCodec<doa> a() {
      return b;
   }

   public doa(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dfp $$0, dgb $$1, jh $$2) {
      if (!$$0.A_() && !$$1.S().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dfm $$0, jh $$1, dvv $$2) {
      jm $$3 = $$2.c(a);
      jh $$4 = $$1.a($$3.g());
      etd $$5 = esz.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.A_() && $$0.c(c) && !$$1.S().a($$2, this)) {
            dvv $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.C && $$0.c(c) && $$1.S().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
