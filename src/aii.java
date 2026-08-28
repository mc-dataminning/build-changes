import javax.annotation.Nullable;

public class aii implements zf<agp> {
   public static final yw<vu, aii> a = zf.a(aii::a, aii::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aii(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aii(vu $$0) {
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
   public zh<aii> a() {
      return agn.ce;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   @Nullable
   public dil a(djm $$0) {
      bwi $$1 = $$0.a(this.b);
      return $$1 instanceof cuj ? ((cuj)$$1).q() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
