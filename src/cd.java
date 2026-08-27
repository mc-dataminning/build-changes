import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cd extends cw<cd.a> {
   public cd.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      List<bc> $$3 = bq.b($$0, "victims", $$2);
      cl.d $$4 = cl.d.a($$0.get("unique_entity_types"));
      return new cd.a($$1, $$3, $$4);
   }

   public void a(akt $$0, Collection<bis> $$1) {
      List<ecs> $$2 = Lists.newArrayList();
      Set<biw<?>> $$3 = Sets.newHashSet();

      for (bis $$4 : $$1) {
         $$3.add($$4.ag());
         $$2.add(bq.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static class a extends at {
      private final List<bc> a;
      private final cl.d b;

      public a(Optional<bc> $$0, List<bc> $$1, cl.d $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<cd.a> a(bq.a... $$0) {
         return al.G.a(new cd.a(Optional.empty(), bq.a($$0), cl.d.c));
      }

      public static am<cd.a> a(cl.d $$0) {
         return al.G.a(new cd.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<ecs> $$0, int $$1) {
         if (!this.a.isEmpty()) {
            List<ecs> $$2 = Lists.newArrayList($$0);

            for (bc $$3 : this.a) {
               boolean $$4 = false;
               Iterator<ecs> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  ecs $$6 = $$5.next();
                  if ($$3.a($$6)) {
                     $$5.remove();
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  return false;
               }
            }
         }

         return this.b.d($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.add("victims", bc.a(this.a));
         $$0.add("unique_entity_types", this.b.e());
         return $$0;
      }
   }
}
