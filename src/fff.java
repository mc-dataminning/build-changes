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

public class fff<T> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Callback";
   private static final String c = "Name";
   private static final String d = "TriggerTime";
   private final ffe<T> e;
   private final Queue<fff.a<T>> f = new PriorityQueue<>(c());
   private UnsignedLong g = UnsignedLong.ZERO;
   private final Table<String, Long, fff.a<T>> h = HashBasedTable.create();

   private static <T> Comparator<fff.a<T>> c() {
      return Comparator.<fff.a<T>>comparingLong($$0 -> $$0.a).thenComparing($$0 -> $$0.b);
   }

   public fff(ffe<T> $$0, Stream<? extends Dynamic<?>> $$1) {
      this($$0);
      this.f.clear();
      this.h.clear();
      this.g = UnsignedLong.ZERO;
      $$1.forEach($$0x -> {
         va $$1x = (va)$$0x.convert(uo.a).getValue();
         if ($$1x instanceof ua $$2) {
            this.a($$2);
         } else {
            a.warn("Invalid format of events: {}", $$1x);
         }
      });
   }

   public fff(ffe<T> $$0) {
      this.e = $$0;
   }

   public void a(T $$0, long $$1) {
      while (true) {
         fff.a<T> $$2 = this.f.peek();
         if ($$2 == null || $$2.a > $$1) {
            return;
         }

         this.f.remove();
         this.h.remove($$2.c, $$1);
         $$2.d.a($$0, this, $$1);
      }
   }

   public void a(String $$0, long $$1, ffd<T> $$2) {
      if (!this.h.contains($$0, $$1)) {
         this.g = this.g.plus(UnsignedLong.ONE);
         fff.a<T> $$3 = new fff.a<>($$1, this.g, $$0, $$2);
         this.h.put($$0, $$1, $$3);
         this.f.add($$3);
      }
   }

   public int a(String $$0) {
      Collection<fff.a<T>> $$1 = this.h.row($$0).values();
      $$1.forEach(this.f::remove);
      int $$2 = $$1.size();
      $$1.clear();
      return $$2;
   }

   public Set<String> a() {
      return Collections.unmodifiableSet(this.h.rowKeySet());
   }

   private void a(ua $$0) {
      ffd<T> $$1 = $$0.<ffd<T>>a("Callback", this.e.a()).orElse(null);
      if ($$1 != null) {
         String $$2 = $$0.b("Name", "");
         long $$3 = $$0.b("TriggerTime", 0L);
         this.a($$2, $$3, $$1);
      }
   }

   private ua a(fff.a<T> $$0) {
      ua $$1 = new ua();
      $$1.a("Name", $$0.c);
      $$1.a("TriggerTime", $$0.a);
      $$1.a("Callback", this.e.a(), $$0.d);
      return $$1;
   }

   public ug b() {
      ug $$0 = new ug();
      this.f.stream().sorted(c()).map(this::a).forEach($$0::add);
      return $$0;
   }

   public static class a<T> {
      public final long a;
      public final UnsignedLong b;
      public final String c;
      public final ffd<T> d;

      a(long $$0, UnsignedLong $$1, String $$2, ffd<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }
   }
}
