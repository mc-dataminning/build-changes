import java.util.function.Predicate;

public class dgp {
   private final fbx a;
   private final fbx b;
   private final dgp.a c;
   private final dgp.b d;
   private final fcc e;

   public dgp(fbx $$0, fbx $$1, dgp.a $$2, dgp.b $$3, bvj $$4) {
      this($$0, $$1, $$2, $$3, fcc.a($$4));
   }

   public dgp(fbx $$0, fbx $$1, dgp.a $$2, dgp.b $$3, fcc $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fbx a() {
      return this.b;
   }

   public fbx b() {
      return this.a;
   }

   public fcr a(dxu $$0, dgm $$1, jh $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fcr a(etw $$0, dgm $$1, jh $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fco.a();
   }

   public static enum a implements dgp.c {
      a(dxt.a::b),
      b(dxt.a::a),
      c(dxt.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axu.aT) ? fco.b() : fco.a());

      private final dgp.c e;

      private a(final dgp.c $$0) {
         this.e = $$0;
      }

      @Override
      public fcr get(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(etw::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aya.a));

      private final Predicate<etw> e;

      private b(final Predicate<etw> $$0) {
         this.e = $$0;
      }

      public boolean a(etw $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fcr get(dxu var1, dgm var2, jh var3, fcc var4);
   }
}
