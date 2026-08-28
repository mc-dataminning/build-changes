import java.util.function.Predicate;

public class dgi {
   private final fbx a;
   private final fbx b;
   private final dgi.a c;
   private final dgi.b d;
   private final fcc e;

   public dgi(fbx $$0, fbx $$1, dgi.a $$2, dgi.b $$3, bva $$4) {
      this($$0, $$1, $$2, $$3, fcc.a($$4));
   }

   public dgi(fbx $$0, fbx $$1, dgi.a $$2, dgi.b $$3, fcc $$4) {
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

   public fcr a(dxq $$0, dgf $$1, ji $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fcr a(etw $$0, dgf $$1, ji $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fco.a();
   }

   public static enum a implements dgi.c {
      a(dxp.a::b),
      b(dxp.a::a),
      c(dxp.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awp.aT) ? fco.b() : fco.a());

      private final dgi.c e;

      private a(final dgi.c $$0) {
         this.e = $$0;
      }

      @Override
      public fcr get(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(etw::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awv.a));

      private final Predicate<etw> e;

      private b(final Predicate<etw> $$0) {
         this.e = $$0;
      }

      public boolean a(etw $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fcr get(dxq var1, dgf var2, ji var3, fcc var4);
   }
}
