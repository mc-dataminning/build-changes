public class dwa extends dux {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alz h = alz.b("empty");
   private alz i = alz.b("empty");
   private aly<epu> j = aly.a(mb.aX, alz.b("empty"));
   private dwa.a k = dwa.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dwa(jh $$0, dxv $$1) {
      super(duz.G, $$0, $$1);
   }

   public alz b() {
      return this.h;
   }

   public alz c() {
      return this.i;
   }

   public aly<epu> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dwa.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(alz $$0) {
      this.h = $$0;
   }

   public void b(alz $$0) {
      this.i = $$0;
   }

   public void a(aly<epu> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dwa.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
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
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = alz.a($$0.l("name"));
      this.i = alz.a($$0.l("target"));
      this.j = aly.a(mb.aX, alz.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = esm.a($$0, this.m());
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public acy u() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public void a(ash $$0, int $$1, boolean $$2) {
      jh $$3 = this.aB_().a(this.m().c(doq.b).a());
      kd<epu> $$4 = $$0.K_().e(mb.aX);
      jq<epu> $$5 = $$4.b(this.j);
      epo.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements bba {
      a("rollable"),
      b("aligned");

      public static final bba.a<dwa.a> c = bba.a(dwa.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public xv a() {
         return xv.c("jigsaw_block.joint." + this.d);
      }
   }
}
