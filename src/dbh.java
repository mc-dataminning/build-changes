import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbh extends dfd {
   public static final MapCodec<dbh> a = b(dbh::new);
   public static final dqc b = dgc.aE;
   private static final etc c = dch.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final etc d = dch.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final etc e = dch.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final etc f = dch.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final etc g = dch.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final etc h = dch.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final etc i = dch.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final etc j = esz.a(c, d, e, f);
   private static final etc k = esz.a(c, g, h, i);
   private static final wi l = wi.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c));
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auz.aC);
         return bof.b;
      }
   }

   @Nullable
   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return new bop(($$2x, $$3, $$4) -> new cmy($$2x, $$3, cnh.a($$1, $$2)), l);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      ij $$4 = $$0.c(b);
      return $$4.o() == ij.a.a ? j : k;
   }

   @Override
   protected void a(cgj $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, dpi $$3, cgj $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(czg $$0, id $$1, cgj $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public boy a(bqa $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static dpi e(dpi $$0) {
      if ($$0.a(dcj.gS)) {
         return dcj.gT.n().a(b, $$0.c(b));
      } else {
         return $$0.a(dcj.gT) ? dcj.gU.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   public int b(dpi $$0, cym $$1, id $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
