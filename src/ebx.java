import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ebx {
   private Int2ObjectMap<bvb> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bvb> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bvb> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bvb> $$0 = (Entry<bvb>)$$1.next();
            this.b.put($$0.getIntKey(), (bvb)$$0.getValue());
         }

         Int2ObjectMap<bvb> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bvb $$0) {
      this.a();
      this.a.put($$0.ar(), $$0);
   }

   public void b(bvb $$0) {
      this.a();
      this.a.remove($$0.ar());
   }

   public boolean c(bvb $$0) {
      return this.a.containsKey($$0.ar());
   }

   public void a(Consumer<bvb> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bvb $$1 = (bvb)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
