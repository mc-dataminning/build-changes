import java.util.Arrays;
import java.util.Optional;

public class dno extends dmo {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ajv h = new ajv("empty");
   private ajv i = new ajv("empty");
   private aju<egz> j = aju.a(ku.aJ, new ajv("empty"));
   private dno.a k = dno.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dno(id $$0, dpi $$1) {
      super(dmq.F, $$0, $$1);
   }

   public ajv b() {
      return this.h;
   }

   public ajv c() {
      return this.i;
   }

   public aju<egz> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dno.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.n;
   }

   public void a(ajv $$0) {
      this.h = $$0;
   }

   public void b(ajv $$0) {
      this.i = $$0;
   }

   public void a(aju<egz> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dno.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
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
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.h = new ajv($$0.l("name"));
      this.i = new ajv($$0.l("target"));
      this.j = aju.a(ku.aJ, new ajv($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dno.a.a($$0.l("joint")).orElseGet(() -> dgi.m(this.n()).o().d() ? dno.a.b : dno.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public abh t() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return this.d($$0);
   }

   public void a(apu $$0, int $$1, boolean $$2) {
      id $$3 = this.az_().a(this.n().c(dgi.b).a());
      ja<egz> $$4 = $$0.H_().d(ku.aJ);
      in<egz> $$5 = $$4.g(this.j);
      egt.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements ayg {
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

      public static Optional<dno.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public wi a() {
         return wi.c("jigsaw_block.joint." + this.c);
      }
   }
}
