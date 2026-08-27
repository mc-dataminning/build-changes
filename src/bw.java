import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Optional;

public class bw extends cw<bw.a> {
   public bw.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("rod"));
      Optional<bc> $$4 = bq.a($$0, "entity", $$2);
      Optional<cb> $$5 = cb.a($$0.get("item"));
      return new bw.a($$1, $$3, $$4, $$5);
   }

   public void a(amf $$0, clj $$1, cei $$2, Collection<clj> $$3) {
      eex $$4 = bq.b($$0, (bkq)($$2.u() != null ? $$2.u() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static class a extends at {
      private final Optional<cb> a;
      private final Optional<bc> b;
      private final Optional<cb> c;

      public a(Optional<bc> $$0, Optional<cb> $$1, Optional<bc> $$2, Optional<cb> $$3) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static am<bw.a> a(Optional<cb> $$0, Optional<bq> $$1, Optional<cb> $$2) {
         return al.D.a(new bw.a(Optional.empty(), $$0, bq.a($$1), $$2));
      }

      public boolean a(clj $$0, eex $$1, Collection<clj> $$2) {
         if (this.a.isPresent() && !this.a.get().a($$0)) {
            return false;
         } else if (this.b.isPresent() && !this.b.get().a($$1)) {
            return false;
         } else {
            if (this.c.isPresent()) {
               boolean $$3 = false;
               bkq $$4 = $$1.c(ehi.a);
               if ($$4 instanceof can $$5 && this.c.get().a($$5.q())) {
                  $$3 = true;
               }

               for (clj $$6 : $$2) {
                  if (this.c.get().a($$6)) {
                     $$3 = true;
                     break;
                  }
               }

               if (!$$3) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("rod", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         this.c.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
