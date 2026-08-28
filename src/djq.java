import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djq extends dkg {
   public static final dzd a = dzc.A;
   private final dsc.a b;

   public djq(dsc.a $$0, dyl.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.B.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends djq> a();

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dkw.hl) || $$1.a(dkw.hm) || $$1.a(dkw.hn) || $$1.a(dkw.ho);
         if ($$3) {
            return a($$2, dvn.q, dxb::a);
         }
      }

      return null;
   }

   public dsc.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
