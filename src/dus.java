import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dus extends dlg {
   public static final MapCodec<dus> a = b(dus::new);
   public static final eam<dyu> b = eae.bB;
   public static final eaf c = eae.bE;

   @Override
   public MapCodec<dus> a() {
      return a;
   }

   public dus(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dyu.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0 instanceof aro $$3
         ? a($$2, dwp.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(eae.bE).orElse(false)))
         : a($$2, dwp.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(eae.bE).orElse(false)));
   }
}
