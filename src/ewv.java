import java.util.Set;

public class ewv extends gfp {
   private static final Set<api<?>> a = Set.of(gfx.a, ggd.c);

   public ewv(geo $$0) {
      super($$0, new ahg("textures/atlas/gui.png"), new ahg("gui"), a);
   }

   @Override
   public gen a(ahg $$0) {
      return super.a($$0);
   }

   public gge a(gen $$0) {
      return this.b($$0).a();
   }

   private ggd b(gen $$0) {
      return $$0.e().f().a(ggd.c).orElse(ggd.a);
   }
}
