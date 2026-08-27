import com.mojang.serialization.MapCodec;

public class deb extends cwq {
   public static final MapCodec<deb> a = b(deb::new);
   protected static final emm b = cwq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public emm b_(djh $$0, csv $$1, hx $$2) {
      return emj.b();
   }

   @Override
   public emm c(djh $$0, csv $$1, hx $$2, ely $$3) {
      return emj.b();
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      cww.b($$1, $$2.c(), $$0);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && $$2.a(cws.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public float d(djh $$0, csv $$1, hx $$2) {
      return 0.2F;
   }
}
