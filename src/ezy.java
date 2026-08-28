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

public class ezy {
   private static final Logger g = LogUtils.getLogger();
   public static final Codec<alf<ezy>> a = alf.a(mh.br);
   public static final bay b = fcm.q;
   public static final long c = 0L;
   public static final Codec<ezy> d = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     fcm.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.h),
                     alg.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.i),
                     ezx.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.j),
                     fbj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.k)
                  )
                  .apply($$0, ezy::new)
         )
   );
   public static final Codec<jf<ezy>> e = alc.a(mh.br, d);
   public static final ezy f = new ezy(fcm.b, Optional.empty(), List.of(), List.of());
   private final bay h;
   private final Optional<alg> i;
   private final List<ezx> j;
   private final List<fbh> k;
   private final BiFunction<czn, ezt, czn> l;

   ezy(bay $$0, Optional<alg> $$1, List<ezx> $$2, List<fbh> $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = fbj.a($$3);
   }

   public static Consumer<czn> a(arq $$0, Consumer<czn> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  czn $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ezw $$0, Consumer<czn> $$1) {
      this.a(new ezt.a($$0).a(this.i), $$1);
   }

   public void a(ezt $$0, Consumer<czn> $$1) {
      ezt.c<?> $$2 = ezt.a(this);
      if ($$0.b($$2)) {
         Consumer<czn> $$3 = fbh.a(this.l, $$1, $$0);

         for (ezx $$4 : this.j) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         g.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ezw $$0, long $$1, Consumer<czn> $$2) {
      this.a(new ezt.a($$0).a($$1).a(this.i), a($$0.a(), $$2));
   }

   public void b(ezw $$0, Consumer<czn> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ezt $$0, Consumer<czn> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<czn> a(ezw $$0, azv $$1) {
      return this.a(new ezt.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<czn> a(ezw $$0, long $$1) {
      return this.a(new ezt.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<czn> a(ezw $$0) {
      return this.a(new ezt.a($$0).a(this.i));
   }

   private ObjectArrayList<czn> a(ezt $$0) {
      ObjectArrayList<czn> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bay a() {
      return this.h;
   }

   public void a(ezz $$0) {
      for (int $$1 = 0; $$1 < this.j.size(); $$1++) {
         this.j.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         this.k.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(btz $$0, ezw $$1, long $$2) {
      ezt $$3 = new ezt.a($$1).a($$2).a(this.i);
      ObjectArrayList<czn> $$4 = this.a($$3);
      azv $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         czn $$7 = (czn)var9.next();
         if ($$6.isEmpty()) {
            g.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), czn.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<czn> $$0, int $$1, azv $$2) {
      List<czn> $$3 = Lists.newArrayList();
      Iterator<czn> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         czn $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         czn $$6 = $$3.remove(azm.a($$2, 0, $$3.size() - 1));
         int $$7 = azm.a($$2, 1, $$6.M() / 2);
         czn $$8 = $$6.a($$7);
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

   public static ezy.a b() {
      return new ezy.a();
   }

   public static class a implements fbd<ezy.a> {
      private final Builder<ezx> a = ImmutableList.builder();
      private final Builder<fbh> b = ImmutableList.builder();
      private bay c = ezy.b;
      private Optional<alg> d = Optional.empty();

      public ezy.a a(ezx.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ezy.a a(bay $$0) {
         this.c = $$0;
         return this;
      }

      public ezy.a a(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ezy.a a(fbh.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ezy.a a() {
         return this;
      }

      public ezy b() {
         return new ezy(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
