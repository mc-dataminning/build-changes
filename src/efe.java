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

public class efe {
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efo.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               asu.a(ehy.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               asu.a(egm.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               eis.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eis.a.fieldOf("bonus_rolls").orElse(eip.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, efe::new)
   );
   private final List<efq> b;
   private final List<ehw> c;
   private final Predicate<eex> d;
   private final List<egk> e;
   private final BiFunction<clj, eex, clj> f;
   private final eir g;
   private final eir h;

   efe(List<efq> $$0, List<ehw> $$1, List<egk> $$2, eir $$3, eir $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ehy.a($$1);
      this.e = $$2;
      this.f = egm.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<clj> $$0, eex $$1) {
      ats $$2 = $$1.b();
      List<efp> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (efq $$5 : this.b) {
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

            for (efp $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<clj> $$0, eex $$1) {
      if (this.d.test($$1)) {
         Consumer<clj> $$2 = egk.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + atm.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(efg $$0) {
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

   public static efe.a a() {
      return new efe.a();
   }

   public static class a implements egh<efe.a>, ehp<efe.a> {
      private final Builder<efq> a = ImmutableList.builder();
      private final Builder<ehw> b = ImmutableList.builder();
      private final Builder<egk> c = ImmutableList.builder();
      private eir d = eip.a(1.0F);
      private eir e = eip.a(0.0F);

      public efe.a a(eir $$0) {
         this.d = $$0;
         return this;
      }

      public efe.a a() {
         return this;
      }

      public efe.a b(eir $$0) {
         this.e = $$0;
         return this;
      }

      public efe.a a(efq.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public efe.a a(ehw.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public efe.a a(egk.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public efe b() {
         return new efe(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
