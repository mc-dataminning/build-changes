import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwn {
   private Int2ObjectMap<bsd> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bsd> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bsd> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bsd> $$0 = (Entry<bsd>)$$1.next();
            this.b.put($$0.getIntKey(), (bsd)$$0.getValue());
         }

         Int2ObjectMap<bsd> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bsd $$0) {
      this.a();
      this.a.put($$0.al(), $$0);
   }

   public void b(bsd $$0) {
      this.a();
      this.a.remove($$0.al());
   }

   public boolean c(bsd $$0) {
      return this.a.containsKey($$0.al());
   }

   public void a(Consumer<bsd> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bsd $$1 = (bsd)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
