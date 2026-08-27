import java.util.Arrays;
import java.util.Optional;

public class dpi extends doi {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private akn h = new akn("empty");
   private akn i = new akn("empty");
   private akm<eiu> j = akm.a(lf.aM, new akn("empty"));
   private dpi.a k = dpi.a.a;
   private String l = "minecraft:air";
   private int m;
   private int q;

   public dpi(io $$0, drd $$1) {
      super(dok.F, $$0, $$1);
   }

   public akn b() {
      return this.h;
   }

   public akn c() {
      return this.i;
   }

   public akm<eiu> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dpi.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.q;
   }

   public void a(akn $$0) {
      this.h = $$0;
   }

   public void b(akn $$0) {
      this.i = $$0;
   }

   public void a(akm<eiu> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dpi.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
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
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.h = new akn($$0.l("name"));
      this.i = new akn($$0.l("target"));
      this.j = akm.a(lf.aM, new akn($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dpi.a.a($$0.l("joint")).orElseGet(() -> dic.m(this.n()).o().d() ? dpi.a.b : dpi.a.a);
      this.m = $$0.h("placement_priority");
      this.q = $$0.h("selection_priority");
   }

   public abx u() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return this.e($$0);
   }

   public void a(aqn $$0, int $$1, boolean $$2) {
      io $$3 = this.aA_().a(this.n().c(dic.b).a());
      jk<eiu> $$4 = $$0.H_().d(lf.aM);
      ix<eiu> $$5 = $$4.g(this.j);
      eio.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements ayz {
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

      public static Optional<dpi.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public wx a() {
         return wx.c("jigsaw_block.joint." + this.c);
      }
   }
}
