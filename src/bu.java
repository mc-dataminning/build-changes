import com.google.gson.JsonObject;
import java.util.Collection;

public class bu extends cv<bu.a> {
   static final acq a = new acq("fishing_rod_hooked");

   @Override
   public acq a() {
      return a;
   }

   public bu.a a(JsonObject $$0, ba $$1, be $$2) {
      bz $$3 = bz.a($$0.get("rod"));
      ba $$4 = bo.a($$0, "entity", $$2);
      bz $$5 = bz.a($$0.get("item"));
      return new bu.a($$1, $$3, $$4, $$5);
   }

   public void a(aig $$0, cfz $$1, bzc $$2, Collection<cfz> $$3) {
      dzk $$4 = bo.b($$0, (bfj)($$2.o() != null ? $$2.o() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static class a extends ar {
      private final bz a;
      private final ba b;
      private final bz c;

      public a(ba $$0, bz $$1, ba $$2, bz $$3) {
         super(bu.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static bu.a a(bz $$0, bo $$1, bz $$2) {
         return new bu.a(ba.a, $$0, bo.a($$1), $$2);
      }

      public boolean a(cfz $$0, dzk $$1, Collection<cfz> $$2) {
         if (!this.a.a($$0)) {
            return false;
         } else if (!this.b.a($$1)) {
            return false;
         } else {
            if (this.c != bz.a) {
               boolean $$3 = false;
               bfj $$4 = $$1.c(ebw.a);
               if ($$4 instanceof bvh $$5 && this.c.a($$5.j())) {
                  $$3 = true;
               }

               for (cfz $$6 : $$2) {
                  if (this.c.a($$6)) {
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
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("rod", this.a.a());
         $$1.add("entity", this.b.a($$0));
         $$1.add("item", this.c.a());
         return $$1;
      }
   }
}
