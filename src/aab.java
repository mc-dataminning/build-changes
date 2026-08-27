import java.util.BitSet;
import javax.annotation.Nullable;

public class aab implements wu<yo> {
   private final int a;
   private final int b;
   private final aac c;

   public aab(csf $$0, edo $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new aac($$0, $$1, $$2, $$3);
   }

   public aab(ue $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new aac($$0, this.a, this.b);
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public aac e() {
      return this.c;
   }
}
