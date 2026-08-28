import com.mojang.serialization.MapCodec;

public class dof extends dnj {
   public static final MapCodec<dof> a = b(dof::new);
   private static final wp b = wp.c("container.loom");

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   protected dof(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ax);
      }

      return bsj.a;
   }

   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new cti($$2x, $$3, cso.a($$1, $$2)), b);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF);
   }
}
