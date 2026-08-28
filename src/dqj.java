import java.util.Arrays;
import java.util.Optional;

public class dqj extends dpj {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alf h = new alf("empty");
   private alf i = new alf("empty");
   private ale<ejv> j = ale.a(lq.aM, new alf("empty"));
   private dqj.a k = dqj.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dqj(iz $$0, dse $$1) {
      super(dpl.F, $$0, $$1);
   }

   public alf b() {
      return this.h;
   }

   public alf c() {
      return this.i;
   }

   public ale<ejv> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dqj.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(alf $$0) {
      this.h = $$0;
   }

   public void b(alf $$0) {
      this.i = $$0;
   }

   public void a(ale<ejv> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dqj.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
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
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = new alf($$0.l("name"));
      this.i = new alf($$0.l("target"));
      this.j = ale.a(lq.aM, new alf($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dqj.a.a($$0.l("joint")).orElseGet(() -> djd.m(this.n()).o().d() ? dqj.a.b : dqj.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public acp u() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.e($$0);
   }

   public void a(arf $$0, int $$1, boolean $$2) {
      iz $$3 = this.ay_().a(this.n().c(djd.b).a());
      jv<ejv> $$4 = $$0.H_().d(lq.aM);
      ji<ejv> $$5 = $$4.g(this.j);
      ejp.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azu {
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

      public static Optional<dqj.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xp a() {
         return xp.c("jigsaw_block.joint." + this.c);
      }
   }
}
