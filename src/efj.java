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

public class efj {
   public static final Codec<efj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eft.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               asy.a(eid.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               asy.a(egr.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               eix.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eix.a.fieldOf("bonus_rolls").orElse(eiu.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, efj::new)
   );
   private final List<efv> b;
   private final List<eib> c;
   private final Predicate<efc> d;
   private final List<egp> e;
   private final BiFunction<clo, efc, clo> f;
   private final eiw g;
   private final eiw h;

   efj(List<efv> $$0, List<eib> $$1, List<egp> $$2, eiw $$3, eiw $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = eid.a($$1);
      this.e = $$2;
      this.f = egr.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<clo> $$0, efc $$1) {
      atw $$2 = $$1.b();
      List<efu> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (efv $$5 : this.b) {
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

            for (efu $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<clo> $$0, efc $$1) {
      if (this.d.test($$1)) {
         Consumer<clo> $$2 = egp.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + atq.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(efl $$0) {
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

   public static efj.a a() {
      return new efj.a();
   }

   public static class a implements egm<efj.a>, ehu<efj.a> {
      private final Builder<efv> a = ImmutableList.builder();
      private final Builder<eib> b = ImmutableList.builder();
      private final Builder<egp> c = ImmutableList.builder();
      private eiw d = eiu.a(1.0F);
      private eiw e = eiu.a(0.0F);

      public efj.a a(eiw $$0) {
         this.d = $$0;
         return this;
      }

      public efj.a a() {
         return this;
      }

      public efj.a b(eiw $$0) {
         this.e = $$0;
         return this;
      }

      public efj.a a(efv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public efj.a a(eib.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public efj.a a(egp.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public efj b() {
         return new efj(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
