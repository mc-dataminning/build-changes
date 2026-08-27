import com.mojang.serialization.MapCodec;

public class dhf extends czv {
   public static final MapCodec<dhf> n = b(dhf::new);

   @Override
   public MapCodec<dhf> a() {
      return n;
   }

   public dhf(dli.d $$0) {
      super($$0, () -> diz.c);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkp($$0, $$1);
   }

   @Override
   protected ats<aiy> c() {
      return atv.i.b(atv.ai);
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return awi.a(dje.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$3 == ie.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
