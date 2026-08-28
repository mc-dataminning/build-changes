public interface dat extends dbe<das> {
   @Override
   default dbp<dat> b() {
      return dbp.a;
   }

   @Override
   dbo<? extends dat> a();

   dar c();

   default ka<cwp> a(das $$0) {
      return b($$0);
   }

   static ka<cwp> b(das $$0) {
      ka<cwp> $$1 = ka.a($$0.a(), cwp.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwl $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dbh h() {
      return switch (this.c()) {
         case a -> dbg.a;
         case c -> dbg.c;
         case b -> dbg.b;
         case d -> dbg.d;
      };
   }
}
