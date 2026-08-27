import java.util.Arrays;
import java.util.Optional;

public class ddp extends dcq {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private aeu f = new aeu("empty");
   private aeu g = new aeu("empty");
   private aet<dwm> h = aet.a(je.aC, new aeu("empty"));
   private ddp.a i = ddp.a.a;
   private String j = "minecraft:air";

   public ddp(gw $$0, dfe $$1) {
      super(dcs.F, $$0, $$1);
   }

   public aeu c() {
      return this.f;
   }

   public aeu d() {
      return this.g;
   }

   public aet<dwm> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public ddp.a i() {
      return this.i;
   }

   public void a(aeu $$0) {
      this.f = $$0;
   }

   public void b(aeu $$0) {
      this.g = $$0;
   }

   public void a(aet<dwm> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(ddp.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.f = new aeu($$0.l("name"));
      this.g = new aeu($$0.l("target"));
      this.h = aet.a(je.aC, new aeu($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = ddp.a.a($$0.l("joint")).orElseGet(() -> cwp.h(this.q()).o().d() ? ddp.a.b : ddp.a.a);
   }

   public xa j() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
      return this.o();
   }

   public void a(akn $$0, int $$1, boolean $$2) {
      gw $$3 = this.p().a(this.q().c(cwp.a).a());
      ht<dwm> $$4 = $$0.B_().d(je.aC);
      hg<dwm> $$5 = $$4.f(this.h);
      dwg.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements ask {
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

      public static Optional<ddp.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public ti a() {
         return ti.c("jigsaw_block.joint." + this.c);
      }
   }
}
