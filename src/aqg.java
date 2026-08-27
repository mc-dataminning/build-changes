import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aqg implements aqd {
   private final aqd a;
   private final bmy<Runnable> b;
   private boolean c;

   private aqg(aqd $$0, Executor $$1) {
      this.a = $$0;
      this.b = bmy.a($$1, "progressListener");
   }

   public static aqg a(aqd $$0, Executor $$1) {
      aqg $$2 = new aqg($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cyn $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cyn $$0, @Nullable dsd $$1) {
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
