import java.util.Arrays;
import java.util.Optional;

public class dto extends dsm {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "placement_priority";
   public static final String e = "selection_priority";
   public static final String f = "name";
   public static final String g = "final_state";
   private ali h = ali.b("empty");
   private ali i = ali.b("empty");
   private alh<enh> j = alh.a(lz.aV, ali.b("empty"));
   private dto.a k = dto.a.a;
   private String l = "minecraft:air";
   private int m;
   private int n;

   public dto(jh $$0, dvj $$1) {
      super(dso.F, $$0, $$1);
   }

   public ali b() {
      return this.h;
   }

   public ali c() {
      return this.i;
   }

   public alh<enh> d() {
      return this.j;
   }

   public String f() {
      return this.l;
   }

   public dto.a j() {
      return this.k;
   }

   public int k() {
      return this.m;
   }

   public int t() {
      return this.n;
   }

   public void a(ali $$0) {
      this.h = $$0;
   }

   public void b(ali $$0) {
      this.i = $$0;
   }

   public void a(alh<enh> $$0) {
      this.j = $$0;
   }

   public void a(String $$0) {
      this.l = $$0;
   }

   public void a(dto.a $$0) {
      this.k = $$0;
   }

   public void a(int $$0) {
      this.m = $$0;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
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
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = ali.a($$0.l("name"));
      this.i = ali.a($$0.l("target"));
      this.j = alh.a(lz.aV, ali.a($$0.l("pool")));
      this.l = $$0.l("final_state");
      this.k = dto.a.a($$0.l("joint")).orElseGet(() -> dmf.o(this.m()).o().d() ? dto.a.b : dto.a.a);
      this.m = $$0.h("placement_priority");
      this.n = $$0.h("selection_priority");
   }

   public acl u() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      return this.e($$0);
   }

   public void a(arn $$0, int $$1, boolean $$2) {
      jh $$3 = this.aB_().a(this.m().c(dmf.b).a());
      kd<enh> $$4 = $$0.H_().e(lz.aV);
      jq<enh> $$5 = $$4.b(this.j);
      enb.a($$0, $$5, this.i, $$1, $$3, $$2);
   }

   public static enum a implements bag {
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

      public static Optional<dto.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public xi a() {
         return xi.c("jigsaw_block.joint." + this.c);
      }
   }
}
