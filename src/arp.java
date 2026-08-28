import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class arp {
   public static final int a = arl.b + 2;
   private final List<Long2ObjectLinkedOpenHashMap<List<Runnable>>> b = IntStream.range(0, a).mapToObj($$0x -> new Long2ObjectLinkedOpenHashMap()).toList();
   private volatile int c = a;
   private final String d;

   public arp(String $$0) {
      this.d = $$0;
   }

   protected void a(int $$0, dgo $$1, int $$2) {
      if ($$0 < a) {
         Long2ObjectLinkedOpenHashMap<List<Runnable>> $$3 = this.b.get($$0);
         List<Runnable> $$4 = (List<Runnable>)$$3.remove($$1.a());
         if ($$0 == this.c) {
            while (this.b() && this.b.get(this.c).isEmpty()) {
               this.c++;
            }
         }

         if ($$4 != null && !$$4.isEmpty()) {
            ((List)this.b.get($$2).computeIfAbsent($$1.a(), $$0x -> Lists.newArrayList())).addAll($$4);
            this.c = Math.min(this.c, $$2);
         }
      }
   }

   protected void a(Runnable $$0, long $$1, int $$2) {
      ((List)this.b.get($$2).computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$0);
      this.c = Math.min(this.c, $$2);
   }

   protected void a(long $$0, boolean $$1) {
      for (Long2ObjectLinkedOpenHashMap<List<Runnable>> $$2 : this.b) {
         List<Runnable> $$3 = (List<Runnable>)$$2.get($$0);
         if ($$3 != null) {
            if ($$1) {
               $$3.clear();
            }

            if ($$3.isEmpty()) {
               $$2.remove($$0);
            }
         }
      }

      while (this.b() && this.b.get(this.c).isEmpty()) {
         this.c++;
      }
   }

   @Nullable
   public arp.a a() {
      if (!this.b()) {
         return null;
      } else {
         int $$0 = this.c;
         Long2ObjectLinkedOpenHashMap<List<Runnable>> $$1 = this.b.get($$0);
         long $$2 = $$1.firstLongKey();
         List<Runnable> $$3 = (List<Runnable>)$$1.removeFirst();

         while (this.b() && this.b.get(this.c).isEmpty()) {
            this.c++;
         }

         return new arp.a($$2, $$3);
      }
   }

   public boolean b() {
      return this.c < a;
   }

   @Override
   public String toString() {
      return this.d + " " + this.c + "...";
   }

   public static record a(long a, List<Runnable> b) {
   }
}
