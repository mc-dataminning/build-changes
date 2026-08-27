import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fds implements fdo, fdp {
   private static final aex a = new aex("spectator/teleport_to_player");
   private static final Comparator<fjf> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final tm c = tm.c("spectatorMenu.teleport");
   private static final tm d = tm.c("spectatorMenu.teleport.prompt");
   private final List<fdp> e;

   public fds() {
      this(eqv.O().J().m());
   }

   public fds(Collection<fjf> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cps.d).sorted(b).map($$0x -> new fdl($$0x.a())).toList();
   }

   @Override
   public List<fdp> a() {
      return this.e;
   }

   @Override
   public tm b() {
      return d;
   }

   @Override
   public void a(fdn $$0) {
      $$0.a(this);
   }

   @Override
   public tm aJ_() {
      return c;
   }

   @Override
   public void a(esf $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aK_() {
      return !this.e.isEmpty();
   }
}
