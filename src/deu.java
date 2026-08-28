import java.util.function.Predicate;

public class deu {
   private final ezy a;
   private final ezy b;
   private final deu.a c;
   private final deu.b d;
   private final fad e;

   public deu(ezy $$0, ezy $$1, deu.a $$2, deu.b $$3, bul $$4) {
      this($$0, $$1, $$2, $$3, fad.a($$4));
   }

   public deu(ezy $$0, ezy $$1, deu.a $$2, deu.b $$3, fad $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ezy a() {
      return this.b;
   }

   public ezy b() {
      return this.a;
   }

   public fas a(dvv $$0, der $$1, jh $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fas a(erv $$0, der $$1, jh $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fap.a();
   }

   public static enum a implements deu.c {
      a(dvu.a::b),
      b(dvu.a::a),
      c(dvu.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axc.aS) ? fap.b() : fap.a());

      private final deu.c e;

      private a(final deu.c $$0) {
         this.e = $$0;
      }

      @Override
      public fas get(dvv $$0, der $$1, jh $$2, fad $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(erv::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axi.a));

      private final Predicate<erv> e;

      private b(final Predicate<erv> $$0) {
         this.e = $$0;
      }

      public boolean a(erv $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fas get(dvv var1, der var2, jh var3, fad var4);
   }
}
