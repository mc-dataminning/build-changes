import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ftw implements fts, ftt {
   private static final akr a = akr.b("spectator/teleport_to_player");
   private static final Comparator<fzq> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wz c = wz.c("spectatorMenu.teleport");
   private static final wz d = wz.c("spectatorMenu.teleport.prompt");
   private final List<ftt> e;

   public ftw() {
      this(fgo.Q().L().l());
   }

   public ftw(Collection<fzq> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dct.d).sorted(b).map($$0x -> new ftp($$0x.a())).toList();
   }

   @Override
   public List<ftt> a() {
      return this.e;
   }

   @Override
   public wz b() {
      return d;
   }

   @Override
   public void a(ftr $$0) {
      $$0.a(this);
   }

   @Override
   public wz aU_() {
      return c;
   }

   @Override
   public void a(fhz $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aV_() {
      return !this.e.isEmpty();
   }
}
