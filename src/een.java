import com.mojang.serialization.Codec;

public class een extends efb {
   public static final Codec<een> a = bnk.b(0, 256).fieldOf("count").xmap(een::new, $$0 -> $$0.c).codec();
   private final bnk c;

   private een(bnk $$0) {
      this.c = $$0;
   }

   public static een a(bnk $$0) {
      return new een($$0);
   }

   public static een a(int $$0) {
      return a(bnh.a($$0));
   }

   @Override
   protected int a(axt $$0, id $$1) {
      return this.c.a($$0);
   }

   @Override
   public eey<?> b() {
      return eey.f;
   }
}
