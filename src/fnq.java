import com.google.common.collect.Sets;
import java.util.Set;

public class fnq implements fnd.a {
   private static final int a = 60;
   private final Set<hx> b = Sets.newHashSet();

   fnq() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(hx $$0) {
      this.b.add($$0);
   }

   public void b(hx $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
      gu $$5 = gu.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(eij $$0, fjx $$1, hx $$2) {
      int $$3 = 1;
      gu $$4 = $$2.q();
      gu $$5 = $$4.b(-1, -1, -1);
      gu $$6 = $$4.b(1, 1, 1);
      fnd.a($$0, $$1, $$5, $$6, 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
