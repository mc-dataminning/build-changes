import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbs extends cvo implements cvi {
   public static final MapCodec<dbs> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhc.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dbs::new)
   );
   public static final din f = did.aU;
   protected static final float g = 6.0F;
   protected static final eks h = cvf.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dhc i;

   @Override
   public MapCodec<? extends dbs> a() {
      return e;
   }

   protected dbs(dhc $$0, dhm.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return h;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ami $$0, hx $$1, dhn $$2, atw $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f);
   }
}
