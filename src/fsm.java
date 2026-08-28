import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fsm implements fsi, fsj {
   private static final alf a = new alf("spectator/teleport_to_player");
   private static final Comparator<fyg> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xp c = xp.c("spectatorMenu.teleport");
   private static final xp d = xp.c("spectatorMenu.teleport.prompt");
   private final List<fsj> e;

   public fsm() {
      this(fff.Q().L().l());
   }

   public fsm(Collection<fyg> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dbv.d).sorted(b).map($$0x -> new fsf($$0x.a())).toList();
   }

   @Override
   public List<fsj> a() {
      return this.e;
   }

   @Override
   public xp b() {
      return d;
   }

   @Override
   public void a(fsh $$0) {
      $$0.a(this);
   }

   @Override
   public xp aN_() {
      return c;
   }

   @Override
   public void a(fgr $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
