import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class drx extends dry {
   public static final int a = 8;
   public static final int b = 15;
   public static final Codec<drx> c = RecordCodecBuilder.create(
      $$0 -> a($$0).and(drw.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, drx::new)
   );
   private final drw h;

   public drx(bgd $$0, dsb $$1, Optional<drv> $$2, drw $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(cqb $$0, BiConsumer<gw, dfj> $$1, asc $$2, gw $$3, gw $$4, dqw $$5) {
      List<gw> $$6 = Lists.newArrayList();
      gw.a $$7 = $$3.j();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(ha.b);
      }

      $$6.add($$4.d());

      for (ha $$8 : ha.c.a) {
         gw $$9 = $$4.a($$8);
         List<gw> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (gw $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(cqb $$0, asc $$1, gw $$2, ha $$3, gw $$4, List<gw> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (gw $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<gw> a(gw $$0, ha $$1, asc $$2, gw $$3) {
      gw $$4 = $$0.d();
      gw $$5 = $$0.a($$1);
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
   protected boolean a(cqb $$0, gw $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(cqb $$0, BiConsumer<gw, dfj> $$1, asc $$2, gw $$3, dqw $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         dfj $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected drz<?> a() {
      return drz.a;
   }
}
