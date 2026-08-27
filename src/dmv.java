import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends ddm {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final dsg<dqq> b = drt.bz;
   public static final drx c = dhw.aE;
   public static final dru d = drt.bA;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, it.c).a(b, dqq.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$0.e() || $$1.c(b) != dqq.b) {
         return bpy.d;
      } else if ($$2 instanceof aqn $$7) {
         if ($$7.c_($$3) instanceof dql $$9) {
            dql.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bpy.a;
         } else {
            return bpy.d;
         }
      } else {
         return bpy.b;
      }
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dql($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0 instanceof aqn $$3
         ? a($$2, dok.R, ($$1x, $$2x, $$3x, $$4) -> dql.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dok.R, ($$0x, $$1x, $$2x, $$3x) -> dql.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public drd a(drd $$0, dkn $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dkg a_(drd $$0) {
      return dkg.c;
   }
}
