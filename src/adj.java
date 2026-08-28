import java.util.BitSet;
import javax.annotation.Nullable;

public class adj implements zg<abu> {
   public static final yx<vw, adj> a = zg.a(adj::a, adj::new);
   private final int b;
   private final int c;
   private final adk d;

   public adj(dcd $$0, eor $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adk($$0, $$1, $$2, $$3);
   }

   private adj(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adk($$0, this.b, this.c);
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zi<adj> a() {
      return agg.N;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adk f() {
      return this.d;
   }
}
