import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends dod {
   public static final MapCodec<dhw> a = b(dhw::new);
   public static final dvi b = dve.R;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dun.d $$0) {
      super($$0);
      this.l(this.o().b(b, jj.c));
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new drx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return !$$0.B ? a($$2, dru.J, ($$0x, $$1x, $$2x, $$3) -> dzu.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
