import com.mojang.serialization.MapCodec;

public class dni extends dkb {
   public static final MapCodec<dni> b = b(dni::new);
   public static final dvu c = dvt.w;

   @Override
   public MapCodec<dni> a() {
      return b;
   }

   public dni(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jl.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dew $$0, jg $$1) {
      if (!$$0.y_() && !$$0.R().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dev $$0, jg $$1, dvd $$2) {
      jl $$3 = $$2.c(a);
      jg $$4 = $$1.a($$3.g());
      esm $$5 = esi.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.R().a($$2, this)) {
            dvd $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.C && $$0.c(c) && $$1.R().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
