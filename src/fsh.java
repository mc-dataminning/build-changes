import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fsh implements fsd, fse {
   private static final alb a = new alb("spectator/teleport_to_player");
   private static final Comparator<fyb> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xl c = xl.c("spectatorMenu.teleport");
   private static final xl d = xl.c("spectatorMenu.teleport.prompt");
   private final List<fse> e;

   public fsh() {
      this(ffa.Q().L().m());
   }

   public fsh(Collection<fyb> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dbq.d).sorted(b).map($$0x -> new fsa($$0x.a())).toList();
   }

   @Override
   public List<fse> a() {
      return this.e;
   }

   @Override
   public xl b() {
      return d;
   }

   @Override
   public void a(fsc $$0) {
      $$0.a(this);
   }

   @Override
   public xl aO_() {
      return c;
   }

   @Override
   public void a(fgm $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
