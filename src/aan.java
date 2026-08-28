import java.util.List;

public record aan(akt<dgg> c, enc d, List<aan.a> e) implements zy {
   public static final ym<vl, aan> a = zy.a(aan::a, aan::new);
   public static final zy.b<aan> b = zy.a("debug/structures");

   private aan(vl $$0) {
      this($$0.a(mc.be), b($$0), $$0.a(aan.a::new));
   }

   private void a(vl $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public zy.b<aan> a() {
      return b;
   }

   static enc b(vl $$0) {
      return new enc($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vl $$0, enc $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public akt<dgg> b() {
      return this.c;
   }

   public enc c() {
      return this.d;
   }

   public List<aan.a> d() {
      return this.e;
   }

   public static record a(enc a, boolean b) {
      public a(vl $$0) {
         this(aan.b($$0), $$0.readBoolean());
      }

      public void a(vl $$0) {
         aan.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
