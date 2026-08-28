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

public class ezt {
   private static final Logger g = LogUtils.getLogger();
   public static final Codec<alf<ezt>> a = alf.a(mh.bq);
   public static final bay b = fch.q;
   public static final long c = 0L;
   public static final Codec<ezt> d = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     fch.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.h),
                     alg.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.i),
                     ezs.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.j),
                     fbe.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.k)
                  )
                  .apply($$0, ezt::new)
         )
   );
   public static final Codec<jf<ezt>> e = alc.a(mh.bq, d);
   public static final ezt f = new ezt(fch.b, Optional.empty(), List.of(), List.of());
   private final bay h;
   private final Optional<alg> i;
   private final List<ezs> j;
   private final List<fbc> k;
   private final BiFunction<czk, ezo, czk> l;

   ezt(bay $$0, Optional<alg> $$1, List<ezs> $$2, List<fbc> $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = fbe.a($$3);
   }

   public static Consumer<czk> a(arq $$0, Consumer<czk> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  czk $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ezr $$0, Consumer<czk> $$1) {
      this.a(new ezo.a($$0).a(this.i), $$1);
   }

   public void a(ezo $$0, Consumer<czk> $$1) {
      ezo.c<?> $$2 = ezo.a(this);
      if ($$0.b($$2)) {
         Consumer<czk> $$3 = fbc.a(this.l, $$1, $$0);

         for (ezs $$4 : this.j) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         g.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ezr $$0, long $$1, Consumer<czk> $$2) {
      this.a(new ezo.a($$0).a($$1).a(this.i), a($$0.a(), $$2));
   }

   public void b(ezr $$0, Consumer<czk> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ezo $$0, Consumer<czk> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<czk> a(ezr $$0, azv $$1) {
      return this.a(new ezo.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<czk> a(ezr $$0, long $$1) {
      return this.a(new ezo.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<czk> a(ezr $$0) {
      return this.a(new ezo.a($$0).a(this.i));
   }

   private ObjectArrayList<czk> a(ezo $$0) {
      ObjectArrayList<czk> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bay a() {
      return this.h;
   }

   public void a(ezu $$0) {
      for (int $$1 = 0; $$1 < this.j.size(); $$1++) {
         this.j.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         this.k.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(btz $$0, ezr $$1, long $$2) {
      ezo $$3 = new ezo.a($$1).a($$2).a(this.i);
      ObjectArrayList<czk> $$4 = this.a($$3);
      azv $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         czk $$7 = (czk)var9.next();
         if ($$6.isEmpty()) {
            g.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), czk.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<czk> $$0, int $$1, azv $$2) {
      List<czk> $$3 = Lists.newArrayList();
      Iterator<czk> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         czk $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         czk $$6 = $$3.remove(azm.a($$2, 0, $$3.size() - 1));
         int $$7 = azm.a($$2, 1, $$6.M() / 2);
         czk $$8 = $$6.a($$7);
         if ($$6.M() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.M() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ag.c($$0, $$2);
   }

   private List<Integer> a(btz $$0, azv $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ag.c($$2, $$1);
      return $$2;
   }

   public static ezt.a b() {
      return new ezt.a();
   }

   public static class a implements fay<ezt.a> {
      private final Builder<ezs> a = ImmutableList.builder();
      private final Builder<fbc> b = ImmutableList.builder();
      private bay c = ezt.b;
      private Optional<alg> d = Optional.empty();

      public ezt.a a(ezs.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ezt.a a(bay $$0) {
         this.c = $$0;
         return this;
      }

      public ezt.a a(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ezt.a a(fbc.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ezt.a a() {
         return this;
      }

      public ezt b() {
         return new ezt(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
