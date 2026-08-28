public interface exx {
   int a();

   int b();

   void a(int var1, int var2);

   boolean c();

   float d();

   default float e() {
      return this.i();
   }

   default float f() {
      return this.e() + (float)this.a() / this.d();
   }

   default float g() {
      return 7.0F - this.j();
   }

   default float h() {
      return this.g() + (float)this.b() / this.d();
   }

   default float i() {
      return 0.0F;
   }

   default float j() {
      return 7.0F;
   }
}
