import java.util.Arrays;
import java.util.Optional;

public class dqn extends dpn {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private akk h = new akk("empty");
   private akk i = new akk("empty");
   private akj<ejz> j = akj.a(lr.aT, new akk("empty"));
   private dqn.a k = dqn.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dqn(ja $$0, dsh $$1) {
      super(dpp.F, $$0, $$1);
   }

   public akk b() {
      return this.h;
   }

   public akk c() {
      return this.i;
   }

   public akj<ejz> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dqn.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(akk $$0) {
      this.h = $$0;
   }

   public void b(akk $$0) {
      this.i = $$0;
   }

   public void a(akj<ejz> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dqn.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
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
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.h = new akk($$0.l("name"));
      this.i = new akk($$0.l("target"));
      this.j = akj.a(lr.aT, new akk($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dqn.a.a($$0.l("joint")).orElseGet(() -> djh.m(this.n()).o().d() ? dqn.a.b : dqn.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public abu u() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.e($$0);
   }

   public void a(aqk $$0, int $$1, boolean $$2) {
      ja $$3 = this.az_().a(this.n().c(djh.b).a());
      jw<ejz> $$4 = $$0.H_().d(lr.aT);
      jj<ejz> $$5 = $$4.g(this.j);
      ejt.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements ayz {
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

      public static Optional<dqn.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public wu a() {
         return wu.c("jigsaw_block.joint." + this.c);
      }
   }
}
