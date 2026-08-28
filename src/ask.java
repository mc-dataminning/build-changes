import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ask implements ash {
   private final ash a;
   private final brq b;
   private boolean c;

   private ask(ash $$0, Executor $$1) {
      this.a = $$0;
      this.b = new brq($$1, "progressListener");
   }

   public static ask a(ash $$0, Executor $$1) {
      ask $$2 = new ask($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dgf $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dgf $$0, @Nullable eak $$1) {
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
