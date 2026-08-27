import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class amm implements amj {
   private final amj a;
   private final bhj<Runnable> b;

   private amm(amj $$0, Executor $$1) {
      this.a = $$0;
      this.b = bhj.a($$1, "progressListener");
   }

   public static amm a(amj $$0, Executor $$1) {
      amm $$2 = new amm($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cqz $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cqz $$0, @Nullable dix $$1) {
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
