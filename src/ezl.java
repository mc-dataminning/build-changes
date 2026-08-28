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

public class ezl {
   public static final Codec<ezl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ezv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.b),
               fcq.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.c),
               fax.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.e),
               fdn.a.fieldOf("rolls").forGetter($$0x -> $$0x.g),
               fdn.a.fieldOf("bonus_rolls").orElse(fdj.a(0.0F)).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ezl::new)
   );
   private final List<ezx> b;
   private final List<fcq> c;
   private final Predicate<ezh> d;
   private final List<fav> e;
   private final BiFunction<czd, ezh, czd> f;
   private final fdm g;
   private final fdm h;

   ezl(List<ezx> $$0, List<fcq> $$1, List<fav> $$2, fdm $$3, fdm $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = af.a($$1);
      this.e = $$2;
      this.f = fax.a($$2);
      this.g = $$3;
      this.h = $$4;
   }

   private void b(Consumer<czd> $$0, ezh $$1) {
      azv $$2 = $$1.b();
      List<ezw> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for (ezx $$5 : this.b) {
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

            for (ezw $$8 : $$3) {
               $$7 -= $$8.a($$1.c());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }
         }
      }
   }

   public void a(Consumer<czd> $$0, ezh $$1) {
      if (this.d.test($$1)) {
         Consumer<czd> $$2 = fav.a(this.f, $$0, $$1);
         int $$3 = this.g.a($$1) + azm.d(this.h.b($$1) * $$1.c());

         for (int $$4 = 0; $$4 < $$3; $$4++) {
            this.b($$2, $$1);
         }
      }
   }

   public void a(ezn $$0) {
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

   public static ezl.a a() {
      return new ezl.a();
   }

   public static class a implements far<ezl.a>, fci<ezl.a> {
      private final Builder<ezx> a = ImmutableList.builder();
      private final Builder<fcq> b = ImmutableList.builder();
      private final Builder<fav> c = ImmutableList.builder();
      private fdm d = fdj.a(1.0F);
      private fdm e = fdj.a(0.0F);

      public ezl.a a(fdm $$0) {
         this.d = $$0;
         return this;
      }

      public ezl.a a() {
         return this;
      }

      public ezl.a b(fdm $$0) {
         this.e = $$0;
         return this;
      }

      public ezl.a a(ezx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ezl.a a(fcq.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public ezl.a a(fav.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public ezl b() {
         return new ezl(this.a.build(), this.b.build(), this.c.build(), this.d, this.e);
      }
   }
}
