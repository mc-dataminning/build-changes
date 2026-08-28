import java.util.List;

public record aav(ald<dip> c, eqa d, List<aav.a> e) implements aag {
   public static final yu<vs, aav> a = aag.a(aav::a, aav::new);
   public static final aag.b<aav> b = aag.a("debug/structures");

   private aav(vs $$0) {
      this($$0.a(mg.bm), b($$0), $$0.a(aav.a::new));
   }

   private void a(vs $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aag.b<aav> a() {
      return b;
   }

   static eqa b(vs $$0) {
      return new eqa($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vs $$0, eqa $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public ald<dip> b() {
      return this.c;
   }

   public eqa c() {
      return this.d;
   }

   public List<aav.a> d() {
      return this.e;
   }

   public static record a(eqa a, boolean b) {
      public a(vs $$0) {
         this(aav.b($$0), $$0.readBoolean());
      }

      public void a(vs $$0) {
         aav.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
