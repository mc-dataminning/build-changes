import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class asf implements asc {
   private final asc a;
   private final btg b;
   private boolean c;

   private asf(asc $$0, Executor $$1) {
      this.a = $$0;
      this.b = new btg($$1, "progressListener");
   }

   public static asf a(asc $$0, Executor $$1) {
      asf $$2 = new asf($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(djc $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(djc $$0, @Nullable eec $$1) {
      if (this.c) {
         this.b.a_(() -> this.a.a($$0, $$1));
      }
   }

   @Override
   public void a() {
      this.c = true;
      this.b.a_(this.a::a);
   }

   @Override
   public void b() {
      this.c = false;
      this.b.a_(this.a::b);
   }
}
