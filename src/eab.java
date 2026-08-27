import com.mojang.serialization.Codec;

public class eab extends eap {
   public static final Codec<eab> a = bkz.b(0, 256).fieldOf("count").xmap(eab::new, $$0 -> $$0.c).codec();
   private final bkz c;

   private eab(bkz $$0) {
      this.c = $$0;
   }

   public static eab a(bkz $$0) {
      return new eab($$0);
   }

   public static eab a(int $$0) {
      return a(bkw.a($$0));
   }

   @Override
   protected int a(awo $$0, hz $$1) {
      return this.c.a($$0);
   }

   @Override
   public eam<?> b() {
      return eam.f;
   }
}
