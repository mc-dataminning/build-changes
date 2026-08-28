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

public class eqm {
   private static final Logger f = LogUtils.getLogger();
   public static final eqm a = new eqm(etc.b, Optional.empty(), List.of(), List.of());
   public static final etb b = etc.q;
   public static final long c = 0L;
   public static final Codec<eqm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etc.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               ale.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eql.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               erw.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eqm::new)
   );
   public static final Codec<ji<eqm>> e = ala.a(lq.aU, d);
   private final etb g;
   private final Optional<ale> h;
   private final List<eql> i;
   private final List<eru> j;
   private final BiFunction<cuo, eqh, cuo> k;

   eqm(etb $$0, Optional<ale> $$1, List<eql> $$2, List<eru> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = erw.a($$3);
   }

   public static Consumer<cuo> a(are $$0, Consumer<cuo> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.I() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.I();

               while ($$3 > 0) {
                  cuo $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.I();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eqk $$0, Consumer<cuo> $$1) {
      this.a(new eqh.a($$0).a(this.h), $$1);
   }

   public void a(eqh $$0, Consumer<cuo> $$1) {
      eqh.c<?> $$2 = eqh.a(this);
      if ($$0.b($$2)) {
         Consumer<cuo> $$3 = eru.a(this.k, $$1, $$0);

         for (eql $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eqk $$0, long $$1, Consumer<cuo> $$2) {
      this.a(new eqh.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eqk $$0, Consumer<cuo> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eqh $$0, Consumer<cuo> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cuo> a(eqk $$0, long $$1) {
      return this.a(new eqh.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cuo> a(eqk $$0) {
      return this.a(new eqh.a($$0).a(this.h));
   }

   private ObjectArrayList<cuo> a(eqh $$0) {
      ObjectArrayList<cuo> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public etb a() {
      return this.g;
   }

   public void a(eqn $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bqm $$0, eqk $$1, long $$2) {
      eqh $$3 = new eqh.a($$1).a($$2).a(this.h);
      ObjectArrayList<cuo> $$4 = this.a($$3);
      azg $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cuo $$7 = (cuo)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cuo.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cuo> $$0, int $$1, azg $$2) {
      List<cuo> $$3 = Lists.newArrayList();
      Iterator<cuo> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cuo $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.I() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cuo $$6 = $$3.remove(ayy.a($$2, 0, $$3.size() - 1));
         int $$7 = ayy.a($$2, 1, $$6.I() / 2);
         cuo $$8 = $$6.a($$7);
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

   private List<Integer> a(bqm $$0, azg $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eqm.a b() {
      return new eqm.a();
   }

   public static class a implements erq<eqm.a> {
      private final Builder<eql> a = ImmutableList.builder();
      private final Builder<eru> b = ImmutableList.builder();
      private etb c = eqm.b;
      private Optional<ale> d = Optional.empty();

      public eqm.a a(eql.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eqm.a a(etb $$0) {
         this.c = $$0;
         return this;
      }

      public eqm.a a(ale $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eqm.a a(eru.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eqm.a a() {
         return this;
      }

      public eqm b() {
         return new eqm(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
