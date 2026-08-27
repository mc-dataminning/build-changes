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

public class eoi {
   private static final Logger e = LogUtils.getLogger();
   public static final eoi a = new eoi(eqs.b, Optional.empty(), List.of(), List.of());
   public static final eqr b = eqs.p;
   public static final long c = 0L;
   public static final Codec<eoi> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eqs.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.f),
               axe.a(akf.a, "random_sequence").forGetter($$0x -> $$0x.g),
               axe.a(eoh.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.h),
               axe.a(epr.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eoi::new)
   );
   private final eqr f;
   private final Optional<akf> g;
   private final List<eoh> h;
   private final List<epp> i;
   private final BiFunction<csd, eoa, csd> j;

   eoi(eqr $$0, Optional<akf> $$1, List<eoh> $$2, List<epp> $$3) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = epr.a($$3);
   }

   public static Consumer<csd> a(aqe $$0, Consumer<csd> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.G() < $$2.i()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.G();

               while ($$3 > 0) {
                  csd $$4 = $$2.c(Math.min($$2.i(), $$3));
                  $$3 -= $$4.G();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eog $$0, Consumer<csd> $$1) {
      this.a(new eoa.a($$0).a(this.g), $$1);
   }

   public void a(eoa $$0, Consumer<csd> $$1) {
      eoa.c<?> $$2 = eoa.a(this);
      if ($$0.b($$2)) {
         Consumer<csd> $$3 = epp.a(this.j, $$1, $$0);

         for (eoh $$4 : this.h) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         e.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eog $$0, long $$1, Consumer<csd> $$2) {
      this.a(new eoa.a($$0).a($$1).a(this.g), a($$0.a(), $$2));
   }

   public void b(eog $$0, Consumer<csd> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eoa $$0, Consumer<csd> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<csd> a(eog $$0, long $$1) {
      return this.a(new eoa.a($$0).a($$1).a(this.g));
   }

   public ObjectArrayList<csd> a(eog $$0) {
      return this.a(new eoa.a($$0).a(this.g));
   }

   private ObjectArrayList<csd> a(eoa $$0) {
      ObjectArrayList<csd> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eqr a() {
      return this.f;
   }

   public void a(eoj $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         this.h.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         this.i.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(boj $$0, eog $$1, long $$2) {
      eoa $$3 = new eoa.a($$1).a($$2).a(this.g);
      ObjectArrayList<csd> $$4 = this.a($$3);
      ayd $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         csd $$7 = (csd)var9.next();
         if ($$6.isEmpty()) {
            e.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.d()) {
            $$0.a($$6.remove($$6.size() - 1), csd.i);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<csd> $$0, int $$1, ayd $$2) {
      List<csd> $$3 = Lists.newArrayList();
      Iterator<csd> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         csd $$5 = $$4.next();
         if ($$5.d()) {
            $$4.remove();
         } else if ($$5.G() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         csd $$6 = $$3.remove(axw.a($$2, 0, $$3.size() - 1));
         int $$7 = axw.a($$2, 1, $$6.G() / 2);
         csd $$8 = $$6.a($$7);
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

   private List<Integer> a(boj $$0, ayd $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).d()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eoi.a b() {
      return new eoi.a();
   }

   public static class a implements epl<eoi.a> {
      private final Builder<eoh> a = ImmutableList.builder();
      private final Builder<epp> b = ImmutableList.builder();
      private eqr c = eoi.b;
      private Optional<akf> d = Optional.empty();

      public eoi.a a(eoh.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eoi.a a(eqr $$0) {
         this.c = $$0;
         return this;
      }

      public eoi.a a(akf $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eoi.a a(epp.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eoi.a a() {
         return this;
      }

      public eoi b() {
         return new eoi(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
