import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class api implements apf {
   private final apf a;
   private final bkp<Runnable> b;
   private boolean c;

   private api(apf $$0, Executor $$1) {
      this.a = $$0;
      this.b = bkp.a($$1, "progressListener");
   }

   public static api a(apf $$0, Executor $$1) {
      api $$2 = new api($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cuy $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cuy $$0, @Nullable dnk $$1) {
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
