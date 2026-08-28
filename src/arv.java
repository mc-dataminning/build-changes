import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arv implements ars {
   private final ars a;
   private final bql<Runnable> b;
   private boolean c;

   private arv(ars $$0, Executor $$1) {
      this.a = $$0;
      this.b = bql.a($$1, "progressListener");
   }

   public static arv a(ars $$0, Executor $$1) {
      arv $$2 = new arv($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(ddp $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(ddp $$0, @Nullable dxp $$1) {
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
