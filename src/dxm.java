import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxm {
   private Int2ObjectMap<bsr> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bsr> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bsr> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bsr> $$0 = (Entry<bsr>)$$1.next();
            this.b.put($$0.getIntKey(), (bsr)$$0.getValue());
         }

         Int2ObjectMap<bsr> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bsr $$0) {
      this.a();
      this.a.put($$0.an(), $$0);
   }

   public void b(bsr $$0) {
      this.a();
      this.a.remove($$0.an());
   }

   public boolean c(bsr $$0) {
      return this.a.containsKey($$0.an());
   }

   public void a(Consumer<bsr> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bsr $$1 = (bsr)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
