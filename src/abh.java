import java.util.List;

public record abh(alh<dfb> c, elp d, List<abh.a> e) implements aas {
   public static final zg<wf, abh> a = aas.a(abh::a, abh::new);
   public static final aas.b<abh> b = aas.a("debug/structures");

   private abh(wf $$0) {
      this($$0.a(lz.bb), b($$0), $$0.a(abh.a::new));
   }

   private void a(wf $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aas.b<abh> a() {
      return b;
   }

   static elp b(wf $$0) {
      return new elp($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wf $$0, elp $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alh<dfb> b() {
      return this.c;
   }

   public elp c() {
      return this.d;
   }

   public List<abh.a> d() {
      return this.e;
   }

   public static record a(elp a, boolean b) {
      public a(wf $$0) {
         this(abh.b($$0), $$0.readBoolean());
      }

      public void a(wf $$0) {
         abh.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
