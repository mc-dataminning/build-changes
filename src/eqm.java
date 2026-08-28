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

public class eqm {
   public static final Codec<eqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eqw.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               etu.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               erx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               euo.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               euo.a.fieldOf("bonus_rolls").orElse(eul.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eqm::new)
   );
   private final List<eqy> b;
   private final List<ets> c;
   private final Predicate<eqi> d;
   private final List<erv> e;
   private final BiFunction<cup, eqi, cup> f;
   private final eun g;
   private final eun h;

   eqm(List<eqy> $$0, List<ets> $$1, List<erv> $$2, eun $$3, eun $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = erx.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cup> $$0, eqi $$1) {
      azh $$2 = $$1.b();
      List<eqx> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eqy $$5 : this.b) {
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

            for (eqx $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cup> $$0, eqi $$1) {
      if (this.d.test($$1)) {
         Consumer<cup> $$2 = erv.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ayz.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eqo $$0) {
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

   public static eqm.a a() {
      return new eqm.a();
   }

   public static class a implements err<eqm.a>, etl<eqm.a> {
      private final Builder<eqy> a = ImmutableList.builder();
      private final Builder<ets> b = ImmutableList.builder();
      private final Builder<erv> c = ImmutableList.builder();
      private eun d = eul.a(1.0F);
      private eun e = eul.a(0.0F);

      public eqm.a a(eun $$0) {
         this.d = $$0;
         return this;
      }

      public eqm.a a() {
         return this;
      }

      public eqm.a b(eun $$0) {
         this.e = $$0;
         return this;
      }

      public eqm.a a(eqy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eqm.a a(ets.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eqm.a a(erv.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eqm b() {
         return new eqm(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
