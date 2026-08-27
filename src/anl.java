import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class anl implements ani {
   private final ani a;
   private final bio<Runnable> b;

   private anl(ani $$0, Executor $$1) {
      this.a = $$0;
      this.b = bio.a($$1, "progressListener");
   }

   public static anl a(ani $$0, Executor $$1) {
      anl $$2 = new anl($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(csp $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(csp $$0, @Nullable dlb $$1) {
      this.b.a(() -> this.a.a($$0, $$1));
   }

   @Override
   public void a() {
      this.b.a(this.a::a);
   }

   @Override
   public void b() {
      this.b.a(this.a::b);
   }
}
