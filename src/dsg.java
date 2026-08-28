import java.util.Arrays;
import java.util.Optional;

public class dsg extends dre {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alb h = alb.b("empty");
   private alb i = alb.b("empty");
   private ala<ely> j = ala.a(lv.aU, alb.b("empty"));
   private dsg.a k = dsg.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dsg(je $$0, dua $$1) {
      super(drg.F, $$0, $$1);
   }

   public alb b() {
      return this.h;
   }

   public alb c() {
      return this.i;
   }

   public ala<ely> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dsg.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(alb $$0) {
      this.h = $$0;
   }

   public void b(alb $$0) {
      this.i = $$0;
   }

   public void a(ala<ely> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dsg.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
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
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.h = alb.a($$0.l("name"));
      this.i = alb.a($$0.l("target"));
      this.j = ala.a(lv.aU, alb.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dsg.a.a($$0.l("joint")).orElseGet(() -> dkx.o(this.m()).o().d() ? dsg.a.b : dsg.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public acg u() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.e($$0);
   }

   public void a(arg $$0, int $$1, boolean $$2) {
      je $$3 = this.aD_().a(this.m().c(dkx.b).a());
      ka<ely> $$4 = $$0.F_().d(lv.aU);
      jn<ely> $$5 = $$4.g(this.j);
      els.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azy {
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

      public static Optional<dsg.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xd a() {
         return xd.c("jigsaw_block.joint." + this.c);
      }
   }
}
