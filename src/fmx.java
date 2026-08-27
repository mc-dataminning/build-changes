import java.util.function.Function;

public abstract class fmx {
   protected final Function<aiy, fvu> v;

   public fmx(Function<aiy, fvu> $$0) {
      this.v = $$0;
   }

   public final fvu a(aiy $$0) {
      return this.v.apply($$0);
   }

   public abstract void a(esa var1, ese var2, int var3, int var4, float var5, float var6, float var7, float var8);
}
