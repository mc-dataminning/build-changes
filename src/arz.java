import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arz implements arw {
   private final arw a;
   private final bqo b;
   private boolean c;

   private arz(arw $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bqo($$1, "progressListener");
   }

   public static arz a(arw $$0, Executor $$1) {
      arz $$2 = new arz($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(deb $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(deb $$0, @Nullable dya $$1) {
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
