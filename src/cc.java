import com.google.gson.JsonObject;
import java.util.Optional;

public class cc extends cu<cc.a> {
   final aer a;

   public cc(aer $$0) {
      this.a = $$0;
   }

   @Override
   public aer a() {
      return this.a;
   }

   public cc.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      return new cc.a(this.a, $$1, bo.a($$0, "entity", $$2), bd.a($$0.get("killing_blow")));
   }

   public void a(akl $$0, bii $$1, bhg $$2) {
      ecg $$3 = bo.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static class a extends ar {
      private final Optional<ba> a;
      private final Optional<bd> b;

      public a(aer $$0, Optional<ba> $$1, Optional<ba> $$2, Optional<bd> $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static cc.a a(Optional<bo> $$0) {
         return new cc.a(ai.b.a, Optional.empty(), bo.a($$0), Optional.empty());
      }

      public static cc.a a(bo.a $$0) {
         return new cc.a(ai.b.a, Optional.empty(), bo.a($$0), Optional.empty());
      }

      public static cc.a d() {
         return new cc.a(ai.b.a, Optional.empty(), Optional.empty(), Optional.empty());
      }

      public static cc.a a(Optional<bo> $$0, Optional<bd> $$1) {
         return new cc.a(ai.b.a, Optional.empty(), bo.a($$0), $$1);
      }

      public static cc.a a(bo.a $$0, Optional<bd> $$1) {
         return new cc.a(ai.b.a, Optional.empty(), bo.a($$0), $$1);
      }

      public static cc.a a(Optional<bo> $$0, bd.a $$1) {
         return new cc.a(ai.b.a, Optional.empty(), bo.a($$0), $$1.b());
      }

      public static cc.a a(bo.a $$0, bd.a $$1) {
         return new cc.a(ai.b.a, Optional.empty(), bo.a($$0), $$1.b());
      }

      public static cc.a e() {
         return new cc.a(ai.W.a, Optional.empty(), Optional.empty(), Optional.empty());
      }

      public static cc.a b(Optional<bo> $$0) {
         return new cc.a(ai.c.a, Optional.empty(), bo.a($$0), Optional.empty());
      }

      public static cc.a b(bo.a $$0) {
         return new cc.a(ai.c.a, Optional.empty(), bo.a($$0), Optional.empty());
      }

      public static cc.a f() {
         return new cc.a(ai.c.a, Optional.empty(), Optional.empty(), Optional.empty());
      }

      public static cc.a b(Optional<bo> $$0, Optional<bd> $$1) {
         return new cc.a(ai.c.a, Optional.empty(), bo.a($$0), $$1);
      }

      public static cc.a b(bo.a $$0, Optional<bd> $$1) {
         return new cc.a(ai.c.a, Optional.empty(), bo.a($$0), $$1);
      }

      public static cc.a b(Optional<bo> $$0, bd.a $$1) {
         return new cc.a(ai.c.a, Optional.empty(), bo.a($$0), $$1.b());
      }

      public static cc.a b(bo.a $$0, bd.a $$1) {
         return new cc.a(ai.c.a, Optional.empty(), bo.a($$0), $$1.b());
      }

      public boolean a(akl $$0, ecg $$1, bhg $$2) {
         return this.b.isPresent() && !this.b.get().a($$0, $$2) ? false : this.a.isEmpty() || this.a.get().a($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("killing_blow", $$1.a()));
         return $$0;
      }
   }
}
