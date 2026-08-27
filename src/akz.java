import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class akz implements akw {
   private final akw a;
   private final bfm<Runnable> b;

   private akz(akw $$0, Executor $$1) {
      this.a = $$0;
      this.b = bfm.a($$1, "progressListener");
   }

   public static akz a(akw $$0, Executor $$1) {
      akz $$2 = new akz($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cox $$0) {
      this.b.a(() -> this.a.a($$0));
   }

   @Override
   public void a(cox $$0, @Nullable dhf $$1) {
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
