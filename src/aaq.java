import java.util.List;

public record aaq(akg<dad> c, egh d, List<aaq.a> e) implements aac {
   public static final ys<vu, aaq> a = aac.a(aaq::a, aaq::new);
   public static final aac.b<aaq> b = aac.a("debug/structures");

   private aaq(vu $$0) {
      this($$0.a(le.aS), b($$0), $$0.a(aaq.a::new));
   }

   private void a(vu $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aac.b<aaq> a() {
      return b;
   }

   static egh b(vu $$0) {
      return new egh($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vu $$0, egh $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public akg<dad> b() {
      return this.c;
   }

   public egh c() {
      return this.d;
   }

   public List<aaq.a> d() {
      return this.e;
   }

   public static record a(egh a, boolean b) {
      public a(vu $$0) {
         this(aaq.b($$0), $$0.readBoolean());
      }

      public void a(vu $$0) {
         aaq.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
