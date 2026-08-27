import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fqn implements fqj, fqk {
   private static final akh a = new akh("spectator/teleport_to_player");
   private static final Comparator<fwh> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wu c = wu.c("spectatorMenu.teleport");
   private static final wu d = wu.c("spectatorMenu.teleport.prompt");
   private final List<fqk> e;

   public fqn() {
      this(fde.Q().L().m());
   }

   public fqn(Collection<fwh> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != daa.d).sorted(b).map($$0x -> new fqg($$0x.a())).toList();
   }

   @Override
   public List<fqk> a() {
      return this.e;
   }

   @Override
   public wu b() {
      return d;
   }

   @Override
   public void a(fqi $$0) {
      $$0.a(this);
   }

   @Override
   public wu aN_() {
      return c;
   }

   @Override
   public void a(fer $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.e.isEmpty();
   }
}
