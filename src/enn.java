import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class enn extends eno {
   public static final int a = 8;
   public static final int b = 15;
   public static final MapCodec<enn> c = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(enm.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, enn::new)
   );
   private final enm h;

   public enn(bti $$0, enr $$1, Optional<enl> $$2, enm $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(djg $$0, BiConsumer<iu, eah> $$1, azv $$2, iu $$3, iu $$4, emm $$5) {
      List<iu> $$6 = Lists.newArrayList();
      iu.a $$7 = $$3.k();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(ja.b);
      }

      $$6.add($$4.e());

      for (ja $$8 : ja.c.a) {
         iu $$9 = $$4.a($$8);
         List<iu> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (iu $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(djg $$0, azv $$1, iu $$2, ja $$3, iu $$4, List<iu> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (iu $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<iu> a(iu $$0, ja $$1, azv $$2, iu $$3) {
      iu $$4 = $$0.e();
      iu $$5 = $$0.a($$1);
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
   protected boolean a(djg $$0, iu $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(djg $$0, BiConsumer<iu, eah> $$1, azv $$2, iu $$3, emm $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         eah $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected enp<?> a() {
      return enp.a;
   }
}
