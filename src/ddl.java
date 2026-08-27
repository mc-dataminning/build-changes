import com.mojang.serialization.MapCodec;

public class ddl extends cyo implements cyr {
   public static final MapCodec<ddl> a = b(ddl::new);

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(dle.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      $$0.I_().c(kg.aw).flatMap($$0x -> $$0x.b(qk.n)).ifPresent($$3x -> ((dtf)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public cyr.a av_() {
      return cyr.a.a;
   }
}
