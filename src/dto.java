import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dto extends dtn {
   public static final MapCodec<dto> f = b(dto::new);
   public static final ecc<jb> g = drd.e;
   public static final ebv h = dtn.b;

   @Override
   public MapCodec<dto> a() {
      return f;
   }

   protected dto(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(g, jb.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return dwv.o($$0);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return dwv.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dne.a.m() : $$0;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = dne.cA.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(h)) {
         jb $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lt.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(djx $$0, iv $$1, ebe $$2) {
      jb $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected eyw a(djx $$0, ebe $$1) {
      return eys.a($$0, $$1.c(g).g(), jb.b);
   }
}
