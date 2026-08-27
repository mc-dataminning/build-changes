import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public class as extends cu<as.a> {
   static final aer a = new aer("bee_nest_destroyed");

   @Override
   public aer a() {
      return a;
   }

   public as.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      csm $$3 = a($$0);
      Optional<bz> $$4 = bz.a($$0.get("item"));
      cj.d $$5 = cj.d.a($$0.get("num_bees_inside"));
      return new as.a($$1, $$3, $$4, $$5);
   }

   @Nullable
   private static csm a(JsonObject $$0) {
      if ($$0.has("block")) {
         aer $$1 = new aer(arg.i($$0, "block"));
         return jb.f.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
      } else {
         return null;
      }
   }

   public void a(akl $$0, dfa $$1, ciy $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static class a extends ar {
      @Nullable
      private final csm a;
      private final Optional<bz> b;
      private final cj.d c;

      public a(Optional<ba> $$0, @Nullable csm $$1, Optional<bz> $$2, cj.d $$3) {
         super(as.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static as.a a(csm $$0, bz.a $$1, cj.d $$2) {
         return new as.a(Optional.empty(), $$0, $$1.b(), $$2);
      }

      public boolean a(dfa $$0, ciy $$1, int $$2) {
         if (this.a != null && !$$0.a(this.a)) {
            return false;
         } else {
            return this.b.isPresent() && !this.b.get().a($$1) ? false : this.c.d($$2);
         }
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         if (this.a != null) {
            $$0.addProperty("block", jb.f.b(this.a).toString());
         }

         this.b.ifPresent($$1 -> $$0.add("item", $$1.a()));
         $$0.add("num_bees_inside", this.c.e());
         return $$0;
      }
   }
}
