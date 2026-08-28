import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fsn implements fsj, fsk {
   private static final alf a = new alf("spectator/teleport_to_player");
   private static final Comparator<fyh> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xp c = xp.c("spectatorMenu.teleport");
   private static final xp d = xp.c("spectatorMenu.teleport.prompt");
   private final List<fsk> e;

   public fsn() {
      this(ffg.Q().L().l());
   }

   public fsn(Collection<fyh> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dbw.d).sorted(b).map($$0x -> new fsg($$0x.a())).toList();
   }

   @Override
   public List<fsk> a() {
      return this.e;
   }

   @Override
   public xp b() {
      return d;
   }

   @Override
   public void a(fsi $$0) {
      $$0.a(this);
   }

   @Override
   public xp aN_() {
      return c;
   }

   @Override
   public void a(fgs $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
