import javax.annotation.Nullable;

public class aer implements zb<abm> {
   public static final ys<vu, aer> a = zb.a(aer::a, aer::new);
   private final int b;
   private final int c;

   public aer(brh $$0, @Nullable brh $$1) {
      this.b = $$0.aj();
      this.c = $$1 != null ? $$1.aj() : 0;
   }

   private aer(vu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vu $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zd<aer> a() {
      return afx.aD;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
