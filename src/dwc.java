import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwc extends dmd {
   public static final MapCodec<dwc> a = b(dwc::new);
   public static final ebw<eaf> b = ebj.bC;
   public static final ebr<jb> c = dqs.e;
   public static final ebk d = ebj.bE;

   @Override
   public MapCodec<dwc> a() {
      return a;
   }

   public dwc(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jb.c).b(b, eaf.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if (!$$0.f() && $$1.c(b) == eaf.b) {
         if ($$2 instanceof arq $$7) {
            if (!($$7.c_($$3) instanceof eaa $$8)) {
               return bug.f;
            }

            eaa.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bug.b;
      } else {
         return bug.f;
      }
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new eaa($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dxt.S, ($$1x, $$2x, $$3x, $$4) -> eaa.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dxt.S, ($$0x, $$1x, $$2x, $$3x) -> eaa.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public eat a(eat $$0, dtl $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
