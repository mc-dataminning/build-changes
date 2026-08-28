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

public class etl {
   public static final Codec<etl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               ews.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               eux.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               exp.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               exp.a.fieldOf("bonus_rolls").orElse(exl.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, etl::new)
   );
   private final List<etx> b;
   private final List<ews> c;
   private final Predicate<eth> d;
   private final List<euv> e;
   private final BiFunction<cvp, eth, cvp> f;
   private final exo g;
   private final exo h;

   etl(List<etx> $$0, List<ews> $$1, List<euv> $$2, exo $$3, exo $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ad.a($$1);
      this.e = $$2;
      this.f = eux.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cvp> $$0, eth $$1) {
      azl $$2 = $$1.b();
      List<etw> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (etx $$5 : this.b) {
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

            for (etw $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cvp> $$0, eth $$1) {
      if (this.d.test($$1)) {
         Consumer<cvp> $$2 = euv.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azd.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(etn $$0) {
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

   public static etl.a a() {
      return new etl.a();
   }

   public static class a implements eur<etl.a>, ewk<etl.a> {
      private final Builder<etx> a = ImmutableList.builder();
      private final Builder<ews> b = ImmutableList.builder();
      private final Builder<euv> c = ImmutableList.builder();
      private exo d = exl.a(1.0F);
      private exo e = exl.a(0.0F);

      public etl.a a(exo $$0) {
         this.d = $$0;
         return this;
      }

      public etl.a a() {
         return this;
      }

      public etl.a b(exo $$0) {
         this.e = $$0;
         return this;
      }

      public etl.a a(etx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public etl.a a(ews.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public etl.a a(euv.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public etl b() {
         return new etl(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
