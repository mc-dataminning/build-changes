import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aph implements ape {
   private final ape a;
   private final bkn<Runnable> b;
   private boolean c;

   private aph(ape $$0, Executor $$1) {
      this.a = $$0;
      this.b = bkn.a($$1, "progressListener");
   }

   public static aph a(ape $$0, Executor $$1) {
      aph $$2 = new aph($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cuu $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cuu $$0, @Nullable dng $$1) {
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
