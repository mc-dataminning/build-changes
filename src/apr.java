import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class apr implements apo {
   private final apo a;
   private final blw<Runnable> b;
   private boolean c;

   private apr(apo $$0, Executor $$1) {
      this.a = $$0;
      this.b = blw.a($$1, "progressListener");
   }

   public static apr a(apo $$0, Executor $$1) {
      apr $$2 = new apr($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cwi $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cwi $$0, @Nullable dpc $$1) {
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
