import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;

public class alw extends ald {
   public static final int a = 33;
   private static final int c = 4;
   protected final Long2ByteMap b = new Long2ByteOpenHashMap();
   private final Long2ObjectOpenHashMap<ato<alu<?>>> d = new Long2ObjectOpenHashMap();

   public alw() {
      super(34, 16, 256);
      this.b.defaultReturnValue((byte)33);
   }

   private ato<alu<?>> g(long $$0) {
      return (ato<alu<?>>)this.d.computeIfAbsent($$0, $$0x -> ato.a(4));
   }

   private int a(ato<alu<?>> $$0) {
      return $$0.isEmpty() ? 34 : $$0.b().b();
   }

   public void a(long $$0, alu<?> $$1) {
      ato<alu<?>> $$2 = this.g($$0);
      int $$3 = this.a($$2);
      $$2.add($$1);
      if ($$1.b() < $$3) {
         this.b($$0, $$1.b(), true);
      }
   }

   public void b(long $$0, alu<?> $$1) {
      ato<alu<?>> $$2 = this.g($$0);
      $$2.remove($$1);
      if ($$2.isEmpty()) {
         this.d.remove($$0);
      }

      this.b($$0, this.a($$2), false);
   }

   public <T> void a(alv<T> $$0, cqg $$1, int $$2, T $$3) {
      this.a($$1.a(), new alu<>($$0, $$2, $$3));
   }

   public <T> void b(alv<T> $$0, cqg $$1, int $$2, T $$3) {
      alu<T> $$4 = new alu<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public void a(int $$0) {
      List<Pair<alu<cqg>, Long>> $$1 = new ArrayList<>();
      ObjectIterator var3 = this.d.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<ato<alu<?>>> $$2 = (Entry<ato<alu<?>>>)var3.next();

         for (alu<?> $$3 : (ato)$$2.getValue()) {
            if ($$3.a() == alv.c) {
               $$1.add(Pair.of($$3, $$2.getLongKey()));
            }
         }
      }

      for (Pair<alu<cqg>, Long> $$4 : $$1) {
         Long $$5 = (Long)$$4.getSecond();
         alu<cqg> $$6 = (alu<cqg>)$$4.getFirst();
         this.b($$5, $$6);
         cqg $$7 = new cqg($$5);
         alv<cqg> $$8 = $$6.a();
         this.a($$8, $$7, $$0, $$7);
      }
   }

   @Override
   protected int b(long $$0) {
      ato<alu<?>> $$1 = (ato<alu<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().b() : Integer.MAX_VALUE;
   }

   public int a(cqg $$0) {
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
      ato<alu<?>> $$1 = (ato<alu<?>>)this.d.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().toString() : "no_ticket";
   }
}
