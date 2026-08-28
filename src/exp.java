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

public class exp {
   public static final Codec<exp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               exz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               fau.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               ezb.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fbr.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fbr.a.fieldOf("bonus_rolls").orElse(fbn.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, exp::new)
   );
   private final List<eyb> b;
   private final List<fau> c;
   private final Predicate<exl> d;
   private final List<eyz> e;
   private final BiFunction<cxy, exl, cxy> f;
   private final fbq g;
   private final fbq h;

   exp(List<eyb> $$0, List<fau> $$1, List<eyz> $$2, fbq $$3, fbq $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = af.a($$1);
      this.e = $$2;
      this.f = ezb.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cxy> $$0, exl $$1) {
      azs $$2 = $$1.b();
      List<eya> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eyb $$5 : this.b) {
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

            for (eya $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cxy> $$0, exl $$1) {
      if (this.d.test($$1)) {
         Consumer<cxy> $$2 = eyz.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azk.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(exr $$0) {
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

   public static exp.a a() {
      return new exp.a();
   }

   public static class a implements eyv<exp.a>, fam<exp.a> {
      private final Builder<eyb> a = ImmutableList.builder();
      private final Builder<fau> b = ImmutableList.builder();
      private final Builder<eyz> c = ImmutableList.builder();
      private fbq d = fbn.a(1.0F);
      private fbq e = fbn.a(0.0F);

      public exp.a a(fbq $$0) {
         this.d = $$0;
         return this;
      }

      public exp.a a() {
         return this;
      }

      public exp.a b(fbq $$0) {
         this.e = $$0;
         return this;
      }

      public exp.a a(eyb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public exp.a a(fau.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public exp.a a(eyz.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public exp b() {
         return new exp(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
