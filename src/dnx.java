import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dnx extends dle implements dkx, dry {
   public static final MapCodec<dnx> a = b(dnx::new);
   public static final dzk<jo> b = dzc.T;
   public static final dzm c = dzc.U;
   private final Function<dym, fdo> g;

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   protected dnx(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<dym, fdo> q() {
      return this.a(this.a(b, c));
   }

   @Override
   public dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(dym $$0, dbn $$1) {
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public dzm c() {
      return c;
   }

   @Override
   public dym a(dbn $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return true;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cxy(this));
      }
   }
}
