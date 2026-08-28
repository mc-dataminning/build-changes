import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ftq implements ftm, ftn {
   private static final akq a = akq.b("spectator/teleport_to_player");
   private static final Comparator<fzk> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wy c = wy.c("spectatorMenu.teleport");
   private static final wy d = wy.c("spectatorMenu.teleport.prompt");
   private final List<ftn> e;

   public ftq() {
      this(fgi.Q().L().l());
   }

   public ftq(Collection<fzk> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dcr.d).sorted(b).map($$0x -> new ftj($$0x.a())).toList();
   }

   @Override
   public List<ftn> a() {
      return this.e;
   }

   @Override
   public wy b() {
      return d;
   }

   @Override
   public void a(ftl $$0) {
      $$0.a(this);
   }

   @Override
   public wy aR_() {
      return c;
   }

   @Override
   public void a(fht $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.e.isEmpty();
   }
}
