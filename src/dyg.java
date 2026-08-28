import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dyg extends dmy {
   public static final MapCodec<dyg> b = b(dyg::new);
   public static final dzk<dzo> c = dzc.bj;
   public static final dzd d = dzc.B;
   public static final int e = 4;
   private static final fdo f = dku.c(16.0, 0.0, 4.0);
   private static final Map<jo, fdo> g = fdl.d(fdl.a(f, dku.c(4.0, 4.0, 16.0)));
   private static final Map<jo, fdo> h = fdl.d(fdl.a(f, dku.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<dyg> a() {
      return b;
   }

   public dyg(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jo.c).b(c, dzo.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(dym $$0, dym $$1) {
      dku $$2 = $$0.c(c) == dzo.a ? dkw.bF : dkw.by;
      return $$1.a($$2) && $$1.c(dyf.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if (!$$0.C && $$3.gk()) {
         jj $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      jj $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dkw.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$0.a((dhs)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, evx.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy($$2.c(c) == dzo.b ? dkw.by : dkw.bF);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
