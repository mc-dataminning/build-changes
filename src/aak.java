import java.util.BitSet;
import javax.annotation.Nullable;

public class aak implements xd<yx> {
   private final int a;
   private final int b;
   private final aal c;

   public aak(csp $$0, edz $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new aal($$0, $$1, $$2, $$3);
   }

   public aak(ug $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new aal($$0, this.a, this.b);
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public aal e() {
      return this.c;
   }
}
