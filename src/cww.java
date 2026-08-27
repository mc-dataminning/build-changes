import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cww extends ddb {
   public static final MapCodec<cww> a = b(cww::new);
   public static final dju b = djq.R;

   @Override
   public MapCodec<cww> a() {
      return a;
   }

   public cww(diz.d $$0) {
      super($$0);
      this.k(this.o().a(b, ic.c));
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return !$$0.B ? a($$2, dgq.J, ($$0x, $$1x, $$2x, $$3) -> dnt.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
