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

public class ect {
   private static final Logger d = LogUtils.getLogger();
   public static final ect a = new ect(eev.b, Optional.empty(), List.of(), List.of());
   public static final eeu b = eev.n;
   public static final Codec<ect> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eev.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               arb.a(aeu.a, "random_sequence").forGetter($$0x -> $$0x.f),
               arb.a(ecs.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               arb.a(eea.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ect::new)
   );
   private final eeu e;
   private final Optional<aeu> f;
   private final List<ecs> g;
   private final List<edy> h;
   private final BiFunction<cja, ecl, cja> i;

   ect(eeu $$0, Optional<aeu> $$1, List<ecs> $$2, List<edy> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eea.a($$3);
   }

   public static Consumer<cja> a(akn $$0, Consumer<cja> $$1) {
      return $$2 -> {
         if ($$2.a($$0.G())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cja $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ecr $$0, Consumer<cja> $$1) {
      this.a(new ecl.a($$0).a(this.f), $$1);
   }

   public void a(ecl $$0, Consumer<cja> $$1) {
      ecl.c<?> $$2 = ecl.a(this);
      if ($$0.b($$2)) {
         Consumer<cja> $$3 = edy.a(this.i, $$1, $$0);

         for (ecs $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ecr $$0, long $$1, Consumer<cja> $$2) {
      this.a(new ecl.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(ecr $$0, Consumer<cja> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ecl $$0, Consumer<cja> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cja> a(ecr $$0, long $$1) {
      return this.a(new ecl.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cja> a(ecr $$0) {
      return this.a(new ecl.a($$0).a(this.f));
   }

   private ObjectArrayList<cja> a(ecl $$0) {
      ObjectArrayList<cja> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eeu a() {
      return this.e;
   }

   public void a(ecu $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(bgm $$0, ecr $$1, long $$2) {
      ecl $$3 = new ecl.a($$1).a($$2).a(this.f);
      ObjectArrayList<cja> $$4 = this.a($$3);
      arx $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cja $$7 = (cja)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cja.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cja> $$0, int $$1, arx $$2) {
      List<cja> $$3 = Lists.newArrayList();
      Iterator<cja> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cja $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cja $$6 = $$3.remove(ars.a($$2, 0, $$3.size() - 1));
         int $$7 = ars.a($$2, 1, $$6.L() / 2);
         cja $$8 = $$6.a($$7);
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

   private List<Integer> a(bgm $$0, arx $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.b($$2, $$1);
      return $$2;
   }

   public static ect.a b() {
      return new ect.a();
   }

   public static class a implements edv<ect.a> {
      private final Builder<ecs> a = ImmutableList.builder();
      private final Builder<edy> b = ImmutableList.builder();
      private eeu c = ect.b;
      private Optional<aeu> d = Optional.empty();

      public ect.a a(ecs.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ect.a a(eeu $$0) {
         this.c = $$0;
         return this;
      }

      public ect.a a(aeu $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ect.a a(edy.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ect.a a() {
         return this;
      }

      public ect b() {
         return new ect(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
