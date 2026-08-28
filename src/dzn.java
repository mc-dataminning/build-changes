import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzn {
   private Int2ObjectMap<btz> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<btz> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<btz> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<btz> $$0 = (Entry<btz>)$$1.next();
            this.b.put($$0.getIntKey(), (btz)$$0.getValue());
         }

         Int2ObjectMap<btz> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(btz $$0) {
      this.a();
      this.a.put($$0.ar(), $$0);
   }

   public void b(btz $$0) {
      this.a();
      this.a.remove($$0.ar());
   }

   public boolean c(btz $$0) {
      return this.a.containsKey($$0.ar());
   }

   public void a(Consumer<btz> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               btz $$1 = (btz)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
