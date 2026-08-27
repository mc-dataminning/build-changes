import java.util.Arrays;
import java.util.Optional;

public class dre extends dqc {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private akt h = new akt("empty");
   private akt i = new akt("empty");
   private aks<elc> j = aks.a(li.aM, new akt("empty"));
   private dre.a k = dre.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dre(ir $$0, dtc $$1) {
      super(dqe.G, $$0, $$1);
   }

   public akt b() {
      return this.h;
   }

   public akt c() {
      return this.i;
   }

   public aks<elc> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dre.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(akt $$0) {
      this.h = $$0;
   }

   public void b(akt $$0) {
      this.i = $$0;
   }

   public void a(aks<elc> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dre.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
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
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.h = new akt($$0.l("name"));
      this.i = new akt($$0.l("target"));
      this.j = aks.a(li.aM, new akt($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dre.a.a($$0.l("joint")).orElseGet(() -> dji.m(this.n()).o().d() ? dre.a.b : dre.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public ace t() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return this.d($$0);
   }

   public void a(aqt $$0, int $$1, boolean $$2) {
      ir $$3 = this.az_().a(this.n().c(dji.b).a());
      jn<elc> $$4 = $$0.I_().d(li.aM);
      ja<elc> $$5 = $$4.g(this.j);
      ekw.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azg {
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

      public static Optional<dre.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xe a() {
         return xe.c("jigsaw_block.joint." + this.c);
      }
   }
}
