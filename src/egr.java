import java.util.Locale;

public interface egr {
   int a();

   int b();

   int c();

   float d();

   long e();

   long f();

   boolean i();

   boolean k();

   void b(boolean var1);

   boolean n();

   ctt q();

   bjz s();

   boolean t();

   default void a(p $$0, ctz $$1) {
      $$0.a("Level spawn location", () -> p.a($$1, this.a(), this.b(), this.c()));
      $$0.a("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.e(), this.f()));
   }
}
