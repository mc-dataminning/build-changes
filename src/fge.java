import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fge implements fga, fgb {
   private static final agi a = new agi("spectator/teleport_to_player");
   private static final Comparator<fls> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final ur c = ur.c("spectatorMenu.teleport");
   private static final ur d = ur.c("spectatorMenu.teleport.prompt");
   private final List<fgb> e;

   public fge() {
      this(etd.N().I().n());
   }

   public fge(Collection<fls> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != crx.d).sorted(b).map($$0x -> new ffx($$0x.a())).toList();
   }

   @Override
   public List<fgb> a() {
      return this.e;
   }

   @Override
   public ur b() {
      return d;
   }

   @Override
   public void a(ffz $$0) {
      $$0.a(this);
   }

   @Override
   public ur aQ_() {
      return c;
   }

   @Override
   public void a(euo $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.e.isEmpty();
   }
}
