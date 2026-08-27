import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class bz extends cw<bz.a> {
   public bz.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      JsonObject $$3 = atg.a($$0, "slots", new JsonObject());
      cl.d $$4 = cl.d.a($$3.get("occupied"));
      cl.d $$5 = cl.d.a($$3.get("full"));
      cl.d $$6 = cl.d.a($$3.get("empty"));
      List<cb> $$7 = cb.b($$0.get("items"));
      return new bz.a($$1, $$4, $$5, $$6, $$7);
   }

   public void a(amj $$0, cdy $$1, clo $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         clo $$7 = $$1.a($$6);
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

   private void a(amj $$0, cdy $$1, clo $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static class a extends at {
      private final cl.d a;
      private final cl.d b;
      private final cl.d c;
      private final List<cb> d;

      public a(Optional<bc> $$0, cl.d $$1, cl.d $$2, cl.d $$3, List<cb> $$4) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
      }

      public static am<bz.a> a(cb.a... $$0) {
         return a(Stream.of($$0).map(cb.a::b).toArray(cb[]::new));
      }

      public static am<bz.a> a(cb... $$0) {
         return al.e.a(new bz.a(Optional.empty(), cl.d.c, cl.d.c, cl.d.c, List.of($$0)));
      }

      public static am<bz.a> a(cse... $$0) {
         cb[] $$1 = new cb[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cb(Optional.empty(), Optional.of(ik.a($$0[$$2].k().j())), cl.d.c, cl.d.c, List.of(), List.of(), Optional.empty(), Optional.empty());
         }

         return a($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         if (!this.a.c() || !this.b.c() || !this.c.c()) {
            JsonObject $$1 = new JsonObject();
            $$1.add("occupied", this.a.e());
            $$1.add("full", this.b.e());
            $$1.add("empty", this.c.e());
            $$0.add("slots", $$1);
         }

         if (!this.d.isEmpty()) {
            $$0.add("items", cb.a(this.d));
         }

         return $$0;
      }

      public boolean a(cdy $$0, clo $$1, int $$2, int $$3, int $$4) {
         if (!this.b.d($$2)) {
            return false;
         } else if (!this.c.d($$3)) {
            return false;
         } else if (!this.a.d($$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cb> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               clo $$8 = $$0.a($$7);
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
