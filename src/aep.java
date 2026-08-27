import javax.annotation.Nullable;

public class aep implements yz<abk> {
   public static final yq<vs, aep> a = yz.a(aep::a, aep::new);
   private final int b;
   private final int c;

   public aep(bql $$0, @Nullable bql $$1) {
      this.b = $$0.aj();
      this.c = $$1 != null ? $$1.aj() : 0;
   }

   private aep(vs $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vs $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zb<aep> a() {
      return afv.aD;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
