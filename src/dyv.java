public class dyv extends dxr {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alg h = alg.b("empty");
   private alg i = alg.b("empty");
   private alf<esx> j = alf.a(mh.bf, alg.b("empty"));
   private dyv.a k = dyv.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dyv(iv $$0, eat $$1) {
      super(dxt.G, $$0, $$1);
   }

   public alg a() {
      return this.h;
   }

   public alg c() {
      return this.i;
   }

   public alf<esx> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dyv.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int s() {
      return this.q;
   }

   public void a(alg $$0) {
      this.h = $$0;
   }

   public void b(alg $$0) {
      this.i = $$0;
   }

   public void a(alf<esx> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dyv.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", this.h.toString());
      $$0.a("target", this.i.toString());
      $$0.a("pool", this.j.a().toString());
      $$0.a("final_state", this.l);
      $$0.a("joint", dyv.a.c, this.k);
      $$0.a("placement_priority", this.m);
      $$0.a("selection_priority", this.q);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.h = alg.a($$0.j("name"));
      this.i = alg.a($$0.j("target"));
      this.j = alf.a(mh.bf, alg.a($$0.j("pool")));
      this.l = $$0.j("final_state");
      this.k = $$0.<dyv.a>a("joint", dyv.a.c).orElseGet(() -> evp.a(this.m()));
      this.m = $$0.f("placement_priority");
      this.q = $$0.f("selection_priority");
   }

   public aca t() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public void a(arq $$0, int $$1, boolean $$2) {
      iv $$3 = this.ax_().a(this.m().c(dqy.b).a());
      js<esx> $$4 = $$0.F_().f(mh.bf);
      jf<esx> $$5 = $$4.b(this.j);
      esr.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements bak {
      a("rollable"),
      b("aligned");

      public static final bak.a<dyv.a> c = bak.a(dyv.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public wy a() {
         return wy.c("jigsaw_block.joint." + this.d);
      }
   }
}
