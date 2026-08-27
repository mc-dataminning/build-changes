import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dem extends cwq {
   public static final MapCodec<dem> a = b(dem::new);
   private static final vf d = vf.c("container.stonecutter");
   public static final dkb b = dal.aE;
   protected static final emm c = cwq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public dem(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asc.ay);
         return bkb.b;
      }
   }

   @Nullable
   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return new bkk(($$2x, $$3, $$4) -> new cka($$2x, $$3, cim.a($$1, $$2)), d);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
