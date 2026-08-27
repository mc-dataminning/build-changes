import java.util.List;

public record aac(ajs<cyx> c, eez d, List<aac.a> e) implements zo {
   public static final ye<vg, aac> a = zo.a(aac::a, aac::new);
   public static final zo.b<aac> b = zo.a("debug/structures");

   private aac(vg $$0) {
      this($$0.a(ks.aO), b($$0), $$0.a(aac.a::new));
   }

   private void a(vg $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public zo.b<aac> a() {
      return b;
   }

   static eez b(vg $$0) {
      return new eez($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vg $$0, eez $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public ajs<cyx> b() {
      return this.c;
   }

   public eez c() {
      return this.d;
   }

   public List<aac.a> d() {
      return this.e;
   }

   public static record a(eez a, boolean b) {
      public a(vg $$0) {
         this(aac.b($$0), $$0.readBoolean());
      }

      public void a(vg $$0) {
         aac.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
