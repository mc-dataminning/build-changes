import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class aw extends cw<aw.a> {
   public aw.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<bc> $$3 = bq.a($$0, "parent", $$2);
      Optional<bc> $$4 = bq.a($$0, "partner", $$2);
      Optional<bc> $$5 = bq.a($$0, "child", $$2);
      return new aw.a($$1, $$3, $$4, $$5);
   }

   public void a(aks $$0, bur $$1, bur $$2, @Nullable bil $$3) {
      ecq $$4 = bq.b($$0, $$1);
      ecq $$5 = bq.b($$0, $$2);
      ecq $$6 = $$3 != null ? bq.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static class a extends at {
      private final Optional<bc> a;
      private final Optional<bc> b;
      private final Optional<bc> c;

      public a(Optional<bc> $$0, Optional<bc> $$1, Optional<bc> $$2, Optional<bc> $$3) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static am<aw.a> c() {
         return al.o.a(new aw.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static am<aw.a> a(bq.a $$0) {
         return al.o.a(new aw.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bq.a($$0))));
      }

      public static am<aw.a> a(Optional<bq> $$0, Optional<bq> $$1, Optional<bq> $$2) {
         return al.o.a(new aw.a(Optional.empty(), bq.a($$0), bq.a($$1), bq.a($$2)));
      }

      public boolean a(ecq $$0, ecq $$1, @Nullable ecq $$2) {
         return !this.c.isPresent() || $$2 != null && this.c.get().a($$2) ? a(this.a, $$0) && a(this.b, $$1) || a(this.a, $$1) && a(this.b, $$0) : false;
      }

      private static boolean a(Optional<bc> $$0, ecq $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("parent", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("partner", $$1.a()));
         this.c.ifPresent($$1 -> $$0.add("child", $$1.a()));
         return $$0;
      }
   }
}
