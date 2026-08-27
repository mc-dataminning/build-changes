import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class eea extends eeb {
   public static final int a = 8;
   public static final int b = 15;
   public static final MapCodec<eea> c = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(edz.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, eea::new)
   );
   private final edz h;

   public eea(bpb $$0, eee $$1, Optional<edy> $$2, edz $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, io $$3, io $$4, ecz $$5) {
      List<io> $$6 = Lists.newArrayList();
      io.a $$7 = $$3.j();

      while ($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(it.b);
      }

      $$6.add($$4.d());

      for (it $$8 : it.c.a) {
         io $$9 = $$4.a($$8);
         List<io> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for (io $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(dbf $$0, aym $$1, io $$2, it $$3, io $$4, List<io> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for (io $$9 : this.a($$2, $$3, $$1, $$4)) {
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

   protected List<io> a(io $$0, it $$1, aym $$2, io $$3) {
      io $$4 = $$0.d();
      io $$5 = $$0.a($$1);
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
   protected boolean a(dbf $$0, io $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, io $$3, ecz $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         drd $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected eec<?> a() {
      return eec.a;
   }
}
