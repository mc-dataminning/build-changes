import javax.annotation.Nullable;

public interface fak {
   int a();

   void a(int var1);

   default int b(int $$0) {
      int $$1 = this.a() + $$0;
      this.a($$1);
      return $$1;
   }

   default int b() {
      return this.b(1);
   }

   default void c() {
      this.a(0);
   }

   boolean d();

   void e();

   void f();

   @Nullable
   xh g();

   void a(@Nullable xh var1);

   void a(@Nullable yx var1);
}
