import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public class av extends cu<av.a> {
   static final aer a = new aer("brewed_potion");

   @Override
   public aer a() {
      return a;
   }

   public av.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      cku $$3 = null;
      if ($$0.has("potion")) {
         aer $$4 = new aer(arg.i($$0, "potion"));
         $$3 = jb.j.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$4 + "'"));
      }

      return new av.a($$1, $$3);
   }

   public void a(akl $$0, cku $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      @Nullable
      private final cku a;

      public a(Optional<ba> $$0, @Nullable cku $$1) {
         super(av.a, $$0);
         this.a = $$1;
      }

      public static av.a d() {
         return new av.a(Optional.empty(), null);
      }

      public boolean a(cku $$0) {
         return this.a == null || this.a == $$0;
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         if (this.a != null) {
            $$0.addProperty("potion", jb.j.b(this.a).toString());
         }

         return $$0;
      }
   }
}
