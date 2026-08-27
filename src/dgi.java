import java.util.Arrays;
import java.util.Optional;

public class dgi extends dfi {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private agm h = new agm("empty");
   private agm i = new agm("empty");
   private agl<dyv> j = agl.a(kd.aE, new agm("empty"));
   private dgi.a k = dgi.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dgi(hx $$0, dhn $$1) {
      super(dfk.F, $$0, $$1);
   }

   public agm c() {
      return this.h;
   }

   public agm d() {
      return this.i;
   }

   public agl<dyv> f() {
      return this.j;
   }

   public String g() {
      return this.l;
   }

   public dgi.a k() {
      return this.k;
   }

   public int l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }

   public void a(agm $$0) {
      this.h = $$0;
   }

   public void b(agm $$0) {
      this.i = $$0;
   }

   public void a(agl<dyv> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dgi.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("name", this.h.toString());
      $$0.a("target", this.i.toString());
      $$0.a("pool", this.j.a().toString());
      $$0.a("final_state", this.l);
      $$0.a("joint", this.k.c());
      $$0.a("placement_priority", this.m);
      $$0.a("selection_priority", this.n);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.h = new agm($$0.l("name"));
      this.i = new agm($$0.l("target"));
      this.j = agl.a(kd.aE, new agm($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dgi.a.a($$0.l("joint")).orElseGet(() -> czg.h(this.r()).o().d() ? dgi.a.b : dgi.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public yo w() {
      return yo.a(this);
   }

   @Override
   public sd ay_() {
      return this.q();
   }

   public void a(ami $$0, int $$1, boolean $$2) {
      hx $$3 = this.aC_().a(this.r().c(czg.b).a());
      is<dyv> $$4 = $$0.I_().d(kd.aE);
      ig<dyv> $$5 = $$4.f(this.j);
      dyp.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements auk {
      a("rollable"),
      b("aligned");

      private final String c;

      private a(String $$0) {
         this.c = $$0;
      }

      @Override
      public String c() {
         return this.c;
      }

      public static Optional<dgi.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public uv a() {
         return uv.c("jigsaw_block.joint." + this.c);
      }
   }
}
