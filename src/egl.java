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

public class egl {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               atg.a(ejf.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.c),
               atg.a(eht.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.e),
               ejz.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               ejz.a.fieldOf("bonus_rolls").orElse(ejw.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, egl::new)
   );
   private final List<egx> b;
   private final List<ejd> c;
   private final Predicate<ege> d;
   private final List<ehr> e;
   private final BiFunction<cmh, ege, cmh> f;
   private final ejy g;
   private final ejy h;

   egl(List<egx> $$0, List<ejd> $$1, List<ehr> $$2, ejy $$3, ejy $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ejf.a($$1);
      this.e = $$2;
      this.f = eht.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cmh> $$0, ege $$1) {
      auf $$2 = $$1.b();
      List<egw> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (egx $$5 : this.b) {
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

            for (egw $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cmh> $$0, ege $$1) {
      if (this.d.test($$1)) {
         Consumer<cmh> $$2 = ehr.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + aty.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(egn $$0) {
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

   public static egl.a a() {
      return new egl.a();
   }

   public static class a implements eho<egl.a>, eiw<egl.a> {
      private final Builder<egx> a = ImmutableList.builder();
      private final Builder<ejd> b = ImmutableList.builder();
      private final Builder<ehr> c = ImmutableList.builder();
      private ejy d = ejw.a(1.0F);
      private ejy e = ejw.a(0.0F);

      public egl.a a(ejy $$0) {
         this.d = $$0;
         return this;
      }

      public egl.a a() {
         return this;
      }

      public egl.a b(ejy $$0) {
         this.e = $$0;
         return this;
      }

      public egl.a a(egx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public egl.a a(ejd.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public egl.a a(ehr.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public egl b() {
         return new egl(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
