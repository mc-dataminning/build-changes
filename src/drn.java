import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends djl {
   public static final MapCodec<drn> a = b(drn::new);
   private static final wp d = wp.c("container.stonecutter");
   public static final dxt<jn> b = dnj.aF;
   protected static final fbt c = djl.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   public drn(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ay);
      }

      return bsj.a;
   }

   @Nullable
   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new cue($$2x, $$3, cso.a($$1, $$2)), d);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
