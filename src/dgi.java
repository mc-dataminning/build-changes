import java.util.function.Predicate;

public class dgi {
   private final fbs a;
   private final fbs b;
   private final dgi.a c;
   private final dgi.b d;
   private final fbx e;

   public dgi(fbs $$0, fbs $$1, dgi.a $$2, dgi.b $$3, bvf $$4) {
      this($$0, $$1, $$2, $$3, fbx.a($$4));
   }

   public dgi(fbs $$0, fbs $$1, dgi.a $$2, dgi.b $$3, fbx $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fbs a() {
      return this.b;
   }

   public fbs b() {
      return this.a;
   }

   public fcm a(dxn $$0, dgf $$1, jh $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fcm a(etp $$0, dgf $$1, jh $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fcj.a();
   }

   public static enum a implements dgi.c {
      a(dxm.a::b),
      b(dxm.a::a),
      c(dxm.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(axu.aT) ? fcj.b() : fcj.a());

      private final dgi.c e;

      private a(final dgi.c $$0) {
         this.e = $$0;
      }

      @Override
      public fcm get(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(etp::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aya.a));

      private final Predicate<etp> e;

      private b(final Predicate<etp> $$0) {
         this.e = $$0;
      }

      public boolean a(etp $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fcm get(dxn var1, dgf var2, jh var3, fbx var4);
   }
}
