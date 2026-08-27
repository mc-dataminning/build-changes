import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ale implements alb {
   private final alb a;
   private final bft<Runnable> b;

   private ale(alb $$0, Executor $$1) {
      this.a = $$0;
      this.b = bft.a($$1, "progressListener");
   }

   public static ale a(alb $$0, Executor $$1) {
      ale $$2 = new ale($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cpe $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cpe $$0, @Nullable dhm $$1) {
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
