import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fhm implements fhi, fhj {
   private static final agt a = new agt("spectator/teleport_to_player");
   private static final Comparator<fnc> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vb c = vb.c("spectatorMenu.teleport");
   private static final vb d = vb.c("spectatorMenu.teleport.prompt");
   private final List<fhj> e;

   public fhm() {
      this(euk.N().I().n());
   }

   public fhm(Collection<fnc> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != csv.d).sorted(b).map($$0x -> new fhf($$0x.a())).toList();
   }

   @Override
   public List<fhj> a() {
      return this.e;
   }

   @Override
   public vb b() {
      return d;
   }

   @Override
   public void a(fhh $$0) {
      $$0.a(this);
   }

   @Override
   public vb aQ_() {
      return c;
   }

   @Override
   public void a(evw $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.e.isEmpty();
   }
}
