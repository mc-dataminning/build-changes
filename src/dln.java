import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dln extends dfi implements dfc {
   public static final MapCodec<dln> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drr.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dln::new)
   );
   public static final dtc f = dss.aU;
   protected static final float g = 6.0F;
   protected static final ewk h = dez.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drr i;

   @Override
   public MapCodec<? extends dln> a() {
      return e;
   }

   protected dln(drr $$0, dsb.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return h;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arf $$0, iz $$1, dsc $$2, azh $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return true;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f);
   }
}
