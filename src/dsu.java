import java.util.Arrays;
import java.util.Optional;

public class dsu extends drs {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private alc h = alc.b("empty");
   private alc i = alc.b("empty");
   private alb<emm> j = alb.a(lv.aV, alc.b("empty"));
   private dsu.a k = dsu.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dsu(je $$0, duo $$1) {
      super(dru.F, $$0, $$1);
   }

   public alc b() {
      return this.h;
   }

   public alc c() {
      return this.i;
   }

   public alb<emm> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dsu.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(alc $$0) {
      this.h = $$0;
   }

   public void b(alc $$0) {
      this.i = $$0;
   }

   public void a(alb<emm> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dsu.a $$0) {
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
      this.h = alc.a($$0.l("name"));
      this.i = alc.a($$0.l("target"));
      this.j = alb.a(lv.aV, alc.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dsu.a.a($$0.l("joint")).orElseGet(() -> dll.o(this.m()).o().d() ? dsu.a.b : dsu.a.a);
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

   public void a(arh $$0, int $$1, boolean $$2) {
      je $$3 = this.aB_().a(this.m().c(dll.b).a());
      ka<emm> $$4 = $$0.F_().d(lv.aV);
      jn<emm> $$5 = $$4.g(this.j);
      emg.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azz {
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

      public static Optional<dsu.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xd a() {
         return xd.c("jigsaw_block.joint." + this.c);
      }
   }
}
