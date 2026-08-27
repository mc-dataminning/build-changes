import com.mojang.serialization.Codec;

public class dte extends dtf {
   public static final dte a = new dte(dlc.a(0));
   public static final Codec<dte> b = aqy.c(dlc.a, dlc.a.fieldOf("value").codec()).xmap(dte::new, dte::b);
   private final dlc d;

   public static dte a(dlc $$0) {
      return new dte($$0);
   }

   private dte(dlc $$0) {
      this.d = $$0;
   }

   public dlc b() {
      return this.d;
   }

   @Override
   public int a(aru $$0, dlf $$1) {
      return this.d.a($$1);
   }

   @Override
   public dtg<?> a() {
      return dtg.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
