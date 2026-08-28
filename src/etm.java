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

public class etm {
   private static final Logger f = LogUtils.getLogger();
   public static final etm a = new etm(ewc.b, Optional.empty(), List.of(), List.of());
   public static final ewb b = ewc.q;
   public static final long c = 0L;
   public static final Codec<etm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ewc.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alc.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               etl.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               eux.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, etm::new)
   );
   public static final Codec<jn<etm>> e = aky.a(lv.bd, d);
   private final ewb g;
   private final Optional<alc> h;
   private final List<etl> i;
   private final List<euv> j;
   private final BiFunction<cvp, eth, cvp> k;

   etm(ewb $$0, Optional<alc> $$1, List<etl> $$2, List<euv> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = eux.a($$3);
   }

   public static Consumer<cvp> a(arh $$0, Consumer<cvp> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.J() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.J();

               while ($$3 > 0) {
                  cvp $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.J();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(etk $$0, Consumer<cvp> $$1) {
      this.a(new eth.a($$0).a(this.h), $$1);
   }

   public void a(eth $$0, Consumer<cvp> $$1) {
      eth.c<?> $$2 = eth.a(this);
      if ($$0.b($$2)) {
         Consumer<cvp> $$3 = euv.a(this.k, $$1, $$0);

         for (etl $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(etk $$0, long $$1, Consumer<cvp> $$2) {
      this.a(new eth.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(etk $$0, Consumer<cvp> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eth $$0, Consumer<cvp> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cvp> a(etk $$0, azl $$1) {
      return this.a(new eth.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvp> a(etk $$0, long $$1) {
      return this.a(new eth.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvp> a(etk $$0) {
      return this.a(new eth.a($$0).a(this.h));
   }

   private ObjectArrayList<cvp> a(eth $$0) {
      ObjectArrayList<cvp> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ewb a() {
      return this.g;
   }

   public void a(etn $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bri $$0, etk $$1, long $$2) {
      eth $$3 = new eth.a($$1).a($$2).a(this.h);
      ObjectArrayList<cvp> $$4 = this.a($$3);
      azl $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cvp $$7 = (cvp)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cvp.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cvp> $$0, int $$1, azl $$2) {
      List<cvp> $$3 = Lists.newArrayList();
      Iterator<cvp> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cvp $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.J() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cvp $$6 = $$3.remove(azd.a($$2, 0, $$3.size() - 1));
         int $$7 = azd.a($$2, 1, $$6.J() / 2);
         cvp $$8 = $$6.a($$7);
         if ($$6.J() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.J() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ad.c($$0, $$2);
   }

   private List<Integer> a(bri $$0, azl $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ad.c($$2, $$1);
      return $$2;
   }

   public static etm.a b() {
      return new etm.a();
   }

   public static class a implements eur<etm.a> {
      private final Builder<etl> a = ImmutableList.builder();
      private final Builder<euv> b = ImmutableList.builder();
      private ewb c = etm.b;
      private Optional<alc> d = Optional.empty();

      public etm.a a(etl.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public etm.a a(ewb $$0) {
         this.c = $$0;
         return this;
      }

      public etm.a a(alc $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public etm.a a(euv.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public etm.a a() {
         return this;
      }

      public etm b() {
         return new etm(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
