import java.util.Set;

public class fkn extends gyw {
   private static final Set<aty<?>> a = Set.of(gze.a, gzk.c);

   public fkn(gxt $$0) {
      super($$0, alh.b("textures/atlas/gui.png"), alh.b("gui"), a);
   }

   @Override
   public gxs a(alh $$0) {
      return super.a($$0);
   }

   public gzl a(gxs $$0) {
      return this.b($$0).a();
   }

   private gzk b(gxs $$0) {
      return $$0.e().f().a(gzk.c).orElse(gzk.a);
   }
}
