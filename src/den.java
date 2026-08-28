import java.util.function.Predicate;

public class den {
   private final ezr a;
   private final ezr b;
   private final den.a c;
   private final den.b d;
   private final ezw e;

   public den(ezr $$0, ezr $$1, den.a $$2, den.b $$3, bui $$4) {
      this($$0, $$1, $$2, $$3, ezw.a($$4));
   }

   public den(ezr $$0, ezr $$1, den.a $$2, den.b $$3, ezw $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ezr a() {
      return this.b;
   }

   public ezr b() {
      return this.a;
   }

   public fal a(dvo $$0, dek $$1, jh $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fal a(ero $$0, dek $$1, jh $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fai.a();
   }

   public static enum a implements den.c {
      a(dvn.a::b),
      b(dvn.a::a),
      c(dvn.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axd.aS) ? fai.b() : fai.a());

      private final den.c e;

      private a(final den.c $$0) {
         this.e = $$0;
      }

      @Override
      public fal get(dvo $$0, dek $$1, jh $$2, ezw $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ero::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axj.a));

      private final Predicate<ero> e;

      private b(final Predicate<ero> $$0) {
         this.e = $$0;
      }

      public boolean a(ero $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fal get(dvo var1, dek var2, jh var3, ezw var4);
   }
}
