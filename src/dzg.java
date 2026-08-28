import com.mojang.serialization.Codec;

public class dzg extends dyc {
   public static final Codec<alh<etl>> a = alh.a(mh.bf);
   public static final ali b = ali.b("empty");
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
   private ali m = b;
   private ali q = b;
   private alh<etl> r = qo.a;
   private dzg.a s = dzg.a.a;
   private String t = "minecraft:air";
   private int u = 0;
   private int v = 0;

   public dzg(iv $$0, ebe $$1) {
      super(dye.G, $$0, $$1);
   }

   public ali a() {
      return this.m;
   }

   public ali c() {
      return this.q;
   }

   public alh<etl> d() {
      return this.r;
   }

   public String f() {
      return this.t;
   }

   public dzg.a j() {
      return this.s;
   }

   public int k() {
      return this.u;
   }

   public int s() {
      return this.v;
   }

   public void a(ali $$0) {
      this.m = $$0;
   }

   public void b(ali $$0) {
      this.q = $$0;
   }

   public void a(alh<etl> $$0) {
      this.r = $$0;
   }

   public void a(String $$0) {
      this.t = $$0;
   }

   public void a(dzg.a $$0) {
      this.s = $$0;
   }

   public void a(int $$0) {
      this.u = $$0;
   }

   public void b(int $$0) {
      this.v = $$0;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", ali.a, this.m);
      $$0.a("target", ali.a, this.q);
      $$0.a("pool", a, this.r);
      $$0.a("final_state", this.t);
      $$0.a("joint", dzg.a.c, this.s);
      $$0.a("placement_priority", this.u);
      $$0.a("selection_priority", this.v);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.m = $$0.<ali>a("name", ali.a).orElse(b);
      this.q = $$0.<ali>a("target", ali.a).orElse(b);
      this.r = $$0.<alh<etl>>a("pool", a).orElse(qo.a);
      this.t = $$0.b("final_state", "minecraft:air");
      this.s = $$0.<dzg.a>a("joint", dzg.a.c).orElseGet(() -> ewd.a(this.m()));
      this.u = $$0.b("placement_priority", 0);
      this.v = $$0.b("selection_priority", 0);
   }

   public acc t() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public void a(ars $$0, int $$1, boolean $$2) {
      iv $$3 = this.aB_().a(this.m().c(drj.b).a());
      js<etl> $$4 = $$0.J_().f(mh.bf);
      jf<etl> $$5 = $$4.b(this.r);
      etf.a($$0, $$5, this.q, $$1, $$3, $$2);
   }

   public static enum a implements bam {
      a("rollable"),
      b("aligned");

      public static final bam.a<dzg.a> c = bam.a(dzg.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public xa a() {
         return xa.c("jigsaw_block.joint." + this.d);
      }
   }
}
