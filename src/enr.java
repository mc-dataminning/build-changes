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

public class enr {
   public static final Codec<enr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eob.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               awu.a(eqn.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               awu.a(epa.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               erh.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               erh.a.fieldOf("bonus_rolls").orElse(ere.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, enr::new)
   );
   private final List<eod> b;
   private final List<eql> c;
   private final Predicate<enk> d;
   private final List<eoy> e;
   private final BiFunction<crs, enk, crs> f;
   private final erg g;
   private final erg h;

   enr(List<eod> $$0, List<eql> $$1, List<eoy> $$2, erg $$3, erg $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = epa.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<crs> $$0, enk $$1) {
      axt $$2 = $$1.b();
      List<eoc> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eod $$5 : this.b) {
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

            for (eoc $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<crs> $$0, enk $$1) {
      if (this.d.test($$1)) {
         Consumer<crs> $$2 = eoy.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + axm.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ent $$0) {
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

   public static enr.a a() {
      return new enr.a();
   }

   public static class a implements eov<enr.a>, eqe<enr.a> {
      private final Builder<eod> a = ImmutableList.builder();
      private final Builder<eql> b = ImmutableList.builder();
      private final Builder<eoy> c = ImmutableList.builder();
      private erg d = ere.a(1.0F);
      private erg e = ere.a(0.0F);

      public enr.a a(erg $$0) {
         this.d = $$0;
         return this;
      }

      public enr.a a() {
         return this;
      }

      public enr.a b(erg $$0) {
         this.e = $$0;
         return this;
      }

      public enr.a a(eod.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public enr.a a(eql.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public enr.a a(eoy.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public enr b() {
         return new enr(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
