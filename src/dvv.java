import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvv extends dmd {
   public static final MapCodec<dvv> a = b(dvv::new);
   public static final ebr<dzy> b = ebj.bB;
   public static final ebk c = ebj.bE;

   @Override
   public MapCodec<dvv> a() {
      return a;
   }

   public dvv(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, dzy.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dxt.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(ebj.bE).orElse(false)))
         : a($$2, dxt.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(ebj.bE).orElse(false)));
   }
}
