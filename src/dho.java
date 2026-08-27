import java.util.Arrays;
import java.util.Optional;

public class dho extends dgo {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ahd h = new ahd("empty");
   private ahd i = new ahd("empty");
   private ahc<eai> j = ahc.a(ke.aG, new ahd("empty"));
   private dho.a k = dho.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dho(hx $$0, dja $$1) {
      super(dgq.F, $$0, $$1);
   }

   public ahd c() {
      return this.h;
   }

   public ahd d() {
      return this.i;
   }

   public ahc<eai> f() {
      return this.j;
   }

   public String g() {
      return this.l;
   }

   public dho.a k() {
      return this.k;
   }

   public int l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }

   public void a(ahd $$0) {
      this.h = $$0;
   }

   public void b(ahd $$0) {
      this.i = $$0;
   }

   public void a(ahc<eai> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dho.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("name", this.h.toString());
      $$0.a("target", this.i.toString());
      $$0.a("pool", this.j.a().toString());
      $$0.a("final_state", this.l);
      $$0.a("joint", this.k.c());
      $$0.a("placement_priority", this.m);
      $$0.a("selection_priority", this.n);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.h = new ahd($$0.l("name"));
      this.i = new ahd($$0.l("target"));
      this.j = ahc.a(ke.aG, new ahd($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dho.a.a($$0.l("joint")).orElseGet(() -> dak.h(this.r()).o().d() ? dho.a.b : dho.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public ze w() {
      return ze.a(this);
   }

   @Override
   public sl ax_() {
      return this.q();
   }

   public void a(amz $$0, int $$1, boolean $$2) {
      hx $$3 = this.aB_().a(this.r().c(dak.b).a());
      it<eai> $$4 = $$0.I_().d(ke.aG);
      ih<eai> $$5 = $$4.f(this.j);
      eac.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements ave {
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

      public static Optional<dho.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public vd a() {
         return vd.c("jigsaw_block.joint." + this.c);
      }
   }
}
