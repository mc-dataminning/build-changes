import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dyy {
   private Int2ObjectMap<bto> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bto> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bto> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bto> $$0 = (Entry<bto>)$$1.next();
            this.b.put($$0.getIntKey(), (bto)$$0.getValue());
         }

         Int2ObjectMap<bto> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bto $$0) {
      this.a();
      this.a.put($$0.ap(), $$0);
   }

   public void b(bto $$0) {
      this.a();
      this.a.remove($$0.ap());
   }

   public boolean c(bto $$0) {
      return this.a.containsKey($$0.ap());
   }

   public void a(Consumer<bto> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bto $$1 = (bto)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
