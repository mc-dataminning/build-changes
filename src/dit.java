import java.util.function.Predicate;

public class dit {
   private final ffc a;
   private final ffc b;
   private final dit.a c;
   private final dit.b d;
   private final ffh e;

   public dit(ffc $$0, ffc $$1, dit.a $$2, dit.b $$3, bwi $$4) {
      this($$0, $$1, $$2, $$3, ffh.a($$4));
   }

   public dit(ffc $$0, ffc $$1, dit.a $$2, dit.b $$3, ffh $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ffc a() {
      return this.b;
   }

   public ffc b() {
      return this.a;
   }

   public ffw a(eat $$0, diq $$1, iv $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ffw a(exa $$0, diq $$1, iv $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fft.a();
   }

   public static enum a implements dit.c {
      a(eas.a::b),
      b(eas.a::a),
      c(eas.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axc.aT) ? fft.b() : fft.a());

      private final dit.c e;

      private a(final dit.c $$0) {
         this.e = $$0;
      }

      @Override
      public ffw get(eat $$0, diq $$1, iv $$2, ffh $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(exa::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axh.a));

      private final Predicate<exa> e;

      private b(final Predicate<exa> $$0) {
         this.e = $$0;
      }

      public boolean a(exa $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ffw get(eat var1, diq var2, iv var3, ffh var4);
   }
}
