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

public class ert {
   public static final Codec<ert> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               esd.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               eva.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               etf.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               evx.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               evx.a.fieldOf("bonus_rolls").orElse(evt.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ert::new)
   );
   private final List<esf> b;
   private final List<eva> c;
   private final Predicate<erp> d;
   private final List<etd> e;
   private final BiFunction<cuq, erp, cuq> f;
   private final evw g;
   private final evw h;

   ert(List<esf> $$0, List<eva> $$1, List<etd> $$2, evw $$3, evw $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ad.a($$1);
      this.e = $$2;
      this.f = etf.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cuq> $$0, erp $$1) {
      ayw $$2 = $$1.b();
      List<ese> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (esf $$5 : this.b) {
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

            for (ese $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cuq> $$0, erp $$1) {
      if (this.d.test($$1)) {
         Consumer<cuq> $$2 = etd.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ayo.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(erv $$0) {
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

   public static ert.a a() {
      return new ert.a();
   }

   public static class a implements esz<ert.a>, eus<ert.a> {
      private final Builder<esf> a = ImmutableList.builder();
      private final Builder<eva> b = ImmutableList.builder();
      private final Builder<etd> c = ImmutableList.builder();
      private evw d = evt.a(1.0F);
      private evw e = evt.a(0.0F);

      public ert.a a(evw $$0) {
         this.d = $$0;
         return this;
      }

      public ert.a a() {
         return this;
      }

      public ert.a b(evw $$0) {
         this.e = $$0;
         return this;
      }

      public ert.a a(esf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ert.a a(eva.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ert.a a(etd.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ert b() {
         return new ert(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
