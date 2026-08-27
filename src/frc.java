import com.google.common.collect.Sets;
import java.util.Set;

public class frc implements fqp.a {
   private static final int a = 60;
   private final Set<hy> b = Sets.newHashSet();

   frc() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(hy $$0) {
      this.b.add($$0);
   }

   public void b(hy $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(elh $$0, fng $$1, double $$2, double $$3, double $$4) {
      gv $$5 = gv.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(elh $$0, fng $$1, hy $$2) {
      int $$3 = 1;
      gv $$4 = $$2.q();
      gv $$5 = $$4.b(-1, -1, -1);
      gv $$6 = $$4.b(1, 1, 1);
      fqp.a($$0, $$1, $$5, $$6, 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
