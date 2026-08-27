import java.util.Arrays;
import java.util.Optional;

public class ddj extends dck {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private aep f = new aep("empty");
   private aep g = new aep("empty");
   private aeo<dwg> h = aeo.a(jd.aC, new aep("empty"));
   private ddj.a i = ddj.a.a;
   private String j = "minecraft:air";

   public ddj(gv $$0, dey $$1) {
      super(dcm.F, $$0, $$1);
   }

   public aep c() {
      return this.f;
   }

   public aep d() {
      return this.g;
   }

   public aeo<dwg> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public ddj.a i() {
      return this.i;
   }

   public void a(aep $$0) {
      this.f = $$0;
   }

   public void b(aep $$0) {
      this.g = $$0;
   }

   public void a(aeo<dwg> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(ddj.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.f = new aep($$0.l("name"));
      this.g = new aep($$0.l("target"));
      this.h = aeo.a(jd.aC, new aep($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = ddj.a.a($$0.l("joint")).orElseGet(() -> cwj.h(this.q()).o().d() ? ddj.a.b : ddj.a.a);
   }

   public ww j() {
      return ww.a(this);
   }

   @Override
   public qs ao_() {
      return this.o();
   }

   public void a(aki $$0, int $$1, boolean $$2) {
      gv $$3 = this.p().a(this.q().c(cwj.a).a());
      hs<dwg> $$4 = $$0.B_().d(jd.aC);
      hf<dwg> $$5 = $$4.f(this.h);
      dwa.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements asf {
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

      public static Optional<ddj.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public te a() {
         return te.c("jigsaw_block.joint." + this.c);
      }
   }
}
