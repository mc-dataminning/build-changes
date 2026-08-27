import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class drm extends drn {
   public static final int a = 8;
   public static final int b = 15;
   public static final Codec<drm> c = RecordCodecBuilder.create(
      $$0 -> a($$0).and(drl.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, drm::new)
   );
   private final drl h;

   public drm(bft $$0, drq $$1, Optional<drk> $$2, drl $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(cpq $$0, BiConsumer<gv, dey> $$1, art $$2, gv $$3, gv $$4, dql $$5) {
      List<gv> $$6 = Lists.newArrayList();
      gv.a $$7 = $$3.j();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(hb.b);
      }

      $$6.add($$4.d());

      for (hb $$8 : hb.c.a) {
         gv $$9 = $$4.a($$8);
         List<gv> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (gv $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(cpq $$0, art $$1, gv $$2, hb $$3, gv $$4, List<gv> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (gv $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<gv> a(gv $$0, hb $$1, art $$2, gv $$3) {
      gv $$4 = $$0.d();
      gv $$5 = $$0.a($$1);
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
   protected boolean a(cpq $$0, gv $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(cpq $$0, BiConsumer<gv, dey> $$1, art $$2, gv $$3, dql $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         dey $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dro<?> a() {
      return dro.a;
   }
}
