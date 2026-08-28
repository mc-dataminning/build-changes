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

public class evt {
   public static final Codec<evt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ewd.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               eyy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               exf.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               ezv.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               ezv.a.fieldOf("bonus_rolls").orElse(ezr.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, evt::new)
   );
   private final List<ewf> b;
   private final List<eyy> c;
   private final Predicate<evp> d;
   private final List<exd> e;
   private final BiFunction<cwn, evp, cwn> f;
   private final ezu g;
   private final ezu h;

   evt(List<ewf> $$0, List<eyy> $$1, List<exd> $$2, ezu $$3, ezu $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = af.a($$1);
      this.e = $$2;
      this.f = exf.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<cwn> $$0, evp $$1) {
      azg $$2 = $$1.b();
      List<ewe> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ewf $$5 : this.b) {
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

            for (ewe $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<cwn> $$0, evp $$1) {
      if (this.d.test($$1)) {
         Consumer<cwn> $$2 = exd.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + ayy.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(evv $$0) {
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

   public static evt.a a() {
      return new evt.a();
   }

   public static class a implements ewz<evt.a>, eyq<evt.a> {
      private final Builder<ewf> a = ImmutableList.builder();
      private final Builder<eyy> b = ImmutableList.builder();
      private final Builder<exd> c = ImmutableList.builder();
      private ezu d = ezr.a(1.0F);
      private ezu e = ezr.a(0.0F);

      public evt.a a(ezu $$0) {
         this.d = $$0;
         return this;
      }

      public evt.a a() {
         return this;
      }

      public evt.a b(ezu $$0) {
         this.e = $$0;
         return this;
      }

      public evt.a a(ewf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public evt.a a(eyy.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public evt.a a(exd.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public evt b() {
         return new evt(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
