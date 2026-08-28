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

public class eyr {
   public static final Codec<eyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ezb.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               fbw.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               fad.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fct.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fct.a.fieldOf("bonus_rolls").orElse(fcp.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eyr::new)
   );
   private final List<ezd> b;
   private final List<fbw> c;
   private final Predicate<eyn> d;
   private final List<fab> e;
   private final BiFunction<cys, eyn, cys> f;
   private final fcs g;
   private final fcs h;

   eyr(List<ezd> $$0, List<fbw> $$1, List<fab> $$2, fcs $$3, fcs $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = af.a($$1);
      this.e = $$2;
      this.f = fad.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cys> $$0, eyn $$1) {
      azt $$2 = $$1.b();
      List<ezc> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ezd $$5 : this.b) {
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

            for (ezc $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cys> $$0, eyn $$1) {
      if (this.d.test($$1)) {
         Consumer<cys> $$2 = fab.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azk.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eyt $$0) {
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

   public static eyr.a a() {
      return new eyr.a();
   }

   public static class a implements ezx<eyr.a>, fbo<eyr.a> {
      private final Builder<ezd> a = ImmutableList.builder();
      private final Builder<fbw> b = ImmutableList.builder();
      private final Builder<fab> c = ImmutableList.builder();
      private fcs d = fcp.a(1.0F);
      private fcs e = fcp.a(0.0F);

      public eyr.a a(fcs $$0) {
         this.d = $$0;
         return this;
      }

      public eyr.a a() {
         return this;
      }

      public eyr.a b(fcs $$0) {
         this.e = $$0;
         return this;
      }

      public eyr.a a(ezd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eyr.a a(fbw.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eyr.a a(fab.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eyr b() {
         return new eyr(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
