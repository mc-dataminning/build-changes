import java.util.Set;

public class fgr extends gqb {
   private static final Set<atn<?>> a = Set.of(gqj.a, gqp.c);

   public fgr(goz $$0) {
      super($$0, new ale("textures/atlas/gui.png"), new ale("gui"), a);
   }

   @Override
   public goy a(ale $$0) {
      return super.a($$0);
   }

   public gqq a(goy $$0) {
      return this.b($$0).a();
   }

   private gqp b(goy $$0) {
      return $$0.e().f().a(gqp.c).orElse(gqp.a);
   }
}
