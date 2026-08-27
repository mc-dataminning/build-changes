import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxt extends ctm {
   public static final MapCodec<cxt> a = b(cxt::new);
   public static final dgv b = dgr.Q;
   public static final dgs c = dgr.f;
   private static final eiy d = cua.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy e = cua.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eiy f = eiv.a(e, d);
   private static final eiy g = eiv.a(f, deu.c, eij.e);
   private static final eiy h = eiv.a(g, cua.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eiy i = eiv.a(g, cua.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eiy j = eiv.a(g, cua.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eiy k = eiv.a(g, cua.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eiy l = eiv.a(g, cua.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eiy m = deu.c;
   private static final eiy n = eiv.a(deu.c, cua.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eiy o = eiv.a(deu.c, cua.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eiy F = eiv.a(deu.c, cua.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eiy G = eiv.a(deu.c, cua.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<cxt> a() {
      return a;
   }

   public cxt(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      switch ((hx)$$0.c(b)) {
         case a:
            return h;
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         case f:
            return i;
         default:
            return g;
      }
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2) {
      switch ((hx)$$0.c(b)) {
         case a:
            return m;
         case c:
            return o;
         case d:
            return F;
         case e:
            return G;
         case f:
            return n;
         default:
            return deu.c;
      }
   }

   @Override
   public dgb a(cmr $$0) {
      hx $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == hx.a.b ? hx.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dev($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$0.B ? null : a($$2, ddz.r, dev::a);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof dev) {
            ((dev)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         ddx $$6 = $$1.c_($$2);
         if ($$6 instanceof dev) {
            $$3.a((dev)$$6);
            $$3.a(aqn.ad);
         }

         return bib.b;
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cqz $$0, ht $$1, dgb $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      bhx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return cfp.a($$1.c_($$2));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      ddx $$4 = $$1.c_($$2);
      if ($$4 instanceof dev) {
         dev.a($$1, $$2, $$0, $$3, (dev)$$4);
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
