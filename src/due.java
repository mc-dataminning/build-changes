import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class due {
   private Int2ObjectMap<bql> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bql> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bql> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bql> $$0 = (Entry<bql>)$$1.next();
            this.b.put($$0.getIntKey(), (bql)$$0.getValue());
         }

         Int2ObjectMap<bql> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bql $$0) {
      this.a();
      this.a.put($$0.aj(), $$0);
   }

   public void b(bql $$0) {
      this.a();
      this.a.remove($$0.aj());
   }

   public boolean c(bql $$0) {
      return this.a.containsKey($$0.aj());
   }

   public void a(Consumer<bql> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bql $$1 = (bql)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
