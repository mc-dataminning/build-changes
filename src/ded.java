import java.util.function.Predicate;

public class ded {
   private final ezh a;
   private final ezh b;
   private final ded.a c;
   private final ded.b d;
   private final ezm e;

   public ded(ezh $$0, ezh $$1, ded.a $$2, ded.b $$3, btz $$4) {
      this($$0, $$1, $$2, $$3, ezm.a($$4));
   }

   public ded(ezh $$0, ezh $$1, ded.a $$2, ded.b $$3, ezm $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ezh a() {
      return this.b;
   }

   public ezh b() {
      return this.a;
   }

   public fab a(dvd $$0, dea $$1, jg $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fab a(ere $$0, dea $$1, jg $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ezy.a();
   }

   public static enum a implements ded.c {
      a(dvc.a::b),
      b(dvc.a::a),
      c(dvc.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awz.aR) ? ezy.b() : ezy.a());

      private final ded.c e;

      private a(final ded.c $$0) {
         this.e = $$0;
      }

      @Override
      public fab get(dvd $$0, dea $$1, jg $$2, ezm $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ere::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axf.a));

      private final Predicate<ere> e;

      private b(final Predicate<ere> $$0) {
         this.e = $$0;
      }

      public boolean a(ere $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fab get(dvd var1, dea var2, jg var3, ezm var4);
   }
}
