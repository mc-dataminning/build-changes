import com.mojang.serialization.MapCodec;

public class egg extends egu {
   public static final MapCodec<egg> a = boz.b(0, 256).fieldOf("count").xmap(egg::new, $$0 -> $$0.c);
   private final boz c;

   private egg(boz $$0) {
      this.c = $$0;
   }

   public static egg a(boz $$0) {
      return new egg($$0);
   }

   public static egg a(int $$0) {
      return a(bow.a($$0));
   }

   @Override
   protected int a(ayk $$0, io $$1) {
      return this.c.a($$0);
   }

   @Override
   public egr<?> b() {
      return egr.f;
   }
}
