import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dmd implements duc {
   public static final MapCodec<dof> a = b(dof::new);
   public static final ebk b = ebj.I;
   private static final ffw c = dmr.a(6.0);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dye($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.A, $$0.C ? dye::a : dye::b);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(b) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axh.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
