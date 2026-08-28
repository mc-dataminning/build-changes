import java.util.Locale;

public interface ept {
   iz a();

   float b();

   long c();

   long d();

   boolean g();

   boolean i();

   void b(boolean var1);

   boolean l();

   dbv o();

   bqs q();

   boolean r();

   default void a(p $$0, dcb $$1) {
      $$0.a("Level spawn location", () -> p.a($$1, this.a()));
      $$0.a("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.c(), this.d()));
   }
}
