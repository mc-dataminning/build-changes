import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class enz extends eoa {
   public static final int a = 8;
   public static final int b = 15;
   public static final MapCodec<enz> c = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eny.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, enz::new)
   );
   private final eny h;

   public enz(btl $$0, eod $$1, Optional<enx> $$2, eny $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(djs $$0, BiConsumer<iv, eat> $$1, azv $$2, iv $$3, iv $$4, emy $$5) {
      List<iv> $$6 = Lists.newArrayList();
      iv.a $$7 = $$3.k();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(jb.b);
      }

      $$6.add($$4.e());

      for (jb $$8 : jb.c.a) {
         iv $$9 = $$4.a($$8);
         List<iv> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (iv $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(djs $$0, azv $$1, iv $$2, jb $$3, iv $$4, List<iv> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (iv $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<iv> a(iv $$0, jb $$1, azv $$2, iv $$3) {
      iv $$4 = $$0.e();
      iv $$5 = $$0.a($$1);
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
   protected boolean a(djs $$0, iv $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(djs $$0, BiConsumer<iv, eat> $$1, azv $$2, iv $$3, emy $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         eat $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected eob<?> a() {
      return eob.a;
   }
}
