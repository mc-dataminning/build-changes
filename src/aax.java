import java.util.List;

public record aax(alf<djm> c, erf d, List<aax.a> e) implements aai {
   public static final yw<vu, aax> a = aai.a(aax::a, aax::new);
   public static final aai.b<aax> b = aai.a("debug/structures");

   private aax(vu $$0) {
      this($$0.a(mh.bp), b($$0), $$0.a(aax.a::new));
   }

   private void a(vu $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aai.b<aax> a() {
      return b;
   }

   static erf b(vu $$0) {
      return new erf($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vu $$0, erf $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alf<djm> b() {
      return this.c;
   }

   public erf c() {
      return this.d;
   }

   public List<aax.a> d() {
      return this.e;
   }

   public static record a(erf a, boolean b) {
      public a(vu $$0) {
         this(aax.b($$0), $$0.readBoolean());
      }

      public void a(vu $$0) {
         aax.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
