import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djg {
   private Int2ObjectMap<biq> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<biq> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<biq> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<biq> $$0 = (Entry<biq>)$$1.next();
            this.b.put($$0.getIntKey(), (biq)$$0.getValue());
         }

         Int2ObjectMap<biq> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(biq $$0) {
      this.a();
      this.a.put($$0.ai(), $$0);
   }

   public void b(biq $$0) {
      this.a();
      this.a.remove($$0.ai());
   }

   public boolean c(biq $$0) {
      return this.a.containsKey($$0.ai());
   }

   public void a(Consumer<biq> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               biq $$1 = (biq)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
