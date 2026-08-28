import java.util.Arrays;
import java.util.Optional;

public class dqc extends dpc {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alb h = new alb("empty");
   private alb i = new alb("empty");
   private ala<ejo> j = ala.a(lq.aM, new alb("empty"));
   private dqc.a k = dqc.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dqc(iz $$0, drx $$1) {
      super(dpe.F, $$0, $$1);
   }

   public alb b() {
      return this.h;
   }

   public alb c() {
      return this.i;
   }

   public ala<ejo> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dqc.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(alb $$0) {
      this.h = $$0;
   }

   public void b(alb $$0) {
      this.i = $$0;
   }

   public void a(ala<ejo> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dqc.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
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
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = new alb($$0.l("name"));
      this.i = new alb($$0.l("target"));
      this.j = ala.a(lq.aM, new alb($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dqc.a.a($$0.l("joint")).orElseGet(() -> diw.m(this.n()).o().d() ? dqc.a.b : dqc.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public acl u() {
      return acl.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.e($$0);
   }

   public void a(arb $$0, int $$1, boolean $$2) {
      iz $$3 = this.aA_().a(this.n().c(diw.b).a());
      jv<ejo> $$4 = $$0.H_().d(lq.aM);
      ji<ejo> $$5 = $$4.g(this.j);
      eji.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azp {
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

      public static Optional<dqc.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xl a() {
         return xl.c("jigsaw_block.joint." + this.c);
      }
   }
}
