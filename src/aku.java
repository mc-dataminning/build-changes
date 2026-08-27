import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aku implements akr {
   private final akr a;
   private final bfh<Runnable> b;

   private aku(akr $$0, Executor $$1) {
      this.a = $$0;
      this.b = bfh.a($$1, "progressListener");
   }

   public static aku a(akr $$0, Executor $$1) {
      aku $$2 = new aku($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cor $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cor $$0, @Nullable dgz $$1) {
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
