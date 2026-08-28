import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fsk implements fsg, fsh {
   private static final ale a = new ale("spectator/teleport_to_player");
   private static final Comparator<fye> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xo c = xo.c("spectatorMenu.teleport");
   private static final xo d = xo.c("spectatorMenu.teleport.prompt");
   private final List<fsh> e;

   public fsk() {
      this(ffd.Q().L().l());
   }

   public fsk(Collection<fye> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dbt.d).sorted(b).map($$0x -> new fsd($$0x.a())).toList();
   }

   @Override
   public List<fsh> a() {
      return this.e;
   }

   @Override
   public xo b() {
      return d;
   }

   @Override
   public void a(fsf $$0) {
      $$0.a(this);
   }

   @Override
   public xo aN_() {
      return c;
   }

   @Override
   public void a(fgp $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
