import java.util.function.Function;

public abstract class fey<T extends bil> extends ffu {
   public float c;
   public boolean d;
   public boolean e = true;

   protected fey() {
      this(foh::e);
   }

   protected fey(Function<aeu, foh> $$0) {
      super($$0);
   }

   public abstract void a(T var1, float var2, float var3, float var4, float var5, float var6);

   public void a(T $$0, float $$1, float $$2, float $$3) {
   }

   public void a(fey<T> $$0) {
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
   }
}
