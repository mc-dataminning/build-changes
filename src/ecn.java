import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class ecn extends ecj {
   public static final String a = "idcounts";
   private final Object2IntMap<String> b = new Object2IntOpenHashMap();

   public static ecj.a<ecn> a() {
      return new ecj.a<>(ecn::new, ecn::b, aud.k);
   }

   public ecn() {
      this.b.defaultReturnValue(-1);
   }

   public static ecn b(rt $$0) {
      ecn $$1 = new ecn();

      for (String $$2 : $$0.e()) {
         if ($$0.b($$2, 99)) {
            $$1.b.put($$2, $$0.h($$2));
         }
      }

      return $$1;
   }

   @Override
   public rt a(rt $$0) {
      ObjectIterator var2 = this.b.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<String> $$1 = (Entry<String>)var2.next();
         $$0.a((String)$$1.getKey(), $$1.getIntValue());
      }

      return $$0;
   }

   public int b() {
      int $$0 = this.b.getInt("map") + 1;
      this.b.put("map", $$0);
      this.c();
      return $$0;
   }
}
