import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fiw implements fis, fit {
   private static final ahh a = new ahh("spectator/teleport_to_player");
   private static final Comparator<fon> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vg c = vg.c("spectatorMenu.teleport");
   private static final vg d = vg.c("spectatorMenu.teleport.prompt");
   private final List<fit> e;

   public fiw() {
      this(evr.O().J().n());
   }

   public fiw(Collection<fon> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != ctu.d).sorted(b).map($$0x -> new fip($$0x.a())).toList();
   }

   @Override
   public List<fit> a() {
      return this.e;
   }

   @Override
   public vg b() {
      return d;
   }

   @Override
   public void a(fir $$0) {
      $$0.a(this);
   }

   @Override
   public vg aQ_() {
      return c;
   }

   @Override
   public void a(exe $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.e.isEmpty();
   }
}
