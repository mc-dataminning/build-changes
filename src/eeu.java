import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class eeu extends eev {
   public static final int a = 8;
   public static final int b = 15;
   public static final MapCodec<eeu> c = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eet.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, eeu::new)
   );
   private final eet h;

   public eeu(bpu $$0, eey $$1, Optional<ees> $$2, eet $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(dbz $$0, BiConsumer<iz, drx> $$1, azc $$2, iz $$3, iz $$4, edt $$5) {
      List<iz> $$6 = Lists.newArrayList();
      iz.a $$7 = $$3.j();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(je.b);
      }

      $$6.add($$4.d());

      for (je $$8 : je.c.a) {
         iz $$9 = $$4.a($$8);
         List<iz> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (iz $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(dbz $$0, azc $$1, iz $$2, je $$3, iz $$4, List<iz> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (iz $$9 : this.a($$2, $$3, $$1, $$4)) {
            if (this.a($$0, $$9)) {
               $$5.add($$9);
               if (!this.a($$0, $$1, $$9, $$3, $$4, $$5, $$6 + 1)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected List<iz> a(iz $$0, je $$1, azc $$2, iz $$3) {
      iz $$4 = $$0.d();
      iz $$5 = $$0.a($$1);
      int $$6 = $$0.k($$3);
      int $$7 = this.h.d();
      float $$8 = this.h.f();
      if ($$6 > $$7 - 3 && $$6 <= $$7) {
         return $$2.i() < $$8 ? List.of($$4, $$5.d()) : List.of($$4);
      } else if ($$6 > $$7) {
         return List.of($$4);
      } else if ($$2.i() < $$8) {
         return List.of($$4);
      } else {
         return $$2.h() ? List.of($$5) : List.of($$4);
      }
   }

   @Override
   protected boolean a(dbz $$0, iz $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(dbz $$0, BiConsumer<iz, drx> $$1, azc $$2, iz $$3, edt $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         drx $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected eew<?> a() {
      return eew.a;
   }
}
