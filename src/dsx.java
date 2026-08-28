import java.util.Arrays;
import java.util.Optional;

public class dsx extends drv {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ale h = ale.b("empty");
   private ale i = ale.b("empty");
   private ald<emq> j = ald.a(lw.aW, ale.b("empty"));
   private dsx.a k = dsx.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dsx(jf $$0, dus $$1) {
      super(drx.F, $$0, $$1);
   }

   public ale b() {
      return this.h;
   }

   public ale c() {
      return this.i;
   }

   public ald<emq> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dsx.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(ale $$0) {
      this.h = $$0;
   }

   public void b(ale $$0) {
      this.i = $$0;
   }

   public void a(ald<emq> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dsx.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", this.h.toString());
      $$0.a("target", this.i.toString());
      $$0.a("pool", this.j.a().toString());
      $$0.a("final_state", this.l);
      $$0.a("joint", this.k.c());
      $$0.a("placement_priority", this.m);
      $$0.a("selection_priority", this.n);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.h = ale.a($$0.l("name"));
      this.i = ale.a($$0.l("target"));
      this.j = ald.a(lw.aW, ale.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dsx.a.a($$0.l("joint")).orElseGet(() -> dlo.o(this.m()).o().d() ? dsx.a.b : dsx.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public ach u() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      return this.e($$0);
   }

   public void a(arj $$0, int $$1, boolean $$2) {
      jf $$3 = this.aC_().a(this.m().c(dlo.b).a());
      kb<emq> $$4 = $$0.G_().e(lw.aW);
      jo<emq> $$5 = $$4.b(this.j);
      emk.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements bab {
      a("rollable"),
      b("aligned");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      @Override
      public String c() {
         return this.c;
      }

      public static Optional<dsx.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xe a() {
         return xe.c("jigsaw_block.joint." + this.c);
      }
   }
}
