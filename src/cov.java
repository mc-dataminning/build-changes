import java.util.function.Predicate;

public class cov {
   private final ehe a;
   private final ehe b;
   private final cov.a c;
   private final cov.b d;
   private final ehj e;

   public cov(ehe $$0, ehe $$1, cov.a $$2, cov.b $$3, bii $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ehj.a($$4);
   }

   public ehe a() {
      return this.b;
   }

   public ehe b() {
      return this.a;
   }

   public ehx a(dfa $$0, cos $$1, gu $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ehx a(ead $$0, cos $$1, gu $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ehu.a();
   }

   public static enum a implements cov.c {
      a(dez.a::b),
      b(dez.a::a),
      c(dez.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(apl.aP) ? ehu.b() : ehu.a());

      private final cov.c e;

      private a(cov.c $$0) {
         this.e = $$0;
      }

      @Override
      public ehx get(dfa $$0, cos $$1, gu $$2, ehj $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ead::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(apq.a));

      private final Predicate<ead> e;

      private b(Predicate<ead> $$0) {
         this.e = $$0;
      }

      public boolean a(ead $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ehx get(dfa var1, cos var2, gu var3, ehj var4);
   }
}
