import java.util.Arrays;
import java.util.Optional;

public class dgd extends dfd {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private agi h = new agi("empty");
   private agi i = new agi("empty");
   private agh<dyq> j = agh.a(jz.aE, new agi("empty"));
   private dgd.a k = dgd.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dgd(ht $$0, dhi $$1) {
      super(dff.F, $$0, $$1);
   }

   public agi c() {
      return this.h;
   }

   public agi d() {
      return this.i;
   }

   public agh<dyq> f() {
      return this.j;
   }

   public String g() {
      return this.l;
   }

   public dgd.a i() {
      return this.k;
   }

   public int j() {
      return this.m;
   }

   public int v() {
      return this.n;
   }

   public void a(agi $$0) {
      this.h = $$0;
   }

   public void b(agi $$0) {
      this.i = $$0;
   }

   public void a(agh<dyq> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dgd.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(rz $$0) {
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
   public void a(rz $$0) {
      super.a($$0);
      this.h = new agi($$0.l("name"));
      this.i = new agi($$0.l("target"));
      this.j = agh.a(jz.aE, new agi($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dgd.a.a($$0.l("joint")).orElseGet(() -> czb.h(this.q()).o().d() ? dgd.a.b : dgd.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public yk w() {
      return yk.a(this);
   }

   @Override
   public rz aw_() {
      return this.o();
   }

   public void a(ame $$0, int $$1, boolean $$2) {
      ht $$3 = this.p().a(this.q().c(czb.b).a());
      io<dyq> $$4 = $$0.H_().d(jz.aE);
      ib<dyq> $$5 = $$4.f(this.j);
      dyk.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements aug {
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

      public static Optional<dgd.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public ur a() {
         return ur.c("jigsaw_block.joint." + this.c);
      }
   }
}
