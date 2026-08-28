import java.util.List;

public record aao(aku<dgh> c, end d, List<aao.a> e) implements zz {
   public static final yn<vl, aao> a = zz.a(aao::a, aao::new);
   public static final zz.b<aao> b = zz.a("debug/structures");

   private aao(vl $$0) {
      this($$0.a(mc.be), b($$0), $$0.a(aao.a::new));
   }

   private void a(vl $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public zz.b<aao> a() {
      return b;
   }

   static end b(vl $$0) {
      return new end($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vl $$0, end $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public aku<dgh> b() {
      return this.c;
   }

   public end c() {
      return this.d;
   }

   public List<aao.a> d() {
      return this.e;
   }

   public static record a(end a, boolean b) {
      public a(vl $$0) {
         this(aao.b($$0), $$0.readBoolean());
      }

      public void a(vl $$0) {
         aao.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
