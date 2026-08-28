public class dxr extends dwn {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ale h = ale.b("empty");
   private ale i = ale.b("empty");
   private ald<ers> j = ald.a(mg.bd, ale.b("empty"));
   private dxr.a k = dxr.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dxr(iu $$0, dzo $$1) {
      super(dwp.G, $$0, $$1);
   }

   public ale a() {
      return this.h;
   }

   public ale c() {
      return this.i;
   }

   public ald<ers> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dxr.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int s() {
      return this.q;
   }

   public void a(ale $$0) {
      this.h = $$0;
   }

   public void b(ale $$0) {
      this.i = $$0;
   }

   public void a(ald<ers> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dxr.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
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
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.h = ale.a($$0.l("name"));
      this.i = ale.a($$0.l("target"));
      this.j = ald.a(mg.bd, ale.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = euk.a($$0, this.m());
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public aby t() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      return this.e($$0);
   }

   public void a(aro $$0, int $$1, boolean $$2) {
      iu $$3 = this.aw_().a(this.m().c(dpz.b).a());
      jr<ers> $$4 = $$0.F_().f(mg.bd);
      je<ers> $$5 = $$4.b(this.j);
      erm.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements bai {
      a("rollable"),
      b("aligned");

      public static final bai.a<dxr.a> c = bai.a(dxr.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ww a() {
         return ww.c("jigsaw_block.joint." + this.d);
      }
   }
}
