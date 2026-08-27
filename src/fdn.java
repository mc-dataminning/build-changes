import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fdn implements fdj, fdk {
   private static final aeu a = new aeu("spectator/teleport_to_player");
   private static final Comparator<fja> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final ti c = ti.c("spectatorMenu.teleport");
   private static final ti d = ti.c("spectatorMenu.teleport.prompt");
   private final List<fdk> e;

   public fdn() {
      this(eqq.O().J().m());
   }

   public fdn(Collection<fja> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cpn.d).sorted(b).map($$0x -> new fdg($$0x.a())).toList();
   }

   @Override
   public List<fdk> a() {
      return this.e;
   }

   @Override
   public ti b() {
      return d;
   }

   @Override
   public void a(fdi $$0) {
      $$0.a(this);
   }

   @Override
   public ti aE_() {
      return c;
   }

   @Override
   public void a(esa $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aF_() {
      return !this.e.isEmpty();
   }
}
