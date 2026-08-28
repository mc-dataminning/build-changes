import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dla extends dlg {
   public static final MapCodec<dla> a = b(dla::new);
   public static final eam<ja> b = eae.R;
   public static final eaf c = eae.y;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1 instanceof aro $$5 && $$1.c_($$2) instanceof dwf $$6) {
         $$3.a($$6);
         $$3.a(awv.ar);
         cpi.a($$5, $$3, true);
      }

      return bty.a;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dwn $$4 = $$1.c_($$2);
      if ($$4 instanceof dwf) {
         ((dwf)$$4).k();
      }
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwf($$0, $$1);
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.a($$1.c_($$2));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
