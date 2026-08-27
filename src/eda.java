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

public class eda {
   private static final Logger d = LogUtils.getLogger();
   public static final eda a = new eda(efc.b, Optional.empty(), List.of(), List.of());
   public static final efb b = efc.n;
   public static final Codec<eda> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efc.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               arh.a(aey.a, "random_sequence").forGetter($$0x -> $$0x.f),
               arh.a(ecz.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               arh.a(eeh.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eda::new)
   );
   private final efb e;
   private final Optional<aey> f;
   private final List<ecz> g;
   private final List<eef> h;
   private final BiFunction<cjh, ecs, cjh> i;

   eda(efb $$0, Optional<aey> $$1, List<ecz> $$2, List<eef> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eeh.a($$3);
   }

   public static Consumer<cjh> a(aks $$0, Consumer<cjh> $$1) {
      return $$2 -> {
         if ($$2.a($$0.G())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cjh $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ecy $$0, Consumer<cjh> $$1) {
      this.a(new ecs.a($$0).a(this.f), $$1);
   }

   public void a(ecs $$0, Consumer<cjh> $$1) {
      ecs.c<?> $$2 = ecs.a(this);
      if ($$0.b($$2)) {
         Consumer<cjh> $$3 = eef.a(this.i, $$1, $$0);

         for (ecz $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ecy $$0, long $$1, Consumer<cjh> $$2) {
      this.a(new ecs.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(ecy $$0, Consumer<cjh> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ecs $$0, Consumer<cjh> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cjh> a(ecy $$0, long $$1) {
      return this.a(new ecs.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cjh> a(ecy $$0) {
      return this.a(new ecs.a($$0).a(this.f));
   }

   private ObjectArrayList<cjh> a(ecs $$0) {
      ObjectArrayList<cjh> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public efb a() {
      return this.e;
   }

   public void a(edb $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(bgt $$0, ecy $$1, long $$2) {
      ecs $$3 = new ecs.a($$1).a($$2).a(this.f);
      ObjectArrayList<cjh> $$4 = this.a($$3);
      ase $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cjh $$7 = (cjh)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cjh.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cjh> $$0, int $$1, ase $$2) {
      List<cjh> $$3 = Lists.newArrayList();
      Iterator<cjh> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cjh $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cjh $$6 = $$3.remove(ary.a($$2, 0, $$3.size() - 1));
         int $$7 = ary.a($$2, 1, $$6.L() / 2);
         cjh $$8 = $$6.a($$7);
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
      ac.b($$0, $$2);
   }

   private List<Integer> a(bgt $$0, ase $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.b($$2, $$1);
      return $$2;
   }

   public static eda.a b() {
      return new eda.a();
   }

   public static class a implements eec<eda.a> {
      private final Builder<ecz> a = ImmutableList.builder();
      private final Builder<eef> b = ImmutableList.builder();
      private efb c = eda.b;
      private Optional<aey> d = Optional.empty();

      public eda.a a(ecz.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eda.a a(efb $$0) {
         this.c = $$0;
         return this;
      }

      public eda.a a(aey $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eda.a a(eef.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eda.a a() {
         return this;
      }

      public eda b() {
         return new eda(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
