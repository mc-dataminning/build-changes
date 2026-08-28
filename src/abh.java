import java.util.List;

public record abh(ala<dbt> c, ehx d, List<abh.a> e) implements aat {
   public static final zj<wl, abh> a = aat.a(abh::a, abh::new);
   public static final aat.b<abh> b = aat.a("debug/structures");

   private abh(wl $$0) {
      this($$0.a(lq.aS), b($$0), $$0.a(abh.a::new));
   }

   private void a(wl $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aat.b<abh> a() {
      return b;
   }

   static ehx b(wl $$0) {
      return new ehx($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wl $$0, ehx $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public ala<dbt> b() {
      return this.c;
   }

   public ehx c() {
      return this.d;
   }

   public List<abh.a> d() {
      return this.e;
   }

   public static record a(ehx a, boolean b) {
      public a(wl $$0) {
         this(abh.b($$0), $$0.readBoolean());
      }

      public void a(wl $$0) {
         abh.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
