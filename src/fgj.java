import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fgj implements fgf, fgg {
   private static final agm a = new agm("spectator/teleport_to_player");
   private static final Comparator<flx> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final uv c = uv.c("spectatorMenu.teleport");
   private static final uv d = uv.c("spectatorMenu.teleport.prompt");
   private final List<fgg> e;

   public fgj() {
      this(eti.N().I().n());
   }

   public fgj(Collection<flx> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != csc.d).sorted(b).map($$0x -> new fgc($$0x.a())).toList();
   }

   @Override
   public List<fgg> a() {
      return this.e;
   }

   @Override
   public uv b() {
      return d;
   }

   @Override
   public void a(fge $$0) {
      $$0.a(this);
   }

   @Override
   public uv aR_() {
      return c;
   }

   @Override
   public void a(eut $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.e.isEmpty();
   }
}
