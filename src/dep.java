import com.mojang.serialization.MapCodec;

public class dep extends dbi {
   public static final MapCodec<dep> b = b(dep::new);
   public static final dmv c = dmu.w;

   @Override
   public MapCodec<dep> a() {
      return b;
   }

   public dep(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cwf $$0, ib $$1) {
      if (!$$0.y_() && !$$0.N().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cwe $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(a);
      ib $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.N().a($$2, this)) {
            dme $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.N().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
