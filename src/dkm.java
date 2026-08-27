import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkm extends deh implements deb {
   public static final MapCodec<dkm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dkm::new)
   );
   public static final dsb f = drr.aU;
   protected static final float g = 6.0F;
   protected static final evd h = ddy.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dqq i;

   @Override
   public MapCodec<? extends dkm> a() {
      return e;
   }

   protected dkm(dqq $$0, dra.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return h;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aqm $$0, io $$1, drb $$2, ayk $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f);
   }
}
