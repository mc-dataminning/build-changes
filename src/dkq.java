import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkq extends dgh {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final duu b = duq.Q;
   public static final dur c = duq.f;
   private static final eyx d = dgv.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eyx e = dgv.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eyx f = eyu.a(e, d);
   private static final eyx g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final eyx h = eyu.a(f, g, eyi.e);
   private static final eyx i = eyu.a(h, dgv.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eyx j = eyu.a(h, dgv.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eyx k = eyu.a(h, dgv.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eyx l = eyu.a(h, dgv.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eyx m = eyu.a(h, dgv.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eyx n = g;
   private static final eyx o = eyu.a(g, dgv.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eyx F = eyu.a(g, dgv.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eyx G = eyu.a(g, dgv.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eyx H = eyu.a(g, dgv.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      switch ((jj)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2) {
      switch ((jj)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dua a(cyw $$0) {
      jj $$1 = $$0.k().g();
      return this.o().b(b, $$1.o() == jj.a.b ? jj.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? null : a($$2, drg.r, dsf::a);
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dsf $$5) {
         $$3.a($$5);
         $$3.a(awn.ad);
      }

      return brk.a;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dds $$0, je $$1, dua $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      brg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.a($$1.c_($$2));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      dre $$4 = $$1.c_($$2);
      if ($$4 instanceof dsf) {
         dsf.a($$1, $$2, $$0, $$3, (dsf)$$4);
      }
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
