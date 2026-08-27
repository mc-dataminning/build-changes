import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIntImmutablePair;
import it.unimi.dsi.fastutil.ints.IntIntPair;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class cuz extends crt {
   private static final yb j = yb.a.a(n.f).b(true);
   private static final int k = 4;

   public cuz(ja<cru> $$0, crt.a $$1, cuc.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      int $$4 = $$0.a(ke.ah, Integer.valueOf(0));
      if ($$4 >= 4) {
         $$2.add(xh.a(xe.c("item.minecraft.poisonous_potato_plant.rumbled.line1"), j));
         $$2.add(xh.a(xe.a("item.minecraft.poisonous_potato_plant.rumbled.line2", xe.c("item.minecraft.poisonous_potato")), j));
      }
   }

   @Override
   public void a(cuh $$0, dca $$1, ir $$2, bpt $$3) {
      List<cuh> $$4 = $$3.a_($$0x -> $$0x.b(ke.aj));

      for (cuh $$5 : $$4) {
         if ($$5.a(ke.aj) == 0) {
            $$5.b(ke.aj, Integer.valueOf($$1.F_().f()));
         }
      }

      int $$6 = $$0.a(ke.aj);
      $$4.removeIf($$1x -> $$1x.a(ke.aj) == $$6);
      if (!$$4.isEmpty()) {
         cuh $$7 = $$4.get($$1.F_().a($$4.size()));
         int $$8 = $$7.a(ke.aj);
         Int2IntMap $$9 = $$7.a(ke.ak, new Int2IntOpenHashMap());
         Int2IntMap $$10 = $$0.a(ke.ak, new Int2IntOpenHashMap());
         int $$11 = $$9.getOrDefault($$6, -1);
         int $$12 = $$10.getOrDefault($$8, -1);
         if ($$11 > $$12) {
            $$10.put($$8, $$11);
            $$0.b(ke.ak, $$10);
         } else {
            int $$13 = $$12 + 1;
            Optional<xs> $$14 = a($$13, $$1.a($$2, 4.0, false));
            if (!$$14.isEmpty()) {
               $$10.put($$8, $$13);
               $$0.b(ke.ak, $$10);
               List<cuh> $$15 = $$3.a_($$0x -> $$0x.a(cuk.sl));
               $$15.removeIf($$2x -> {
                  if (!$$2x.b(ke.al)) {
                     return true;
                  } else {
                     IntIntPair $$3x = $$2x.a(ke.al);
                     return $$3x.firstInt() != $$6 && $$3x.firstInt() != $$8;
                  }
               });
               cuh $$16;
               if ($$15.isEmpty()) {
                  $$16 = new cuh(cuk.sl);
                  int $$17 = bpu.a($$3, $$16);
                  if ($$17 < 0) {
                     return;
                  }
               } else {
                  $$16 = $$15.get($$1.F_().a($$15.size()));
               }

               $$16.b(ke.al, new IntIntImmutablePair($$8, $$13));
               $$16.b(ke.f, $$14.get());
            }
         }
      }
   }

   private static Optional<xs> a(int $$0, @Nullable cly $$1) {
      xs $$2 = xe.a("item.minecraft.paper.secret." + $$0, y.a($$1, cly::P_, xe.c("the.player")));
      return $$2.getString().startsWith("item.minecraft.paper.secret.") ? Optional.empty() : Optional.of($$2);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      int $$4 = $$3.a(ke.ah, Integer.valueOf(0));
      return $$4 >= 4 ? super.a($$0, $$1, $$2) : bqb.c($$3);
   }
}
