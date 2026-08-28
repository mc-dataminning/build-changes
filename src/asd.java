import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class asd implements asa {
   private final asa a;
   private final bst b;
   private boolean c;

   private asd(asa $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bst($$1, "progressListener");
   }

   public static asd a(asa $$0, Executor $$1) {
      asd $$2 = new asd($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dih $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dih $$0, @Nullable edf $$1) {
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
