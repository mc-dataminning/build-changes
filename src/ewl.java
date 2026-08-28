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

public class ewl {
   public static final Codec<ewl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ewv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               ezs.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               exx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fap.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fap.a.fieldOf("bonus_rolls").orElse(fal.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ewl::new)
   );
   private final List<ewx> b;
   private final List<ezs> c;
   private final Predicate<ewh> d;
   private final List<exv> e;
   private final BiFunction<cxk, ewh, cxk> f;
   private final fao g;
   private final fao h;

   ewl(List<ewx> $$0, List<ezs> $$1, List<exv> $$2, fao $$3, fao $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ae.a($$1);
      this.e = $$2;
      this.f = exx.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cxk> $$0, ewh $$1) {
      bam $$2 = $$1.b();
      List<eww> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ewx $$5 : this.b) {
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

            for (eww $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cxk> $$0, ewh $$1) {
      if (this.d.test($$1)) {
         Consumer<cxk> $$2 = exv.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + bae.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ewn $$0) {
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

   public static ewl.a a() {
      return new ewl.a();
   }

   public static class a implements exr<ewl.a>, ezk<ewl.a> {
      private final Builder<ewx> a = ImmutableList.builder();
      private final Builder<ezs> b = ImmutableList.builder();
      private final Builder<exv> c = ImmutableList.builder();
      private fao d = fal.a(1.0F);
      private fao e = fal.a(0.0F);

      public ewl.a a(fao $$0) {
         this.d = $$0;
         return this;
      }

      public ewl.a a() {
         return this;
      }

      public ewl.a b(fao $$0) {
         this.e = $$0;
         return this;
      }

      public ewl.a a(ewx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ewl.a a(ezs.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ewl.a a(exv.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ewl b() {
         return new ewl(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
