public class dvc extends dtz {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private aku h = aku.b("empty");
   private aku i = aku.b("empty");
   private akt<eow> j = akt.a(mc.aX, aku.b("empty"));
   private dvc.a k = dvc.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dvc(ji $$0, dwx $$1) {
      super(dub.G, $$0, $$1);
   }

   public aku b() {
      return this.h;
   }

   public aku c() {
      return this.i;
   }

   public akt<eow> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dvc.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int s() {
      return this.n;
   }

   public void a(aku $$0) {
      this.h = $$0;
   }

   public void b(aku $$0) {
      this.i = $$0;
   }

   public void a(akt<eow> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dvc.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
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
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.h = aku.a($$0.l("name"));
      this.i = aku.a($$0.l("target"));
      this.j = akt.a(mc.aX, aku.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = ero.a($$0, this.m());
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public abr t() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public void a(arc $$0, int $$1, boolean $$2) {
      ji $$3 = this.aA_().a(this.m().c(dnq.b).a());
      ke<eow> $$4 = $$0.K_().e(mc.aX);
      jr<eow> $$5 = $$4.b(this.j);
      eoq.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azv {
      a("rollable"),
      b("aligned");

      public static final azv.a<dvc.a> c = azv.a(dvc.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public wo a() {
         return wo.c("jigsaw_block.joint." + this.d);
      }
   }
}
