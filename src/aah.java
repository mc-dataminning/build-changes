import java.util.BitSet;
import javax.annotation.Nullable;

public class aah implements xd<yx> {
   private final int a;
   private final int b;
   private final aag c;
   private final aal d;

   public aah(dlh $$0, edz $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      csp $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new aag($$0);
      this.d = new aal($$4, $$1, $$2, $$3);
   }

   public aah(ug $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new aag($$0, this.a, this.b);
      this.d = new aal($$0, this.a, this.b);
   }

   @Override
   public void a(ug $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public aag e() {
      return this.c;
   }

   public aal f() {
      return this.d;
   }
}
