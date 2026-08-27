import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fph implements fpd, fpe {
   private static final ajv a = new ajv("spectator/teleport_to_player");
   private static final Comparator<fvb> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wi c = wi.c("spectatorMenu.teleport");
   private static final wi d = wi.c("spectatorMenu.teleport.prompt");
   private final List<fpe> e;

   public fph() {
      this(fby.Q().L().m());
   }

   public fph(Collection<fvb> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != czd.d).sorted(b).map($$0x -> new fpa($$0x.a())).toList();
   }

   @Override
   public List<fpe> a() {
      return this.e;
   }

   @Override
   public wi b() {
      return d;
   }

   @Override
   public void a(fpc $$0) {
      $$0.a(this);
   }

   @Override
   public wi aN_() {
      return c;
   }

   @Override
   public void a(fdl $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
