import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Optional;

public class bu extends cu<bu.a> {
   static final aer a = new aer("fishing_rod_hooked");

   @Override
   public aer a() {
      return a;
   }

   public bu.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bz> $$3 = bz.a($$0.get("rod"));
      Optional<ba> $$4 = bo.a($$0, "entity", $$2);
      Optional<bz> $$5 = bz.a($$0.get("item"));
      return new bu.a($$1, $$3, $$4, $$5);
   }

   public void a(akl $$0, cix $$1, cca $$2, Collection<cix> $$3) {
      ecg $$4 = bo.b($$0, (bii)($$2.o() != null ? $$2.o() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static class a extends ar {
      private final Optional<bz> a;
      private final Optional<ba> b;
      private final Optional<bz> c;

      public a(Optional<ba> $$0, Optional<bz> $$1, Optional<ba> $$2, Optional<bz> $$3) {
         super(bu.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static bu.a a(Optional<bz> $$0, Optional<bo> $$1, Optional<bz> $$2) {
         return new bu.a(Optional.empty(), $$0, bo.a($$1), $$2);
      }

      public boolean a(cix $$0, ecg $$1, Collection<cix> $$2) {
         if (this.a.isPresent() && !this.a.get().a($$0)) {
            return false;
         } else if (this.b.isPresent() && !this.b.get().a($$1)) {
            return false;
         } else {
            if (this.c.isPresent()) {
               boolean $$3 = false;
               bii $$4 = $$1.c(eer.a);
               if ($$4 instanceof byf $$5 && this.c.get().a($$5.j())) {
                  $$3 = true;
               }

               for (cix $$6 : $$2) {
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
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("rod", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         this.c.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
