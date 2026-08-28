public class dwp extends dvl {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ald h = ald.b("empty");
   private ald i = ald.b("empty");
   private alc<eqq> j = alc.a(me.bc, ald.b("empty"));
   private dwp.a k = dwp.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dwp(jj $$0, dym $$1) {
      super(dvn.G, $$0, $$1);
   }

   public ald a() {
      return this.h;
   }

   public ald c() {
      return this.i;
   }

   public alc<eqq> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dwp.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int s() {
      return this.q;
   }

   public void a(ald $$0) {
      this.h = $$0;
   }

   public void b(ald $$0) {
      this.i = $$0;
   }

   public void a(alc<eqq> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dwp.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", this.h.toString());
      $$0.a("target", this.i.toString());
      $$0.a("pool", this.j.a().toString());
      $$0.a("final_state", this.l);
      $$0.a("joint", this.k.c());
      $$0.a("placement_priority", this.m);
      $$0.a("selection_priority", this.q);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.h = ald.a($$0.l("name"));
      this.i = ald.a($$0.l("target"));
      this.j = alc.a(me.bc, ald.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = eti.a($$0, this.m());
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public abx t() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.e($$0);
   }

   public void a(arn $$0, int $$1, boolean $$2) {
      jj $$3 = this.aw_().a(this.m().c(doz.b).a());
      kf<eqq> $$4 = $$0.F_().f(me.bc);
      js<eqq> $$5 = $$4.b(this.j);
      eqk.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements bag {
      a("rollable"),
      b("aligned");

      public static final bag.a<dwp.a> c = bag.a(dwp.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public wv a() {
         return wv.c("jigsaw_block.joint." + this.d);
      }
   }
}
