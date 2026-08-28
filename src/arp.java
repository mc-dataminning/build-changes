import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class arp implements arm {
   private final arm a;
   private final bqz b;
   private boolean c;

   private arp(arm $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bqz($$1, "progressListener");
   }

   public static arp a(arm $$0, Executor $$1) {
      arp $$2 = new arp($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dfo $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dfo $$0, @Nullable dzt $$1) {
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
