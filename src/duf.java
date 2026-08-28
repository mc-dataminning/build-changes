import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duf extends dma {
   public static final MapCodec<duf> a = b(duf::new);
   private static final wy c = wy.c("container.stonecutter");
   public static final eax<ja> b = dqa.e;
   private static final ffc d = dma.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<duf> a() {
      return a;
   }

   public duf(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ay);
      }

      return bub.a;
   }

   @Nullable
   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return new buj(($$2x, $$3, $$4) -> new cwt($$2x, $$3, cvd.a($$1, $$2)), c);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d;
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
