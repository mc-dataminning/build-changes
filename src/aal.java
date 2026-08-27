import java.util.BitSet;
import javax.annotation.Nullable;

public class aal implements xg<zb> {
   private final int a;
   private final int b;
   private final aak c;
   private final aap d;

   public aal(dlw $$0, eeo $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cte $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new aak($$0);
      this.d = new aap($$4, $$1, $$2, $$3);
   }

   public aal(uj $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new aak($$0, this.a, this.b);
      this.d = new aap($$0, this.a, this.b);
   }

   @Override
   public void a(uj $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public aak e() {
      return this.c;
   }

   public aap f() {
      return this.d;
   }
}
