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

public class eld {
   public static final Codec<eld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eln.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               awe.a(enx.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               awe.a(eml.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               eor.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eor.a.fieldOf("bonus_rolls").orElse(eoo.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eld::new)
   );
   private final List<elp> b;
   private final List<env> c;
   private final Predicate<ekw> d;
   private final List<emj> e;
   private final BiFunction<cqm, ekw, cqm> f;
   private final eoq g;
   private final eoq h;

   eld(List<elp> $$0, List<env> $$1, List<emj> $$2, eoq $$3, eoq $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = eml.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cqm> $$0, ekw $$1) {
      axd $$2 = $$1.b();
      List<elo> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (elp $$5 : this.b) {
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

            for (elo $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cqm> $$0, ekw $$1) {
      if (this.d.test($$1)) {
         Consumer<cqm> $$2 = emj.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + aww.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(elf $$0) {
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

   public static eld.a a() {
      return new eld.a();
   }

   public static class a implements emg<eld.a>, eno<eld.a> {
      private final Builder<elp> a = ImmutableList.builder();
      private final Builder<env> b = ImmutableList.builder();
      private final Builder<emj> c = ImmutableList.builder();
      private eoq d = eoo.a(1.0F);
      private eoq e = eoo.a(0.0F);

      public eld.a a(eoq $$0) {
         this.d = $$0;
         return this;
      }

      public eld.a a() {
         return this;
      }

      public eld.a b(eoq $$0) {
         this.e = $$0;
         return this;
      }

      public eld.a a(elp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eld.a a(env.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public eld.a a(emj.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public eld b() {
         return new eld(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
