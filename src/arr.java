import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arr implements aro {
   private final aro a;
   private final bpp<Runnable> b;
   private boolean c;

   private arr(aro $$0, Executor $$1) {
      this.a = $$0;
      this.b = bpp.a($$1, "progressListener");
   }

   public static arr a(aro $$0, Executor $$1) {
      arr $$2 = new arr($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dbh $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(dbh $$0, @Nullable duz $$1) {
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
