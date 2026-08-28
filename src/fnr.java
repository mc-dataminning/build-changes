import java.util.Set;

public class fnr extends hcn {
   private static final Set<aut<?>> a = Set.of(hcv.a, hdb.c);

   public fnr(hbk $$0) {
      super($$0, alz.b("textures/atlas/gui.png"), alz.b("gui"), a);
   }

   @Override
   public hbj a(alz $$0) {
      return super.a($$0);
   }

   public hdc a(hbj $$0) {
      return this.b($$0).a();
   }

   private hdb b(hbj $$0) {
      return $$0.e().f().a(hdb.c).orElse(hdb.a);
   }
}
