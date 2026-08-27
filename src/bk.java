import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public class bk extends cu<bk.a> {
   static final aer a = new aer("enter_block");

   @Override
   public aer a() {
      return a;
   }

   public bk.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      csm $$3 = a($$0);
      Optional<cy> $$4 = cy.a($$0.get("state"));
      if ($$3 != null) {
         $$4.ifPresent($$1x -> $$1x.a($$3.l(), $$1xx -> {
               throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1xx);
            }));
      }

      return new bk.a($$1, $$3, $$4);
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

   public void a(akl $$0, dfa $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      @Nullable
      private final csm a;
      private final Optional<cy> b;

      public a(Optional<ba> $$0, @Nullable csm $$1, Optional<cy> $$2) {
         super(bk.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bk.a a(csm $$0) {
         return new bk.a(Optional.empty(), $$0, Optional.empty());
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         if (this.a != null) {
            $$0.addProperty("block", jb.f.b(this.a).toString());
         }

         this.b.ifPresent($$1 -> $$0.add("state", $$1.a()));
         return $$0;
      }

      public boolean a(dfa $$0) {
         return this.a != null && !$$0.a(this.a) ? false : !this.b.isPresent() || this.b.get().a($$0);
      }
   }
}
