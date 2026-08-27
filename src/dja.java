import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dja {
   private Int2ObjectMap<biw> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<biw> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<biw> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<biw> $$0 = (Entry<biw>)$$1.next();
            this.b.put($$0.getIntKey(), (biw)$$0.getValue());
         }

         Int2ObjectMap<biw> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(biw $$0) {
      this.a();
      this.a.put($$0.ah(), $$0);
   }

   public void b(biw $$0) {
      this.a();
      this.a.remove($$0.ah());
   }

   public boolean c(biw $$0) {
      return this.a.containsKey($$0.ah());
   }

   public void a(Consumer<biw> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               biw $$1 = (biw)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
