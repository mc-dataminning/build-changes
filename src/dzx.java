import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzx {
   private Int2ObjectMap<bui> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bui> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bui> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bui> $$0 = (Entry<bui>)$$1.next();
            this.b.put($$0.getIntKey(), (bui)$$0.getValue());
         }

         Int2ObjectMap<bui> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bui $$0) {
      this.a();
      this.a.put($$0.as(), $$0);
   }

   public void b(bui $$0) {
      this.a();
      this.a.remove($$0.as());
   }

   public boolean c(bui $$0) {
      return this.a.containsKey($$0.as());
   }

   public void a(Consumer<bui> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bui $$1 = (bui)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
