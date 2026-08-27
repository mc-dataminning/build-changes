import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class apm implements apj {
   private final apj a;
   private final ble<Runnable> b;
   private boolean c;

   private apm(apj $$0, Executor $$1) {
      this.a = $$0;
      this.b = ble.a($$1, "progressListener");
   }

   public static apm a(apj $$0, Executor $$1) {
      apm $$2 = new apm($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cvl $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cvl $$0, @Nullable dof $$1) {
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
