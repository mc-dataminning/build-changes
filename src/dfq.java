import java.util.function.Predicate;

public class dfq {
   private final fba a;
   private final fba b;
   private final dfq.a c;
   private final dfq.b d;
   private final fbf e;

   public dfq(fba $$0, fba $$1, dfq.a $$2, dfq.b $$3, bul $$4) {
      this($$0, $$1, $$2, $$3, fbf.a($$4));
   }

   public dfq(fba $$0, fba $$1, dfq.a $$2, dfq.b $$3, fbf $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fba a() {
      return this.b;
   }

   public fba b() {
      return this.a;
   }

   public fbu a(dwx $$0, dfn $$1, ji $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fbu a(esz $$0, dfn $$1, ji $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fbr.a();
   }

   public static enum a implements dfq.c {
      a(dww.a::b),
      b(dww.a::a),
      c(dww.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awp.aT) ? fbr.b() : fbr.a());

      private final dfq.c e;

      private a(final dfq.c $$0) {
         this.e = $$0;
      }

      @Override
      public fbu get(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(esz::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awv.a));

      private final Predicate<esz> e;

      private b(final Predicate<esz> $$0) {
         this.e = $$0;
      }

      public boolean a(esz $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fbu get(dwx var1, dfn var2, ji var3, fbf var4);
   }
}
