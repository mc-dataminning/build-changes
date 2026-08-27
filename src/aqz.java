import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aqz implements aqw {
   private final aqw a;
   private final bop<Runnable> b;
   private boolean c;

   private aqz(aqw $$0, Executor $$1) {
      this.a = $$0;
      this.b = bop.a($$1, "progressListener");
   }

   public static aqz a(aqw $$0, Executor $$1) {
      aqz $$2 = new aqz($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dag $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(dag $$0, @Nullable dty $$1) {
      if (this.c) {
         this.b.a(() -> this.a.a($$0, $$1));
      }
   }

   @Override
   public void a() {
      this.c = true;
      this.b.a(this.a::a);
   }

   @Override
   public void b() {
      this.c = false;
      this.b.a(this.a::b);
   }
}
