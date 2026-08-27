import java.util.Locale;

public interface eki {
   ib a();

   float b();

   long c();

   long d();

   boolean g();

   boolean i();

   void b(boolean var1);

   boolean l();

   cwx o();

   bna q();

   boolean r();

   default void a(p $$0, cxd $$1) {
      $$0.a("Level spawn location", () -> p.a($$1, this.a()));
      $$0.a("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.c(), this.d()));
   }
}
