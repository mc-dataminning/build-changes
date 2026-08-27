public interface fo {
   emc a(ds var1);

   emb b(ds var1);

   default hx c(ds $$0) {
      return hx.a(this.a($$0));
   }

   boolean a();

   boolean b();

   boolean c();
}
