import java.util.List;

public record abu(aly<dhh> c, eob d, List<abu.a> e) implements abf {
   public static final zt<ws, abu> a = abf.a(abu::a, abu::new);
   public static final abf.b<abu> b = abf.a("debug/structures");

   private abu(ws $$0) {
      this($$0.a(mb.be), b($$0), $$0.a(abu.a::new));
   }

   private void a(ws $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public abf.b<abu> a() {
      return b;
   }

   static eob b(ws $$0) {
      return new eob($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(ws $$0, eob $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public aly<dhh> b() {
      return this.c;
   }

   public eob c() {
      return this.d;
   }

   public List<abu.a> d() {
      return this.e;
   }

   public static record a(eob a, boolean b) {
      public a(ws $$0) {
         this(abu.b($$0), $$0.readBoolean());
      }

      public void a(ws $$0) {
         abu.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
