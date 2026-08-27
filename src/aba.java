import java.util.List;

public record aba(aks<dca> c, ejl d, List<aba.a> e) implements aam {
   public static final zc<we, aba> a = aam.a(aba::a, aba::new);
   public static final aam.b<aba> b = aam.a("debug/structures");

   private aba(we $$0) {
      this($$0.a(li.aS), b($$0), $$0.a(aba.a::new));
   }

   private void a(we $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aam.b<aba> a() {
      return b;
   }

   static ejl b(we $$0) {
      return new ejl($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(we $$0, ejl $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public aks<dca> b() {
      return this.c;
   }

   public ejl c() {
      return this.d;
   }

   public List<aba.a> d() {
      return this.e;
   }

   public static record a(ejl a, boolean b) {
      public a(we $$0) {
         this(aba.b($$0), $$0.readBoolean());
      }

      public void a(we $$0) {
         aba.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
