import java.util.function.Predicate;

public class die {
   private final fei a;
   private final fei b;
   private final die.a c;
   private final die.b d;
   private final fen e;

   public die(fei $$0, fei $$1, die.a $$2, die.b $$3, bwd $$4) {
      this($$0, $$1, $$2, $$3, fen.a($$4));
   }

   public die(fei $$0, fei $$1, die.a $$2, die.b $$3, fen $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fei a() {
      return this.b;
   }

   public fei b() {
      return this.a;
   }

   public ffc a(dzz $$0, dib $$1, iu $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ffc a(ewg $$0, dib $$1, iu $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fez.a();
   }

   public static enum a implements die.c {
      a(dzy.a::b),
      b(dzy.a::a),
      c(dzy.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axc.aT) ? fez.b() : fez.a());

      private final die.c e;

      private a(final die.c $$0) {
         this.e = $$0;
      }

      @Override
      public ffc get(dzz $$0, dib $$1, iu $$2, fen $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ewg::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axh.a));

      private final Predicate<ewg> e;

      private b(final Predicate<ewg> $$0) {
         this.e = $$0;
      }

      public boolean a(ewg $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ffc get(dzz var1, dib var2, iu var3, fen var4);
   }
}
