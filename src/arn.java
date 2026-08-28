import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arn implements ark {
   private final ark a;
   private final bpi<Runnable> b;
   private boolean c;

   private arn(ark $$0, Executor $$1) {
      this.a = $$0;
      this.b = bpi.a($$1, "progressListener");
   }

   public static arn a(ark $$0, Executor $$1) {
      arn $$2 = new arn($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dba $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(dba $$0, @Nullable dus $$1) {
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
