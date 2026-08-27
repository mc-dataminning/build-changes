import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbn extends cvj implements cvd {
   public static final MapCodec<dbn> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgx.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dbn::new)
   );
   public static final dii f = dhy.aU;
   protected static final float g = 6.0F;
   protected static final ekn h = cva.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dgx i;

   @Override
   public MapCodec<? extends dbn> a() {
      return e;
   }

   protected dbn(dgx $$0, dhh.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return h;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ame $$0, ht $$1, dhi $$2, ats $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return true;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f);
   }
}
