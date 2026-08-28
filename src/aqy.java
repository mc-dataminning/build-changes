import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aqy implements aqv {
   private final aqv a;
   private final bpa<Runnable> b;
   private boolean c;

   private aqy(aqv $$0, Executor $$1) {
      this.a = $$0;
      this.b = bpa.a($$1, "progressListener");
   }

   public static aqy a(aqv $$0, Executor $$1) {
      aqy $$2 = new aqy($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dbn $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(dbn $$0, @Nullable dvi $$1) {
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
