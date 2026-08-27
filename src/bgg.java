import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bgg {
   private final LongSupplier a;
   private final IntSupplier b;
   private bgk c = bgj.a;

   public bgg(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bgj.a;
   }

   public void b() {
      this.c = bgj.a;
   }

   public void c() {
      this.c = new bgf(this.a, this.b, true);
   }

   public bgm d() {
      return this.c;
   }

   public bgl e() {
      return this.c.d();
   }
}
