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

public class edp {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               asg.a(egj.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               asg.a(eex.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               ehd.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               ehd.a.fieldOf("bonus_rolls").orElse(eha.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, edp::new)
   );
   private final List<eeb> b;
   private final List<egh> c;
   private final Predicate<edi> d;
   private final List<eev> e;
   private final BiFunction<ckj, edi, ckj> f;
   private final ehc g;
   private final ehc h;

   edp(List<eeb> $$0, List<egh> $$1, List<eev> $$2, ehc $$3, ehc $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = egj.a($$1);
      this.e = $$2;
      this.f = eex.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<ckj> $$0, edi $$1) {
      ate $$2 = $$1.b();
      List<eea> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eeb $$5 : this.b) {
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

            for (eea $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<ckj> $$0, edi $$1) {
      if (this.d.test($$1)) {
         Consumer<ckj> $$2 = eev.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + asy.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(edr $$0) {
      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         this.e.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }

      for (int $$3 = 0; $$3 < this.b.size(); $$3++) {
         this.b.get($$3).a($$0.b(".entries[" + $$3 + "]"));
      }

      this.g.a($$0.b(".rolls"));
      this.h.a($$0.b(".bonusRolls"));
   }

   public static edp.a a() {
      return new edp.a();
   }

   public static class a implements ees<edp.a>, ega<edp.a> {
      private final Builder<eeb> a = ImmutableList.builder();
      private final Builder<egh> b = ImmutableList.builder();
      private final Builder<eev> c = ImmutableList.builder();
      private ehc d = eha.a(1.0F);
      private ehc e = eha.a(0.0F);

      public edp.a a(ehc $$0) {
         this.d = $$0;
         return this;
      }

      public edp.a a() {
         return this;
      }

      public edp.a b(ehc $$0) {
         this.e = $$0;
         return this;
      }

      public edp.a a(eeb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public edp.a a(egh.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public edp.a a(eev.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public edp b() {
         return new edp(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
