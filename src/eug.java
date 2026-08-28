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

public class eug {
   public static final Codec<eug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               euq.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               exn.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               evs.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               eyk.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eyk.a.fieldOf("bonus_rolls").orElse(eyg.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eug::new)
   );
   private final List<eus> b;
   private final List<exn> c;
   private final Predicate<euc> d;
   private final List<evq> e;
   private final BiFunction<cwb, euc, cwb> f;
   private final eyj g;
   private final eyj h;

   eug(List<eus> $$0, List<exn> $$1, List<evq> $$2, eyj $$3, eyj $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ae.a($$1);
      this.e = $$2;
      this.f = evs.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cwb> $$0, euc $$1) {
      azs $$2 = $$1.b();
      List<eur> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eus $$5 : this.b) {
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

            for (eur $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cwb> $$0, euc $$1) {
      if (this.d.test($$1)) {
         Consumer<cwb> $$2 = evq.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azk.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eui $$0) {
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

   public static eug.a a() {
      return new eug.a();
   }

   public static class a implements evm<eug.a>, exf<eug.a> {
      private final Builder<eus> a = ImmutableList.builder();
      private final Builder<exn> b = ImmutableList.builder();
      private final Builder<evq> c = ImmutableList.builder();
      private eyj d = eyg.a(1.0F);
      private eyj e = eyg.a(0.0F);

      public eug.a a(eyj $$0) {
         this.d = $$0;
         return this;
      }

      public eug.a a() {
         return this;
      }

      public eug.a b(eyj $$0) {
         this.e = $$0;
         return this;
      }

      public eug.a a(eus.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eug.a a(exn.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eug.a a(evq.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eug b() {
         return new eug(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
