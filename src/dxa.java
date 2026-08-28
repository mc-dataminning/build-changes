import javax.annotation.Nullable;

public class dxa extends dxm implements buj {
   public static final int a = 6;
   private static final String b = "patterns";
   @Nullable
   private wy c;
   private final cyi d;
   private dxc e = dxc.a;

   public dxa(iv $$0, eao $$1) {
      this($$0, $$1, ((dld)$$1.b()).b());
   }

   public dxa(iv $$0, eao $$1, cyi $$2) {
      super(dxo.u, $$0, $$1);
      this.d = $$2;
   }

   @Override
   public wy ai() {
      return (wy)(this.c != null ? this.c : wy.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wy ak() {
      return this.c;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      if (!this.e.equals(dxc.a)) {
         $$0.a("patterns", dxc.b, $$2, this.e);
      }

      $$0.b("CustomName", xa.a, $$2, this.c);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.c = a($$0.a("CustomName"), $$1);
      ale<uw> $$2 = $$1.a(un.a);
      this.e = $$0.<dxc>a("patterns", dxc.b, $$2).orElse(dxc.a);
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.d($$0);
   }

   public dxc b() {
      return this.e;
   }

   public czk c() {
      czk $$0 = new czk(dlr.a(this.d));
      $$0.b(this.q());
      return $$0;
   }

   public cyi f() {
      return this.d;
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.e = $$0.a(kk.am, dxc.a);
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
      $$0.p("patterns");
      $$0.p("CustomName");
   }
}
