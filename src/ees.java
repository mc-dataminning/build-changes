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

public class ees {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efc.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               asq.a(ehm.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               asq.a(ega.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               eig.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eig.a.fieldOf("bonus_rolls").orElse(eid.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ees::new)
   );
   private final List<efe> b;
   private final List<ehk> c;
   private final Predicate<eel> d;
   private final List<efy> e;
   private final BiFunction<clb, eel, clb> f;
   private final eif g;
   private final eif h;

   ees(List<efe> $$0, List<ehk> $$1, List<efy> $$2, eif $$3, eif $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ehm.a($$1);
      this.e = $$2;
      this.f = ega.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<clb> $$0, eel $$1) {
      ato $$2 = $$1.b();
      List<efd> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (efe $$5 : this.b) {
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

            for (efd $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<clb> $$0, eel $$1) {
      if (this.d.test($$1)) {
         Consumer<clb> $$2 = efy.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ati.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eeu $$0) {
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

   public static ees.a a() {
      return new ees.a();
   }

   public static class a implements efv<ees.a>, ehd<ees.a> {
      private final Builder<efe> a = ImmutableList.builder();
      private final Builder<ehk> b = ImmutableList.builder();
      private final Builder<efy> c = ImmutableList.builder();
      private eif d = eid.a(1.0F);
      private eif e = eid.a(0.0F);

      public ees.a a(eif $$0) {
         this.d = $$0;
         return this;
      }

      public ees.a a() {
         return this;
      }

      public ees.a b(eif $$0) {
         this.e = $$0;
         return this;
      }

      public ees.a a(efe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ees.a a(ehk.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ees.a a(efy.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ees b() {
         return new ees(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
