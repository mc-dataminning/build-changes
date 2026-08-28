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

public class eul {
   private static final Logger f = LogUtils.getLogger();
   public static final eul a = new eul(exb.b, Optional.empty(), List.of(), List.of());
   public static final exa b = exb.q;
   public static final long c = 0L;
   public static final Codec<eul> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               exb.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               all.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               euk.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               evw.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eul::new)
   );
   public static final Codec<jq<eul>> e = alh.a(ma.bd, d);
   private final exa g;
   private final Optional<all> h;
   private final List<euk> i;
   private final List<evu> j;
   private final BiFunction<cwf, eug, cwf> k;

   eul(exa $$0, Optional<all> $$1, List<euk> $$2, List<evu> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = evw.a($$3);
   }

   public static Consumer<cwf> a(arq $$0, Consumer<cwf> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.L() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cwf $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(euj $$0, Consumer<cwf> $$1) {
      this.a(new eug.a($$0).a(this.h), $$1);
   }

   public void a(eug $$0, Consumer<cwf> $$1) {
      eug.c<?> $$2 = eug.a(this);
      if ($$0.b($$2)) {
         Consumer<cwf> $$3 = evu.a(this.k, $$1, $$0);

         for (euk $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(euj $$0, long $$1, Consumer<cwf> $$2) {
      this.a(new eug.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(euj $$0, Consumer<cwf> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eug $$0, Consumer<cwf> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cwf> a(euj $$0, azv $$1) {
      return this.a(new eug.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwf> a(euj $$0, long $$1) {
      return this.a(new eug.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwf> a(euj $$0) {
      return this.a(new eug.a($$0).a(this.h));
   }

   private ObjectArrayList<cwf> a(eug $$0) {
      ObjectArrayList<cwf> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public exa a() {
      return this.g;
   }

   public void a(eum $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bsa $$0, euj $$1, long $$2) {
      eug $$3 = new eug.a($$1).a($$2).a(this.h);
      ObjectArrayList<cwf> $$4 = this.a($$3);
      azv $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cwf $$7 = (cwf)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cwf.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cwf> $$0, int $$1, azv $$2) {
      List<cwf> $$3 = Lists.newArrayList();
      Iterator<cwf> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cwf $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cwf $$6 = $$3.remove(azn.a($$2, 0, $$3.size() - 1));
         int $$7 = azn.a($$2, 1, $$6.L() / 2);
         cwf $$8 = $$6.a($$7);
         if ($$6.L() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.L() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ae.c($$0, $$2);
   }

   private List<Integer> a(bsa $$0, azv $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ae.c($$2, $$1);
      return $$2;
   }

   public static eul.a b() {
      return new eul.a();
   }

   public static class a implements evq<eul.a> {
      private final Builder<euk> a = ImmutableList.builder();
      private final Builder<evu> b = ImmutableList.builder();
      private exa c = eul.b;
      private Optional<all> d = Optional.empty();

      public eul.a a(euk.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eul.a a(exa $$0) {
         this.c = $$0;
         return this;
      }

      public eul.a a(all $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eul.a a(evu.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eul.a a() {
         return this;
      }

      public eul b() {
         return new eul(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
