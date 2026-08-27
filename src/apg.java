import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;

public class apg extends aon {
   public static final int a = 33;
   private static final int c = 4;
   protected final Long2ByteMap b = new Long2ByteOpenHashMap();
   private final Long2ObjectOpenHashMap<axd<ape<?>>> d = new Long2ObjectOpenHashMap();

   public apg() {
      super(34, 16, 256);
      this.b.defaultReturnValue((byte)33);
   }

   private axd<ape<?>> g(long $$0) {
      return (axd<ape<?>>)this.d.computeIfAbsent($$0, $$0x -> axd.a(4));
   }

   private int a(axd<ape<?>> $$0) {
      return $$0.isEmpty() ? 34 : $$0.b().b();
   }

   public void a(long $$0, ape<?> $$1) {
      axd<ape<?>> $$2 = this.g($$0);
      int $$3 = this.a($$2);
      $$2.add($$1);
      if ($$1.b() < $$3) {
         this.b($$0, $$1.b(), true);
      }
   }

   public void b(long $$0, ape<?> $$1) {
      axd<ape<?>> $$2 = this.g($$0);
      $$2.remove($$1);
      if ($$2.isEmpty()) {
         this.d.remove($$0);
      }

      this.b($$0, this.a($$2), false);
   }

   public <T> void a(apf<T> $$0, cvl $$1, int $$2, T $$3) {
      this.a($$1.a(), new ape<>($$0, $$2, $$3));
   }

   public <T> void b(apf<T> $$0, cvl $$1, int $$2, T $$3) {
      ape<T> $$4 = new ape<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public void a(int $$0) {
      List<Pair<ape<cvl>, Long>> $$1 = new ArrayList<>();
      ObjectIterator var3 = this.d.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<axd<ape<?>>> $$2 = (Entry<axd<ape<?>>>)var3.next();

         for (ape<?> $$3 : (axd)$$2.getValue()) {
            if ($$3.a() == apf.c) {
               $$1.add(Pair.of($$3, $$2.getLongKey()));
            }
         }
      }

      for (Pair<ape<cvl>, Long> $$4 : $$1) {
         Long $$5 = (Long)$$4.getSecond();
         ape<cvl> $$6 = (ape<cvl>)$$4.getFirst();
         this.b($$5, $$6);
         cvl $$7 = new cvl($$5);
         apf<cvl> $$8 = $$6.a();
         this.a($$8, $$7, $$0, $$7);
      }
   }

   @Override
   protected int b(long $$0) {
      axd<ape<?>> $$1 = (axd<ape<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().b() : Integer.MAX_VALUE;
   }

   public int a(cvl $$0) {
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
      axd<ape<?>> $$1 = (axd<ape<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().toString() : "no_ticket";
   }
}
