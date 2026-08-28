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

public class fan {
   public static final Codec<fan> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fax.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               fds.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               fbz.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fep.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fep.a.fieldOf("bonus_rolls").orElse(fel.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, fan::new)
   );
   private final List<faz> b;
   private final List<fds> c;
   private final Predicate<faj> d;
   private final List<fbx> e;
   private final BiFunction<daa, faj, daa> f;
   private final feo g;
   private final feo h;

   fan(List<faz> $$0, List<fds> $$1, List<fbx> $$2, feo $$3, feo $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = ag.a($$1);
      this.e = $$2;
      this.f = fbz.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<daa> $$0, faj $$1) {
      azz $$2 = $$1.b();
      List<fay> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (faz $$5 : this.b) {
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

            for (fay $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<daa> $$0, faj $$1) {
      if (this.d.test($$1)) {
         Consumer<daa> $$2 = fbx.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azq.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(fap $$0) {
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

   public static fan.a a() {
      return new fan.a();
   }

   public static class a implements fbt<fan.a>, fdk<fan.a> {
      private final Builder<faz> a = ImmutableList.builder();
      private final Builder<fds> b = ImmutableList.builder();
      private final Builder<fbx> c = ImmutableList.builder();
      private feo d = fel.a(1.0F);
      private feo e = fel.a(0.0F);

      public fan.a a(feo $$0) {
         this.d = $$0;
         return this;
      }

      public fan.a a() {
         return this;
      }

      public fan.a b(feo $$0) {
         this.e = $$0;
         return this;
      }

      public fan.a a(faz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public fan.a a(fds.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public fan.a a(fbx.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public fan b() {
         return new fan(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
