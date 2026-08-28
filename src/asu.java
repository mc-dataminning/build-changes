import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class asu implements asr {
   private final asr a;
   private final bru b;
   private boolean c;

   private asu(asr $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bru($$1, "progressListener");
   }

   public static asu a(asr $$0, Executor $$1) {
      asu $$2 = new asu($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dgg $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dgg $$0, @Nullable eaj $$1) {
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
