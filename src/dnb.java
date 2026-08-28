import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnb extends dna {
   public static final MapCodec<dnb> h = b(dnb::new);
   public static final duu i = dkr.aE;
   public static final dur j = dna.d;

   @Override
   public MapCodec<dnb> a() {
      return h;
   }

   protected dnb(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(i, jj.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return dpy.o($$0);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return dpy.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dgx.a.o() : $$0;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = dgx.cq.a($$0);
      return $$1 == null ? null : this.o().b(i, $$1.c(i));
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(j)) {
         jj $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(li.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dds $$0, je $$1, dua $$2) {
      jj $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected erj a(dds $$0, dua $$1) {
      return erf.a($$0, $$1.c(i).g(), jj.b);
   }
}
