import java.util.Arrays;
import java.util.Optional;

public class dti extends dsg {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alh h = alh.b("empty");
   private alh i = alh.b("empty");
   private alg<enb> j = alg.a(ly.aV, alh.b("empty"));
   private dti.a k = dti.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dti(jg $$0, dvd $$1) {
      super(dsi.F, $$0, $$1);
   }

   public alh b() {
      return this.h;
   }

   public alh c() {
      return this.i;
   }

   public alg<enb> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dti.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(alh $$0) {
      this.h = $$0;
   }

   public void b(alh $$0) {
      this.i = $$0;
   }

   public void a(alg<enb> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dti.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
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
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.h = alh.a($$0.l("name"));
      this.i = alh.a($$0.l("target"));
      this.j = alg.a(ly.aV, alh.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dti.a.a($$0.l("joint")).orElseGet(() -> dlz.o(this.m()).o().d() ? dti.a.b : dti.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public ack u() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      return this.e($$0);
   }

   public void a(arm $$0, int $$1, boolean $$2) {
      jg $$3 = this.aC_().a(this.m().c(dlz.b).a());
      kc<enb> $$4 = $$0.H_().e(ly.aV);
      jp<enb> $$5 = $$4.b(this.j);
      emv.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements baf {
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

      public static Optional<dti.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xh a() {
         return xh.c("jigsaw_block.joint." + this.c);
      }
   }
}
