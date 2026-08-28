import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqj extends dwq implements dnh, dul {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final ece<jc> b = ebw.T;
   public static final ecg c = ebw.U;
   private final Function<ebg, fgm> g;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   protected dqj(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<ebg, fgm> q() {
      return this.a(this.a(b, c));
   }

   @Override
   public ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(ebg $$0, ddt $$1) {
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public ecg c() {
      return c;
   }

   @Override
   public ebg a(ddt $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return true;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new daa(this));
      }
   }
}
