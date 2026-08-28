import java.util.List;

public record abd(ald<dej> c, eky d, List<abd.a> e) implements aao {
   public static final zc<wb, abd> a = aao.a(abd::a, abd::new);
   public static final aao.b<abd> b = aao.a("debug/structures");

   private abd(wb $$0) {
      this($$0.a(lw.bc), b($$0), $$0.a(abd.a::new));
   }

   private void a(wb $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aao.b<abd> a() {
      return b;
   }

   static eky b(wb $$0) {
      return new eky($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wb $$0, eky $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public ald<dej> b() {
      return this.c;
   }

   public eky c() {
      return this.d;
   }

   public List<abd.a> d() {
      return this.e;
   }

   public static record a(eky a, boolean b) {
      public a(wb $$0) {
         this(abd.b($$0), $$0.readBoolean());
      }

      public void a(wb $$0) {
         abd.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
