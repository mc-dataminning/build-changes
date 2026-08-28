import java.util.Arrays;
import java.util.Optional;

public class drg extends dqf {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private akq h = akq.b("empty");
   private akq i = akq.b("empty");
   private akp<ekw> j = akp.a(lu.aU, akq.b("empty"));
   private drg.a k = drg.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public drg(jd $$0, dta $$1) {
      super(dqh.F, $$0, $$1);
   }

   public akq b() {
      return this.h;
   }

   public akq c() {
      return this.i;
   }

   public akp<ekw> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public drg.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(akq $$0) {
      this.h = $$0;
   }

   public void b(akq $$0) {
      this.i = $$0;
   }

   public void a(akp<ekw> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(drg.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
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
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.h = akq.a($$0.l("name"));
      this.i = akq.a($$0.l("target"));
      this.j = akp.a(lu.aU, akq.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = drg.a.a($$0.l("joint")).orElseGet(() -> djy.m(this.n()).o().d() ? drg.a.b : drg.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public aca u() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      return this.e($$0);
   }

   public void a(aqt $$0, int $$1, boolean $$2) {
      jd $$3 = this.az_().a(this.n().c(djy.b).a());
      jz<ekw> $$4 = $$0.H_().d(lu.aU);
      jm<ekw> $$5 = $$4.g(this.j);
      ekq.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements azj {
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

      public static Optional<drg.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public wy a() {
         return wy.c("jigsaw_block.joint." + this.c);
      }
   }
}
