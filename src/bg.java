import com.google.gson.JsonObject;
import java.util.Optional;

public class bg extends cu<bg.a> {
   final aer a;

   public bg(aer $$0) {
      this.a = $$0;
   }

   @Override
   public aer a() {
      return this.a;
   }

   public bg.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<ch> $$3 = ch.a($$0.get("start_position"));
      Optional<bf> $$4 = bf.a($$0.get("distance"));
      return new bg.a(this.a, $$1, $$3, $$4);
   }

   public void a(akl $$0, ehd $$1) {
      ehd $$2 = $$0.di();
      this.a($$0, $$3 -> $$3.a($$0.x(), $$1, $$2));
   }

   public static class a extends ar {
      private final Optional<ch> a;
      private final Optional<bf> b;

      public a(aer $$0, Optional<ba> $$1, Optional<ch> $$2, Optional<bf> $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static bg.a a(bo.a $$0, bf $$1, ch.a $$2) {
         return new bg.a(ai.U.a, bo.a($$0), $$2.b(), Optional.of($$1));
      }

      public static bg.a a(bo.a $$0, bf $$1) {
         return new bg.a(ai.V.a, bo.a($$0), Optional.empty(), Optional.of($$1));
      }

      public static bg.a a(bf $$0) {
         return new bg.a(ai.C.a, Optional.empty(), Optional.empty(), Optional.of($$0));
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("start_position", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("distance", $$1.a()));
         return $$0;
      }

      public boolean a(akk $$0, ehd $$1, ehd $$2) {
         return this.a.isPresent() && !this.a.get().a($$0, $$1.c, $$1.d, $$1.e)
            ? false
            : !this.b.isPresent() || this.b.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
      }
   }
}
