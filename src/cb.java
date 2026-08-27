import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cb extends cv<cb.a> {
   static final aep a = new aep("killed_by_crossbow");

   @Override
   public aep a() {
      return a;
   }

   public cb.a a(JsonObject $$0, ba $$1, be $$2) {
      ba[] $$3 = bo.b($$0, "victims", $$2);
      cj.d $$4 = cj.d.a($$0.get("unique_entity_types"));
      return new cb.a($$1, $$3, $$4);
   }

   public void a(akj $$0, Collection<big> $$1) {
      List<ech> $$2 = Lists.newArrayList();
      Set<bik<?>> $$3 = Sets.newHashSet();

      for (big $$4 : $$1) {
         $$3.add($$4.ag());
         $$2.add(bo.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static class a extends ar {
      private final ba[] a;
      private final cj.d b;

      public a(ba $$0, ba[] $$1, cj.d $$2) {
         super(cb.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cb.a a(bo.a... $$0) {
         ba[] $$1 = new ba[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            bo.a $$3 = $$0[$$2];
            $$1[$$2] = bo.a($$3.b());
         }

         return new cb.a(ba.a, $$1, cj.d.e);
      }

      public static cb.a a(cj.d $$0) {
         ba[] $$1 = new ba[0];
         return new cb.a(ba.a, $$1, $$0);
      }

      public boolean a(Collection<ech> $$0, int $$1) {
         if (this.a.length > 0) {
            List<ech> $$2 = Lists.newArrayList($$0);

            for (ba $$3 : this.a) {
               boolean $$4 = false;
               Iterator<ech> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  ech $$6 = $$5.next();
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
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("victims", ba.a(this.a, $$0));
         $$1.add("unique_entity_types", this.b.d());
         return $$1;
      }
   }
}
