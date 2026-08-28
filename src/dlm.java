import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlm extends dfh implements dfb {
   public static final MapCodec<dlm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dlm::new)
   );
   public static final dtb f = dsr.aU;
   protected static final float g = 6.0F;
   protected static final ewj h = dey.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drq i;

   @Override
   public MapCodec<? extends dlm> a() {
      return e;
   }

   protected dlm(drq $$0, dsa.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return h;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(are $$0, iz $$1, dsb $$2, azg $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f);
   }
}
