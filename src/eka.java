import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class eka extends ekb {
   public static final int a = 8;
   public static final int b = 15;
   public static final MapCodec<eka> c = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ejz.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, eka::new)
   );
   private final ejz h;

   public eka(brq $$0, eke $$1, Optional<ejy> $$2, ejz $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(dgp $$0, BiConsumer<ji, dwy> $$1, azh $$2, ji $$3, ji $$4, eiz $$5) {
      List<ji> $$6 = Lists.newArrayList();
      ji.a $$7 = $$3.k();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(jn.b);
      }

      $$6.add($$4.e());

      for (jn $$8 : jn.c.a) {
         ji $$9 = $$4.a($$8);
         List<ji> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (ji $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(dgp $$0, azh $$1, ji $$2, jn $$3, ji $$4, List<ji> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (ji $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<ji> a(ji $$0, jn $$1, azh $$2, ji $$3) {
      ji $$4 = $$0.e();
      ji $$5 = $$0.a($$1);
      int $$6 = $$0.k($$3);
      int $$7 = this.h.d();
      float $$8 = this.h.f();
      if ($$6 > $$7 - 3 && $$6 <= $$7) {
         return $$2.i() < $$8 ? List.of($$4, $$5.e()) : List.of($$4);
      } else if ($$6 > $$7) {
         return List.of($$4);
      } else if ($$2.i() < $$8) {
         return List.of($$4);
      } else {
         return $$2.h() ? List.of($$5) : List.of($$4);
      }
   }

   @Override
   protected boolean a(dgp $$0, ji $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(dgp $$0, BiConsumer<ji, dwy> $$1, azh $$2, ji $$3, eiz $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         dwy $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected ekc<?> a() {
      return ekc.a;
   }
}
