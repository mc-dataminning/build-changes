import java.util.function.Consumer;

public class frx implements fru {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public frx(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public frx(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static frx a(int $$0) {
      return new frx($$0, 0);
   }

   public static frx b(int $$0) {
      return new frx(0, $$0);
   }

   @Override
   public void k(int $$0) {
      this.a = $$0;
   }

   @Override
   public void l(int $$0) {
      this.b = $$0;
   }

   @Override
   public int D() {
      return this.a;
   }

   @Override
   public int E() {
      return this.b;
   }

   @Override
   public int y() {
      return this.c;
   }

   @Override
   public int w() {
      return this.d;
   }

   @Override
   public void a(Consumer<fob> $$0) {
   }
}
