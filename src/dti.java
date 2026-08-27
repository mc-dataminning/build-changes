import com.mojang.serialization.Codec;

public class dti extends dtj {
   public static final dti a = new dti(dlg.a(0));
   public static final Codec<dti> b = arj.e(dlg.a, dlg.a.fieldOf("value").codec()).xmap(dti::new, dti::b);
   private final dlg d;

   public static dti a(dlg $$0) {
      return new dti($$0);
   }

   private dti(dlg $$0) {
      this.d = $$0;
   }

   public dlg b() {
      return this.d;
   }

   @Override
   public int a(ash $$0, dlj $$1) {
      return this.d.a($$1);
   }

   @Override
   public dtk<?> a() {
      return dtk.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
