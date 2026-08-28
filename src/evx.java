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

public class evx {
   private static final Logger f = LogUtils.getLogger();
   public static final evx a = new evx(eyl.b, Optional.empty(), List.of(), List.of());
   public static final baj b = eyl.q;
   public static final long c = 0L;
   public static final Codec<evx> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eyl.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akv.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               evw.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               exi.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, evx::new)
   );
   public static final Codec<jr<evx>> e = akr.a(mc.bg, d);
   private final baj g;
   private final Optional<akv> h;
   private final List<evw> i;
   private final List<exg> j;
   private final BiFunction<cwq, evs, cwq> k;

   evx(baj $$0, Optional<akv> $$1, List<evw> $$2, List<exg> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = exi.a($$3);
   }

   public static Consumer<cwq> a(ard $$0, Consumer<cwq> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cwq $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(evv $$0, Consumer<cwq> $$1) {
      this.a(new evs.a($$0).a(this.h), $$1);
   }

   public void a(evs $$0, Consumer<cwq> $$1) {
      evs.c<?> $$2 = evs.a(this);
      if ($$0.b($$2)) {
         Consumer<cwq> $$3 = exg.a(this.k, $$1, $$0);

         for (evw $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(evv $$0, long $$1, Consumer<cwq> $$2) {
      this.a(new evs.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(evv $$0, Consumer<cwq> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(evs $$0, Consumer<cwq> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cwq> a(evv $$0, azh $$1) {
      return this.a(new evs.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwq> a(evv $$0, long $$1) {
      return this.a(new evs.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwq> a(evv $$0) {
      return this.a(new evs.a($$0).a(this.h));
   }

   private ObjectArrayList<cwq> a(evs $$0) {
      ObjectArrayList<cwq> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public baj a() {
      return this.g;
   }

   public void a(evy $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bse $$0, evv $$1, long $$2) {
      evs $$3 = new evs.a($$1).a($$2).a(this.h);
      ObjectArrayList<cwq> $$4 = this.a($$3);
      azh $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cwq $$7 = (cwq)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cwq.j);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cwq> $$0, int $$1, azh $$2) {
      List<cwq> $$3 = Lists.newArrayList();
      Iterator<cwq> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cwq $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cwq $$6 = $$3.remove(ayz.a($$2, 0, $$3.size() - 1));
         int $$7 = ayz.a($$2, 1, $$6.M() / 2);
         cwq $$8 = $$6.a($$7);
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

   private List<Integer> a(bse $$0, azh $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      af.c($$2, $$1);
      return $$2;
   }

   public static evx.a b() {
      return new evx.a();
   }

   public static class a implements exc<evx.a> {
      private final Builder<evw> a = ImmutableList.builder();
      private final Builder<exg> b = ImmutableList.builder();
      private baj c = evx.b;
      private Optional<akv> d = Optional.empty();

      public evx.a a(evw.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public evx.a a(baj $$0) {
         this.c = $$0;
         return this;
      }

      public evx.a a(akv $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public evx.a a(exg.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public evx.a a() {
         return this;
      }

      public evx b() {
         return new evx(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
