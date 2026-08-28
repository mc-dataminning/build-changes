import java.util.function.Consumer;

public class fpb implements foy {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public fpb(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public fpb(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static fpb a(int $$0) {
      return new fpb($$0, 0);
   }

   public static fpb b(int $$0) {
      return new fpb(0, $$0);
   }

   @Override
   public void m(int $$0) {
      this.a = $$0;
   }

   @Override
   public void n(int $$0) {
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
   public void a(Consumer<flf> $$0) {
   }
}
