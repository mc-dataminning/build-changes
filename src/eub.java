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

public class eub {
   private static final Logger f = LogUtils.getLogger();
   public static final eub a = new eub(ewr.b, Optional.empty(), List.of(), List.of());
   public static final ewq b = ewr.q;
   public static final long c = 0L;
   public static final Codec<eub> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ewr.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alh.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eua.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               evm.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eub::new)
   );
   public static final Codec<jp<eub>> e = ald.a(ly.bd, d);
   private final ewq g;
   private final Optional<alh> h;
   private final List<eua> i;
   private final List<evk> j;
   private final BiFunction<cvx, etw, cvx> k;

   eub(ewq $$0, Optional<alh> $$1, List<eua> $$2, List<evk> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = evm.a($$3);
   }

   public static Consumer<cvx> a(arm $$0, Consumer<cvx> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.L() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cvx $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(etz $$0, Consumer<cvx> $$1) {
      this.a(new etw.a($$0).a(this.h), $$1);
   }

   public void a(etw $$0, Consumer<cvx> $$1) {
      etw.c<?> $$2 = etw.a(this);
      if ($$0.b($$2)) {
         Consumer<cvx> $$3 = evk.a(this.k, $$1, $$0);

         for (eua $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(etz $$0, long $$1, Consumer<cvx> $$2) {
      this.a(new etw.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(etz $$0, Consumer<cvx> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(etw $$0, Consumer<cvx> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cvx> a(etz $$0, azr $$1) {
      return this.a(new etw.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvx> a(etz $$0, long $$1) {
      return this.a(new etw.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvx> a(etz $$0) {
      return this.a(new etw.a($$0).a(this.h));
   }

   private ObjectArrayList<cvx> a(etw $$0) {
      ObjectArrayList<cvx> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ewq a() {
      return this.g;
   }

   public void a(euc $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(brr $$0, etz $$1, long $$2) {
      etw $$3 = new etw.a($$1).a($$2).a(this.h);
      ObjectArrayList<cvx> $$4 = this.a($$3);
      azr $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cvx $$7 = (cvx)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cvx.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cvx> $$0, int $$1, azr $$2) {
      List<cvx> $$3 = Lists.newArrayList();
      Iterator<cvx> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cvx $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cvx $$6 = $$3.remove(azj.a($$2, 0, $$3.size() - 1));
         int $$7 = azj.a($$2, 1, $$6.L() / 2);
         cvx $$8 = $$6.a($$7);
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
      ad.c($$0, $$2);
   }

   private List<Integer> a(brr $$0, azr $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ad.c($$2, $$1);
      return $$2;
   }

   public static eub.a b() {
      return new eub.a();
   }

   public static class a implements evg<eub.a> {
      private final Builder<eua> a = ImmutableList.builder();
      private final Builder<evk> b = ImmutableList.builder();
      private ewq c = eub.b;
      private Optional<alh> d = Optional.empty();

      public eub.a a(eua.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eub.a a(ewq $$0) {
         this.c = $$0;
         return this;
      }

      public eub.a a(alh $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eub.a a(evk.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eub.a a() {
         return this;
      }

      public eub b() {
         return new eub(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
