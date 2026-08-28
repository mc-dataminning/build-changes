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

public class ews {
   public static final Codec<ews> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               exc.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               ezx.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               eye.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fau.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fau.a.fieldOf("bonus_rolls").orElse(faq.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ews::new)
   );
   private final List<exe> b;
   private final List<ezx> c;
   private final Predicate<ewo> d;
   private final List<eyc> e;
   private final BiFunction<cxo, ewo, cxo> f;
   private final fat g;
   private final fat h;

   ews(List<exe> $$0, List<ezx> $$1, List<eyc> $$2, fat $$3, fat $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ae.a($$1);
      this.e = $$2;
      this.f = eye.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cxo> $$0, ewo $$1) {
      bam $$2 = $$1.b();
      List<exd> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (exe $$5 : this.b) {
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

            for (exd $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cxo> $$0, ewo $$1) {
      if (this.d.test($$1)) {
         Consumer<cxo> $$2 = eyc.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + bae.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ewu $$0) {
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

   public static ews.a a() {
      return new ews.a();
   }

   public static class a implements exy<ews.a>, ezp<ews.a> {
      private final Builder<exe> a = ImmutableList.builder();
      private final Builder<ezx> b = ImmutableList.builder();
      private final Builder<eyc> c = ImmutableList.builder();
      private fat d = faq.a(1.0F);
      private fat e = faq.a(0.0F);

      public ews.a a(fat $$0) {
         this.d = $$0;
         return this;
      }

      public ews.a a() {
         return this;
      }

      public ews.a b(fat $$0) {
         this.e = $$0;
         return this;
      }

      public ews.a a(exe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ews.a a(ezx.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ews.a a(eyc.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ews b() {
         return new ews(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
