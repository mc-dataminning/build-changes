import java.util.function.Predicate;

public class dcf {
   private final exc a;
   private final exc b;
   private final dcf.a c;
   private final dcf.b d;
   private final exh e;

   public dcf(exc $$0, exc $$1, dcf.a $$2, dcf.b $$3, bsr $$4) {
      this($$0, $$1, $$2, $$3, exh.a($$4));
   }

   public dcf(exc $$0, exc $$1, dcf.a $$2, dcf.b $$3, exh $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public exc a() {
      return this.b;
   }

   public exc b() {
      return this.a;
   }

   public exv a(dtc $$0, dcc $$1, jd $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public exv a(epe $$0, dcc $$1, jd $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : exs.a();
   }

   public static enum a implements dcf.c {
      a(dtb.a::b),
      b(dtb.a::a),
      c(dtb.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awe.aR) ? exs.b() : exs.a());

      private final dcf.c e;

      private a(final dcf.c $$0) {
         this.e = $$0;
      }

      @Override
      public exv get(dtc $$0, dcc $$1, jd $$2, exh $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(epe::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awk.a));

      private final Predicate<epe> e;

      private b(final Predicate<epe> $$0) {
         this.e = $$0;
      }

      public boolean a(epe $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      exv get(dtc var1, dcc var2, jd var3, exh var4);
   }
}
