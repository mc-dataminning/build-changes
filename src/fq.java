public interface fq {
   epr a(du var1);

   epq b(du var1);

   default ib c(du $$0) {
      return ib.a(this.a($$0));
   }

   boolean a();

   boolean b();

   boolean c();
}
