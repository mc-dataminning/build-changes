import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edv extends edp {
   public static final MapCodec<edv> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpb.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, edv::new)
   );
   private final bpb b;

   public edv(bpb $$0, bpb $$1, bpb $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected edq<?> a() {
      return edq.b;
   }

   @Override
   protected void a(dbf $$0, edp.b $$1, aym $$2, ecz $$3, int $$4, edp.a $$5, int $$6, int $$7, int $$8) {
      io $$9 = $$5.a();
      int $$10 = $$2.a(2);
      int $$11 = 1;
      int $$12 = 0;

      for (int $$13 = $$8; $$13 >= -$$6; $$13--) {
         this.a($$0, $$1, $$2, $$3, $$9, $$10, $$13, $$5.c());
         if ($$10 >= $$11) {
            $$10 = $$12;
            $$12 = 1;
            $$11 = Math.min($$11 + 1, $$7 + $$5.b());
         } else {
            $$10++;
         }
      }
   }

   @Override
   public int a(aym $$0, int $$1, ecz $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(aym $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
