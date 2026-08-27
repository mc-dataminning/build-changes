import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class amq implements amn {
   private final amn a;
   private final bhq<Runnable> b;

   private amq(amn $$0, Executor $$1) {
      this.a = $$0;
      this.b = bhq.a($$1, "progressListener");
   }

   public static amq a(amn $$0, Executor $$1) {
      amq $$2 = new amq($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(crh $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(crh $$0, @Nullable djj $$1) {
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
