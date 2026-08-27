import java.util.Arrays;
import java.util.Optional;

public class dfr extends der {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private agg f = new agg("empty");
   private agg g = new agg("empty");
   private agf<dye> h = agf.a(jz.aE, new agg("empty"));
   private dfr.a i = dfr.a.a;
   private String j = "minecraft:air";

   public dfr(ht $$0, dgw $$1) {
      super(det.F, $$0, $$1);
   }

   public agg c() {
      return this.f;
   }

   public agg d() {
      return this.g;
   }

   public agf<dye> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public dfr.a i() {
      return this.i;
   }

   public void a(agg $$0) {
      this.f = $$0;
   }

   public void b(agg $$0) {
      this.g = $$0;
   }

   public void a(agf<dye> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(dfr.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.f = new agg($$0.l("name"));
      this.g = new agg($$0.l("target"));
      this.h = agf.a(jz.aE, new agg($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = dfr.a.a($$0.l("joint")).orElseGet(() -> cyu.h(this.q()).o().d() ? dfr.a.b : dfr.a.a);
   }

   public yk j() {
      return yk.a(this);
   }

   @Override
   public rz av_() {
      return this.o();
   }

   public void a(ama $$0, int $$1, boolean $$2) {
      ht $$3 = this.p().a(this.q().c(cyu.b).a());
      io<dye> $$4 = $$0.H_().d(jz.aE);
      ib<dye> $$5 = $$4.f(this.h);
      dxy.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements aub {
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

      public static Optional<dfr.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public ur a() {
         return ur.c("jigsaw_block.joint." + this.c);
      }
   }
}
