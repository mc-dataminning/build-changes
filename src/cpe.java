import java.util.function.Predicate;

public class cpe {
   private final ehn a;
   private final ehn b;
   private final cpe.a c;
   private final cpe.b d;
   private final ehs e;

   public cpe(ehn $$0, ehn $$1, cpe.a $$2, cpe.b $$3, biq $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ehs.a($$4);
   }

   public ehn a() {
      return this.b;
   }

   public ehn b() {
      return this.a;
   }

   public eig a(dfj $$0, cpb $$1, gw $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eig a(eam $$0, cpb $$1, gw $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eid.a();
   }

   public static enum a implements cpe.c {
      a(dfi.a::b),
      b(dfi.a::a),
      c(dfi.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(apt.aP) ? eid.b() : eid.a());

      private final cpe.c e;

      private a(cpe.c $$0) {
         this.e = $$0;
      }

      @Override
      public eig get(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eam::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(apy.a));

      private final Predicate<eam> e;

      private b(Predicate<eam> $$0) {
         this.e = $$0;
      }

      public boolean a(eam $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eig get(dfj var1, cpb var2, gw var3, ehs var4);
   }
}
