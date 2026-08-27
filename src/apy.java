import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;

public class apy extends apf {
   public static final int a = 33;
   private static final int c = 4;
   protected final Long2ByteMap b = new Long2ByteOpenHashMap();
   private final Long2ObjectOpenHashMap<ayb<apw<?>>> d = new Long2ObjectOpenHashMap();

   public apy() {
      super(34, 16, 256);
      this.b.defaultReturnValue((byte)33);
   }

   private ayb<apw<?>> g(long $$0) {
      return (ayb<apw<?>>)this.d.computeIfAbsent($$0, $$0x -> ayb.a(4));
   }

   private int a(ayb<apw<?>> $$0) {
      return $$0.isEmpty() ? 34 : $$0.b().b();
   }

   public void a(long $$0, apw<?> $$1) {
      ayb<apw<?>> $$2 = this.g($$0);
      int $$3 = this.a($$2);
      $$2.add($$1);
      if ($$1.b() < $$3) {
         this.b($$0, $$1.b(), true);
      }
   }

   public void b(long $$0, apw<?> $$1) {
      ayb<apw<?>> $$2 = this.g($$0);
      $$2.remove($$1);
      if ($$2.isEmpty()) {
         this.d.remove($$0);
      }

      this.b($$0, this.a($$2), false);
   }

   public <T> void a(apx<T> $$0, cye $$1, int $$2, T $$3) {
      this.a($$1.a(), new apw<>($$0, $$2, $$3));
   }

   public <T> void b(apx<T> $$0, cye $$1, int $$2, T $$3) {
      apw<T> $$4 = new apw<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public void a(int $$0) {
      List<Pair<apw<cye>, Long>> $$1 = new ArrayList<>();
      ObjectIterator var3 = this.d.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<ayb<apw<?>>> $$2 = (Entry<ayb<apw<?>>>)var3.next();

         for (apw<?> $$3 : (ayb)$$2.getValue()) {
            if ($$3.a() == apx.c) {
               $$1.add(Pair.of($$3, $$2.getLongKey()));
            }
         }
      }

      for (Pair<apw<cye>, Long> $$4 : $$1) {
         Long $$5 = (Long)$$4.getSecond();
         apw<cye> $$6 = (apw<cye>)$$4.getFirst();
         this.b($$5, $$6);
         cye $$7 = new cye($$5);
         apx<cye> $$8 = $$6.a();
         this.a($$8, $$7, $$0, $$7);
      }
   }

   @Override
   protected int b(long $$0) {
      ayb<apw<?>> $$1 = (ayb<apw<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().b() : Integer.MAX_VALUE;
   }

   public int a(cye $$0) {
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

   public void a() {
      this.b(Integer.MAX_VALUE);
   }

   public String d(long $$0) {
      ayb<apw<?>> $$1 = (ayb<apw<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().toString() : "no_ticket";
   }
}
