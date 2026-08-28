import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class asd implements asa {
   private final asa a;
   private final bsr b;
   private boolean c;

   private asd(asa $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bsr($$1, "progressListener");
   }

   public static asd a(asa $$0, Executor $$1) {
      asd $$2 = new asd($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dic $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dic $$0, @Nullable ecx $$1) {
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
