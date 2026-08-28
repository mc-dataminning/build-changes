import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dka extends dkg {
   public static final MapCodec<dka> a = b(dka::new);
   public static final dzk<jo> b = dzc.R;
   public static final dzd c = dzc.y;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1 instanceof arn $$5 && $$1.c_($$2) instanceof dvd $$6) {
         $$3.a($$6);
         $$3.a(awu.ar);
         coy.a($$5, $$3, true);
      }

      return btq.a;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      dvl $$4 = $$1.c_($$2);
      if ($$4 instanceof dvd) {
         ((dvd)$$4).k();
      }
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvd($$0, $$1);
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.a($$1.c_($$2));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
