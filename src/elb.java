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

public class elb {
   public static final Codec<elb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ell.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               awe.a(env.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               awe.a(emj.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               eop.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               eop.a.fieldOf("bonus_rolls").orElse(eom.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, elb::new)
   );
   private final List<eln> b;
   private final List<ent> c;
   private final Predicate<eku> d;
   private final List<emh> e;
   private final BiFunction<cqk, eku, cqk> f;
   private final eoo g;
   private final eoo h;

   elb(List<eln> $$0, List<ent> $$1, List<emh> $$2, eoo $$3, eoo $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ac.a($$1);
      this.e = $$2;
      this.f = emj.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cqk> $$0, eku $$1) {
      axd $$2 = $$1.b();
      List<elm> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (eln $$5 : this.b) {
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

            for (elm $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cqk> $$0, eku $$1) {
      if (this.d.test($$1)) {
         Consumer<cqk> $$2 = emh.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + aww.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(eld $$0) {
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

   public static elb.a a() {
      return new elb.a();
   }

   public static class a implements eme<elb.a>, enm<elb.a> {
      private final Builder<eln> a = ImmutableList.builder();
      private final Builder<ent> b = ImmutableList.builder();
      private final Builder<emh> c = ImmutableList.builder();
      private eoo d = eom.a(1.0F);
      private eoo e = eom.a(0.0F);

      public elb.a a(eoo $$0) {
         this.d = $$0;
         return this;
      }

      public elb.a a() {
         return this;
      }

      public elb.a b(eoo $$0) {
         this.e = $$0;
         return this;
      }

      public elb.a a(eln.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public elb.a a(ent.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public elb.a a(emh.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public elb b() {
         return new elb(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
