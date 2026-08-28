import javax.annotation.Nullable;

public class dwt extends dxf implements bug {
   public static final int a = 6;
   private static final String b = "patterns";
   @Nullable
   private wy c;
   private final cyb d;
   private dwv e = dwv.a;

   public dwt(iu $$0, eah $$1) {
      this($$0, $$1, ((dkw)$$1.b()).b());
   }

   public dwt(iu $$0, eah $$1, cyb $$2) {
      super(dxh.u, $$0, $$1);
      this.d = $$2;
   }

   @Override
   public wy al() {
      return (wy)(this.c != null ? this.c : wy.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wy an() {
      return this.c;
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      if (!this.e.equals(dwv.a)) {
         $$0.a("patterns", dwv.b, $$2, this.e);
      }

      if (this.c != null) {
         $$0.a("CustomName", xa.a, $$2, this.c);
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("CustomName")) {
         this.c = a($$0.c("CustomName"), $$1);
      }

      ale<uw> $$2 = $$1.a(un.a);
      this.e = $$0.<dwv>a("patterns", dwv.b, $$2).orElse(dwv.a);
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return this.d($$0);
   }

   public dwv b() {
      return this.e;
   }

   public czd c() {
      czd $$0 = new czd(dlk.a(this.d));
      $$0.b(this.q());
      return $$0;
   }

   public cyb f() {
      return this.d;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.e = $$0.a(kj.am, dwv.a);
      this.c = $$0.a(kj.g);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.am, this.e);
      $$0.a(kj.g, this.c);
   }

   @Override
   public void a(tz $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
