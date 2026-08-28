import java.util.Set;

public class fns extends hco {
   private static final Set<aut<?>> a = Set.of(hcw.a, hdc.c);

   public fns(hbl $$0) {
      super($$0, alz.b("textures/atlas/gui.png"), alz.b("gui"), a);
   }

   @Override
   public hbk a(alz $$0) {
      return super.a($$0);
   }

   public hdd a(hbk $$0) {
      return this.b($$0).a();
   }

   private hdc b(hbk $$0) {
      return $$0.e().f().a(hdc.c).orElse(hdc.a);
   }
}
