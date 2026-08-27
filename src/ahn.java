import javax.annotation.Nullable;

public class ahn implements zb<afz> {
   public static final ys<vu, ahn> a = zb.a(ahn::a, ahn::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahn(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahn(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<ahn> a() {
      return afx.bT;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   @Nullable
   public cze a(dad $$0) {
      brh $$1 = $$0.a(this.b);
      return $$1 instanceof cnk ? ((cnk)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
