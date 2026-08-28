import java.util.Locale;

public interface ezr {
   iv a();

   float b();

   long c();

   long d();

   boolean g();

   boolean i();

   void b(boolean var1);

   boolean l();

   buo q();

   boolean r();

   default void a(q $$0, djz $$1) {
      $$0.a("Level spawn location", () -> q.a($$1, this.a()));
      $$0.a("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.c(), this.d()));
   }
}
