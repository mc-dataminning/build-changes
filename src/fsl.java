import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fsl implements fsh, fsi {
   private static final ale a = new ale("spectator/teleport_to_player");
   private static final Comparator<fyf> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xo c = xo.c("spectatorMenu.teleport");
   private static final xo d = xo.c("spectatorMenu.teleport.prompt");
   private final List<fsi> e;

   public fsl() {
      this(ffe.Q().L().l());
   }

   public fsl(Collection<fyf> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dbu.d).sorted(b).map($$0x -> new fse($$0x.a())).toList();
   }

   @Override
   public List<fsi> a() {
      return this.e;
   }

   @Override
   public xo b() {
      return d;
   }

   @Override
   public void a(fsg $$0) {
      $$0.a(this);
   }

   @Override
   public xo aN_() {
      return c;
   }

   @Override
   public void a(fgq $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
