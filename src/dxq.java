import javax.annotation.Nullable;

public class dxq extends dyc implements buu {
   public static final int a = 6;
   private static final String b = "patterns";
   @Nullable
   private xa c;
   private final cyw d;
   private dxs e = dxs.a;

   public dxq(iv $$0, ebe $$1) {
      this($$0, $$1, ((dlt)$$1.b()).b());
   }

   public dxq(iv $$0, ebe $$1, cyw $$2) {
      super(dye.u, $$0, $$1);
      this.d = $$2;
   }

   @Override
   public xa ai() {
      return (xa)(this.c != null ? this.c : xa.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xa ak() {
      return this.c;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      alg<uy> $$2 = $$1.a(un.a);
      if (!this.e.equals(dxs.a)) {
         $$0.a("patterns", dxs.b, $$2, this.e);
      }

      $$0.b("CustomName", xc.a, $$2, this.c);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.c = a($$0.a("CustomName"), $$1);
      alg<uy> $$2 = $$1.a(un.a);
      this.e = $$0.<dxs>a("patterns", dxs.b, $$2).orElse(dxs.a);
   }

   public acc a() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.d($$0);
   }

   public dxs b() {
      return this.e;
   }

   public czy c() {
      czy $$0 = new czy(dmh.a(this.d));
      $$0.b(this.q());
      return $$0;
   }

   public cyw f() {
      return this.d;
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.e = $$0.a(kk.am, dxs.a);
      this.c = $$0.a(kk.g);
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.am, this.e);
      $$0.a(kk.g, this.c);
   }

   @Override
   public void a(tz $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
