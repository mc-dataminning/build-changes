import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class anp implements anm {
   private final anm a;
   private final bit<Runnable> b;

   private anp(anm $$0, Executor $$1) {
      this.a = $$0;
      this.b = bit.a($$1, "progressListener");
   }

   public static anp a(anm $$0, Executor $$1) {
      anp $$2 = new anp($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(csv $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(csv $$0, @Nullable dlh $$1) {
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
