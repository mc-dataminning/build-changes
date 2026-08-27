import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class au extends cv<au.a> {
   static final aep a = new aep("bred_animals");

   @Override
   public aep a() {
      return a;
   }

   public au.a a(JsonObject $$0, ba $$1, be $$2) {
      ba $$3 = bo.a($$0, "parent", $$2);
      ba $$4 = bo.a($$0, "partner", $$2);
      ba $$5 = bo.a($$0, "child", $$2);
      return new au.a($$1, $$3, $$4, $$5);
   }

   public void a(akj $$0, bui $$1, bui $$2, @Nullable bib $$3) {
      ech $$4 = bo.b($$0, $$1);
      ech $$5 = bo.b($$0, $$2);
      ech $$6 = $$3 != null ? bo.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static class a extends ar {
      private final ba a;
      private final ba b;
      private final ba c;

      public a(ba $$0, ba $$1, ba $$2, ba $$3) {
         super(au.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static au.a c() {
         return new au.a(ba.a, ba.a, ba.a, ba.a);
      }

      public static au.a a(bo.a $$0) {
         return new au.a(ba.a, ba.a, ba.a, bo.a($$0.b()));
      }

      public static au.a a(bo $$0, bo $$1, bo $$2) {
         return new au.a(ba.a, bo.a($$0), bo.a($$1), bo.a($$2));
      }

      public boolean a(ech $$0, ech $$1, @Nullable ech $$2) {
         return this.c == ba.a || $$2 != null && this.c.a($$2) ? this.a.a($$0) && this.b.a($$1) || this.a.a($$1) && this.b.a($$0) : false;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("parent", this.a.a($$0));
         $$1.add("partner", this.b.a($$0));
         $$1.add("child", this.c.a($$0));
         return $$1;
      }
   }
}
