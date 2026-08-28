import javax.annotation.Nullable;

public class ajd implements aac<ahm> {
   public static final zt<ws, ajd> a = aac.a(ajd::a, ajd::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ajd(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ajd(ws $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aae<ajd> a() {
      return ahk.cc;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   @Nullable
   public dgh a(dhh $$0) {
      bvj $$1 = $$0.a(this.b);
      return $$1 instanceof csf ? ((csf)$$1).v() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
