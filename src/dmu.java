import com.mojang.serialization.MapCodec;

public class dmu extends djm {
   public static final MapCodec<dmu> b = b(dmu::new);
   public static final dvf c = dve.w;

   @Override
   public MapCodec<dmu> a() {
      return b;
   }

   public dmu(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jj.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(deh $$0, je $$1) {
      if (!$$0.w_() && !$$0.R().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(deg $$0, je $$1, duo $$2) {
      jj $$3 = $$2.c(a);
      je $$4 = $$1.a($$3.g());
      erx $$5 = ert.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(c) && !$$1.R().a($$2, this)) {
            duo $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.R().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(a, $$0.d().g().g());
   }
}
