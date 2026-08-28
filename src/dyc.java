import javax.annotation.Nullable;

public class dyc extends dyo implements bvf {
   public static final int a = 6;
   private static final String b = "patterns";
   @Nullable
   private xg c;
   private final czi d;
   private dye e = dye.a;

   public dyc(iw $$0, ebq $$1) {
      this($$0, $$1, ((dmf)$$1.b()).b());
   }

   public dyc(iw $$0, ebq $$1, czi $$2) {
      super(dyq.u, $$0, $$1);
      this.d = $$2;
   }

   @Override
   public xg ah() {
      return (xg)(this.c != null ? this.c : xg.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xg aj() {
      return this.c;
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      alp<va> $$2 = $$1.a(uo.a);
      if (!this.e.equals(dye.a)) {
         $$0.a("patterns", dye.b, $$2, this.e);
      }

      $$0.b("CustomName", xi.a, $$2, this.c);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.c = a($$0.a("CustomName"), $$1);
      alp<va> $$2 = $$1.a(uo.a);
      this.e = $$0.<dye>a("patterns", dye.b, $$2).orElse(dye.a);
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.d($$0);
   }

   public dye b() {
      return this.e;
   }

   public dak c() {
      dak $$0 = new dak(dmt.a(this.d));
      $$0.b(this.q());
      return $$0;
   }

   public czi f() {
      return this.d;
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.e = $$0.a(kl.am, dye.a);
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
