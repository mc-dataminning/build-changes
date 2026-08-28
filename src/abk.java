import java.util.List;

public record abk(alk<dff> c, elt d, List<abk.a> e) implements aav {
   public static final zj<wi, abk> a = aav.a(abk::a, abk::new);
   public static final aav.b<abk> b = aav.a("debug/structures");

   private abk(wi $$0) {
      this($$0.a(ma.bb), b($$0), $$0.a(abk.a::new));
   }

   private void a(wi $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aav.b<abk> a() {
      return b;
   }

   static elt b(wi $$0) {
      return new elt($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wi $$0, elt $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alk<dff> b() {
      return this.c;
   }

   public elt c() {
      return this.d;
   }

   public List<abk.a> d() {
      return this.e;
   }

   public static record a(elt a, boolean b) {
      public a(wi $$0) {
         this(abk.b($$0), $$0.readBoolean());
      }

      public void a(wi $$0) {
         abk.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
