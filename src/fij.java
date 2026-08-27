import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fij implements fif, fig {
   private static final ahg a = new ahg("spectator/teleport_to_player");
   private static final Comparator<fnz> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vf c = vf.c("spectatorMenu.teleport");
   private static final vf d = vf.c("spectatorMenu.teleport.prompt");
   private final List<fig> e;

   public fij() {
      this(evg.O().J().n());
   }

   public fij(Collection<fnz> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != ctl.d).sorted(b).map($$0x -> new fic($$0x.a())).toList();
   }

   @Override
   public List<fig> a() {
      return this.e;
   }

   @Override
   public vf b() {
      return d;
   }

   @Override
   public void a(fie $$0) {
      $$0.a(this);
   }

   @Override
   public vf aO_() {
      return c;
   }

   @Override
   public void a(ews $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
