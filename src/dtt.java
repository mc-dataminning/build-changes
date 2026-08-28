import java.util.Arrays;
import java.util.Optional;

public class dtt extends dsr {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private all h = all.b("empty");
   private all i = all.b("empty");
   private alk<enl> j = alk.a(ma.aV, all.b("empty"));
   private dtt.a k = dtt.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dtt(jh $$0, dvo $$1) {
      super(dst.F, $$0, $$1);
   }

   public all b() {
      return this.h;
   }

   public all c() {
      return this.i;
   }

   public alk<enl> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dtt.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(all $$0) {
      this.h = $$0;
   }

   public void b(all $$0) {
      this.i = $$0;
   }

   public void a(alk<enl> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dtt.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(un $$0, js.a $$1) {
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
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = all.a($$0.l("name"));
      this.i = all.a($$0.l("target"));
      this.j = alk.a(ma.aV, all.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dtt.a.a($$0.l("joint")).orElseGet(() -> dmk.o(this.m()).o().d() ? dtt.a.b : dtt.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public aco u() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.e($$0);
   }

   public void a(arq $$0, int $$1, boolean $$2) {
      jh $$3 = this.aB_().a(this.m().c(dmk.b).a());
      kd<enl> $$4 = $$0.H_().e(ma.aV);
      jq<enl> $$5 = $$4.b(this.j);
      enf.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements baj {
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

      public static Optional<dtt.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xl a() {
         return xl.c("jigsaw_block.joint." + this.c);
      }
   }
}
