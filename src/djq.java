import java.util.function.Predicate;

public class djq {
   private final fgc a;
   private final fgc b;
   private final djq.a c;
   private final djq.b d;
   private final fgh e;

   public djq(fgc $$0, fgc $$1, djq.a $$2, djq.b $$3, bxe $$4) {
      this($$0, $$1, $$2, $$3, fgh.a($$4));
   }

   public djq(fgc $$0, fgc $$1, djq.a $$2, djq.b $$3, fgh $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fgc a() {
      return this.b;
   }

   public fgc b() {
      return this.a;
   }

   public fgw a(ebq $$0, djn $$1, iw $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fgw a(eya $$0, djn $$1, iw $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fgt.a();
   }

   public static enum a implements djq.c {
      a(ebp.a::b),
      b(ebp.a::a),
      c(ebp.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axn.aT) ? fgt.b() : fgt.a());

      private final djq.c e;

      private a(final djq.c $$0) {
         this.e = $$0;
      }

      @Override
      public fgw get(ebq $$0, djn $$1, iw $$2, fgh $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eya::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axs.a));

      private final Predicate<eya> e;

      private b(final Predicate<eya> $$0) {
         this.e = $$0;
      }

      public boolean a(eya $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fgw get(ebq var1, djn var2, iw var3, fgh var4);
   }
}
