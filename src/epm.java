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

public class epm {
   private static final Logger f = LogUtils.getLogger();
   public static final epm a = new epm(ery.b, Optional.empty(), List.of(), List.of());
   public static final erx b = ery.q;
   public static final long c = 0L;
   public static final Codec<epm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ery.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akn.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               epl.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               eqv.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, epm::new)
   );
   public static final Codec<ix<epm>> e = akj.a(lf.aU, d);
   private final erx g;
   private final Optional<akn> h;
   private final List<epl> i;
   private final List<eqt> j;
   private final BiFunction<ctq, eph, ctq> k;

   epm(erx $$0, Optional<akn> $$1, List<epl> $$2, List<eqt> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = eqv.a($$3);
   }

   public static Consumer<ctq> a(aqn $$0, Consumer<ctq> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.I() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.I();

               while ($$3 > 0) {
                  ctq $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.I();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(epk $$0, Consumer<ctq> $$1) {
      this.a(new eph.a($$0).a(this.h), $$1);
   }

   public void a(eph $$0, Consumer<ctq> $$1) {
      eph.c<?> $$2 = eph.a(this);
      if ($$0.b($$2)) {
         Consumer<ctq> $$3 = eqt.a(this.k, $$1, $$0);

         for (epl $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(epk $$0, long $$1, Consumer<ctq> $$2) {
      this.a(new eph.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(epk $$0, Consumer<ctq> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eph $$0, Consumer<ctq> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<ctq> a(epk $$0, long $$1) {
      return this.a(new eph.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<ctq> a(epk $$0) {
      return this.a(new eph.a($$0).a(this.h));
   }

   private ObjectArrayList<ctq> a(eph $$0) {
      ObjectArrayList<ctq> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public erx a() {
      return this.g;
   }

   public void a(epn $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bpp $$0, epk $$1, long $$2) {
      eph $$3 = new eph.a($$1).a($$2).a(this.h);
      ObjectArrayList<ctq> $$4 = this.a($$3);
      aym $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         ctq $$7 = (ctq)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), ctq.i);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<ctq> $$0, int $$1, aym $$2) {
      List<ctq> $$3 = Lists.newArrayList();
      Iterator<ctq> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         ctq $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.I() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         ctq $$6 = $$3.remove(ayf.a($$2, 0, $$3.size() - 1));
         int $$7 = ayf.a($$2, 1, $$6.I() / 2);
         ctq $$8 = $$6.a($$7);
         if ($$6.I() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.I() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bpp $$0, aym $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static epm.a b() {
      return new epm.a();
   }

   public static class a implements eqp<epm.a> {
      private final Builder<epl> a = ImmutableList.builder();
      private final Builder<eqt> b = ImmutableList.builder();
      private erx c = epm.b;
      private Optional<akn> d = Optional.empty();

      public epm.a a(epl.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public epm.a a(erx $$0) {
         this.c = $$0;
         return this;
      }

      public epm.a a(akn $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public epm.a a(eqt.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public epm.a a() {
         return this;
      }

      public epm b() {
         return new epm(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
