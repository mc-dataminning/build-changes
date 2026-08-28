import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ars implements arp {
   private final arp a;
   private final bqd<Runnable> b;
   private boolean c;

   private ars(arp $$0, Executor $$1) {
      this.a = $$0;
      this.b = bqd.a($$1, "progressListener");
   }

   public static ars a(arp $$0, Executor $$1) {
      ars $$2 = new ars($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dcy $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(dcy $$0, @Nullable dwx $$1) {
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
