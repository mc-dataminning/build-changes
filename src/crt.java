public class crt {
   private static final boolean f = false;
   private static final boolean g = false;
   private static final boolean h = false;
   private static final boolean i = false;
   private static final boolean j = true;
   private static final float k = 0.05F;
   private static final float l = 0.1F;
   public boolean a;
   public boolean b;
   public boolean c;
   public boolean d;
   public boolean e = true;
   private float m = 0.05F;
   private float n = 0.1F;

   public void a(tz $$0) {
      tz $$1 = new tz();
      $$1.a("invulnerable", this.a);
      $$1.a("flying", this.b);
      $$1.a("mayfly", this.c);
      $$1.a("instabuild", this.d);
      $$1.a("mayBuild", this.e);
      $$1.a("flySpeed", this.m);
      $$1.a("walkSpeed", this.n);
      $$0.a("abilities", $$1);
   }

   public void b(tz $$0) {
      tz $$1 = $$0.n("abilities");
      this.a = $$1.b("invulnerable", false);
      this.b = $$1.b("flying", false);
      this.c = $$1.b("mayfly", false);
      this.d = $$1.b("instabuild", false);
      this.m = $$1.b("flySpeed", 0.05F);
      this.n = $$1.b("walkSpeed", 0.1F);
      this.e = $$1.b("mayBuild", true);
   }

   public float a() {
      return this.m;
   }

   public void a(float $$0) {
      this.m = $$0;
   }

   public float b() {
      return this.n;
   }

   public void b(float $$0) {
      this.n = $$0;
   }
}
