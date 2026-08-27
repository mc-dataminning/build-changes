import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class amu implements amr {
   private final amr a;
   private final bhu<Runnable> b;

   private amu(amr $$0, Executor $$1) {
      this.a = $$0;
      this.b = bhu.a($$1, "progressListener");
   }

   public static amu a(amr $$0, Executor $$1) {
      amu $$2 = new amu($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(crm $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(crm $$0, @Nullable djo $$1) {
      this.b.a(() -> this.a.a($$0, $$1));
   }

   @Override
   public void a() {
      this.b.a(this.a::a);
   }

   @Override
   public void b() {
      this.b.a(this.a::b);
   }
}
