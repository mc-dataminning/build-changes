import java.util.Set;

public class fgu extends gqe {
   private static final Set<ato<?>> a = Set.of(gqm.a, gqs.c);

   public fgu(gpc $$0) {
      super($$0, new alf("textures/atlas/gui.png"), new alf("gui"), a);
   }

   @Override
   public gpb a(alf $$0) {
      return super.a($$0);
   }

   public gqt a(gpb $$0) {
      return this.b($$0).a();
   }

   private gqs b(gpb $$0) {
      return $$0.e().f().a(gqs.c).orElse(gqs.a);
   }
}
