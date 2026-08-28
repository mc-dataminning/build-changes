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

public class evu {
   private static final Logger f = LogUtils.getLogger();
   public static final evu a = new evu(eyi.b, Optional.empty(), List.of(), List.of());
   public static final bai b = eyi.q;
   public static final long c = 0L;
   public static final Codec<evu> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eyi.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               aku.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               evt.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               exf.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, evu::new)
   );
   public static final Codec<jr<evu>> e = akq.a(mc.bg, d);
   private final bai g;
   private final Optional<aku> h;
   private final List<evt> i;
   private final List<exd> j;
   private final BiFunction<cwn, evp, cwn> k;

   evu(bai $$0, Optional<aku> $$1, List<evt> $$2, List<exd> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = exf.a($$3);
   }

   public static Consumer<cwn> a(arc $$0, Consumer<cwn> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cwn $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(evs $$0, Consumer<cwn> $$1) {
      this.a(new evp.a($$0).a(this.h), $$1);
   }

   public void a(evp $$0, Consumer<cwn> $$1) {
      evp.c<?> $$2 = evp.a(this);
      if ($$0.b($$2)) {
         Consumer<cwn> $$3 = exd.a(this.k, $$1, $$0);

         for (evt $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(evs $$0, long $$1, Consumer<cwn> $$2) {
      this.a(new evp.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(evs $$0, Consumer<cwn> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(evp $$0, Consumer<cwn> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cwn> a(evs $$0, azg $$1) {
      return this.a(new evp.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwn> a(evs $$0, long $$1) {
      return this.a(new evp.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwn> a(evs $$0) {
      return this.a(new evp.a($$0).a(this.h));
   }

   private ObjectArrayList<cwn> a(evp $$0) {
      ObjectArrayList<cwn> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bai a() {
      return this.g;
   }

   public void a(evv $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bsb $$0, evs $$1, long $$2) {
      evp $$3 = new evp.a($$1).a($$2).a(this.h);
      ObjectArrayList<cwn> $$4 = this.a($$3);
      azg $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cwn $$7 = (cwn)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cwn.j);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cwn> $$0, int $$1, azg $$2) {
      List<cwn> $$3 = Lists.newArrayList();
      Iterator<cwn> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cwn $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cwn $$6 = $$3.remove(ayy.a($$2, 0, $$3.size() - 1));
         int $$7 = ayy.a($$2, 1, $$6.M() / 2);
         cwn $$8 = $$6.a($$7);
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
      af.c($$0, $$2);
   }

   private List<Integer> a(bsb $$0, azg $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      af.c($$2, $$1);
      return $$2;
   }

   public static evu.a b() {
      return new evu.a();
   }

   public static class a implements ewz<evu.a> {
      private final Builder<evt> a = ImmutableList.builder();
      private final Builder<exd> b = ImmutableList.builder();
      private bai c = evu.b;
      private Optional<aku> d = Optional.empty();

      public evu.a a(evt.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public evu.a a(bai $$0) {
         this.c = $$0;
         return this;
      }

      public evu.a a(aku $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public evu.a a(exd.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public evu.a a() {
         return this;
      }

      public evu b() {
         return new evu(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
