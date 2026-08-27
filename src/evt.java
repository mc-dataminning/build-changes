import java.util.function.Consumer;

public class evt implements evq {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public evt(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public evt(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static evt a(int $$0) {
      return new evt($$0, 0);
   }

   public static evt b(int $$0) {
      return new evt(0, $$0);
   }

   @Override
   public void e(int $$0) {
      this.a = $$0;
   }

   @Override
   public void f(int $$0) {
      this.b = $$0;
   }

   @Override
   public int p() {
      return this.a;
   }

   @Override
   public int r() {
      return this.b;
   }

   @Override
   public int k() {
      return this.c;
   }

   @Override
   public int h() {
      return this.d;
   }

   @Override
   public void a(Consumer<esf> $$0) {
   }
}
