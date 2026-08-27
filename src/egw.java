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

public class egw {
   public static final Codec<egw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehg.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               atq.a(ejq.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               atq.a(eie.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               ekk.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               ekk.a.fieldOf("bonus_rolls").orElse(ekh.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, egw::new)
   );
   private final List<ehi> b;
   private final List<ejo> c;
   private final Predicate<egp> d;
   private final List<eic> e;
   private final BiFunction<cmr, egp, cmr> f;
   private final ekj g;
   private final ekj h;

   egw(List<ehi> $$0, List<ejo> $$1, List<eic> $$2, ekj $$3, ekj $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ejq.a($$1);
      this.e = $$2;
      this.f = eie.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cmr> $$0, egp $$1) {
      aup $$2 = $$1.b();
      List<ehh> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ehi $$5 : this.b) {
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

            for (ehh $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cmr> $$0, egp $$1) {
      if (this.d.test($$1)) {
         Consumer<cmr> $$2 = eic.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + aui.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(egy $$0) {
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

   public static egw.a a() {
      return new egw.a();
   }

   public static class a implements ehz<egw.a>, ejh<egw.a> {
      private final Builder<ehi> a = ImmutableList.builder();
      private final Builder<ejo> b = ImmutableList.builder();
      private final Builder<eic> c = ImmutableList.builder();
      private ekj d = ekh.a(1.0F);
      private ekj e = ekh.a(0.0F);

      public egw.a a(ekj $$0) {
         this.d = $$0;
         return this;
      }

      public egw.a a() {
         return this;
      }

      public egw.a b(ekj $$0) {
         this.e = $$0;
         return this;
      }

      public egw.a a(ehi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public egw.a a(ejo.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public egw.a a(eic.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public egw b() {
         return new egw(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
