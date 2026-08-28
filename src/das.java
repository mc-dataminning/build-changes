public interface das extends dbd<dar> {
   @Override
   default dbo<das> b() {
      return dbo.a;
   }

   @Override
   dbn<? extends das> a();

   daq c();

   default ka<cwo> a(dar $$0) {
      return b($$0);
   }

   static ka<cwo> b(dar $$0) {
      ka<cwo> $$1 = ka.a($$0.a(), cwo.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwk $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dbg h() {
      return switch (this.c()) {
         case a -> dbf.a;
         case c -> dbf.c;
         case b -> dbf.b;
         case d -> dbf.d;
      };
   }
}
