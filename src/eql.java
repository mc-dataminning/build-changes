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

public class eql {
   private static final Logger f = LogUtils.getLogger();
   public static final eql a = new eql(etb.b, Optional.empty(), List.of(), List.of());
   public static final eta b = etb.q;
   public static final long c = 0L;
   public static final Codec<eql> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etb.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               ale.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eqk.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               erv.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eql::new)
   );
   public static final Codec<ji<eql>> e = ala.a(lq.aU, d);
   private final eta g;
   private final Optional<ale> h;
   private final List<eqk> i;
   private final List<ert> j;
   private final BiFunction<cun, eqg, cun> k;

   eql(eta $$0, Optional<ale> $$1, List<eqk> $$2, List<ert> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = erv.a($$3);
   }

   public static Consumer<cun> a(are $$0, Consumer<cun> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.I() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.I();

               while ($$3 > 0) {
                  cun $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.I();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eqj $$0, Consumer<cun> $$1) {
      this.a(new eqg.a($$0).a(this.h), $$1);
   }

   public void a(eqg $$0, Consumer<cun> $$1) {
      eqg.c<?> $$2 = eqg.a(this);
      if ($$0.b($$2)) {
         Consumer<cun> $$3 = ert.a(this.k, $$1, $$0);

         for (eqk $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eqj $$0, long $$1, Consumer<cun> $$2) {
      this.a(new eqg.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eqj $$0, Consumer<cun> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eqg $$0, Consumer<cun> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cun> a(eqj $$0, long $$1) {
      return this.a(new eqg.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cun> a(eqj $$0) {
      return this.a(new eqg.a($$0).a(this.h));
   }

   private ObjectArrayList<cun> a(eqg $$0) {
      ObjectArrayList<cun> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eta a() {
      return this.g;
   }

   public void a(eqm $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bql $$0, eqj $$1, long $$2) {
      eqg $$3 = new eqg.a($$1).a($$2).a(this.h);
      ObjectArrayList<cun> $$4 = this.a($$3);
      azf $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cun $$7 = (cun)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cun.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cun> $$0, int $$1, azf $$2) {
      List<cun> $$3 = Lists.newArrayList();
      Iterator<cun> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cun $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.I() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cun $$6 = $$3.remove(ayx.a($$2, 0, $$3.size() - 1));
         int $$7 = ayx.a($$2, 1, $$6.I() / 2);
         cun $$8 = $$6.a($$7);
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

   private List<Integer> a(bql $$0, azf $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eql.a b() {
      return new eql.a();
   }

   public static class a implements erp<eql.a> {
      private final Builder<eqk> a = ImmutableList.builder();
      private final Builder<ert> b = ImmutableList.builder();
      private eta c = eql.b;
      private Optional<ale> d = Optional.empty();

      public eql.a a(eqk.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eql.a a(eta $$0) {
         this.c = $$0;
         return this;
      }

      public eql.a a(ale $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eql.a a(ert.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eql.a a() {
         return this;
      }

      public eql b() {
         return new eql(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
