import java.util.function.Predicate;

public class cro {
   private final ejz a;
   private final ejz b;
   private final cro.a c;
   private final cro.b d;
   private final eke e;

   public cro(ejz $$0, ejz $$1, cro.a $$2, cro.b $$3, bkv $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = eke.a($$4);
   }

   public ejz a() {
      return this.b;
   }

   public ejz b() {
      return this.a;
   }

   public eks a(dhn $$0, crl $$1, hx $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eks a(ecx $$0, crl $$1, hx $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ekp.a();
   }

   public static enum a implements cro.c {
      a(dhm.a::b),
      b(dhm.a::a),
      c(dhm.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(ark.aP) ? ekp.b() : ekp.a());

      private final cro.c e;

      private a(cro.c $$0) {
         this.e = $$0;
      }

      @Override
      public eks get(dhn $$0, crl $$1, hx $$2, eke $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ecx::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(arp.a));

      private final Predicate<ecx> e;

      private b(Predicate<ecx> $$0) {
         this.e = $$0;
      }

      public boolean a(ecx $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eks get(dhn var1, crl var2, hx var3, eke var4);
   }
}
