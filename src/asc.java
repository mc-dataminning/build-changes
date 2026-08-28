import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class asc implements arz {
   private final arz a;
   private final bra b;
   private boolean c;

   private asc(arz $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bra($$1, "progressListener");
   }

   public static asc a(arz $$0, Executor $$1) {
      asc $$2 = new asc($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(des $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(des $$0, @Nullable dyr $$1) {
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
