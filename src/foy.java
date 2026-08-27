import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class foy implements fou, fov {
   private static final ajt a = new ajt("spectator/teleport_to_player");
   private static final Comparator<fus> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wg c = wg.c("spectatorMenu.teleport");
   private static final wg d = wg.c("spectatorMenu.teleport.prompt");
   private final List<fov> e;

   public foy() {
      this(fbp.Q().L().m());
   }

   public foy(Collection<fus> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cyu.d).sorted(b).map($$0x -> new foq($$0x.a())).toList();
   }

   @Override
   public List<fov> a() {
      return this.e;
   }

   @Override
   public wg b() {
      return d;
   }

   @Override
   public void a(fot $$0) {
      $$0.a(this);
   }

   @Override
   public wg aO_() {
      return c;
   }

   @Override
   public void a(fdc $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
