import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class art implements arq {
   private final arq a;
   private final bqi<Runnable> b;
   private boolean c;

   private art(arq $$0, Executor $$1) {
      this.a = $$0;
      this.b = bqi.a($$1, "progressListener");
   }

   public static art a(arq $$0, Executor $$1) {
      art $$2 = new art($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(ddm $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(ddm $$0, @Nullable dxl $$1) {
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
