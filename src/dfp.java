import java.util.function.Predicate;

public class dfp {
   private final faz a;
   private final faz b;
   private final dfp.a c;
   private final dfp.b d;
   private final fbe e;

   public dfp(faz $$0, faz $$1, dfp.a $$2, dfp.b $$3, buk $$4) {
      this($$0, $$1, $$2, $$3, fbe.a($$4));
   }

   public dfp(faz $$0, faz $$1, dfp.a $$2, dfp.b $$3, fbe $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public faz a() {
      return this.b;
   }

   public faz b() {
      return this.a;
   }

   public fbt a(dww $$0, dfm $$1, ji $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fbt a(esy $$0, dfm $$1, ji $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fbq.a();
   }

   public static enum a implements dfp.c {
      a(dwv.a::b),
      b(dwv.a::a),
      c(dwv.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awp.aT) ? fbq.b() : fbq.a());

      private final dfp.c e;

      private a(final dfp.c $$0) {
         this.e = $$0;
      }

      @Override
      public fbt get(dww $$0, dfm $$1, ji $$2, fbe $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(esy::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awv.a));

      private final Predicate<esy> e;

      private b(final Predicate<esy> $$0) {
         this.e = $$0;
      }

      public boolean a(esy $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fbt get(dww var1, dfm var2, ji var3, fbe var4);
   }
}
