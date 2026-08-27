import java.util.Arrays;
import java.util.Optional;

public class dom extends dnm {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private akh h = new akh("empty");
   private akh i = new akh("empty");
   private akg<ehy> j = akg.a(le.aM, new akh("empty"));
   private dom.a k = dom.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dom(in $$0, dqh $$1) {
      super(dno.F, $$0, $$1);
   }

   public akh b() {
      return this.h;
   }

   public akh c() {
      return this.i;
   }

   public akg<ehy> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dom.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(akh $$0) {
      this.h = $$0;
   }

   public void b(akh $$0) {
      this.i = $$0;
   }

   public void a(akg<ehy> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dom.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
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
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.h = new akh($$0.l("name"));
      this.i = new akh($$0.l("target"));
      this.j = akg.a(le.aM, new akh($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dom.a.a($$0.l("joint")).orElseGet(() -> dhg.m(this.n()).o().d() ? dom.a.b : dom.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public abt t() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      return this.d($$0);
   }

   public void a(aqh $$0, int $$1, boolean $$2) {
      in $$3 = this.az_().a(this.n().c(dhg.b).a());
      jj<ehy> $$4 = $$0.H_().d(le.aM);
      iw<ehy> $$5 = $$4.g(this.j);
      ehs.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements ayt {
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

      public static Optional<dom.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public wu a() {
         return wu.c("jigsaw_block.joint." + this.c);
      }
   }
}
