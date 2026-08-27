import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwm extends dcr {
   public static final MapCodec<cwm> a = b(cwm::new);
   public static final djj b = djf.R;

   @Override
   public MapCodec<cwm> a() {
      return a;
   }

   public cwm(dio.d $$0) {
      super($$0);
      this.k(this.o().a(b, ia.c));
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return !$$0.B ? a($$2, dgf.J, ($$0x, $$1x, $$2x, $$3) -> dni.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
