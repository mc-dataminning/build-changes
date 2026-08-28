import javax.annotation.Nullable;

public interface fgt {
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
   xa g();

   void a(@Nullable xa var1);

   void a(@Nullable yq var1);
}
