import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class akw implements akt {
   private final akt a;
   private final bfj<Runnable> b;

   private akw(akt $$0, Executor $$1) {
      this.a = $$0;
      this.b = bfj.a($$1, "progressListener");
   }

   public static akw a(akt $$0, Executor $$1) {
      akw $$2 = new akw($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cos $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cos $$0, @Nullable dha $$1) {
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
