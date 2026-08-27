import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class au extends cu<au.a> {
   static final aer a = new aer("bred_animals");

   @Override
   public aer a() {
      return a;
   }

   public au.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<ba> $$3 = bo.a($$0, "parent", $$2);
      Optional<ba> $$4 = bo.a($$0, "partner", $$2);
      Optional<ba> $$5 = bo.a($$0, "child", $$2);
      return new au.a($$1, $$3, $$4, $$5);
   }

   public void a(akl $$0, buk $$1, buk $$2, @Nullable bid $$3) {
      ech $$4 = bo.b($$0, $$1);
      ech $$5 = bo.b($$0, $$2);
      ech $$6 = $$3 != null ? bo.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static class a extends ar {
      private final Optional<ba> a;
      private final Optional<ba> b;
      private final Optional<ba> c;

      public a(Optional<ba> $$0, Optional<ba> $$1, Optional<ba> $$2, Optional<ba> $$3) {
         super(au.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static au.a d() {
         return new au.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
      }

      public static au.a a(bo.a $$0) {
         return new au.a(Optional.empty(), Optional.empty(), Optional.empty(), bo.a($$0));
      }

      public static au.a a(Optional<bo> $$0, Optional<bo> $$1, Optional<bo> $$2) {
         return new au.a(Optional.empty(), bo.a($$0), bo.a($$1), bo.a($$2));
      }

      public boolean a(ech $$0, ech $$1, @Nullable ech $$2) {
         return !this.c.isPresent() || $$2 != null && this.c.get().a($$2) ? a(this.a, $$0) && a(this.b, $$1) || a(this.a, $$1) && a(this.b, $$0) : false;
      }

      private static boolean a(Optional<ba> $$0, ech $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("parent", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("partner", $$1.a()));
         this.c.ifPresent($$1 -> $$0.add("child", $$1.a()));
         return $$0;
      }
   }
}
