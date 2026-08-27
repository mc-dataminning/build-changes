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

public class eco {
   public static final Codec<eco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecy.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               aqy.a(efi.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               aqy.a(edw.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               egc.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               egc.a.fieldOf("bonus_rolls").orElse(efz.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eco::new)
   );
   private final List<eda> b;
   private final List<efg> c;
   private final Predicate<ech> d;
   private final List<edu> e;
   private final BiFunction<ciy, ech, ciy> f;
   private final egb g;
   private final egb h;

   eco(List<eda> $$0, List<efg> $$1, List<edu> $$2, egb $$3, egb $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = efi.a($$1);
      this.e = $$2;
      this.f = edw.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<ciy> $$0, ech $$1) {
      aru $$2 = $$1.b();
      List<ecz> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eda $$5 : this.b) {
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

            for (ecz $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<ciy> $$0, ech $$1) {
      if (this.d.test($$1)) {
         Consumer<ciy> $$2 = edu.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + arp.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ecq $$0) {
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

   public static eco.a a() {
      return new eco.a();
   }

   public static class a implements edr<eco.a>, eez<eco.a> {
      private final Builder<eda> a = ImmutableList.builder();
      private final Builder<efg> b = ImmutableList.builder();
      private final Builder<edu> c = ImmutableList.builder();
      private egb d = efz.a(1.0F);
      private egb e = efz.a(0.0F);

      public eco.a a(egb $$0) {
         this.d = $$0;
         return this;
      }

      public eco.a a() {
         return this;
      }

      public eco.a b(egb $$0) {
         this.e = $$0;
         return this;
      }

      public eco.a a(eda.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eco.a a(efg.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eco.a a(edu.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eco b() {
         return new eco(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
