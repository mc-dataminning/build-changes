import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqh extends dwo implements dnf, duj {
   public static final MapCodec<dqh> a = b(dqh::new);
   public static final ecc<jb> b = ebu.T;
   public static final ece c = ebu.U;
   private final Function<ebe, fgk> g;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   protected dqh(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<ebe, fgk> q() {
      return this.a(this.a(b, c));
   }

   @Override
   public ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(ebe $$0, ddr $$1) {
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public ece c() {
      return c;
   }

   @Override
   public ebe a(ddr $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return true;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new czy(this));
      }
   }
}
