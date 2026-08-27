import java.util.Arrays;
import java.util.Optional;

public class did extends dhd {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ahh h = new ahh("empty");
   private ahh i = new ahh("empty");
   private ahg<eax> j = ahg.a(ke.aG, new ahh("empty"));
   private did.a k = did.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public did(hx $$0, djp $$1) {
      super(dhf.F, $$0, $$1);
   }

   public ahh c() {
      return this.h;
   }

   public ahh d() {
      return this.i;
   }

   public ahg<eax> f() {
      return this.j;
   }

   public String g() {
      return this.l;
   }

   public did.a k() {
      return this.k;
   }

   public int l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }

   public void a(ahh $$0) {
      this.h = $$0;
   }

   public void b(ahh $$0) {
      this.i = $$0;
   }

   public void a(ahg<eax> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(did.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(so $$0) {
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
   public void a(so $$0) {
      super.a($$0);
      this.h = new ahh($$0.l("name"));
      this.i = new ahh($$0.l("target"));
      this.j = ahg.a(ke.aG, new ahh($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = did.a.a($$0.l("joint")).orElseGet(() -> daz.h(this.r()).o().d() ? did.a.b : did.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public zi w() {
      return zi.a(this);
   }

   @Override
   public so aA_() {
      return this.q();
   }

   public void a(ane $$0, int $$1, boolean $$2) {
      hx $$3 = this.aE_().a(this.r().c(daz.b).a());
      it<eax> $$4 = $$0.I_().d(ke.aG);
      ih<eax> $$5 = $$4.f(this.j);
      ear.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements avl {
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

      public static Optional<did.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public vg a() {
         return vg.c("jigsaw_block.joint." + this.c);
      }
   }
}
