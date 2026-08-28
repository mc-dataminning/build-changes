import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Queue;

public class ama {
   private static final int a = 8;
   private final Queue<ama.a> b = new axw<>();
   private final Object2IntLinkedOpenHashMap<ama.b> c = new Object2IntLinkedOpenHashMap();

   private static long b() {
      return System.currentTimeMillis();
   }

   public synchronized void a(String $$0, Throwable $$1) {
      long $$2 = b();
      String $$3 = $$1.getMessage();
      this.b.add(new ama.a($$2, $$0, (Class<? extends Throwable>)$$1.getClass(), $$3));

      while (this.b.size() > 8) {
         this.b.remove();
      }

      ama.b $$4 = new ama.b($$0, (Class<? extends Throwable>)$$1.getClass());
      int $$5 = this.c.getInt($$4);
      this.c.putAndMoveToFirst($$4, $$5 + 1);
   }

   public synchronized String a() {
      long $$0 = b();
      StringBuilder $$1 = new StringBuilder();
      if (!this.b.isEmpty()) {
         $$1.append("\n\t\tLatest entries:\n");

         for (ama.a $$2 : this.b) {
            $$1.append("\t\t\t")
               .append($$2.b)
               .append(":")
               .append($$2.c)
               .append(": ")
               .append($$2.d)
               .append(" (")
               .append($$0 - $$2.a)
               .append("ms ago)")
               .append("\n");
         }
      }

      if (!this.c.isEmpty()) {
         if ($$1.isEmpty()) {
            $$1.append("\n");
         }

         $$1.append("\t\tEntry counts:\n");
         ObjectIterator var6 = Object2IntMaps.fastIterable(this.c).iterator();

         while (var6.hasNext()) {
            Entry<ama.b> $$3 = (Entry<ama.b>)var6.next();
            $$1.append("\t\t\t")
               .append(((ama.b)$$3.getKey()).a)
               .append(":")
               .append(((ama.b)$$3.getKey()).b)
               .append(" x ")
               .append($$3.getIntValue())
               .append("\n");
         }
      }

      return $$1.isEmpty() ? "~~NONE~~" : $$1.toString();
   }

   static record a(long a, String b, Class<? extends Throwable> c, String d) {
   }

   static record b(String a, Class<? extends Throwable> b) {
   }
}
