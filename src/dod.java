import java.util.Arrays;
import java.util.Optional;

public class dod extends dnd {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private akf h = new akf("empty");
   private akf i = new akf("empty");
   private ake<ehp> j = ake.a(ld.aL, new akf("empty"));
   private dod.a k = dod.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dod(im $$0, dpy $$1) {
      super(dnf.F, $$0, $$1);
   }

   public akf b() {
      return this.h;
   }

   public akf c() {
      return this.i;
   }

   public ake<ehp> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dod.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.n;
   }

   public void a(akf $$0) {
      this.h = $$0;
   }

   public void b(akf $$0) {
      this.i = $$0;
   }

   public void a(ake<ehp> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dod.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
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
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.h = new akf($$0.l("name"));
      this.i = new akf($$0.l("target"));
      this.j = ake.a(ld.aL, new akf($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dod.a.a($$0.l("joint")).orElseGet(() -> dgx.m(this.n()).o().d() ? dod.a.b : dod.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public abr t() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return this.d($$0);
   }

   public void a(aqe $$0, int $$1, boolean $$2) {
      im $$3 = this.az_().a(this.n().c(dgx.b).a());
      ji<ehp> $$4 = $$0.H_().d(ld.aL);
      iv<ehp> $$5 = $$4.g(this.j);
      ehj.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements ayq {
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

      public static Optional<dod.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public ws a() {
         return ws.c("jigsaw_block.joint." + this.c);
      }
   }
}
