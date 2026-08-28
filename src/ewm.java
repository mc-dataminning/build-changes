import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class ewm extends ewf {
   public static final String a = "idcounts";
   private final Object2IntMap<String> b = new Object2IntOpenHashMap();

   public static ewf.a<ewm> a() {
      return new ewf.a<>(ewm::new, ewm::b, bax.k);
   }

   public ewm() {
      this.b.defaultReturnValue(-1);
   }

   public static ewm b(tw $$0, ju.a $$1) {
      ewm $$2 = new ewm();

      for (String $$3 : $$0.e()) {
         if ($$0.b($$3, 99)) {
            $$2.b.put($$3, $$0.h($$3));
         }
      }

      return $$2;
   }

   @Override
   public tw a(tw $$0, ju.a $$1) {
      ObjectIterator var3 = this.b.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<String> $$2 = (Entry<String>)var3.next();
         $$0.a((String)$$2.getKey(), $$2.getIntValue());
      }

      return $$0;
   }

   public ewl b() {
      int $$0 = this.b.getInt("map") + 1;
      this.b.put("map", $$0);
      this.g();
      return new ewl($$0);
   }
}
