import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class epl extends epe {
   public static final String a = "idcounts";
   private final Object2IntMap<String> b = new Object2IntOpenHashMap();

   public static epe.a<epl> a() {
      return new epe.a<>(epl::new, epl::b, bag.k);
   }

   public epl() {
      this.b.defaultReturnValue(-1);
   }

   public static epl b(us $$0, jk.a $$1) {
      epl $$2 = new epl();

      for (String $$3 : $$0.e()) {
         if ($$0.b($$3, 99)) {
            $$2.b.put($$3, $$0.h($$3));
         }
      }

      return $$2;
   }

   @Override
   public us a(us $$0, jk.a $$1) {
      ObjectIterator var3 = this.b.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<String> $$2 = (Entry<String>)var3.next();
         $$0.a((String)$$2.getKey(), $$2.getIntValue());
      }

      return $$0;
   }

   public epk b() {
      int $$0 = this.b.getInt("map") + 1;
      this.b.put("map", $$0);
      this.c();
      return new epk($$0);
   }
}
