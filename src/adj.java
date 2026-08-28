import java.util.BitSet;
import javax.annotation.Nullable;

public class adj implements zf<abu> {
   public static final yw<vu, adj> a = zf.a(adj::a, adj::new);
   private final int b;
   private final int c;
   private final adk d;

   public adj(dic $$0, evv $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new adk($$0, $$1, $$2, $$3);
   }

   private adj(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adk($$0, this.b, this.c);
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zh<adj> a() {
      return agn.N;
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
