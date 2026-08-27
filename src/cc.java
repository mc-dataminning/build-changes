import com.google.gson.JsonObject;

public class cc extends cv<cc.a> {
   final aep a;

   public cc(aep $$0) {
      this.a = $$0;
   }

   @Override
   public aep a() {
      return this.a;
   }

   public cc.a a(JsonObject $$0, ba $$1, be $$2) {
      return new cc.a(this.a, $$1, bo.a($$0, "entity", $$2), bd.a($$0.get("killing_blow")));
   }

   public void a(akj $$0, big $$1, bhe $$2) {
      ech $$3 = bo.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static class a extends ar {
      private final ba a;
      private final bd b;

      public a(aep $$0, ba $$1, ba $$2, bd $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static cc.a a(bo $$0) {
         return new cc.a(ai.b.a, ba.a, bo.a($$0), bd.a);
      }

      public static cc.a a(bo.a $$0) {
         return new cc.a(ai.b.a, ba.a, bo.a($$0.b()), bd.a);
      }

      public static cc.a c() {
         return new cc.a(ai.b.a, ba.a, ba.a, bd.a);
      }

      public static cc.a a(bo $$0, bd $$1) {
         return new cc.a(ai.b.a, ba.a, bo.a($$0), $$1);
      }

      public static cc.a a(bo.a $$0, bd $$1) {
         return new cc.a(ai.b.a, ba.a, bo.a($$0.b()), $$1);
      }

      public static cc.a a(bo $$0, bd.a $$1) {
         return new cc.a(ai.b.a, ba.a, bo.a($$0), $$1.b());
      }

      public static cc.a a(bo.a $$0, bd.a $$1) {
         return new cc.a(ai.b.a, ba.a, bo.a($$0.b()), $$1.b());
      }

      public static cc.a d() {
         return new cc.a(ai.W.a, ba.a, ba.a, bd.a);
      }

      public static cc.a b(bo $$0) {
         return new cc.a(ai.c.a, ba.a, bo.a($$0), bd.a);
      }

      public static cc.a b(bo.a $$0) {
         return new cc.a(ai.c.a, ba.a, bo.a($$0.b()), bd.a);
      }

      public static cc.a e() {
         return new cc.a(ai.c.a, ba.a, ba.a, bd.a);
      }

      public static cc.a b(bo $$0, bd $$1) {
         return new cc.a(ai.c.a, ba.a, bo.a($$0), $$1);
      }

      public static cc.a b(bo.a $$0, bd $$1) {
         return new cc.a(ai.c.a, ba.a, bo.a($$0.b()), $$1);
      }

      public static cc.a b(bo $$0, bd.a $$1) {
         return new cc.a(ai.c.a, ba.a, bo.a($$0), $$1.b());
      }

      public static cc.a b(bo.a $$0, bd.a $$1) {
         return new cc.a(ai.c.a, ba.a, bo.a($$0.b()), $$1.b());
      }

      public boolean a(akj $$0, ech $$1, bhe $$2) {
         return !this.b.a($$0, $$2) ? false : this.a.a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("entity", this.a.a($$0));
         $$1.add("killing_blow", this.b.a());
         return $$1;
      }
   }
}
