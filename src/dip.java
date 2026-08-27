import com.mojang.serialization.MapCodec;

public class dip extends dbf {
   public static final MapCodec<dip> n = b(dip::new);

   @Override
   public MapCodec<dip> a() {
      return n;
   }

   public dip(dna.d $$0) {
      super($$0, () -> dkk.c);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dma($$0, $$1);
   }

   @Override
   protected auf<ajh> c() {
      return aui.i.b(aui.ai);
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return aww.a(dkp.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
