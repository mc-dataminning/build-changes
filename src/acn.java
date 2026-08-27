import java.util.BitSet;
import javax.annotation.Nullable;

public class acn implements yn<aay> {
   public static final ye<vg, acn> a = yn.a(acn::a, acn::new);
   private final int b;
   private final int c;
   private final aco d;

   public acn(cye $$0, ekh $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new aco($$0, $$1, $$2, $$3);
   }

   private acn(vg $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new aco($$0, this.b, this.c);
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public yp<acn> a() {
      return afj.N;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aco f() {
      return this.d;
   }
}
