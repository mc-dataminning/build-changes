import java.util.Set;

public class fnm extends hci {
   private static final Set<aut<?>> a = Set.of(hcq.a, hcw.c);

   public fnm(hbf $$0) {
      super($$0, alz.b("textures/atlas/gui.png"), alz.b("gui"), a);
   }

   @Override
   public hbe a(alz $$0) {
      return super.a($$0);
   }

   public hcx a(hbe $$0) {
      return this.b($$0).a();
   }

   private hcw b(hbe $$0) {
      return $$0.e().f().a(hcw.c).orElse(hcw.a);
   }
}
