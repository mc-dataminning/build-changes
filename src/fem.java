import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fem implements fei, fej {
   private static final afw a = new afw("spectator/teleport_to_player");
   private static final Comparator<fka> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final ui c = ui.c("spectatorMenu.teleport");
   private static final ui d = ui.c("spectatorMenu.teleport.prompt");
   private final List<fej> e;

   public fem() {
      this(ero.O().J().n());
   }

   public fem(Collection<fka> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cqw.d).sorted(b).map($$0x -> new fef($$0x.a())).toList();
   }

   @Override
   public List<fej> a() {
      return this.e;
   }

   @Override
   public ui b() {
      return d;
   }

   @Override
   public void a(feh $$0) {
      $$0.a(this);
   }

   @Override
   public ui aN_() {
      return c;
   }

   @Override
   public void a(esy $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
