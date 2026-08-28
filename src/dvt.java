public class dvt extends duq {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alp h = alp.b("empty");
   private alp i = alp.b("empty");
   private alo<epn> j = alo.a(mb.aX, alp.b("empty"));
   private dvt.a k = dvt.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dvt(jh $$0, dxo $$1) {
      super(dus.G, $$0, $$1);
   }

   public alp b() {
      return this.h;
   }

   public alp c() {
      return this.i;
   }

   public alo<epn> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dvt.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int s() {
      return this.n;
   }

   public void a(alp $$0) {
      this.h = $$0;
   }

   public void b(alp $$0) {
      this.i = $$0;
   }

   public void a(alo<epn> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dvt.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", this.h.toString());
      $$0.a("target", this.i.toString());
      $$0.a("pool", this.j.a().toString());
      $$0.a("final_state", this.l);
      $$0.a("joint", this.k.c());
      $$0.a("placement_priority", this.m);
      $$0.a("selection_priority", this.n);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = alp.a($$0.l("name"));
      this.i = alp.a($$0.l("target"));
      this.j = alo.a(mb.aX, alp.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = esf.a($$0, this.m());
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public acn t() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      return this.e($$0);
   }

   public void a(arx $$0, int $$1, boolean $$2) {
      jh $$3 = this.aB_().a(this.m().c(doh.b).a());
      kd<epn> $$4 = $$0.K_().e(mb.aX);
      jq<epn> $$5 = $$4.b(this.j);
      eph.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements baq {
      a("rollable"),
      b("aligned");

      public static final baq.a<dvt.a> c = baq.a(dvt.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public xk a() {
         return xk.c("jigsaw_block.joint." + this.d);
      }
   }
}
