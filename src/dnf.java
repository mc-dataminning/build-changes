import java.util.Arrays;
import java.util.Optional;

public class dnf extends dmf {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ajt h = new ajt("empty");
   private ajt i = new ajt("empty");
   private ajs<egq> j = ajs.a(ks.aI, new ajt("empty"));
   private dnf.a k = dnf.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dnf(ib $$0, doz $$1) {
      super(dmh.F, $$0, $$1);
   }

   public ajt b() {
      return this.h;
   }

   public ajt c() {
      return this.i;
   }

   public ajs<egq> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dnf.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.n;
   }

   public void a(ajt $$0) {
      this.h = $$0;
   }

   public void b(ajt $$0) {
      this.i = $$0;
   }

   public void a(ajs<egq> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dnf.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
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
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = new ajt($$0.l("name"));
      this.i = new ajt($$0.l("target"));
      this.j = ajs.a(ks.aI, new ajt($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dnf.a.a($$0.l("joint")).orElseGet(() -> dfz.m(this.n()).o().d() ? dnf.a.b : dnf.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public abf t() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   public void a(aps $$0, int $$1, boolean $$2) {
      ib $$3 = this.aA_().a(this.n().c(dfz.b).a());
      iy<egq> $$4 = $$0.H_().d(ks.aI);
      il<egq> $$5 = $$4.g(this.j);
      egk.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements aye {
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

      public static Optional<dnf.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public wg a() {
         return wg.c("jigsaw_block.joint." + this.c);
      }
   }
}
