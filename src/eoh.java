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

public class eoh {
   public static final Codec<eoh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eor.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               axe.a(erj.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               axe.a(epr.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               esd.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               esd.a.fieldOf("bonus_rolls").orElse(esa.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eoh::new)
   );
   private final List<eot> b;
   private final List<erh> c;
   private final Predicate<eoa> d;
   private final List<epp> e;
   private final BiFunction<csd, eoa, csd> f;
   private final esc g;
   private final esc h;

   eoh(List<eot> $$0, List<erh> $$1, List<epp> $$2, esc $$3, esc $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = epr.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<csd> $$0, eoa $$1) {
      ayd $$2 = $$1.b();
      List<eos> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eot $$5 : this.b) {
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

            for (eos $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<csd> $$0, eoa $$1) {
      if (this.d.test($$1)) {
         Consumer<csd> $$2 = epp.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + axw.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eoj $$0) {
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

   public static eoh.a a() {
      return new eoh.a();
   }

   public static class a implements epl<eoh.a>, era<eoh.a> {
      private final Builder<eot> a = ImmutableList.builder();
      private final Builder<erh> b = ImmutableList.builder();
      private final Builder<epp> c = ImmutableList.builder();
      private esc d = esa.a(1.0F);
      private esc e = esa.a(0.0F);

      public eoh.a a(esc $$0) {
         this.d = $$0;
         return this;
      }

      public eoh.a a() {
         return this;
      }

      public eoh.a b(esc $$0) {
         this.e = $$0;
         return this;
      }

      public eoh.a a(eot.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eoh.a a(erh.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eoh.a a(epp.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eoh b() {
         return new eoh(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
