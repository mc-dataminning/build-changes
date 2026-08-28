import java.util.List;

public record abk(ald<dbx> c, eib d, List<abk.a> e) implements aaw {
   public static final zm<wl, abk> a = aaw.a(abk::a, abk::new);
   public static final aaw.b<abk> b = aaw.a("debug/structures");

   private abk(wl $$0) {
      this($$0.a(lq.aS), b($$0), $$0.a(abk.a::new));
   }

   private void a(wl $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aaw.b<abk> a() {
      return b;
   }

   static eib b(wl $$0) {
      return new eib($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wl $$0, eib $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public ald<dbx> b() {
      return this.c;
   }

   public eib c() {
      return this.d;
   }

   public List<abk.a> d() {
      return this.e;
   }

   public static record a(eib a, boolean b) {
      public a(wl $$0) {
         this(abk.b($$0), $$0.readBoolean());
      }

      public void a(wl $$0) {
         abk.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
