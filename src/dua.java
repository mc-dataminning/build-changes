import java.util.Arrays;
import java.util.Optional;

public class dua extends dsy {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alj h = alj.b("empty");
   private alj i = alj.b("empty");
   private ali<ens> j = ali.a(ma.aV, alj.b("empty"));
   private dua.a k = dua.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dua(jh $$0, dvv $$1) {
      super(dta.F, $$0, $$1);
   }

   public alj b() {
      return this.h;
   }

   public alj c() {
      return this.i;
   }

   public ali<ens> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dua.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(alj $$0) {
      this.h = $$0;
   }

   public void b(alj $$0) {
      this.i = $$0;
   }

   public void a(ali<ens> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dua.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
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
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = alj.a($$0.l("name"));
      this.i = alj.a($$0.l("target"));
      this.j = ali.a(ma.aV, alj.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dua.a.a($$0.l("joint")).orElseGet(() -> dmr.o(this.m()).o().d() ? dua.a.b : dua.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public acm u() {
      return acm.a(this);
   }

   @Override
   public ul a(js.a $$0) {
      return this.e($$0);
   }

   public void a(arp $$0, int $$1, boolean $$2) {
      jh $$3 = this.aA_().a(this.m().c(dmr.b).a());
      kd<ens> $$4 = $$0.J_().e(ma.aV);
      jq<ens> $$5 = $$4.b(this.j);
      enm.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements bai {
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

      public static Optional<dua.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xj a() {
         return xj.c("jigsaw_block.joint." + this.c);
      }
   }
}
