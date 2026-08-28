public class crf {
   public boolean a;
   public boolean b;
   public boolean c;
   public boolean d;
   public boolean e = true;
   private float f = 0.05F;
   private float g = 0.1F;

   public void a(tz $$0) {
      tz $$1 = new tz();
      $$1.a("invulnerable", this.a);
      $$1.a("flying", this.b);
      $$1.a("mayfly", this.c);
      $$1.a("instabuild", this.d);
      $$1.a("mayBuild", this.e);
      $$1.a("flySpeed", this.f);
      $$1.a("walkSpeed", this.g);
      $$0.a("abilities", $$1);
   }

   public void b(tz $$0) {
      if ($$0.b("abilities", 10)) {
         tz $$1 = $$0.n("abilities");
         this.a = $$1.o("invulnerable");
         this.b = $$1.o("flying");
         this.c = $$1.o("mayfly");
         this.d = $$1.o("instabuild");
         if ($$1.b("flySpeed", 99)) {
            this.f = $$1.h("flySpeed");
            this.g = $$1.h("walkSpeed");
         }

         if ($$1.b("mayBuild", 1)) {
            this.e = $$1.o("mayBuild");
         }
      }
   }

   public float a() {
      return this.f;
   }

   public void a(float $$0) {
      this.f = $$0;
   }

   public float b() {
      return this.g;
   }

   public void b(float $$0) {
      this.g = $$0;
   }
}
