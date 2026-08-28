import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class aso implements asl {
   private final asl a;
   private final btr b;
   private boolean c;

   private aso(asl $$0, Executor $$1) {
      this.a = $$0;
      this.b = new btr($$1, "progressListener");
   }

   public static aso a(asl $$0, Executor $$1) {
      aso $$2 = new aso($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(djo $$0) {
      this.b.a_(() -> this.a.a($$0));
   }

   @Override
   public void a(djo $$0, @Nullable eeo $$1) {
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
