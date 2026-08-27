import java.util.Set;

public class fau extends gkb {
   private static final Set<arn<?>> a = Set.of(gkj.a, gkp.c);

   public fau(gja $$0) {
      super($$0, new ajh("textures/atlas/gui.png"), new ajh("gui"), a);
   }

   @Override
   public giz a(ajh $$0) {
      return super.a($$0);
   }

   public gkq a(giz $$0) {
      return this.b($$0).a();
   }

   private gkp b(giz $$0) {
      return $$0.e().f().a(gkp.c).orElse(gkp.a);
   }
}
