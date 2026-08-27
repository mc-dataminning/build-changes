import java.util.Arrays;
import java.util.Optional;

public class djx extends dix {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private aiy h = new aiy("empty");
   private aiy i = new aiy("empty");
   private aix<ecu> j = aix.a(kg.aG, new aiy("empty"));
   private djx.a k = djx.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public djx(hz $$0, dlj $$1) {
      super(diz.F, $$0, $$1);
   }

   public aiy c() {
      return this.h;
   }

   public aiy d() {
      return this.i;
   }

   public aix<ecu> f() {
      return this.j;
   }

   public String g() {
      return this.l;
   }

   public djx.a k() {
      return this.k;
   }

   public int l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }

   public void a(aiy $$0) {
      this.h = $$0;
   }

   public void b(aiy $$0) {
      this.i = $$0;
   }

   public void a(aix<ecu> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(djx.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(sw $$0) {
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
   public void a(sw $$0) {
      super.a($$0);
      this.h = new aiy($$0.l("name"));
      this.i = new aiy($$0.l("target"));
      this.j = aix.a(kg.aG, new aiy($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = djx.a.a($$0.l("joint")).orElseGet(() -> dct.m(this.r()).o().d() ? djx.a.b : djx.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public aan w() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      return this.q();
   }

   public void a(aow $$0, int $$1, boolean $$2) {
      hz $$3 = this.aE_().a(this.r().c(dct.b).a());
      iv<ecu> $$4 = $$0.I_().d(kg.aG);
      ij<ecu> $$5 = $$4.f(this.j);
      eco.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements axc {
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

      public static Optional<djx.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public vq a() {
         return vq.c("jigsaw_block.joint." + this.c);
      }
   }
}
