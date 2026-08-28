import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class drr extends dwo implements duj {
   public static final MapCodec<drr> a = b(drr::new);
   public static final ecc<jb> b = ebu.T;
   private final Function<ebe, fgk> c;

   public drr(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<ebe, fgk> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<drr> a() {
      return a;
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
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jb.b);
   }

   @Override
   public fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.c.apply($$0);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, this.c());
   }
}
