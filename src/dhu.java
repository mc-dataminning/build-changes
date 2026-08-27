import java.util.Arrays;
import java.util.Optional;

public class dhu extends dgu {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ahg h = new ahg("empty");
   private ahg i = new ahg("empty");
   private ahf<eao> j = ahf.a(ke.aG, new ahg("empty"));
   private dhu.a k = dhu.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dhu(hx $$0, djg $$1) {
      super(dgw.F, $$0, $$1);
   }

   public ahg c() {
      return this.h;
   }

   public ahg d() {
      return this.i;
   }

   public ahf<eao> f() {
      return this.j;
   }

   public String g() {
      return this.l;
   }

   public dhu.a k() {
      return this.k;
   }

   public int l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }

   public void a(ahg $$0) {
      this.h = $$0;
   }

   public void b(ahg $$0) {
      this.i = $$0;
   }

   public void a(ahf<eao> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dhu.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(sn $$0) {
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
   public void a(sn $$0) {
      super.a($$0);
      this.h = new ahg($$0.l("name"));
      this.i = new ahg($$0.l("target"));
      this.j = ahf.a(ke.aG, new ahg($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dhu.a.a($$0.l("joint")).orElseGet(() -> daq.h(this.r()).o().d() ? dhu.a.b : dhu.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public zh w() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   public void a(and $$0, int $$1, boolean $$2) {
      hx $$3 = this.aB_().a(this.r().c(daq.b).a());
      it<eao> $$4 = $$0.I_().d(ke.aG);
      ih<eao> $$5 = $$4.f(this.j);
      eai.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements avj {
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

      public static Optional<dhu.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public vf a() {
         return vf.c("jigsaw_block.joint." + this.c);
      }
   }
}
