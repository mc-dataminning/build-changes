import java.util.Set;

public class ftl extends hlv {
   private static final Set<aun<?>> a = Set.of(hmd.b, hmh.c);

   public ftl(hks $$0) {
      super($$0, alr.b("textures/atlas/gui.png"), hmp.g, a);
   }

   @Override
   public hkq a(alr $$0) {
      return super.a($$0);
   }

   public hmi a(hkq $$0) {
      return this.b($$0).a();
   }

   private hmh b(hkq $$0) {
      return $$0.e().f().a(hmh.c).orElse(hmh.a);
   }
}
