import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class ebq extends ebm {
   public static final String a = "idcounts";
   private final Object2IntMap<String> b = new Object2IntOpenHashMap();

   public static ebm.a<ebq> a() {
      return new ebm.a<>(ebq::new, ebq::b, asv.k);
   }

   public ebq() {
      this.b.defaultReturnValue(-1);
   }

   public static ebq b(qu $$0) {
      ebq $$1 = new ebq();

      for (String $$2 : $$0.e()) {
         if ($$0.b($$2, 99)) {
            $$1.b.put($$2, $$0.h($$2));
         }
      }

      return $$1;
   }

   @Override
   public qu a(qu $$0) {
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
