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

public class erp {
   public static final Codec<erp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               euw.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               etb.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               evt.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               evt.a.fieldOf("bonus_rolls").orElse(evp.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, erp::new)
   );
   private final List<esb> b;
   private final List<euw> c;
   private final Predicate<erl> d;
   private final List<esz> e;
   private final BiFunction<cuo, erl, cuo> f;
   private final evs g;
   private final evs h;

   erp(List<esb> $$0, List<euw> $$1, List<esz> $$2, evs $$3, evs $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ad.a($$1);
      this.e = $$2;
      this.f = etb.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cuo> $$0, erl $$1) {
      ayv $$2 = $$1.b();
      List<esa> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (esb $$5 : this.b) {
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

            for (esa $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cuo> $$0, erl $$1) {
      if (this.d.test($$1)) {
         Consumer<cuo> $$2 = esz.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ayn.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(err $$0) {
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

   public static erp.a a() {
      return new erp.a();
   }

   public static class a implements esv<erp.a>, euo<erp.a> {
      private final Builder<esb> a = ImmutableList.builder();
      private final Builder<euw> b = ImmutableList.builder();
      private final Builder<esz> c = ImmutableList.builder();
      private evs d = evp.a(1.0F);
      private evs e = evp.a(0.0F);

      public erp.a a(evs $$0) {
         this.d = $$0;
         return this;
      }

      public erp.a a() {
         return this;
      }

      public erp.a b(evs $$0) {
         this.e = $$0;
         return this;
      }

      public erp.a a(esb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public erp.a a(euw.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public erp.a a(esz.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public erp b() {
         return new erp(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
