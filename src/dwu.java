import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwu {
   private Int2ObjectMap<bsh> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bsh> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bsh> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bsh> $$0 = (Entry<bsh>)$$1.next();
            this.b.put($$0.getIntKey(), (bsh)$$0.getValue());
         }

         Int2ObjectMap<bsh> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bsh $$0) {
      this.a();
      this.a.put($$0.an(), $$0);
   }

   public void b(bsh $$0) {
      this.a();
      this.a.remove($$0.an());
   }

   public boolean c(bsh $$0) {
      return this.a.containsKey($$0.an());
   }

   public void a(Consumer<bsh> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bsh $$1 = (bsh)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
