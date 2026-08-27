import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class anq implements ann {
   private final ann a;
   private final biv<Runnable> b;

   private anq(ann $$0, Executor $$1) {
      this.a = $$0;
      this.b = biv.a($$1, "progressListener");
   }

   public static anq a(ann $$0, Executor $$1) {
      anq $$2 = new anq($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cte $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cte $$0, @Nullable dlq $$1) {
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
