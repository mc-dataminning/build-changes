import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class alf implements alc {
   private final alc a;
   private final bfx<Runnable> b;

   private alf(alc $$0, Executor $$1) {
      this.a = $$0;
      this.b = bfx.a($$1, "progressListener");
   }

   public static alf a(alc $$0, Executor $$1) {
      alf $$2 = new alf($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cpi $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cpi $$0, @Nullable dhe $$1) {
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
