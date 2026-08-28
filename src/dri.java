import java.util.Arrays;
import java.util.Optional;

public class dri extends dqh {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private akr h = akr.b("empty");
   private akr i = akr.b("empty");
   private akq<elb> j = akq.a(lu.aU, akr.b("empty"));
   private dri.a k = dri.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dri(jd $$0, dtc $$1) {
      super(dqj.F, $$0, $$1);
   }

   public akr b() {
      return this.h;
   }

   public akr c() {
      return this.i;
   }

   public akq<elb> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dri.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(akr $$0) {
      this.h = $$0;
   }

   public void b(akr $$0) {
      this.i = $$0;
   }

   public void a(akq<elb> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dri.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
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
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.h = akr.a($$0.l("name"));
      this.i = akr.a($$0.l("target"));
      this.j = akq.a(lu.aU, akr.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dri.a.a($$0.l("joint")).orElseGet(() -> dka.m(this.n()).o().d() ? dri.a.b : dri.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public acb u() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      return this.e($$0);
   }

   public void a(aqu $$0, int $$1, boolean $$2) {
      jd $$3 = this.aD_().a(this.n().c(dka.b).a());
      jz<elb> $$4 = $$0.H_().d(lu.aU);
      jm<elb> $$5 = $$4.g(this.j);
      ekv.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azk {
      a("rollable"),
      b("aligned");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      @Override
      public String c() {
         return this.c;
      }

      public static Optional<dri.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public wz a() {
         return wz.c("jigsaw_block.joint." + this.c);
      }
   }
}
