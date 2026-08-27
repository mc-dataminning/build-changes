import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnc extends dmk implements dkz {
   public static final MapCodec<dnc> a = b(dnc::new);
   public static final drs c = drr.C;

   @Override
   protected MapCodec<? extends dnc> a() {
      return a;
   }

   protected dnc(dra.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(emv.c)));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }
}
