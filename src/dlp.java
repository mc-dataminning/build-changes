import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlp extends dfk implements dfe {
   public static final MapCodec<dlp> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drt.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dlp::new)
   );
   public static final dte f = dsu.aU;
   protected static final float g = 6.0F;
   protected static final ewm h = dfb.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drt i;

   @Override
   public MapCodec<? extends dlp> a() {
      return e;
   }

   protected dlp(drt $$0, dsd.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return h;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arf $$0, iz $$1, dse $$2, azh $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f);
   }
}
