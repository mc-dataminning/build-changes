import java.util.Arrays;
import java.util.Optional;

public class ddk extends dcl {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private aer f = new aer("empty");
   private aer g = new aer("empty");
   private aeq<dwh> h = aeq.a(jc.aC, new aer("empty"));
   private ddk.a i = ddk.a.a;
   private String j = "minecraft:air";

   public ddk(gu $$0, dez $$1) {
      super(dcn.F, $$0, $$1);
   }

   public aer c() {
      return this.f;
   }

   public aer d() {
      return this.g;
   }

   public aeq<dwh> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public ddk.a i() {
      return this.i;
   }

   public void a(aer $$0) {
      this.f = $$0;
   }

   public void b(aer $$0) {
      this.g = $$0;
   }

   public void a(aeq<dwh> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(ddk.a $$0) {
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
      this.f = new aer($$0.l("name"));
      this.g = new aer($$0.l("target"));
      this.h = aeq.a(jc.aC, new aer($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = ddk.a.a($$0.l("joint")).orElseGet(() -> cwk.h(this.q()).o().d() ? ddk.a.b : ddk.a.a);
   }

   public wx j() {
      return wx.a(this);
   }

   @Override
   public qr an_() {
      return this.o();
   }

   public void a(akk $$0, int $$1, boolean $$2) {
      gu $$3 = this.p().a(this.q().c(cwk.a).a());
      hr<dwh> $$4 = $$0.B_().d(jc.aC);
      he<dwh> $$5 = $$4.f(this.h);
      dwb.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements ash {
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

      public static Optional<ddk.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public tf a() {
         return tf.c("jigsaw_block.joint." + this.c);
      }
   }
}
