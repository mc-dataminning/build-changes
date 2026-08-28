import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dyk {
   private Int2ObjectMap<btj> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<btj> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<btj> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<btj> $$0 = (Entry<btj>)$$1.next();
            this.b.put($$0.getIntKey(), (btj)$$0.getValue());
         }

         Int2ObjectMap<btj> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(btj $$0) {
      this.a();
      this.a.put($$0.ap(), $$0);
   }

   public void b(btj $$0) {
      this.a();
      this.a.remove($$0.ap());
   }

   public boolean c(btj $$0) {
      return this.a.containsKey($$0.ap());
   }

   public void a(Consumer<btj> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               btj $$1 = (btj)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
