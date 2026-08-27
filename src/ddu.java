import java.util.Arrays;
import java.util.Optional;

public class ddu extends dcv {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private aew f = new aew("empty");
   private aew g = new aew("empty");
   private aev<dwr> h = aev.a(jc.aC, new aew("empty"));
   private ddu.a i = ddu.a.a;
   private String j = "minecraft:air";

   public ddu(gw $$0, dfj $$1) {
      super(dcx.F, $$0, $$1);
   }

   public aew c() {
      return this.f;
   }

   public aew d() {
      return this.g;
   }

   public aev<dwr> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public ddu.a i() {
      return this.i;
   }

   public void a(aew $$0) {
      this.f = $$0;
   }

   public void b(aew $$0) {
      this.g = $$0;
   }

   public void a(aev<dwr> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(ddu.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.f = new aew($$0.l("name"));
      this.g = new aew($$0.l("target"));
      this.h = aev.a(jc.aC, new aew($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = ddu.a.a($$0.l("joint")).orElseGet(() -> cwu.h(this.q()).o().d() ? ddu.a.b : ddu.a.a);
   }

   public xd j() {
      return xd.a(this);
   }

   @Override
   public qw as_() {
      return this.o();
   }

   public void a(akq $$0, int $$1, boolean $$2) {
      gw $$3 = this.p().a(this.q().c(cwu.a).a());
      hq<dwr> $$4 = $$0.G_().d(jc.aC);
      he<dwr> $$5 = $$4.f(this.h);
      dwl.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements asp {
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

      public static Optional<ddu.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public tl a() {
         return tl.c("jigsaw_block.joint." + this.c);
      }
   }
}
