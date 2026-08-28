import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvj extends dnc {
   public static final MapCodec<dvj> a = b(dvj::new);
   private static final xa c = xa.c("container.stonecutter");
   public static final ecc<jb> b = drd.e;
   private static final fgk d = dnc.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dvj> a() {
      return a;
   }

   public dvj(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awz.ay);
      }

      return bur.a;
   }

   @Nullable
   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return new buz(($$2x, $$3, $$4) -> new cxt($$2x, $$3, cwd.a($$1, $$2)), c);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d;
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
