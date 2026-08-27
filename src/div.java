import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class div {
   private Int2ObjectMap<big> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<big> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<big> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<big> $$0 = (Entry<big>)$$1.next();
            this.b.put($$0.getIntKey(), (big)$$0.getValue());
         }

         Int2ObjectMap<big> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(big $$0) {
      this.a();
      this.a.put($$0.ah(), $$0);
   }

   public void b(big $$0) {
      this.a();
      this.a.remove($$0.ah());
   }

   public boolean c(big $$0) {
      return this.a.containsKey($$0.ah());
   }

   public void a(Consumer<big> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               big $$1 = (big)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
