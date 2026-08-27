import java.util.Arrays;
import java.util.Optional;

public class dkl extends djl {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ajc h = new ajc("empty");
   private ajc i = new ajc("empty");
   private ajb<edp> j = ajb.a(ki.aH, new ajc("empty"));
   private dkl.a k = dkl.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dkl(ib $$0, dme $$1) {
      super(djn.F, $$0, $$1);
   }

   public ajc b() {
      return this.h;
   }

   public ajc c() {
      return this.i;
   }

   public ajb<edp> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dkl.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.n;
   }

   public void a(ajc $$0) {
      this.h = $$0;
   }

   public void b(ajc $$0) {
      this.i = $$0;
   }

   public void a(ajb<edp> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dkl.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
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
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = new ajc($$0.l("name"));
      this.i = new ajc($$0.l("target"));
      this.j = ajb.a(ki.aH, new ajc($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dkl.a.a($$0.l("joint")).orElseGet(() -> ddg.m(this.n()).o().d() ? dkl.a.b : dkl.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public aap s() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return this.d($$0);
   }

   public void a(apa $$0, int $$1, boolean $$2) {
      ib $$3 = this.aD_().a(this.n().c(ddg.b).a());
      ix<edp> $$4 = $$0.I_().d(ki.aH);
      il<edp> $$5 = $$4.f(this.j);
      edj.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements axg {
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

      public static Optional<dkl.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public vs a() {
         return vs.c("jigsaw_block.joint." + this.c);
      }
   }
}
