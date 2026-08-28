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

public class fax {
   public static final Codec<fax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fbh.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               fec.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               fcj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fez.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fez.a.fieldOf("bonus_rolls").orElse(fev.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, fax::new)
   );
   private final List<fbj> b;
   private final List<fec> c;
   private final Predicate<fat> d;
   private final List<fch> e;
   private final BiFunction<dak, fat, dak> f;
   private final fey g;
   private final fey h;

   fax(List<fbj> $$0, List<fec> $$1, List<fch> $$2, fey $$3, fey $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ag.a($$1);
      this.e = $$2;
      this.f = fcj.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<dak> $$0, fat $$1) {
      bai $$2 = $$1.b();
      List<fbi> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (fbj $$5 : this.b) {
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

            for (fbi $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<dak> $$0, fat $$1) {
      if (this.d.test($$1)) {
         Consumer<dak> $$2 = fch.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azz.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(faz $$0) {
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

   public static fax.a a() {
      return new fax.a();
   }

   public static class a implements fcd<fax.a>, fdu<fax.a> {
      private final Builder<fbj> a = ImmutableList.builder();
      private final Builder<fec> b = ImmutableList.builder();
      private final Builder<fch> c = ImmutableList.builder();
      private fey d = fev.a(1.0F);
      private fey e = fev.a(0.0F);

      public fax.a a(fey $$0) {
         this.d = $$0;
         return this;
      }

      public fax.a a() {
         return this;
      }

      public fax.a b(fey $$0) {
         this.e = $$0;
         return this;
      }

      public fax.a a(fbj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public fax.a a(fec.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public fax.a a(fch.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public fax b() {
         return new fax(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
