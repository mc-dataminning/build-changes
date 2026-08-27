import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fdi implements fde, fdf {
   private static final aer a = new aer("spectator/teleport_to_player");
   private static final Comparator<fiv> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final tf c = tf.c("spectatorMenu.teleport");
   private static final tf d = tf.c("spectatorMenu.teleport.prompt");
   private final List<fdf> e;

   public fdi() {
      this(eql.O().J().m());
   }

   public fdi(Collection<fiv> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cpi.d).sorted(b).map($$0x -> new fdb($$0x.a())).toList();
   }

   @Override
   public List<fdf> a() {
      return this.e;
   }

   @Override
   public tf b() {
      return d;
   }

   @Override
   public void a(fdd $$0) {
      $$0.a(this);
   }

   @Override
   public tf aD_() {
      return c;
   }

   @Override
   public void a(erv $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aE_() {
      return !this.e.isEmpty();
   }
}
