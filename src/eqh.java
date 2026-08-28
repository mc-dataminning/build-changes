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

public class eqh {
   public static final Codec<eqh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eqr.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               etp.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               ers.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               euj.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               euj.a.fieldOf("bonus_rolls").orElse(eug.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eqh::new)
   );
   private final List<eqt> b;
   private final List<etn> c;
   private final Predicate<eqd> d;
   private final List<erq> e;
   private final BiFunction<cuk, eqd, cuk> f;
   private final eui g;
   private final eui h;

   eqh(List<eqt> $$0, List<etn> $$1, List<erq> $$2, eui $$3, eui $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = ers.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cuk> $$0, eqd $$1) {
      azc $$2 = $$1.b();
      List<eqs> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eqt $$5 : this.b) {
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

            for (eqs $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cuk> $$0, eqd $$1) {
      if (this.d.test($$1)) {
         Consumer<cuk> $$2 = erq.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ayu.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eqj $$0) {
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

   public static eqh.a a() {
      return new eqh.a();
   }

   public static class a implements erm<eqh.a>, etg<eqh.a> {
      private final Builder<eqt> a = ImmutableList.builder();
      private final Builder<etn> b = ImmutableList.builder();
      private final Builder<erq> c = ImmutableList.builder();
      private eui d = eug.a(1.0F);
      private eui e = eug.a(0.0F);

      public eqh.a a(eui $$0) {
         this.d = $$0;
         return this;
      }

      public eqh.a a() {
         return this;
      }

      public eqh.a b(eui $$0) {
         this.e = $$0;
         return this;
      }

      public eqh.a a(eqt.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eqh.a a(etn.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eqh.a a(erq.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eqh b() {
         return new eqh(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
