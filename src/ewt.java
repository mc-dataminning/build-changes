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

public class ewt {
   public static final Codec<ewt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               exd.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               ezy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               eyf.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fav.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fav.a.fieldOf("bonus_rolls").orElse(far.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ewt::new)
   );
   private final List<exf> b;
   private final List<ezy> c;
   private final Predicate<ewp> d;
   private final List<eyd> e;
   private final BiFunction<cxp, ewp, cxp> f;
   private final fau g;
   private final fau h;

   ewt(List<exf> $$0, List<ezy> $$1, List<eyd> $$2, fau $$3, fau $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ae.a($$1);
      this.e = $$2;
      this.f = eyf.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cxp> $$0, ewp $$1) {
      bam $$2 = $$1.b();
      List<exe> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (exf $$5 : this.b) {
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

            for (exe $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cxp> $$0, ewp $$1) {
      if (this.d.test($$1)) {
         Consumer<cxp> $$2 = eyd.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + bae.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ewv $$0) {
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

   public static ewt.a a() {
      return new ewt.a();
   }

   public static class a implements exz<ewt.a>, ezq<ewt.a> {
      private final Builder<exf> a = ImmutableList.builder();
      private final Builder<ezy> b = ImmutableList.builder();
      private final Builder<eyd> c = ImmutableList.builder();
      private fau d = far.a(1.0F);
      private fau e = far.a(0.0F);

      public ewt.a a(fau $$0) {
         this.d = $$0;
         return this;
      }

      public ewt.a a() {
         return this;
      }

      public ewt.a b(fau $$0) {
         this.e = $$0;
         return this;
      }

      public ewt.a a(exf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ewt.a a(ezy.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ewt.a a(eyd.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ewt b() {
         return new ewt(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
