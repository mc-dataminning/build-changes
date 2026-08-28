import java.util.function.Function;

public abstract class ftv<T extends bsp> extends fur {
   public float c;
   public boolean d;
   public boolean e = true;

   protected ftv() {
      this(gdr::e);
   }

   protected ftv(Function<alb, gdr> $$0) {
      super($$0);
   }

   public abstract void a(T var1, float var2, float var3, float var4, float var5, float var6);

   public void a(T $$0, float $$1, float $$2, float $$3) {
   }

   public void a(ftv<T> $$0) {
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
   }
}
