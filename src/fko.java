import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fko implements fkk, fkl {
   private static final aiy a = new aiy("spectator/teleport_to_player");
   private static final Comparator<fqg> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vq c = vq.c("spectatorMenu.teleport");
   private static final vq d = vq.c("spectatorMenu.teleport.prompt");
   private final List<fkl> e;

   public fko() {
      this(exh.O().J().n());
   }

   public fko(Collection<fqg> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cvk.d).sorted(b).map($$0x -> new fkh($$0x.a())).toList();
   }

   @Override
   public List<fkl> a() {
      return this.e;
   }

   @Override
   public vq b() {
      return d;
   }

   @Override
   public void a(fkj $$0) {
      $$0.a(this);
   }

   @Override
   public vq aR_() {
      return c;
   }

   @Override
   public void a(eyu $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.e.isEmpty();
   }
}
