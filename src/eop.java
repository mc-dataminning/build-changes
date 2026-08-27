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

public class eop {
   public static final Codec<eop> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               axh.a(ers.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               axh.a(epz.c.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               esm.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               esm.a.fieldOf("bonus_rolls").orElse(esj.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eop::new)
   );
   private final List<epb> b;
   private final List<erq> c;
   private final Predicate<eol> d;
   private final List<epx> e;
   private final BiFunction<csz, eol, csz> f;
   private final esl g;
   private final esl h;

   eop(List<epb> $$0, List<erq> $$1, List<epx> $$2, esl $$3, esl $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = epz.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<csz> $$0, eol $$1) {
      ayg $$2 = $$1.b();
      List<epa> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (epb $$5 : this.b) {
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

            for (epa $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<csz> $$0, eol $$1) {
      if (this.d.test($$1)) {
         Consumer<csz> $$2 = epx.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + axz.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eor $$0) {
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

   public static eop.a a() {
      return new eop.a();
   }

   public static class a implements ept<eop.a>, erj<eop.a> {
      private final Builder<epb> a = ImmutableList.builder();
      private final Builder<erq> b = ImmutableList.builder();
      private final Builder<epx> c = ImmutableList.builder();
      private esl d = esj.a(1.0F);
      private esl e = esj.a(0.0F);

      public eop.a a(esl $$0) {
         this.d = $$0;
         return this;
      }

      public eop.a a() {
         return this;
      }

      public eop.a b(esl $$0) {
         this.e = $$0;
         return this;
      }

      public eop.a a(epb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eop.a a(erq.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eop.a a(epx.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eop b() {
         return new eop(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
