import java.util.function.Predicate;

public class dhy {
   private final fdw a;
   private final fdw b;
   private final dhy.a c;
   private final dhy.b d;
   private final feb e;

   public dhy(fdw $$0, fdw $$1, dhy.a $$2, dhy.b $$3, bwa $$4) {
      this($$0, $$1, $$2, $$3, feb.a($$4));
   }

   public dhy(fdw $$0, fdw $$1, dhy.a $$2, dhy.b $$3, feb $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fdw a() {
      return this.b;
   }

   public fdw b() {
      return this.a;
   }

   public feq a(dzo $$0, dhv $$1, iu $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public feq a(evv $$0, dhv $$1, iu $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fen.a();
   }

   public static enum a implements dhy.c {
      a(dzn.a::b),
      b(dzn.a::a),
      c(dzn.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axa.aT) ? fen.b() : fen.a());

      private final dhy.c e;

      private a(final dhy.c $$0) {
         this.e = $$0;
      }

      @Override
      public feq get(dzo $$0, dhv $$1, iu $$2, feb $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(evv::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axf.a));

      private final Predicate<evv> e;

      private b(final Predicate<evv> $$0) {
         this.e = $$0;
      }

      public boolean a(evv $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      feq get(dzo var1, dhv var2, iu var3, feb var4);
   }
}
