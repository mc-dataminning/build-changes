import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtt extends dmd implements duc {
   public static final MapCodec<dtt> a = b(dtt::new);
   public static final ebk b = ebj.C;
   public static final ebk c = ebj.I;
   public static final ebk d = ebj.e;
   private static final ffw f = dmr.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jb.a.b);

   @Override
   public MapCodec<dtt> a() {
      return a;
   }

   public dtt(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bwi $$3) {
      if ($$0 instanceof arq $$4) {
         arr $$5 = dzd.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dxt.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dxt.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return f;
   }

   @Override
   protected ffw d_(eat $$0) {
      return f;
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzd($$0, $$1);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == exb.c));
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, czn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bti.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return !$$0.C ? dmd.a($$2, dxt.M, ($$0x, $$1x, $$2x, $$3) -> egc.c.a($$0x, $$3.x(), $$3.gt())) : null;
   }
}
