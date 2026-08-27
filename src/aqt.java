import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aqt implements aqq {
   private final aqq a;
   private final bof<Runnable> b;
   private boolean c;

   private aqt(aqq $$0, Executor $$1) {
      this.a = $$0;
      this.b = bof.a($$1, "progressListener");
   }

   public static aqt a(aqq $$0, Executor $$1) {
      aqt $$2 = new aqt($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(czk $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(czk $$0, @Nullable dtc $$1) {
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
