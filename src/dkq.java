import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkq extends dlg {
   public static final eaf a = eae.A;
   private final dtc.a b;

   public dkq(dtc.a $$0, dzn.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.B.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dkq> a();

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dlw.hl) || $$1.a(dlw.hm) || $$1.a(dlw.hn) || $$1.a(dlw.ho);
         if ($$3) {
            return a($$2, dwp.q, dyd::a);
         }
      }

      return null;
   }

   public dtc.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(a);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
