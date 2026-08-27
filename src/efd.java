import com.mojang.serialization.Codec;

public class efd extends efr {
   public static final Codec<efd> a = bnv.b(0, 256).fieldOf("count").xmap(efd::new, $$0 -> $$0.c).codec();
   private final bnv c;

   private efd(bnv $$0) {
      this.c = $$0;
   }

   public static efd a(bnv $$0) {
      return new efd($$0);
   }

   public static efd a(int $$0) {
      return a(bns.a($$0));
   }

   @Override
   protected int a(ayd $$0, im $$1) {
      return this.c.a($$0);
   }

   @Override
   public efo<?> b() {
      return efo.f;
   }
}
