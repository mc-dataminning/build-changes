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

public class eur {
   public static final Codec<eur> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               evb.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               exy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               ewd.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               eyv.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eyv.a.fieldOf("bonus_rolls").orElse(eyr.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eur::new)
   );
   private final List<evd> b;
   private final List<exy> c;
   private final Predicate<eun> d;
   private final List<ewb> e;
   private final BiFunction<cwm, eun, cwm> f;
   private final eyu g;
   private final eyu h;

   eur(List<evd> $$0, List<exy> $$1, List<ewb> $$2, eyu $$3, eyu $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ae.a($$1);
      this.e = $$2;
      this.f = ewd.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cwm> $$0, eun $$1) {
      azu $$2 = $$1.b();
      List<evc> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (evd $$5 : this.b) {
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

            for (evc $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cwm> $$0, eun $$1) {
      if (this.d.test($$1)) {
         Consumer<cwm> $$2 = ewb.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azm.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eut $$0) {
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

   public static eur.a a() {
      return new eur.a();
   }

   public static class a implements evx<eur.a>, exq<eur.a> {
      private final Builder<evd> a = ImmutableList.builder();
      private final Builder<exy> b = ImmutableList.builder();
      private final Builder<ewb> c = ImmutableList.builder();
      private eyu d = eyr.a(1.0F);
      private eyu e = eyr.a(0.0F);

      public eur.a a(eyu $$0) {
         this.d = $$0;
         return this;
      }

      public eur.a a() {
         return this;
      }

      public eur.a b(eyu $$0) {
         this.e = $$0;
         return this;
      }

      public eur.a a(evd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eur.a a(exy.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eur.a a(ewb.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eur b() {
         return new eur(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
