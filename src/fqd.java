import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fqd implements fpz, fqa {
   private static final akf a = new akf("spectator/teleport_to_player");
   private static final Comparator<fvx> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final ws c = ws.c("spectatorMenu.teleport");
   private static final ws d = ws.c("spectatorMenu.teleport.prompt");
   private final List<fqa> e;

   public fqd() {
      this(fcu.Q().L().m());
   }

   public fqd(Collection<fvx> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != czr.d).sorted(b).map($$0x -> new fpw($$0x.a())).toList();
   }

   @Override
   public List<fqa> a() {
      return this.e;
   }

   @Override
   public ws b() {
      return d;
   }

   @Override
   public void a(fpy $$0) {
      $$0.a(this);
   }

   @Override
   public ws aN_() {
      return c;
   }

   @Override
   public void a(feh $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
