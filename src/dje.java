import java.util.function.Predicate;

public class dje {
   private final ffq a;
   private final ffq b;
   private final dje.a c;
   private final dje.b d;
   private final ffv e;

   public dje(ffq $$0, ffq $$1, dje.a $$2, dje.b $$3, bwt $$4) {
      this($$0, $$1, $$2, $$3, ffv.a($$4));
   }

   public dje(ffq $$0, ffq $$1, dje.a $$2, dje.b $$3, ffv $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ffq a() {
      return this.b;
   }

   public ffq b() {
      return this.a;
   }

   public fgk a(ebe $$0, djb $$1, iv $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fgk a(exo $$0, djb $$1, iv $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fgh.a();
   }

   public static enum a implements dje.c {
      a(ebd.a::b),
      b(ebd.a::a),
      c(ebd.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axe.aT) ? fgh.b() : fgh.a());

      private final dje.c e;

      private a(final dje.c $$0) {
         this.e = $$0;
      }

      @Override
      public fgk get(ebe $$0, djb $$1, iv $$2, ffv $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(exo::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axj.a));

      private final Predicate<exo> e;

      private b(final Predicate<exo> $$0) {
         this.e = $$0;
      }

      public boolean a(exo $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fgk get(ebe var1, djb var2, iv var3, ffv var4);
   }
}
