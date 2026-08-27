import java.util.Arrays;
import java.util.Optional;

public class dam extends czn {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private acq f = new acq("empty");
   private acq g = new acq("empty");
   private acp<dtj> h = acp.a(jc.aC, new acq("empty"));
   private dam.a i = dam.a.a;
   private String j = "minecraft:air";

   public dam(gu $$0, dcb $$1) {
      super(czp.F, $$0, $$1);
   }

   public acq c() {
      return this.f;
   }

   public acq d() {
      return this.g;
   }

   public acp<dtj> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public dam.a i() {
      return this.i;
   }

   public void a(acq $$0) {
      this.f = $$0;
   }

   public void b(acq $$0) {
      this.g = $$0;
   }

   public void a(acp<dtj> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(dam.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.f = new acq($$0.l("name"));
      this.g = new acq($$0.l("target"));
      this.h = acp.a(jc.aC, new acq($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = dam.a.a($$0.l("joint")).orElseGet(() -> ctm.h(this.q()).o().d() ? dam.a.b : dam.a.a);
   }

   public uz j() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   public void a(aif $$0, int $$1, boolean $$2) {
      gu $$3 = this.p().a(this.q().c(ctm.a).a());
      hr<dtj> $$4 = $$0.B_().d(jc.aC);
      he<dtj> $$5 = $$4.f(this.h);
      dtd.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements apr {
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

      public static Optional<dam.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public sw a() {
         return sw.c("jigsaw_block.joint." + this.c);
      }
   }
}
