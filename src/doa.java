import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doa extends der {
   public static final MapCodec<doa> a = b(doa::new);
   public static final dtk<dru> b = dsx.bz;
   public static final dtb c = djb.aE;
   public static final dsy d = dsx.bA;

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, jf.c).a(b, dru.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$0.e() || $$1.c(b) != dru.b) {
         return bqf.d;
      } else if ($$2 instanceof aqk $$7) {
         if ($$7.c_($$3) instanceof drp $$9) {
            drp.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqf.a;
         } else {
            return bqf.d;
         }
      } else {
         return bqf.b;
      }
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new drp($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0 instanceof aqk $$3
         ? a($$2, dpp.R, ($$1x, $$2x, $$3x, $$4) -> drp.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dpp.R, ($$0x, $$1x, $$2x, $$3x) -> drp.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dsh a(dsh $$0, dls $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dll a_(dsh $$0) {
      return dll.c;
   }
}
