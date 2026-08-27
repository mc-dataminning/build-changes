import javax.annotation.Nullable;

public interface emo {
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
   vd g();

   void a(@Nullable vd var1);

   void a(@Nullable wt var1);
}
