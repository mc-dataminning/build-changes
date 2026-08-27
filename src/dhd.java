import java.util.Arrays;
import java.util.Optional;

public class dhd extends dgd {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private agt h = new agt("empty");
   private agt i = new agt("empty");
   private ags<dzx> j = ags.a(kc.aF, new agt("empty"));
   private dhd.a k = dhd.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dhd(hv $$0, dip $$1) {
      super(dgf.F, $$0, $$1);
   }

   public agt c() {
      return this.h;
   }

   public agt d() {
      return this.i;
   }

   public ags<dzx> f() {
      return this.j;
   }

   public String g() {
      return this.l;
   }

   public dhd.a k() {
      return this.k;
   }

   public int l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }

   public void a(agt $$0) {
      this.h = $$0;
   }

   public void b(agt $$0) {
      this.i = $$0;
   }

   public void a(ags<dzx> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dhd.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(sj $$0) {
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
   public void a(sj $$0) {
      super.a($$0);
      this.h = new agt($$0.l("name"));
      this.i = new agt($$0.l("target"));
      this.j = ags.a(kc.aF, new agt($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dhd.a.a($$0.l("joint")).orElseGet(() -> daa.h(this.r()).o().d() ? dhd.a.b : dhd.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public yv w() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
      return this.q();
   }

   public void a(amp $$0, int $$1, boolean $$2) {
      hv $$3 = this.aB_().a(this.r().c(daa.b).a());
      ir<dzx> $$4 = $$0.I_().d(kc.aF);
      ie<dzx> $$5 = $$4.f(this.j);
      dzr.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements aut {
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

      public static Optional<dhd.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public vb a() {
         return vb.c("jigsaw_block.joint." + this.c);
      }
   }
}
