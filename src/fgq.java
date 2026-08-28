import java.util.Set;

public class fgq extends gqa {
   private static final Set<atn<?>> a = Set.of(gqi.a, gqo.c);

   public fgq(goy $$0) {
      super($$0, new ale("textures/atlas/gui.png"), new ale("gui"), a);
   }

   @Override
   public gox a(ale $$0) {
      return super.a($$0);
   }

   public gqp a(gox $$0) {
      return this.b($$0).a();
   }

   private gqo b(gox $$0) {
      return $$0.e().f().a(gqo.c).orElse(gqo.a);
   }
}
