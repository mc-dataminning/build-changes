import javax.annotation.Nullable;

public class afh implements zl<aca> {
   public static final zc<wb, afh> a = zl.a(afh::a, afh::new);
   private final int b;
   private final int c;

   public afh(btr $$0, @Nullable btr $$1) {
      this.b = $$0.ap();
      this.c = $$1 != null ? $$1.ap() : 0;
   }

   private afh(wb $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wb $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zn<afh> a() {
      return agp.aD;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
