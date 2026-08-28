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

public class ewm {
   public static final Codec<ewm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eww.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               ezr.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               exy.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fao.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fao.a.fieldOf("bonus_rolls").orElse(fak.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ewm::new)
   );
   private final List<ewy> b;
   private final List<ezr> c;
   private final Predicate<ewi> d;
   private final List<exw> e;
   private final BiFunction<cxg, ewi, cxg> f;
   private final fan g;
   private final fan h;

   ewm(List<ewy> $$0, List<ezr> $$1, List<exw> $$2, fan $$3, fan $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ae.a($$1);
      this.e = $$2;
      this.f = exy.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cxg> $$0, ewi $$1) {
      bac $$2 = $$1.b();
      List<ewx> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ewy $$5 : this.b) {
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

            for (ewx $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cxg> $$0, ewi $$1) {
      if (this.d.test($$1)) {
         Consumer<cxg> $$2 = exw.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azu.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ewo $$0) {
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

   public static ewm.a a() {
      return new ewm.a();
   }

   public static class a implements exs<ewm.a>, ezj<ewm.a> {
      private final Builder<ewy> a = ImmutableList.builder();
      private final Builder<ezr> b = ImmutableList.builder();
      private final Builder<exw> c = ImmutableList.builder();
      private fan d = fak.a(1.0F);
      private fan e = fak.a(0.0F);

      public ewm.a a(fan $$0) {
         this.d = $$0;
         return this;
      }

      public ewm.a a() {
         return this;
      }

      public ewm.a b(fan $$0) {
         this.e = $$0;
         return this;
      }

      public ewm.a a(ewy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ewm.a a(ezr.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ewm.a a(exw.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ewm b() {
         return new ewm(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
