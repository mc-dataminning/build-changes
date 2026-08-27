import com.google.gson.JsonObject;
import java.util.Optional;

public class ay extends cu<ay.a> {
   static final aer a = new aer("construct_beacon");

   @Override
   public aer a() {
      return a;
   }

   public ay.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      cj.d $$3 = cj.d.a($$0.get("level"));
      return new ay.a($$1, $$3);
   }

   public void a(akl $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final cj.d a;

      public a(Optional<ba> $$0, cj.d $$1) {
         super(ay.a, $$0);
         this.a = $$1;
      }

      public static ay.a d() {
         return new ay.a(Optional.empty(), cj.d.c);
      }

      public static ay.a a(cj.d $$0) {
         return new ay.a(Optional.empty(), $$0);
      }

      public boolean a(int $$0) {
         return this.a.d($$0);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         $$0.add("level", this.a.e());
         return $$0;
      }
   }
}
