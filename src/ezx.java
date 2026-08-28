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

public class ezx {
   public static final Codec<ezx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fah.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               fdc.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               fbj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fdz.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fdz.a.fieldOf("bonus_rolls").orElse(fdv.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ezx::new)
   );
   private final List<faj> b;
   private final List<fdc> c;
   private final Predicate<ezt> d;
   private final List<fbh> e;
   private final BiFunction<czn, ezt, czn> f;
   private final fdy g;
   private final fdy h;

   ezx(List<faj> $$0, List<fdc> $$1, List<fbh> $$2, fdy $$3, fdy $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ag.a($$1);
      this.e = $$2;
      this.f = fbj.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<czn> $$0, ezt $$1) {
      azv $$2 = $$1.b();
      List<fai> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (faj $$5 : this.b) {
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

            for (fai $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<czn> $$0, ezt $$1) {
      if (this.d.test($$1)) {
         Consumer<czn> $$2 = fbh.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azm.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ezz $$0) {
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

   public static ezx.a a() {
      return new ezx.a();
   }

   public static class a implements fbd<ezx.a>, fcu<ezx.a> {
      private final Builder<faj> a = ImmutableList.builder();
      private final Builder<fdc> b = ImmutableList.builder();
      private final Builder<fbh> c = ImmutableList.builder();
      private fdy d = fdv.a(1.0F);
      private fdy e = fdv.a(0.0F);

      public ezx.a a(fdy $$0) {
         this.d = $$0;
         return this;
      }

      public ezx.a a() {
         return this;
      }

      public ezx.a b(fdy $$0) {
         this.e = $$0;
         return this;
      }

      public ezx.a a(faj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ezx.a a(fdc.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ezx.a a(fbh.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ezx b() {
         return new ezx(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
