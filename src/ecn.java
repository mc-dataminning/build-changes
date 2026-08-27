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

public class ecn {
   public static final Codec<ecn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecx.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               aqy.a(efh.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               aqy.a(edv.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               egb.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               egb.a.fieldOf("bonus_rolls").orElse(efy.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ecn::new)
   );
   private final List<ecz> b;
   private final List<eff> c;
   private final Predicate<ecg> d;
   private final List<edt> e;
   private final BiFunction<cix, ecg, cix> f;
   private final ega g;
   private final ega h;

   ecn(List<ecz> $$0, List<eff> $$1, List<edt> $$2, ega $$3, ega $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = efh.a($$1);
      this.e = $$2;
      this.f = edv.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cix> $$0, ecg $$1) {
      aru $$2 = $$1.b();
      List<ecy> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ecz $$5 : this.b) {
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

            for (ecy $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cix> $$0, ecg $$1) {
      if (this.d.test($$1)) {
         Consumer<cix> $$2 = edt.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + arp.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ecp $$0) {
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

   public static ecn.a a() {
      return new ecn.a();
   }

   public static class a implements edq<ecn.a>, eey<ecn.a> {
      private final Builder<ecz> a = ImmutableList.builder();
      private final Builder<eff> b = ImmutableList.builder();
      private final Builder<edt> c = ImmutableList.builder();
      private ega d = efy.a(1.0F);
      private ega e = efy.a(0.0F);

      public ecn.a a(ega $$0) {
         this.d = $$0;
         return this;
      }

      public ecn.a a() {
         return this;
      }

      public ecn.a b(ega $$0) {
         this.e = $$0;
         return this;
      }

      public ecn.a a(ecz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ecn.a a(eff.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ecn.a a(edt.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ecn b() {
         return new ecn(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
