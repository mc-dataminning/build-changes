import com.mojang.serialization.Codec;

public class dtd extends dte {
   public static final dtd a = new dtd(dlb.a(0));
   public static final Codec<dtd> b = aqw.c(dlb.a, dlb.a.fieldOf("value").codec()).xmap(dtd::new, dtd::b);
   private final dlb d;

   public static dtd a(dlb $$0) {
      return new dtd($$0);
   }

   private dtd(dlb $$0) {
      this.d = $$0;
   }

   public dlb b() {
      return this.d;
   }

   @Override
   public int a(art $$0, dle $$1) {
      return this.d.a($$1);
   }

   @Override
   public dtf<?> a() {
      return dtf.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
