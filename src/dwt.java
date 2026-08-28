import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwt {
   private Int2ObjectMap<bsg> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bsg> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bsg> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bsg> $$0 = (Entry<bsg>)$$1.next();
            this.b.put($$0.getIntKey(), (bsg)$$0.getValue());
         }

         Int2ObjectMap<bsg> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bsg $$0) {
      this.a();
      this.a.put($$0.am(), $$0);
   }

   public void b(bsg $$0) {
      this.a();
      this.a.remove($$0.am());
   }

   public boolean c(bsg $$0) {
      return this.a.containsKey($$0.am());
   }

   public void a(Consumer<bsg> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bsg $$1 = (bsg)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
