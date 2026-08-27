import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ald implements ala {
   private final ala a;
   private final bfr<Runnable> b;

   private ald(ala $$0, Executor $$1) {
      this.a = $$0;
      this.b = bfr.a($$1, "progressListener");
   }

   public static ald a(ala $$0, Executor $$1) {
      ald $$2 = new ald($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cpc $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cpc $$0, @Nullable dhk $$1) {
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
