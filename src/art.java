import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;

public class art extends aqw {
   public static final int a = 33;
   private static final int c = 4;
   protected final Long2ByteMap b = new Long2ByteOpenHashMap();
   private final Long2ObjectOpenHashMap<bab<arr<?>>> d = new Long2ObjectOpenHashMap();

   public art() {
      super(34, 16, 256);
      this.b.defaultReturnValue((byte)33);
   }

   private bab<arr<?>> g(long $$0) {
      return (bab<arr<?>>)this.d.computeIfAbsent($$0, $$0x -> bab.a(4));
   }

   private int a(bab<arr<?>> $$0) {
      return $$0.isEmpty() ? 34 : $$0.b().b();
   }

   public void a(long $$0, arr<?> $$1) {
      bab<arr<?>> $$2 = this.g($$0);
      int $$3 = this.a($$2);
      $$2.add($$1);
      if ($$1.b() < $$3) {
         this.b($$0, $$1.b(), true);
      }
   }

   public void b(long $$0, arr<?> $$1) {
      bab<arr<?>> $$2 = this.g($$0);
      $$2.remove($$1);
      if ($$2.isEmpty()) {
         this.d.remove($$0);
      }

      this.b($$0, this.a($$2), false);
   }

   public <T> void a(ars<T> $$0, deb $$1, int $$2, T $$3) {
      this.a($$1.a(), new arr<>($$0, $$2, $$3));
   }

   public <T> void b(ars<T> $$0, deb $$1, int $$2, T $$3) {
      arr<T> $$4 = new arr<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public void a(int $$0) {
      List<Pair<arr<deb>, Long>> $$1 = new ArrayList<>();
      ObjectIterator var3 = this.d.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<bab<arr<?>>> $$2 = (Entry<bab<arr<?>>>)var3.next();

         for (arr<?> $$3 : (bab)$$2.getValue()) {
            if ($$3.a() == ars.c) {
               $$1.add(Pair.of($$3, $$2.getLongKey()));
            }
         }
      }

      for (Pair<arr<deb>, Long> $$4 : $$1) {
         Long $$5 = (Long)$$4.getSecond();
         arr<deb> $$6 = (arr<deb>)$$4.getFirst();
         this.b($$5, $$6);
         deb $$7 = new deb($$5);
         ars<deb> $$8 = $$6.a();
         this.a($$8, $$7, $$0, $$7);
      }
   }

   @Override
   protected int b(long $$0) {
      bab<arr<?>> $$1 = (bab<arr<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().b() : Integer.MAX_VALUE;
   }

   public int a(deb $$0) {
      return this.c($$0.a());
   }

   @Override
   protected int c(long $$0) {
      return this.b.get($$0);
   }

   @Override
   protected void a(long $$0, int $$1) {
      if ($$1 >= 33) {
         this.b.remove($$0);
      } else {
         this.b.put($$0, (byte)$$1);
      }
   }

   public LongSet a() {
      return this.b.keySet();
   }

   public void b() {
      this.b(Integer.MAX_VALUE);
   }

   public String d(long $$0) {
      bab<arr<?>> $$1 = (bab<arr<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().toString() : "no_ticket";
   }
}
