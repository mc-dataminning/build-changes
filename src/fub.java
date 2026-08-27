import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fub implements ftx, fty {
   private static final akt a = new akt("spectator/teleport_to_player");
   private static final Comparator<fzy> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xe c = xe.c("spectatorMenu.teleport");
   private static final xe d = xe.c("spectatorMenu.teleport.prompt");
   private final List<fty> e;

   public fub() {
      this(fgj.Q().L().m());
   }

   public fub(Collection<fzy> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dbx.d).sorted(b).map($$0x -> new ftu($$0x.a())).toList();
   }

   @Override
   public List<fty> a() {
      return this.e;
   }

   @Override
   public xe b() {
      return d;
   }

   @Override
   public void a(ftw $$0) {
      $$0.a(this);
   }

   @Override
   public xe aO_() {
      return c;
   }

   @Override
   public void a(fia $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
