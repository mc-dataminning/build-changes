import java.util.List;

public record aao(ake<czu> c, efy d, List<aao.a> e) implements aaa {
   public static final yq<vs, aao> a = aaa.a(aao::a, aao::new);
   public static final aaa.b<aao> b = aaa.a("debug/structures");

   private aao(vs $$0) {
      this($$0.a(ld.aR), b($$0), $$0.a(aao.a::new));
   }

   private void a(vs $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aaa.b<aao> a() {
      return b;
   }

   static efy b(vs $$0) {
      return new efy($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vs $$0, efy $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public ake<czu> b() {
      return this.c;
   }

   public efy c() {
      return this.d;
   }

   public List<aao.a> d() {
      return this.e;
   }

   public static record a(efy a, boolean b) {
      public a(vs $$0) {
         this(aao.b($$0), $$0.readBoolean());
      }

      public void a(vs $$0) {
         aao.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
