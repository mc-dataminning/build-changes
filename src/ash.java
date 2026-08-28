import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ash implements ase {
   private final ase a;
   private final bti b;
   private boolean c;

   private ash(ase $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bti($$1, "progressListener");
   }

   public static ash a(ase $$0, Executor $$1) {
      ash $$2 = new ash($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dje $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dje $$0, @Nullable eee $$1) {
      if (this.c) {
         this.b.a_(() -> this.a.a($$0, $$1));
      }
   }

   @Override
   public void a() {
      this.c = true;
      this.b.a_(this.a::a);
   }

   @Override
   public void b() {
      this.c = false;
      this.b.a_(this.a::b);
   }
}
