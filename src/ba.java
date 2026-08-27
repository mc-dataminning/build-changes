import com.google.gson.JsonObject;
import java.util.Optional;

public class ba extends cw<ba.a> {
   public ba.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      cl.d $$3 = cl.d.a($$0.get("level"));
      return new ba.a($$1, $$3);
   }

   public void a(amj $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      private final cl.d a;

      public a(Optional<bc> $$0, cl.d $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<ba.a> c() {
         return al.l.a(new ba.a(Optional.empty(), cl.d.c));
      }

      public static am<ba.a> a(cl.d $$0) {
         return al.l.a(new ba.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.a.d($$0);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.add("level", this.a.e());
         return $$0;
      }
   }
}
