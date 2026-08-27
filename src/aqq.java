import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aqq implements aqn {
   private final aqn a;
   private final bnj<Runnable> b;
   private boolean c;

   private aqq(aqn $$0, Executor $$1) {
      this.a = $$0;
      this.b = bnj.a($$1, "progressListener");
   }

   public static aqq a(aqn $$0, Executor $$1) {
      aqq $$2 = new aqq($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(czb $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(czb $$0, @Nullable dst $$1) {
      if (this.c) {
         this.b.a(() -> this.a.a($$0, $$1));
      }
   }

   @Override
   public void a() {
      this.c = true;
      this.b.a(this.a::a);
   }

   @Override
   public void b() {
      this.c = false;
      this.b.a(this.a::b);
   }
}
