import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class asa implements arx {
   private final arx a;
   private final bqt b;
   private boolean c;

   private asa(arx $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bqt($$1, "progressListener");
   }

   public static asa a(arx $$0, Executor $$1) {
      asa $$2 = new asa($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(deh $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(deh $$0, @Nullable dyg $$1) {
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
