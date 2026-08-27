import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ewh<T> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Callback";
   private static final String c = "Name";
   private static final String d = "TriggerTime";
   private final ewg<T> e;
   private final Queue<ewh.a<T>> f = new PriorityQueue<>(c());
   private UnsignedLong g = UnsignedLong.ZERO;
   private final Table<String, Long, ewh.a<T>> h = HashBasedTable.create();

   private static <T> Comparator<ewh.a<T>> c() {
      return Comparator.<ewh.a<T>>comparingLong($$0 -> $$0.a).thenComparing($$0 -> $$0.b);
   }

   public ewh(ewg<T> $$0, Stream<? extends Dynamic<?>> $$1) {
      this($$0);
      this.f.clear();
      this.h.clear();
      this.g = UnsignedLong.ZERO;
      $$1.forEach($$0x -> {
         vh $$1x = (vh)$$0x.convert(uy.a).getValue();
         if ($$1x instanceof uk $$2) {
            this.a($$2);
         } else {
            a.warn("Invalid format of events: {}", $$1x);
         }
      });
   }

   public ewh(ewg<T> $$0) {
      this.e = $$0;
   }

   public void a(T $$0, long $$1) {
      while (true) {
         ewh.a<T> $$2 = this.f.peek();
         if ($$2 == null || $$2.a > $$1) {
            return;
         }

         this.f.remove();
         this.h.remove($$2.c, $$1);
         $$2.d.handle($$0, this, $$1);
      }
   }

   public void a(String $$0, long $$1, ewf<T> $$2) {
      if (!this.h.contains($$0, $$1)) {
         this.g = this.g.plus(UnsignedLong.ONE);
         ewh.a<T> $$3 = new ewh.a<>($$1, this.g, $$0, $$2);
         this.h.put($$0, $$1, $$3);
         this.f.add($$3);
      }
   }

   public int a(String $$0) {
      Collection<ewh.a<T>> $$1 = this.h.row($$0).values();
      $$1.forEach(this.f::remove);
      int $$2 = $$1.size();
      $$1.clear();
      return $$2;
   }

   public Set<String> a() {
      return Collections.unmodifiableSet(this.h.rowKeySet());
   }

   private void a(uk $$0) {
      uk $$1 = $$0.p("Callback");
      ewf<T> $$2 = this.e.a($$1);
      if ($$2 != null) {
         String $$3 = $$0.l("Name");
         long $$4 = $$0.i("TriggerTime");
         this.a($$3, $$4, $$2);
      }
   }

   private uk a(ewh.a<T> $$0) {
      uk $$1 = new uk();
      $$1.a("Name", $$0.c);
      $$1.a("TriggerTime", $$0.a);
      $$1.a("Callback", this.e.a($$0.d));
      return $$1;
   }

   public uq b() {
      uq $$0 = new uq();
      this.f.stream().sorted(c()).map(this::a).forEach($$0::add);
      return $$0;
   }

   public static class a<T> {
      public final long a;
      public final UnsignedLong b;
      public final String c;
      public final ewf<T> d;

      a(long $$0, UnsignedLong $$1, String $$2, ewf<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }
   }
}
