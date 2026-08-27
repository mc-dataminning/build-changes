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

public class enj {
   private static final Logger e = LogUtils.getLogger();
   public static final enj a = new enj(epn.b, Optional.empty(), List.of(), List.of());
   public static final epm b = epn.p;
   public static final long c = 0L;
   public static final Codec<enj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epn.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.f),
               aws.a(ajt.a, "random_sequence").forGetter($$0x -> $$0x.g),
               aws.a(eni.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.h),
               aws.a(eor.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, enj::new)
   );
   private final epm f;
   private final Optional<ajt> g;
   private final List<eni> h;
   private final List<eop> i;
   private final BiFunction<crj, enb, crj> j;

   enj(epm $$0, Optional<ajt> $$1, List<eni> $$2, List<eop> $$3) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = eor.a($$3);
   }

   public static Consumer<crj> a(aps $$0, Consumer<crj> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.G() < $$2.i()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.G();

               while ($$3 > 0) {
                  crj $$4 = $$2.c(Math.min($$2.i(), $$3));
                  $$3 -= $$4.G();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(enh $$0, Consumer<crj> $$1) {
      this.a(new enb.a($$0).a(this.g), $$1);
   }

   public void a(enb $$0, Consumer<crj> $$1) {
      enb.c<?> $$2 = enb.a(this);
      if ($$0.b($$2)) {
         Consumer<crj> $$3 = eop.a(this.j, $$1, $$0);

         for (eni $$4 : this.h) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         e.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(enh $$0, long $$1, Consumer<crj> $$2) {
      this.a(new enb.a($$0).a($$1).a(this.g), a($$0.a(), $$2));
   }

   public void b(enh $$0, Consumer<crj> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(enb $$0, Consumer<crj> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<crj> a(enh $$0, long $$1) {
      return this.a(new enb.a($$0).a($$1).a(this.g));
   }

   public ObjectArrayList<crj> a(enh $$0) {
      return this.a(new enb.a($$0).a(this.g));
   }

   private ObjectArrayList<crj> a(enb $$0) {
      ObjectArrayList<crj> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public epm a() {
      return this.f;
   }

   public void a(enk $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         this.h.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         this.i.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bnt $$0, enh $$1, long $$2) {
      enb $$3 = new enb.a($$1).a($$2).a(this.g);
      ObjectArrayList<crj> $$4 = this.a($$3);
      axr $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         crj $$7 = (crj)var9.next();
         if ($$6.isEmpty()) {
            e.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.d()) {
            $$0.a($$6.remove($$6.size() - 1), crj.i);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<crj> $$0, int $$1, axr $$2) {
      List<crj> $$3 = Lists.newArrayList();
      Iterator<crj> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         crj $$5 = $$4.next();
         if ($$5.d()) {
            $$4.remove();
         } else if ($$5.G() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         crj $$6 = $$3.remove(axk.a($$2, 0, $$3.size() - 1));
         int $$7 = axk.a($$2, 1, $$6.G() / 2);
         crj $$8 = $$6.a($$7);
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

   private List<Integer> a(bnt $$0, axr $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).d()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static enj.a b() {
      return new enj.a();
   }

   public static class a implements eom<enj.a> {
      private final Builder<eni> a = ImmutableList.builder();
      private final Builder<eop> b = ImmutableList.builder();
      private epm c = enj.b;
      private Optional<ajt> d = Optional.empty();

      public enj.a a(eni.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public enj.a a(epm $$0) {
         this.c = $$0;
         return this;
      }

      public enj.a a(ajt $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public enj.a a(eop.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public enj.a a() {
         return this;
      }

      public enj b() {
         return new enj(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
