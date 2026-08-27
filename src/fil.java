import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fil implements fih, fii {
   private static final ahg a = new ahg("spectator/teleport_to_player");
   private static final Comparator<fob> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vf c = vf.c("spectatorMenu.teleport");
   private static final vf d = vf.c("spectatorMenu.teleport.prompt");
   private final List<fii> e;

   public fil() {
      this(evi.O().J().n());
   }

   public fil(Collection<fob> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != ctm.d).sorted(b).map($$0x -> new fie($$0x.a())).toList();
   }

   @Override
   public List<fii> a() {
      return this.e;
   }

   @Override
   public vf b() {
      return d;
   }

   @Override
   public void a(fig $$0) {
      $$0.a(this);
   }

   @Override
   public vf aO_() {
      return c;
   }

   @Override
   public void a(ewu $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
