import java.util.function.Predicate;

public class dbj {
   private final ewu a;
   private final ewu b;
   private final dbj.a c;
   private final dbj.b d;
   private final ewz e;

   public dbj(ewu $$0, ewu $$1, dbj.a $$2, dbj.b $$3, brv $$4) {
      this($$0, $$1, $$2, $$3, ewz.a($$4));
   }

   public dbj(ewu $$0, ewu $$1, dbj.a $$2, dbj.b $$3, ewz $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ewu a() {
      return this.b;
   }

   public ewu b() {
      return this.a;
   }

   public exn a(dtc $$0, dbg $$1, ir $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public exn a(epe $$0, dbg $$1, ir $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : exk.a();
   }

   public static enum a implements dbj.c {
      a(dtb.a::b),
      b(dtb.a::a),
      c(dtb.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awe.aS) ? exk.b() : exk.a());

      private final dbj.c e;

      private a(dbj.c $$0) {
         this.e = $$0;
      }

      @Override
      public exn get(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(epe::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awj.a));

      private final Predicate<epe> e;

      private b(Predicate<epe> $$0) {
         this.e = $$0;
      }

      public boolean a(epe $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      exn get(dtc var1, dbg var2, ir var3, ewz var4);
   }
}
