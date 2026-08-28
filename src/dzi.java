import com.mojang.serialization.Codec;

public class dzi extends dye {
   public static final Codec<alj<etn>> a = alj.a(mi.bf);
   public static final alk b = alk.b("empty");
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
   private alk m = b;
   private alk q = b;
   private alj<etn> r = qp.a;
   private dzi.a s = dzi.a.a;
   private String t = "minecraft:air";
   private int u = 0;
   private int v = 0;

   public dzi(iw $$0, ebg $$1) {
      super(dyg.G, $$0, $$1);
   }

   public alk a() {
      return this.m;
   }

   public alk c() {
      return this.q;
   }

   public alj<etn> d() {
      return this.r;
   }

   public String f() {
      return this.t;
   }

   public dzi.a j() {
      return this.s;
   }

   public int k() {
      return this.u;
   }

   public int s() {
      return this.v;
   }

   public void a(alk $$0) {
      this.m = $$0;
   }

   public void b(alk $$0) {
      this.q = $$0;
   }

   public void a(alj<etn> $$0) {
      this.r = $$0;
   }

   public void a(String $$0) {
      this.t = $$0;
   }

   public void a(dzi.a $$0) {
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
      $$0.a("name", alk.a, this.m);
      $$0.a("target", alk.a, this.q);
      $$0.a("pool", a, this.r);
      $$0.a("final_state", this.t);
      $$0.a("joint", dzi.a.c, this.s);
      $$0.a("placement_priority", this.u);
      $$0.a("selection_priority", this.v);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.m = $$0.<alk>a("name", alk.a).orElse(b);
      this.q = $$0.<alk>a("target", alk.a).orElse(b);
      this.r = $$0.<alj<etn>>a("pool", a).orElse(qp.a);
      this.t = $$0.b("final_state", "minecraft:air");
      this.s = $$0.<dzi.a>a("joint", dzi.a.c).orElseGet(() -> ewf.a(this.m()));
      this.u = $$0.b("placement_priority", 0);
      this.v = $$0.b("selection_priority", 0);
   }

   public ace t() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public void a(aru $$0, int $$1, boolean $$2) {
      iw $$3 = this.aB_().a(this.m().c(drl.b).a());
      jt<etn> $$4 = $$0.J_().f(mi.bf);
      jg<etn> $$5 = $$4.b(this.r);
      eth.a($$0, $$5, this.q, $$1, $$3, $$2);
   }

   public static enum a implements bao {
      a("rollable"),
      b("aligned");

      public static final bao.a<dzi.a> c = bao.a(dzi.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public xc a() {
         return xc.c("jigsaw_block.joint." + this.d);
      }
   }
}
