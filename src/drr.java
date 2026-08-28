import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drr extends dkg {
   public static final MapCodec<drr> a = b(drr::new);
   public static final dzd b = dzc.c;
   private final bsv c = bss.a(5);

   @Override
   public MapCodec<drr> a() {
      return a;
   }

   public drr(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? null : a($$2, dvn.L, dwv::a);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
