import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class dxt extends dxu {
   public static final int a = 8;
   public static final int b = 15;
   public static final Codec<dxt> c = RecordCodecBuilder.create(
      $$0 -> a($$0).and(dxs.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, dxt::new)
   );
   private final dxs h;

   public dxt(bkz $$0, dxx $$1, Optional<dxr> $$2, dxs $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(cvt $$0, BiConsumer<hz, dlf> $$1, awo $$2, hz $$3, hz $$4, dws $$5) {
      List<hz> $$6 = Lists.newArrayList();
      hz.a $$7 = $$3.j();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(ie.b);
      }

      $$6.add($$4.d());

      for (ie $$8 : ie.c.a) {
         hz $$9 = $$4.a($$8);
         List<hz> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (hz $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(cvt $$0, awo $$1, hz $$2, ie $$3, hz $$4, List<hz> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (hz $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<hz> a(hz $$0, ie $$1, awo $$2, hz $$3) {
      hz $$4 = $$0.d();
      hz $$5 = $$0.a($$1);
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
   protected boolean a(cvt $$0, hz $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(cvt $$0, BiConsumer<hz, dlf> $$1, awo $$2, hz $$3, dws $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         dlf $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dxv<?> a() {
      return dxv.a;
   }
}
