import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aqe implements aqb {
   private final aqb a;
   private final bmt<Runnable> b;
   private boolean c;

   private aqe(aqb $$0, Executor $$1) {
      this.a = $$0;
      this.b = bmt.a($$1, "progressListener");
   }

   public static aqe a(aqb $$0, Executor $$1) {
      aqe $$2 = new aqe($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cye $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cye $$0, @Nullable dru $$1) {
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
