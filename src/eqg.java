import java.util.Locale;

public interface eqg {
   ja a();

   float b();

   long c();

   long d();

   boolean g();

   boolean i();

   void b(boolean var1);

   boolean l();

   dcc o();

   bqe q();

   boolean r();

   default void a(p $$0, dci $$1) {
      $$0.a("Level spawn location", () -> p.a($$1, this.a()));
      $$0.a("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.c(), this.d()));
   }
}
