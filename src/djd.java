import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dpj {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dws<jm> b = dwl.R;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.c));
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return !$$0.C ? a($$2, dta.J, ($$0x, $$1x, $$2x, $$3) -> eba.c.a($$0x, $$3.go(), $$3.gp())) : null;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
