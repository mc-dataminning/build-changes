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

public class eni {
   public static final Codec<eni> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ens.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               aws.a(eqe.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               aws.a(eor.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               eqy.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eqy.a.fieldOf("bonus_rolls").orElse(eqv.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eni::new)
   );
   private final List<enu> b;
   private final List<eqc> c;
   private final Predicate<enb> d;
   private final List<eop> e;
   private final BiFunction<crj, enb, crj> f;
   private final eqx g;
   private final eqx h;

   eni(List<enu> $$0, List<eqc> $$1, List<eop> $$2, eqx $$3, eqx $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = eor.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<crj> $$0, enb $$1) {
      axr $$2 = $$1.b();
      List<ent> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (enu $$5 : this.b) {
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

            for (ent $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<crj> $$0, enb $$1) {
      if (this.d.test($$1)) {
         Consumer<crj> $$2 = eop.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + axk.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(enk $$0) {
      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         this.e.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }

      for (int $$3 = 0; $$3 < this.b.size(); $$3++) {
         this.b.get($$3).a($$0.a(".entries[" + $$3 + "]"));
      }

      this.g.a($$0.a(".rolls"));
      this.h.a($$0.a(".bonusRolls"));
   }

   public static eni.a a() {
      return new eni.a();
   }

   public static class a implements eom<eni.a>, epv<eni.a> {
      private final Builder<enu> a = ImmutableList.builder();
      private final Builder<eqc> b = ImmutableList.builder();
      private final Builder<eop> c = ImmutableList.builder();
      private eqx d = eqv.a(1.0F);
      private eqx e = eqv.a(0.0F);

      public eni.a a(eqx $$0) {
         this.d = $$0;
         return this;
      }

      public eni.a a() {
         return this;
      }

      public eni.a b(eqx $$0) {
         this.e = $$0;
         return this;
      }

      public eni.a a(enu.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eni.a a(eqc.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eni.a a(eop.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eni b() {
         return new eni(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
