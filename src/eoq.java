import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class eoq {
   private static final Logger f = LogUtils.getLogger();
   public static final eoq a = new eoq(erb.b, Optional.empty(), List.of(), List.of());
   public static final era b = erb.p;
   public static final long c = 0L;
   public static final Codec<eoq> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erb.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               axh.a(akh.a, "random_sequence").forGetter($$0x -> $$0x.h),
               axh.a(eop.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.i),
               axh.a(epz.c.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eoq::new)
   );
   public static final Codec<iw<eoq>> e = akd.a(le.aU, d);
   private final era g;
   private final Optional<akh> h;
   private final List<eop> i;
   private final List<epx> j;
   private final BiFunction<csz, eol, csz> k;

   eoq(era $$0, Optional<akh> $$1, List<eop> $$2, List<epx> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = epz.a($$3);
   }

   public static Consumer<csz> a(aqh $$0, Consumer<csz> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.G() < $$2.i()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.G();

               while ($$3 > 0) {
                  csz $$4 = $$2.c(Math.min($$2.i(), $$3));
                  $$3 -= $$4.G();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eoo $$0, Consumer<csz> $$1) {
      this.a(new eol.a($$0).a(this.h), $$1);
   }

   public void a(eol $$0, Consumer<csz> $$1) {
      eol.c<?> $$2 = eol.a(this);
      if ($$0.b($$2)) {
         Consumer<csz> $$3 = epx.a(this.k, $$1, $$0);

         for (eop $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eoo $$0, long $$1, Consumer<csz> $$2) {
      this.a(new eol.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eoo $$0, Consumer<csz> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eol $$0, Consumer<csz> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<csz> a(eoo $$0, long $$1) {
      return this.a(new eol.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<csz> a(eoo $$0) {
      return this.a(new eol.a($$0).a(this.h));
   }

   private ObjectArrayList<csz> a(eol $$0) {
      ObjectArrayList<csz> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public era a() {
      return this.g;
   }

   public void a(eor $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bpf $$0, eoo $$1, long $$2) {
      eol $$3 = new eol.a($$1).a($$2).a(this.h);
      ObjectArrayList<csz> $$4 = this.a($$3);
      ayg $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         csz $$7 = (csz)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.d()) {
            $$0.a($$6.remove($$6.size() - 1), csz.i);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<csz> $$0, int $$1, ayg $$2) {
      List<csz> $$3 = Lists.newArrayList();
      Iterator<csz> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         csz $$5 = $$4.next();
         if ($$5.d()) {
            $$4.remove();
         } else if ($$5.G() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         csz $$6 = $$3.remove(axz.a($$2, 0, $$3.size() - 1));
         int $$7 = axz.a($$2, 1, $$6.G() / 2);
         csz $$8 = $$6.a($$7);
         if ($$6.G() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.G() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bpf $$0, ayg $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).d()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eoq.a b() {
      return new eoq.a();
   }

   public static class a implements ept<eoq.a> {
      private final Builder<eop> a = ImmutableList.builder();
      private final Builder<epx> b = ImmutableList.builder();
      private era c = eoq.b;
      private Optional<akh> d = Optional.empty();

      public eoq.a a(eop.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eoq.a a(era $$0) {
         this.c = $$0;
         return this;
      }

      public eoq.a a(akh $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eoq.a a(epx.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eoq.a a() {
         return this;
      }

      public eoq b() {
         return new eoq(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
