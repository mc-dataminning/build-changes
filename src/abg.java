import java.util.List;

public record abg(alg<dev> c, elj d, List<abg.a> e) implements aar {
   public static final zf<we, abg> a = aar.a(abg::a, abg::new);
   public static final aar.b<abg> b = aar.a("debug/structures");

   private abg(we $$0) {
      this($$0.a(ly.bb), b($$0), $$0.a(abg.a::new));
   }

   private void a(we $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aar.b<abg> a() {
      return b;
   }

   static elj b(we $$0) {
      return new elj($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(we $$0, elj $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alg<dev> b() {
      return this.c;
   }

   public elj c() {
      return this.d;
   }

   public List<abg.a> d() {
      return this.e;
   }

   public static record a(elj a, boolean b) {
      public a(we $$0) {
         this(abg.b($$0), $$0.readBoolean());
      }

      public void a(we $$0) {
         abg.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
