import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dph extends dle implements dry {
   public static final MapCodec<dph> a = b(dph::new);
   public static final dzk<jo> b = dzc.T;
   private final Function<dym, fdo> c;

   public dph(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<dym, fdo> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<dph> a() {
      return a;
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
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   public fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.c.apply($$0);
   }

   @Override
   public dym a(dbn $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, this.c());
   }
}
