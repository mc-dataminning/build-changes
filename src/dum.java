import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dum extends dmf {
   public static final MapCodec<dum> a = b(dum::new);
   private static final wy c = wy.c("container.stonecutter");
   public static final ebf<ja> b = dqg.e;
   private static final ffk d = dmf.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dum> a() {
      return a;
   }

   public dum(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c));
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ay);
      }

      return bud.a;
   }

   @Nullable
   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return new bul(($$2x, $$3, $$4) -> new cwy($$2x, $$3, cvi.a($$1, $$2)), c);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d;
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
