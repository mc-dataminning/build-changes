import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkb extends ddy {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final drs b = dkc.d;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dra.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.C($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }
}
