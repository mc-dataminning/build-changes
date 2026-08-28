public interface dau extends dbf<dat> {
   @Override
   default dbq<dau> b() {
      return dbq.a;
   }

   @Override
   dbp<? extends dau> a();

   das c();

   default ka<cwq> a(dat $$0) {
      return b($$0);
   }

   static ka<cwq> b(dat $$0) {
      ka<cwq> $$1 = ka.a($$0.a(), cwq.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwm $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.k());
      }

      return $$1;
   }

   @Override
   default dbi h() {
      return switch (this.c()) {
         case a -> dbh.a;
         case c -> dbh.c;
         case b -> dbh.b;
         case d -> dbh.d;
      };
   }
}
