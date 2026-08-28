import com.mojang.serialization.MapCodec;

public class ejx extends ejy {
   public static final ejx a = new ejx(ebt.a(0));
   public static final MapCodec<ejx> b = ebt.a.fieldOf("value").xmap(ejx::new, ejx::b);
   private final ebt d;

   public static ejx a(ebt $$0) {
      return new ejx($$0);
   }

   private ejx(ebt $$0) {
      this.d = $$0;
   }

   public ebt b() {
      return this.d;
   }

   @Override
   public int a(azr $$0, ebw $$1) {
      return this.d.a($$1);
   }

   @Override
   public ejz<?> a() {
      return ejz.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
