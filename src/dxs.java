import javax.annotation.Nullable;

public class dxs extends dye implements buw {
   public static final int a = 6;
   private static final String b = "patterns";
   @Nullable
   private xc c;
   private final cyy d;
   private dxu e = dxu.a;

   public dxs(iw $$0, ebg $$1) {
      this($$0, $$1, ((dlv)$$1.b()).b());
   }

   public dxs(iw $$0, ebg $$1, cyy $$2) {
      super(dyg.u, $$0, $$1);
      this.d = $$2;
   }

   @Override
   public xc ai() {
      return (xc)(this.c != null ? this.c : xc.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xc ak() {
      return this.c;
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      ali<va> $$2 = $$1.a(uo.a);
      if (!this.e.equals(dxu.a)) {
         $$0.a("patterns", dxu.b, $$2, this.e);
      }

      $$0.b("CustomName", xe.a, $$2, this.c);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.c = a($$0.a("CustomName"), $$1);
      ali<va> $$2 = $$1.a(uo.a);
      this.e = $$0.<dxu>a("patterns", dxu.b, $$2).orElse(dxu.a);
   }

   public ace a() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.d($$0);
   }

   public dxu b() {
      return this.e;
   }

   public daa c() {
      daa $$0 = new daa(dmj.a(this.d));
      $$0.b(this.q());
      return $$0;
   }

   public cyy f() {
      return this.d;
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.e = $$0.a(kl.am, dxu.a);
      this.c = $$0.a(kl.g);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.am, this.e);
      $$0.a(kl.g, this.c);
   }

   @Override
   public void a(ua $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
