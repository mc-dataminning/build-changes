import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class efm extends efn {
   public static final int a = 8;
   public static final int b = 15;
   public static final MapCodec<efm> c = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(efl.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, efm::new)
   );
   private final efl h;

   public efm(bpm $$0, efq $$1, Optional<efk> $$2, efl $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, ja $$3, ja $$4, eel $$5) {
      List<ja> $$6 = Lists.newArrayList();
      ja.a $$7 = $$3.j();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(jf.b);
      }

      $$6.add($$4.d());

      for (jf $$8 : jf.c.a) {
         ja $$9 = $$4.a($$8);
         List<ja> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (ja $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(dcm $$0, ayo $$1, ja $$2, jf $$3, ja $$4, List<ja> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (ja $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<ja> a(ja $$0, jf $$1, ayo $$2, ja $$3) {
      ja $$4 = $$0.d();
      ja $$5 = $$0.a($$1);
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
   protected boolean a(dcm $$0, ja $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, ja $$3, eel $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         dsl $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected efo<?> a() {
      return efo.a;
   }
}
