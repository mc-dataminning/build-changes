import com.mojang.serialization.Codec;

public class dtf extends dtg {
   public static final dtf a = new dtf(dld.a(0));
   public static final Codec<dtf> b = aqy.c(dld.a, dld.a.fieldOf("value").codec()).xmap(dtf::new, dtf::b);
   private final dld d;

   public static dtf a(dld $$0) {
      return new dtf($$0);
   }

   private dtf(dld $$0) {
      this.d = $$0;
   }

   public dld b() {
      return this.d;
   }

   @Override
   public int a(aru $$0, dlg $$1) {
      return this.d.a($$1);
   }

   @Override
   public dth<?> a() {
      return dth.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
