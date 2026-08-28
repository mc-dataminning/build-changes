import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arg implements ard {
   private final ard a;
   private final bpk<Runnable> b;
   private boolean c;

   private arg(ard $$0, Executor $$1) {
      this.a = $$0;
      this.b = bpk.a($$1, "progressListener");
   }

   public static arg a(ard $$0, Executor $$1) {
      arg $$2 = new arg($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dcd $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(dcd $$0, @Nullable dvz $$1) {
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
