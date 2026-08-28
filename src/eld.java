import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eld extends elc {
   public static final MapCodec<eld> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eld::new));

   public eld(bsv $$0, bsv $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eli<?> a() {
      return eli.e;
   }

   @Override
   protected void a(dhv $$0, elh.b $$1, azs $$2, ekr $$3, int $$4, elh.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(azs $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
