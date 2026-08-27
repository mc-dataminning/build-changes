import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cts extends ctm implements ctr {
   public static final MapCodec<cts> a = b(cts::new);

   @Override
   public MapCodec<cts> a() {
      return a;
   }

   public cts(dga.d $$0) {
      super($$0);
   }

   @Override
   public cix b() {
      return cix.a;
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dds($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.o, dds::a);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         ddx $$6 = $$1.c_($$2);
         if ($$6 instanceof dds) {
            $$3.a((dds)$$6);
            $$3.a(aqn.ab);
         }

         return bib.b;
      }
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof dds) {
            ((dds)$$5).a($$4.y());
         }
      }
   }
}
