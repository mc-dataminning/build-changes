import java.util.BitSet;
import javax.annotation.Nullable;

public class acz implements zb<abn> {
   public static final ys<wf, acz> a = zb.a(acz::a, acz::new);
   private final int b;
   private final int c;
   private final acy d;
   private final add e;

   public acz(duq $$0, enw $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dbm $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new acy($$0);
      this.e = new add($$4, $$1, $$2, $$3);
   }

   private acz(wf $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new acy($$0, this.b, this.c);
      this.e = new add($$0, this.b, this.c);
   }

   private void a(wf $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zd<acz> a() {
      return afz.K;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acy f() {
      return this.d;
   }

   public add g() {
      return this.e;
   }
}
