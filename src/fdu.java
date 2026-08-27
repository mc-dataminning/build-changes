import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fdu implements fdq, fdr {
   private static final aey a = new aey("spectator/teleport_to_player");
   private static final Comparator<fjh> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final tn c = tn.c("spectatorMenu.teleport");
   private static final tn d = tn.c("spectatorMenu.teleport.prompt");
   private final List<fdr> e;

   public fdu() {
      this(eqx.O().J().m());
   }

   public fdu(Collection<fjh> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cpu.d).sorted(b).map($$0x -> new fdn($$0x.a())).toList();
   }

   @Override
   public List<fdr> a() {
      return this.e;
   }

   @Override
   public tn b() {
      return d;
   }

   @Override
   public void a(fdp $$0) {
      $$0.a(this);
   }

   @Override
   public tn aI_() {
      return c;
   }

   @Override
   public void a(esh $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aJ_() {
      return !this.e.isEmpty();
   }
}
