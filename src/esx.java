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

public class esx {
   public static final Codec<esx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eth.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               ewe.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               euj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               exb.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               exb.a.fieldOf("bonus_rolls").orElse(ewx.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, esx::new)
   );
   private final List<etj> b;
   private final List<ewe> c;
   private final Predicate<est> d;
   private final List<euh> e;
   private final BiFunction<cvl, est, cvl> f;
   private final exa g;
   private final exa h;

   esx(List<etj> $$0, List<ewe> $$1, List<euh> $$2, exa $$3, exa $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ad.a($$1);
      this.e = $$2;
      this.f = euj.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cvl> $$0, est $$1) {
      azk $$2 = $$1.b();
      List<eti> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (etj $$5 : this.b) {
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

            for (eti $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cvl> $$0, est $$1) {
      if (this.d.test($$1)) {
         Consumer<cvl> $$2 = euh.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azc.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(esz $$0) {
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

   public static esx.a a() {
      return new esx.a();
   }

   public static class a implements eud<esx.a>, evw<esx.a> {
      private final Builder<etj> a = ImmutableList.builder();
      private final Builder<ewe> b = ImmutableList.builder();
      private final Builder<euh> c = ImmutableList.builder();
      private exa d = ewx.a(1.0F);
      private exa e = ewx.a(0.0F);

      public esx.a a(exa $$0) {
         this.d = $$0;
         return this;
      }

      public esx.a a() {
         return this;
      }

      public esx.a b(exa $$0) {
         this.e = $$0;
         return this;
      }

      public esx.a a(etj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public esx.a a(ewe.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public esx.a a(euh.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public esx b() {
         return new esx(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
