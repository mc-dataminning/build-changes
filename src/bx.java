import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

public class bx extends cv<bx.a> {
   static final acq a = new acq("inventory_changed");

   @Override
   public acq a() {
      return a;
   }

   public bx.a a(JsonObject $$0, ba $$1, be $$2) {
      JsonObject $$3 = aor.a($$0, "slots", new JsonObject());
      cj.d $$4 = cj.d.a($$3.get("occupied"));
      cj.d $$5 = cj.d.a($$3.get("full"));
      cj.d $$6 = cj.d.a($$3.get("empty"));
      bz[] $$7 = bz.b($$0.get("items"));
      return new bx.a($$1, $$4, $$5, $$6, $$7);
   }

   public void a(aig $$0, byn $$1, cfz $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cfz $$7 = $$1.a($$6);
         if ($$7.b()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.L() >= $$7.g()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(aig $$0, byn $$1, cfz $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static class a extends ar {
      private final cj.d a;
      private final cj.d b;
      private final cj.d c;
      private final bz[] d;

      public a(ba $$0, cj.d $$1, cj.d $$2, cj.d $$3, bz[] $$4) {
         super(bx.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
      }

      public static bx.a a(bz... $$0) {
         return new bx.a(ba.a, cj.d.e, cj.d.e, cj.d.e, $$0);
      }

      public static bx.a a(cml... $$0) {
         bz[] $$1 = new bz[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new bz(null, ImmutableSet.of($$0[$$2].k()), cj.d.e, cj.d.e, bj.b, bj.b, null, cl.a);
         }

         return a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (!this.a.c() || !this.b.c() || !this.c.c()) {
            JsonObject $$2 = new JsonObject();
            $$2.add("occupied", this.a.d());
            $$2.add("full", this.b.d());
            $$2.add("empty", this.c.d());
            $$1.add("slots", $$2);
         }

         if (this.d.length > 0) {
            JsonArray $$3 = new JsonArray();

            for (bz $$4 : this.d) {
               $$3.add($$4.a());
            }

            $$1.add("items", $$3);
         }

         return $$1;
      }

      public boolean a(byn $$0, cfz $$1, int $$2, int $$3, int $$4) {
         if (!this.b.d($$2)) {
            return false;
         } else if (!this.c.d($$3)) {
            return false;
         } else if (!this.a.d($$4)) {
            return false;
         } else {
            int $$5 = this.d.length;
            if ($$5 == 0) {
               return true;
            } else if ($$5 != 1) {
               List<bz> $$6 = new ObjectArrayList(this.d);
               int $$7 = $$0.b();

               for (int $$8 = 0; $$8 < $$7; $$8++) {
                  if ($$6.isEmpty()) {
                     return true;
                  }

                  cfz $$9 = $$0.a($$8);
                  if (!$$9.b()) {
                     $$6.removeIf($$1x -> $$1x.a($$9));
                  }
               }

               return $$6.isEmpty();
            } else {
               return !$$1.b() && this.d[0].a($$1);
            }
         }
      }
   }
}
