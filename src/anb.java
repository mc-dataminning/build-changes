import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class anb implements amy {
   private final amy a;
   private final bie<Runnable> b;

   private anb(amy $$0, Executor $$1) {
      this.a = $$0;
      this.b = bie.a($$1, "progressListener");
   }

   public static anb a(amy $$0, Executor $$1) {
      anb $$2 = new anb($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(csf $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(csf $$0, @Nullable dkq $$1) {
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
