import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dft extends ctm {
   public static final MapCodec<dft> a = b(dft::new);
   public static final dgv b = dfv.a;
   public static final dgz<dhd> c = dfv.c;

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, dhd.a));
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return null;
   }

   public static ddx a(ht $$0, dgb $$1, dgb $$2, hx $$3, boolean $$4, boolean $$5) {
      return new dfx($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.k, dfx::a);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         ddx $$5 = $$1.c_($$2);
         if ($$5 instanceof dfx) {
            ((dfx)$$5).j();
         }
      }
   }

   @Override
   public void a(cra $$0, ht $$1, dgb $$2) {
      ht $$3 = $$1.a($$2.c(b).g());
      dgb $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dfu && $$4.c(dfu.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bib.b;
      } else {
         return bib.d;
      }
   }

   @Override
   public List<ckj> a(dgb $$0, edo.a $$1) {
      dfx $$2 = this.a($$1.a(), ht.a($$1.a(eft.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return eiv.a();
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      dfx $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eiv.a();
   }

   @Nullable
   private dfx a(cqf $$0, ht $$1) {
      ddx $$2 = $$0.c_($$1);
      return $$2 instanceof dfx ? (dfx)$$2 : null;
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return ckj.b;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
