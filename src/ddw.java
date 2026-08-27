import java.util.Arrays;
import java.util.Optional;

public class ddw extends dcx {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private aey f = new aey("empty");
   private aey g = new aey("empty");
   private aex<dwt> h = aex.a(je.aC, new aey("empty"));
   private ddw.a i = ddw.a.a;
   private String j = "minecraft:air";

   public ddw(gw $$0, dfl $$1) {
      super(dcz.F, $$0, $$1);
   }

   public aey c() {
      return this.f;
   }

   public aey d() {
      return this.g;
   }

   public aex<dwt> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public ddw.a i() {
      return this.i;
   }

   public void a(aey $$0) {
      this.f = $$0;
   }

   public void b(aey $$0) {
      this.g = $$0;
   }

   public void a(aex<dwt> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(ddw.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.f = new aey($$0.l("name"));
      this.g = new aey($$0.l("target"));
      this.h = aex.a(je.aC, new aey($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = ddw.a.a($$0.l("joint")).orElseGet(() -> cww.h(this.q()).o().d() ? ddw.a.b : ddw.a.a);
   }

   public xf j() {
      return xf.a(this);
   }

   @Override
   public qy as_() {
      return this.o();
   }

   public void a(aks $$0, int $$1, boolean $$2) {
      gw $$3 = this.p().a(this.q().c(cww.a).a());
      ht<dwt> $$4 = $$0.G_().d(je.aC);
      hg<dwt> $$5 = $$4.f(this.h);
      dwn.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements asr {
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

      public static Optional<ddw.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public tn a() {
         return tn.c("jigsaw_block.joint." + this.c);
      }
   }
}
