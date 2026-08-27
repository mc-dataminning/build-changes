import java.util.function.Predicate;

public class czm {
   private final etp a;
   private final etp b;
   private final czm.a c;
   private final czm.b d;
   private final etu e;

   public czm(etp $$0, etp $$1, czm.a $$2, czm.b $$3, brh $$4) {
      this($$0, $$1, $$2, $$3, etu.a($$4));
   }

   public czm(etp $$0, etp $$1, czm.a $$2, czm.b $$3, etu $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public etp a() {
      return this.b;
   }

   public etp b() {
      return this.a;
   }

   public eui a(dqh $$0, czj $$1, in $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eui a(ema $$0, czj $$1, in $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : euf.a();
   }

   public static enum a implements czm.c {
      a(dqg.a::b),
      b(dqg.a::a),
      c(dqg.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avr.aQ) ? euf.b() : euf.a());

      private final czm.c e;

      private a(czm.c $$0) {
         this.e = $$0;
      }

      @Override
      public eui get(dqh $$0, czj $$1, in $$2, etu $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ema::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(avw.a));

      private final Predicate<ema> e;

      private b(Predicate<ema> $$0) {
         this.e = $$0;
      }

      public boolean a(ema $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eui get(dqh var1, czj var2, in var3, etu var4);
   }
}
