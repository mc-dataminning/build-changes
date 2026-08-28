import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efw extends efq {
   public static final MapCodec<efw> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpv.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, efw::new)
   );
   private final bpv b;

   public efw(bpv $$0, bpv $$1, bpv $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected efr<?> a() {
      return efr.b;
   }

   @Override
   protected void a(dda $$0, efq.b $$1, ayv $$2, efa $$3, int $$4, efq.a $$5, int $$6, int $$7, int $$8) {
      jd $$9 = $$5.a();
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
   public int a(ayv $$0, int $$1, efa $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(ayv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
