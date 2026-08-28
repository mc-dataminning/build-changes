import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arq implements arn {
   private final arn a;
   private final brb b;
   private boolean c;

   private arq(arn $$0, Executor $$1) {
      this.a = $$0;
      this.b = new brb($$1, "progressListener");
   }

   public static arq a(arn $$0, Executor $$1) {
      arq $$2 = new arq($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dfp $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dfp $$0, @Nullable dzu $$1) {
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
