import java.util.Arrays;
import java.util.Optional;

public class dlg extends dkg {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ajh h = new ajh("empty");
   private ajh i = new ajh("empty");
   private ajg<eel> j = ajg.a(kj.aH, new ajh("empty"));
   private dlg.a k = dlg.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dlg(ib $$0, dmz $$1) {
      super(dki.F, $$0, $$1);
   }

   public ajh b() {
      return this.h;
   }

   public ajh c() {
      return this.i;
   }

   public ajg<eel> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dlg.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.n;
   }

   public void a(ajh $$0) {
      this.h = $$0;
   }

   public void b(ajh $$0) {
      this.i = $$0;
   }

   public void a(ajg<eel> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dlg.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
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
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = new ajh($$0.l("name"));
      this.i = new ajh($$0.l("target"));
      this.j = ajg.a(kj.aH, new ajh($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dlg.a.a($$0.l("joint")).orElseGet(() -> deb.m(this.n()).o().d() ? dlg.a.b : dlg.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public aat s() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      return this.d($$0);
   }

   public void a(apf $$0, int $$1, boolean $$2) {
      ib $$3 = this.aC_().a(this.n().c(deb.b).a());
      iy<eel> $$4 = $$0.H_().d(kj.aH);
      il<eel> $$5 = $$4.g(this.j);
      eef.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements axq {
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

      public static Optional<dlg.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public vu a() {
         return vu.c("jigsaw_block.joint." + this.c);
      }
   }
}
