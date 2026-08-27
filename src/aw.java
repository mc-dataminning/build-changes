import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class aw extends cu<aw.a> {
   static final aer a = new aer("changed_dimension");

   @Override
   public aer a() {
      return a;
   }

   public aw.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      aeq<cpl> $$3 = $$0.has("from") ? aeq.a(jc.aH, new aer(arg.i($$0, "from"))) : null;
      aeq<cpl> $$4 = $$0.has("to") ? aeq.a(jc.aH, new aer(arg.i($$0, "to"))) : null;
      return new aw.a($$1, $$3, $$4);
   }

   public void a(akl $$0, aeq<cpl> $$1, aeq<cpl> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static class a extends ar {
      @Nullable
      private final aeq<cpl> a;
      @Nullable
      private final aeq<cpl> b;

      public a(Optional<ba> $$0, @Nullable aeq<cpl> $$1, @Nullable aeq<cpl> $$2) {
         super(aw.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static aw.a d() {
         return new aw.a(Optional.empty(), null, null);
      }

      public static aw.a a(aeq<cpl> $$0, aeq<cpl> $$1) {
         return new aw.a(Optional.empty(), $$0, $$1);
      }

      public static aw.a a(aeq<cpl> $$0) {
         return new aw.a(Optional.empty(), null, $$0);
      }

      public static aw.a b(aeq<cpl> $$0) {
         return new aw.a(Optional.empty(), $$0, null);
      }

      public boolean b(aeq<cpl> $$0, aeq<cpl> $$1) {
         return this.a != null && this.a != $$0 ? false : this.b == null || this.b == $$1;
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         if (this.a != null) {
            $$0.addProperty("from", this.a.a().toString());
         }

         if (this.b != null) {
            $$0.addProperty("to", this.b.a().toString());
         }

         return $$0;
      }
   }
}
