import java.util.Arrays;
import java.util.Optional;

public class dew extends ddx {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private afw f = new afw("empty");
   private afw g = new afw("empty");
   private afv<dxj> h = afv.a(jz.aD, new afw("empty"));
   private dew.a i = dew.a.a;
   private String j = "minecraft:air";

   public dew(ht $$0, dgb $$1) {
      super(ddz.F, $$0, $$1);
   }

   public afw c() {
      return this.f;
   }

   public afw d() {
      return this.g;
   }

   public afv<dxj> f() {
      return this.h;
   }

   public String g() {
      return this.j;
   }

   public dew.a i() {
      return this.i;
   }

   public void a(afw $$0) {
      this.f = $$0;
   }

   public void b(afw $$0) {
      this.g = $$0;
   }

   public void a(afv<dxj> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(dew.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.f = new afw($$0.l("name"));
      this.g = new afw($$0.l("target"));
      this.h = afv.a(jz.aD, new afw($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = dew.a.a($$0.l("joint")).orElseGet(() -> cya.h(this.q()).o().d() ? dew.a.b : dew.a.a);
   }

   public yb j() {
      return yb.a(this);
   }

   @Override
   public rt av_() {
      return this.o();
   }

   public void a(alq $$0, int $$1, boolean $$2) {
      ht $$3 = this.p().a(this.q().c(cya.b).a());
      io<dxj> $$4 = $$0.H_().d(jz.aD);
      ib<dxj> $$5 = $$4.f(this.h);
      dxd.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements atr {
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

      public static Optional<dew.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public ui a() {
         return ui.c("jigsaw_block.joint." + this.c);
      }
   }
}
