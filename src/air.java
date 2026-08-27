import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class air implements aio {
   private final aio a;
   private final bcq<Runnable> b;

   private air(aio $$0, Executor $$1) {
      this.a = $$0;
      this.b = bcq.a($$1, "progressListener");
   }

   public static air a(aio $$0, Executor $$1) {
      air $$2 = new air($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(clt $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(clt $$0, @Nullable dec $$1) {
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
