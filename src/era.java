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

public class era {
   public static final Codec<era> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erk.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               euh.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               esm.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               eve.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eve.a.fieldOf("bonus_rolls").orElse(eva.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, era::new)
   );
   private final List<erm> b;
   private final List<euh> c;
   private final Predicate<eqw> d;
   private final List<esk> e;
   private final BiFunction<cud, eqw, cud> f;
   private final evd g;
   private final evd h;

   era(List<erm> $$0, List<euh> $$1, List<esk> $$2, evd $$3, evd $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = esm.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cud> $$0, eqw $$1) {
      ayo $$2 = $$1.b();
      List<erl> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (erm $$5 : this.b) {
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

            for (erl $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cud> $$0, eqw $$1) {
      if (this.d.test($$1)) {
         Consumer<cud> $$2 = esk.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ayg.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(erc $$0) {
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

   public static era.a a() {
      return new era.a();
   }

   public static class a implements esg<era.a>, etz<era.a> {
      private final Builder<erm> a = ImmutableList.builder();
      private final Builder<euh> b = ImmutableList.builder();
      private final Builder<esk> c = ImmutableList.builder();
      private evd d = eva.a(1.0F);
      private evd e = eva.a(0.0F);

      public era.a a(evd $$0) {
         this.d = $$0;
         return this;
      }

      public era.a a() {
         return this;
      }

      public era.a b(evd $$0) {
         this.e = $$0;
         return this;
      }

      public era.a a(erm.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public era.a a(euh.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public era.a a(esk.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public era b() {
         return new era(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
