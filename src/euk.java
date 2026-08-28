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

public class euk {
   public static final Codec<euk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               euu.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               exr.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               evw.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               eyo.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eyo.a.fieldOf("bonus_rolls").orElse(eyk.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, euk::new)
   );
   private final List<euw> b;
   private final List<exr> c;
   private final Predicate<eug> d;
   private final List<evu> e;
   private final BiFunction<cwf, eug, cwf> f;
   private final eyn g;
   private final eyn h;

   euk(List<euw> $$0, List<exr> $$1, List<evu> $$2, eyn $$3, eyn $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ae.a($$1);
      this.e = $$2;
      this.f = evw.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cwf> $$0, eug $$1) {
      azv $$2 = $$1.b();
      List<euv> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (euw $$5 : this.b) {
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

            for (euv $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cwf> $$0, eug $$1) {
      if (this.d.test($$1)) {
         Consumer<cwf> $$2 = evu.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azn.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eum $$0) {
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

   public static euk.a a() {
      return new euk.a();
   }

   public static class a implements evq<euk.a>, exj<euk.a> {
      private final Builder<euw> a = ImmutableList.builder();
      private final Builder<exr> b = ImmutableList.builder();
      private final Builder<evu> c = ImmutableList.builder();
      private eyn d = eyk.a(1.0F);
      private eyn e = eyk.a(0.0F);

      public euk.a a(eyn $$0) {
         this.d = $$0;
         return this;
      }

      public euk.a a() {
         return this;
      }

      public euk.a b(eyn $$0) {
         this.e = $$0;
         return this;
      }

      public euk.a a(euw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public euk.a a(exr.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public euk.a a(evu.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public euk b() {
         return new euk(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
