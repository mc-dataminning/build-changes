import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fmr implements fmn, fmo {
   private static final ajh a = new ajh("spectator/teleport_to_player");
   private static final Comparator<fsl> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vu c = vu.c("spectatorMenu.teleport");
   private static final vu d = vu.c("spectatorMenu.teleport.prompt");
   private final List<fmo> e;

   public fmr() {
      this(ezi.Q().L().m());
   }

   public fmr(Collection<fsl> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cwy.d).sorted(b).map($$0x -> new fmk($$0x.a())).toList();
   }

   @Override
   public List<fmo> a() {
      return this.e;
   }

   @Override
   public vu b() {
      return d;
   }

   @Override
   public void a(fmm $$0) {
      $$0.a(this);
   }

   @Override
   public vu aP_() {
      return c;
   }

   @Override
   public void a(fav $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aQ_() {
      return !this.e.isEmpty();
   }
}
