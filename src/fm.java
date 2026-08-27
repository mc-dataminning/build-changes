public interface fm {
   ehp a(dt var1);

   eho b(dt var1);

   default gw c(dt $$0) {
      return gw.a(this.a($$0));
   }

   boolean a();

   boolean b();

   boolean c();
}
