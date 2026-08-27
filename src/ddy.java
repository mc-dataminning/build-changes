import java.util.Arrays;
import java.util.Optional;

public class ddy extends dcz {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private aez f = new aez("empty");
   private aez g = new aez("empty");
   private aey<dwl> h = aey.a(jc.aD, new aez("empty"));
   private ddy.a i = ddy.a.a;
   private String j = "minecraft:air";

   public ddy(gw $$0, dfd $$1) {
      super(ddb.F, $$0, $$1);
   }

   public aez c() {
      return this.f;
   }

   public aez d() {
      return this.g;
   }

   public aey<dwl> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public ddy.a i() {
      return this.i;
   }

   public void a(aez $$0) {
      this.f = $$0;
   }

   public void b(aez $$0) {
      this.g = $$0;
   }

   public void a(aey<dwl> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(ddy.a $$0) {
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
      this.f = new aez($$0.l("name"));
      this.g = new aez($$0.l("target"));
      this.h = aey.a(jc.aD, new aez($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = ddy.a.a($$0.l("joint")).orElseGet(() -> cxc.h(this.q()).o().d() ? ddy.a.b : ddy.a.a);
   }

   public xe j() {
      return xe.a(this);
   }

   @Override
   public qw as_() {
      return this.o();
   }

   public void a(akt $$0, int $$1, boolean $$2) {
      gw $$3 = this.p().a(this.q().c(cxc.b).a());
      hq<dwl> $$4 = $$0.G_().d(jc.aD);
      he<dwl> $$5 = $$4.f(this.h);
      dwf.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements asu {
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

      public static Optional<ddy.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public tl a() {
         return tl.c("jigsaw_block.joint." + this.c);
      }
   }
}
