import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwi {
   private Int2ObjectMap<bsu> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bsu> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bsu> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bsu> $$0 = (Entry<bsu>)$$1.next();
            this.b.put($$0.getIntKey(), (bsu)$$0.getValue());
         }

         Int2ObjectMap<bsu> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bsu $$0) {
      this.a();
      this.a.put($$0.al(), $$0);
   }

   public void b(bsu $$0) {
      this.a();
      this.a.remove($$0.al());
   }

   public boolean c(bsu $$0) {
      return this.a.containsKey($$0.al());
   }

   public void a(Consumer<bsu> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bsu $$1 = (bsu)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
