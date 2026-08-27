import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fkv implements fkr, fks {
   private static final aiy a = new aiy("spectator/teleport_to_player");
   private static final Comparator<fqn> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vq c = vq.c("spectatorMenu.teleport");
   private static final vq d = vq.c("spectatorMenu.teleport.prompt");
   private final List<fks> e;

   public fkv() {
      this(exo.P().K().m());
   }

   public fkv(Collection<fqn> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cvo.d).sorted(b).map($$0x -> new fko($$0x.a())).toList();
   }

   @Override
   public List<fks> a() {
      return this.e;
   }

   @Override
   public vq b() {
      return d;
   }

   @Override
   public void a(fkq $$0) {
      $$0.a(this);
   }

   @Override
   public vq aR_() {
      return c;
   }

   @Override
   public void a(ezb $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.e.isEmpty();
   }
}
