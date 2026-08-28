import java.util.List;

public record aax(akq<dcw> c, ejh d, List<aax.a> e) implements aaj {
   public static final yx<vw, aax> a = aaj.a(aax::a, aax::new);
   public static final aaj.b<aax> b = aaj.a("debug/structures");

   private aax(vw $$0) {
      this($$0.a(lu.ba), b($$0), $$0.a(aax.a::new));
   }

   private void a(vw $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aaj.b<aax> a() {
      return b;
   }

   static ejh b(vw $$0) {
      return new ejh($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vw $$0, ejh $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public akq<dcw> b() {
      return this.c;
   }

   public ejh c() {
      return this.d;
   }

   public List<aax.a> d() {
      return this.e;
   }

   public static record a(ejh a, boolean b) {
      public a(vw $$0) {
         this(aax.b($$0), $$0.readBoolean());
      }

      public void a(vw $$0) {
         aax.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
