import javax.annotation.Nullable;

public class ahz implements zl<agl> {
   public static final zc<we, ahz> a = zl.a(ahz::a, ahz::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahz(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahz(we $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahz> a() {
      return agj.bV;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   @Nullable
   public dbb a(dca $$0) {
      brv $$1 = $$0.a(this.b);
      return $$1 instanceof coe ? ((coe)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
