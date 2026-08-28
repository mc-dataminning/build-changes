import java.util.function.Predicate;

public class djg {
   private final ffs a;
   private final ffs b;
   private final djg.a c;
   private final djg.b d;
   private final ffx e;

   public djg(ffs $$0, ffs $$1, djg.a $$2, djg.b $$3, bwv $$4) {
      this($$0, $$1, $$2, $$3, ffx.a($$4));
   }

   public djg(ffs $$0, ffs $$1, djg.a $$2, djg.b $$3, ffx $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ffs a() {
      return this.b;
   }

   public ffs b() {
      return this.a;
   }

   public fgm a(ebg $$0, djd $$1, iw $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fgm a(exq $$0, djd $$1, iw $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fgj.a();
   }

   public static enum a implements djg.c {
      a(ebf.a::b),
      b(ebf.a::a),
      c(ebf.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axg.aT) ? fgj.b() : fgj.a());

      private final djg.c e;

      private a(final djg.c $$0) {
         this.e = $$0;
      }

      @Override
      public fgm get(ebg $$0, djd $$1, iw $$2, ffx $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(exq::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axl.a));

      private final Predicate<exq> e;

      private b(final Predicate<exq> $$0) {
         this.e = $$0;
      }

      public boolean a(exq $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fgm get(ebg var1, djd var2, iw var3, ffx var4);
   }
}
