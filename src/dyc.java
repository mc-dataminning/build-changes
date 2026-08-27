import com.mojang.serialization.Codec;

public class dyc extends dyq {
   public static final Codec<dyc> a = bjf.b(0, 256).fieldOf("count").xmap(dyc::new, $$0 -> $$0.c).codec();
   private final bjf c;

   private dyc(bjf $$0) {
      this.c = $$0;
   }

   public static dyc a(bjf $$0) {
      return new dyc($$0);
   }

   public static dyc a(int $$0) {
      return a(bjc.a($$0));
   }

   @Override
   protected int a(auu $$0, hx $$1) {
      return this.c.a($$0);
   }

   @Override
   public dyn<?> b() {
      return dyn.f;
   }
}
