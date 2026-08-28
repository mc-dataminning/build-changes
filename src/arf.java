import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arf implements arc {
   private final arc a;
   private final bpj<Runnable> b;
   private boolean c;

   private arf(arc $$0, Executor $$1) {
      this.a = $$0;
      this.b = bpj.a($$1, "progressListener");
   }

   public static arf a(arc $$0, Executor $$1) {
      arf $$2 = new arf($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dcb $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(dcb $$0, @Nullable dvx $$1) {
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
