import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class ecs {
   public static final Codec<ecs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edc.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               arb.a(efm.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               arb.a(eea.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               egg.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               egg.a.fieldOf("bonus_rolls").orElse(egd.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ecs::new)
   );
   private final List<ede> b;
   private final List<efk> c;
   private final Predicate<ecl> d;
   private final List<edy> e;
   private final BiFunction<cja, ecl, cja> f;
   private final egf g;
   private final egf h;

   ecs(List<ede> $$0, List<efk> $$1, List<edy> $$2, egf $$3, egf $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = efm.a($$1);
      this.e = $$2;
      this.f = eea.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cja> $$0, ecl $$1) {
      arx $$2 = $$1.b();
      List<edd> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ede $$5 : this.b) {
         $$5.expand($$1, $$3x -> {
            int $$4x = $$3x.a($$1.c());
            if ($$4x > 0) {
               $$3.add($$3x);
               $$4.add($$4x);
            }
         });
      }

      int $$6 = $$3.size();
      if ($$4.intValue() != 0 && $$6 != 0) {
         if ($$6 == 1) {
            $$3.get(0).a($$0, $$1);
         } else {
            int $$7 = $$2.a($$4.intValue());

            for (edd $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cja> $$0, ecl $$1) {
      if (this.d.test($$1)) {
         Consumer<cja> $$2 = edy.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ars.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ecu $$0) {
      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         this.e.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }

      for (int $$3 = 0; $$3 < this.b.size(); $$3++) {
         this.b.get($$3).a($$0.b(".entries[" + $$3 + "]"));
      }

      this.g.a($$0.b(".rolls"));
      this.h.a($$0.b(".bonusRolls"));
   }

   public static ecs.a a() {
      return new ecs.a();
   }

   public static class a implements edv<ecs.a>, efd<ecs.a> {
      private final Builder<ede> a = ImmutableList.builder();
      private final Builder<efk> b = ImmutableList.builder();
      private final Builder<edy> c = ImmutableList.builder();
      private egf d = egd.a(1.0F);
      private egf e = egd.a(0.0F);

      public ecs.a a(egf $$0) {
         this.d = $$0;
         return this;
      }

      public ecs.a a() {
         return this;
      }

      public ecs.a b(egf $$0) {
         this.e = $$0;
         return this;
      }

      public ecs.a a(ede.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ecs.a a(efk.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ecs.a a(edy.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ecs b() {
         return new ecs(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
