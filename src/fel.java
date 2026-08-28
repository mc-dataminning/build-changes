import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class fel {
   private static final Long2ObjectMap<String> a = new Long2ObjectOpenHashMap();

   public static String a(long $$0) {
      return (String)a.get($$0);
   }

   public static void b(long $$0) {
      a.remove($$0);
   }

   public static void a(long $$0, String $$1) {
      a.put($$0, $$1);
   }
}
