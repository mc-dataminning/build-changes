import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fdd implements fcz, fda {
   private static final aer a = new aer("spectator/teleport_to_player");
   private static final Comparator<fiq> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final tf c = tf.c("spectatorMenu.teleport");
   private static final tf d = tf.c("spectatorMenu.teleport.prompt");
   private final List<fda> e;

   public fdd() {
      this(eqm.O().J().m());
   }

   public fdd(Collection<fiq> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cpj.d).sorted(b).map($$0x -> new fcw($$0x.a())).toList();
   }

   @Override
   public List<fda> a() {
      return this.e;
   }

   @Override
   public tf b() {
      return d;
   }

   @Override
   public void a(fcy $$0) {
      $$0.a(this);
   }

   @Override
   public tf aF_() {
      return c;
   }

   @Override
   public void a(erw $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aG_() {
      return !this.e.isEmpty();
   }
}
