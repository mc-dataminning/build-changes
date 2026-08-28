import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class asb implements ary {
   private final ary a;
   private final bso b;
   private boolean c;

   private asb(ary $$0, Executor $$1) {
      this.a = $$0;
      this.b = new bso($$1, "progressListener");
   }

   public static asb a(ary $$0, Executor $$1) {
      asb $$2 = new asb($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(dhw $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(dhw $$0, @Nullable ecm $$1) {
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
