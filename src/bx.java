import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class bx extends cu<bx.a> {
   static final aer a = new aer("inventory_changed");

   @Override
   public aer a() {
      return a;
   }

   public bx.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      JsonObject $$3 = arg.a($$0, "slots", new JsonObject());
      cj.d $$4 = cj.d.a($$3.get("occupied"));
      cj.d $$5 = cj.d.a($$3.get("full"));
      cj.d $$6 = cj.d.a($$3.get("empty"));
      List<bz> $$7 = bz.b($$0.get("items"));
      return new bx.a($$1, $$4, $$5, $$6, $$7);
   }

   public void a(akl $$0, cbm $$1, ciy $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         ciy $$7 = $$1.a($$6);
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

   private void a(akl $$0, cbm $$1, ciy $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static class a extends ar {
      private final cj.d a;
      private final cj.d b;
      private final cj.d c;
      private final List<bz> d;

      public a(Optional<ba> $$0, cj.d $$1, cj.d $$2, cj.d $$3, List<bz> $$4) {
         super(bx.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
      }

      public static bx.a a(bz.a... $$0) {
         return a(Arrays.stream($$0).flatMap($$0x -> $$0x.b().stream()).toArray(bz[]::new));
      }

      public static bx.a a(bz... $$0) {
         return new bx.a(Optional.empty(), cj.d.c, cj.d.c, cj.d.c, List.of($$0));
      }

      public static bx.a a(cpl... $$0) {
         bz[] $$1 = new bz[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new bz(Optional.empty(), Optional.of(hi.a($$0[$$2].k().j())), cj.d.c, cj.d.c, List.of(), List.of(), Optional.empty(), Optional.empty());
         }

         return a($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         if (!this.a.c() || !this.b.c() || !this.c.c()) {
            JsonObject $$1 = new JsonObject();
            $$1.add("occupied", this.a.e());
            $$1.add("full", this.b.e());
            $$1.add("empty", this.c.e());
            $$0.add("slots", $$1);
         }

         if (!this.d.isEmpty()) {
            $$0.add("items", bz.a(this.d));
         }

         return $$0;
      }

      public boolean a(cbm $$0, ciy $$1, int $$2, int $$3, int $$4) {
         if (!this.b.d($$2)) {
            return false;
         } else if (!this.c.d($$3)) {
            return false;
         } else if (!this.a.d($$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<bz> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               ciy $$8 = $$0.a($$7);
               if (!$$8.b()) {
                  $$5.removeIf($$1x -> $$1x.a($$8));
               }
            }

            return $$5.isEmpty();
         } else {
            return !$$1.b() && this.d.get(0).a($$1);
         }
      }
   }
}
