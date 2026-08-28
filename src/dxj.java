import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxj {
   private Int2ObjectMap<bsq> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bsq> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bsq> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bsq> $$0 = (Entry<bsq>)$$1.next();
            this.b.put($$0.getIntKey(), (bsq)$$0.getValue());
         }

         Int2ObjectMap<bsq> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bsq $$0) {
      this.a();
      this.a.put($$0.an(), $$0);
   }

   public void b(bsq $$0) {
      this.a();
      this.a.remove($$0.an());
   }

   public boolean c(bsq $$0) {
      return this.a.containsKey($$0.an());
   }

   public void a(Consumer<bsq> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bsq $$1 = (bsq)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
