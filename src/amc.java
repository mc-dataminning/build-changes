import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class amc implements alz {
   private final alz a;
   private final bgu<Runnable> b;

   private amc(alz $$0, Executor $$1) {
      this.a = $$0;
      this.b = bgu.a($$1, "progressListener");
   }

   public static amc a(alz $$0, Executor $$1) {
      amc $$2 = new amc($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cqg $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cqg $$0, @Nullable dic $$1) {
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
