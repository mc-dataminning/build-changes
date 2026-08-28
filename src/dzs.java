import com.mojang.serialization.Codec;

public class dzs extends dyo {
   public static final Codec<alq<etx>> a = alq.a(mi.bf);
   public static final alr b = alr.b("empty");
   private static final int k = 0;
   private static final int l = 0;
   public static final String c = "target";
   public static final String d = "pool";
   public static final String e = "joint";
   public static final String f = "placement_priority";
   public static final String g = "selection_priority";
   public static final String h = "name";
   public static final String i = "final_state";
   public static final String j = "minecraft:air";
   private alr m = b;
   private alr q = b;
   private alq<etx> r = qp.a;
   private dzs.a s = dzs.a.a;
   private String t = "minecraft:air";
   private int u = 0;
   private int v = 0;

   public dzs(iw $$0, ebq $$1) {
      super(dyq.G, $$0, $$1);
   }

   public alr a() {
      return this.m;
   }

   public alr c() {
      return this.q;
   }

   public alq<etx> d() {
      return this.r;
   }

   public String f() {
      return this.t;
   }

   public dzs.a j() {
      return this.s;
   }

   public int k() {
      return this.u;
   }

   public int s() {
      return this.v;
   }

   public void a(alr $$0) {
      this.m = $$0;
   }

   public void b(alr $$0) {
      this.q = $$0;
   }

   public void a(alq<etx> $$0) {
      this.r = $$0;
   }

   public void a(String $$0) {
      this.t = $$0;
   }

   public void a(dzs.a $$0) {
      this.s = $$0;
   }

   public void a(int $$0) {
      this.u = $$0;
   }

   public void b(int $$0) {
      this.v = $$0;
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", alr.a, this.m);
      $$0.a("target", alr.a, this.q);
      $$0.a("pool", a, this.r);
      $$0.a("final_state", this.t);
      $$0.a("joint", dzs.a.c, this.s);
      $$0.a("placement_priority", this.u);
      $$0.a("selection_priority", this.v);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.m = $$0.<alr>a("name", alr.a).orElse(b);
      this.q = $$0.<alr>a("target", alr.a).orElse(b);
      this.r = $$0.<alq<etx>>a("pool", a).orElse(qp.a);
      this.t = $$0.b("final_state", "minecraft:air");
      this.s = $$0.<dzs.a>a("joint", dzs.a.c).orElseGet(() -> ewp.a(this.m()));
      this.u = $$0.b("placement_priority", 0);
      this.v = $$0.b("selection_priority", 0);
   }

   public acl t() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public void a(asb $$0, int $$1, boolean $$2) {
      iw $$3 = this.ax_().a(this.m().c(drv.b).a());
      jt<etx> $$4 = $$0.J_().f(mi.bf);
      jg<etx> $$5 = $$4.b(this.r);
      etr.a($$0, $$5, this.q, $$1, $$3, $$2);
   }

   public static enum a implements bax {
      a("rollable"),
      b("aligned");

      public static final bax.a<dzs.a> c = bax.a(dzs.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public xg a() {
         return xg.c("jigsaw_block.joint." + this.d);
      }
   }
}
