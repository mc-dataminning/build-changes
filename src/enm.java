import com.mojang.serialization.MapCodec;

public class enm extends enn {
   public static final enm a = new enm(eff.a(0));
   public static final MapCodec<enm> b = eff.a.fieldOf("value").xmap(enm::new, enm::b);
   private final eff d;

   public static enm a(eff $$0) {
      return new enm($$0);
   }

   private enm(eff $$0) {
      this.d = $$0;
   }

   public eff b() {
      return this.d;
   }

   @Override
   public int a(azs $$0, efi $$1) {
      return this.d.a($$1);
   }

   @Override
   public eno<?> a() {
      return eno.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
