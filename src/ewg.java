import java.util.function.Consumer;

public class ewg implements ewd {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public ewg(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public ewg(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ewg a(int $$0) {
      return new ewg($$0, 0);
   }

   public static ewg b(int $$0) {
      return new ewg(0, $$0);
   }

   @Override
   public void f(int $$0) {
      this.a = $$0;
   }

   @Override
   public void g(int $$0) {
      this.b = $$0;
   }

   @Override
   public int r() {
      return this.a;
   }

   @Override
   public int t() {
      return this.b;
   }

   @Override
   public int l() {
      return this.c;
   }

   @Override
   public int i() {
      return this.d;
   }

   @Override
   public void a(Consumer<esq> $$0) {
   }
}
