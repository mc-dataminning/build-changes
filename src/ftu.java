import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ftu implements ftq, ftr {
   private static final akr a = akr.b("spectator/teleport_to_player");
   private static final Comparator<fzo> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wz c = wz.c("spectatorMenu.teleport");
   private static final wz d = wz.c("spectatorMenu.teleport.prompt");
   private final List<ftr> e;

   public ftu() {
      this(fgm.Q().L().l());
   }

   public ftu(Collection<fzo> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dct.d).sorted(b).map($$0x -> new ftn($$0x.a())).toList();
   }

   @Override
   public List<ftr> a() {
      return this.e;
   }

   @Override
   public wz b() {
      return d;
   }

   @Override
   public void a(ftp $$0) {
      $$0.a(this);
   }

   @Override
   public wz aU_() {
      return c;
   }

   @Override
   public void a(fhx $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aV_() {
      return !this.e.isEmpty();
   }
}
