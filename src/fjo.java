import java.util.Set;

public class fjo extends gxo {
   private static final Set<atr<?>> a = Set.of(gxw.a, gyc.c);

   public fjo(gwl $$0) {
      super($$0, alb.b("textures/atlas/gui.png"), alb.b("gui"), a);
   }

   @Override
   public gwk a(alb $$0) {
      return super.a($$0);
   }

   public gyd a(gwk $$0) {
      return this.b($$0).a();
   }

   private gyc b(gwk $$0) {
      return $$0.e().f().a(gyc.c).orElse(gyc.a);
   }
}
