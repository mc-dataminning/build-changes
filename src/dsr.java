import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsr extends dlg {
   public static final MapCodec<dsr> a = b(dsr::new);
   public static final eaf b = eae.c;
   private final btd c = bta.a(5);

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   public dsr(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0.C ? null : a($$2, dwp.L, dxx::a);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
