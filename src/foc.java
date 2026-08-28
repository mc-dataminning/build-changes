import java.util.Set;

public class foc extends hfr {
   private static final Set<ato<?>> a = Set.of(hfz.b, hgd.c);

   public foc(heo $$0) {
      super($$0, aku.b("textures/atlas/gui.png"), aku.b("gui"), a);
   }

   @Override
   public hem a(aku $$0) {
      return super.a($$0);
   }

   public hge a(hem $$0) {
      return this.b($$0).a();
   }

   private hgd b(hem $$0) {
      return $$0.e().f().a(hgd.c).orElse(hgd.a);
   }
}
