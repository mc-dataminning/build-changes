import java.util.List;

public record abj(alo<dgz> c, env d, List<abj.a> e) implements aau {
   public static final zi<wh, abj> a = aau.a(abj::a, abj::new);
   public static final aau.b<abj> b = aau.a("debug/structures");

   private abj(wh $$0) {
      this($$0.a(mb.be), b($$0), $$0.a(abj.a::new));
   }

   private void a(wh $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aau.b<abj> a() {
      return b;
   }

   static env b(wh $$0) {
      return new env($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wh $$0, env $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alo<dgz> b() {
      return this.c;
   }

   public env c() {
      return this.d;
   }

   public List<abj.a> d() {
      return this.e;
   }

   public static record a(env a, boolean b) {
      public a(wh $$0) {
         this(abj.b($$0), $$0.readBoolean());
      }

      public void a(wh $$0) {
         abj.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
