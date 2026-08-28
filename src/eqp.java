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

public class eqp {
   private static final Logger f = LogUtils.getLogger();
   public static final eqp a = new eqp(etf.b, Optional.empty(), List.of(), List.of());
   public static final ete b = etf.q;
   public static final long c = 0L;
   public static final Codec<eqp> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etf.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alf.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eqo.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               erz.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eqp::new)
   );
   public static final Codec<ji<eqp>> e = alb.a(lq.aU, d);
   private final ete g;
   private final Optional<alf> h;
   private final List<eqo> i;
   private final List<erx> j;
   private final BiFunction<cur, eqk, cur> k;

   eqp(ete $$0, Optional<alf> $$1, List<eqo> $$2, List<erx> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = erz.a($$3);
   }

   public static Consumer<cur> a(arf $$0, Consumer<cur> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.I() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.I();

               while ($$3 > 0) {
                  cur $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.I();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eqn $$0, Consumer<cur> $$1) {
      this.a(new eqk.a($$0).a(this.h), $$1);
   }

   public void a(eqk $$0, Consumer<cur> $$1) {
      eqk.c<?> $$2 = eqk.a(this);
      if ($$0.b($$2)) {
         Consumer<cur> $$3 = erx.a(this.k, $$1, $$0);

         for (eqo $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eqn $$0, long $$1, Consumer<cur> $$2) {
      this.a(new eqk.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eqn $$0, Consumer<cur> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eqk $$0, Consumer<cur> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cur> a(eqn $$0, long $$1) {
      return this.a(new eqk.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cur> a(eqn $$0) {
      return this.a(new eqk.a($$0).a(this.h));
   }

   private ObjectArrayList<cur> a(eqk $$0) {
      ObjectArrayList<cur> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ete a() {
      return this.g;
   }

   public void a(eqq $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bqp $$0, eqn $$1, long $$2) {
      eqk $$3 = new eqk.a($$1).a($$2).a(this.h);
      ObjectArrayList<cur> $$4 = this.a($$3);
      azh $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cur $$7 = (cur)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cur.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cur> $$0, int $$1, azh $$2) {
      List<cur> $$3 = Lists.newArrayList();
      Iterator<cur> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cur $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.I() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cur $$6 = $$3.remove(ayz.a($$2, 0, $$3.size() - 1));
         int $$7 = ayz.a($$2, 1, $$6.I() / 2);
         cur $$8 = $$6.a($$7);
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

   private List<Integer> a(bqp $$0, azh $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eqp.a b() {
      return new eqp.a();
   }

   public static class a implements ert<eqp.a> {
      private final Builder<eqo> a = ImmutableList.builder();
      private final Builder<erx> b = ImmutableList.builder();
      private ete c = eqp.b;
      private Optional<alf> d = Optional.empty();

      public eqp.a a(eqo.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eqp.a a(ete $$0) {
         this.c = $$0;
         return this;
      }

      public eqp.a a(alf $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eqp.a a(erx.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eqp.a a() {
         return this;
      }

      public eqp b() {
         return new eqp(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
