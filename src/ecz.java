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

public class ecz {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edj.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               arh.a(eft.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               arh.a(eeh.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               egn.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               egn.a.fieldOf("bonus_rolls").orElse(egk.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ecz::new)
   );
   private final List<edl> b;
   private final List<efr> c;
   private final Predicate<ecs> d;
   private final List<eef> e;
   private final BiFunction<cjh, ecs, cjh> f;
   private final egm g;
   private final egm h;

   ecz(List<edl> $$0, List<efr> $$1, List<eef> $$2, egm $$3, egm $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = eft.a($$1);
      this.e = $$2;
      this.f = eeh.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cjh> $$0, ecs $$1) {
      ase $$2 = $$1.b();
      List<edk> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (edl $$5 : this.b) {
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

            for (edk $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cjh> $$0, ecs $$1) {
      if (this.d.test($$1)) {
         Consumer<cjh> $$2 = eef.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ary.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(edb $$0) {
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

   public static ecz.a a() {
      return new ecz.a();
   }

   public static class a implements eec<ecz.a>, efk<ecz.a> {
      private final Builder<edl> a = ImmutableList.builder();
      private final Builder<efr> b = ImmutableList.builder();
      private final Builder<eef> c = ImmutableList.builder();
      private egm d = egk.a(1.0F);
      private egm e = egk.a(0.0F);

      public ecz.a a(egm $$0) {
         this.d = $$0;
         return this;
      }

      public ecz.a a() {
         return this;
      }

      public ecz.a b(egm $$0) {
         this.e = $$0;
         return this;
      }

      public ecz.a a(edl.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ecz.a a(efr.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ecz.a a(eef.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ecz b() {
         return new ecz(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
