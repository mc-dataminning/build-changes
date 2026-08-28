import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dka extends djq {
   public static final MapCodec<dka> a = b(dka::new);
   public static final dyk<jm> b = doc.aF;
   public static final dyk<dyb> c = dyd.W;
   public static final dye d = dyd.x;
   private static final fcm f = dke.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fcm g = dke.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fcm h = dke.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fcm i = dke.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fcm j = fcj.a(i, h);
   private static final fcm k = fcj.a(j, dke.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fcm l = fcj.a(j, dke.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcm m = fcj.a(j, dke.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fcm n = fcj.a(j, dke.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcm o = fcj.a(j, dke.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fcm G = fcj.a(j, dke.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fcm H = fcj.a(j, dke.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyb.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
      bvf $$4 = $$3.p();
      cps $$5 = $$4 instanceof cps ? (cps)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      return (bte)(this.a($$1, $$0, $$4, $$3, true) ? bte.a : bte.e);
   }

   public boolean a(dha $$0, dxn $$1, fbo $$2, @Nullable cps $$3, boolean $$4) {
      jm $$5 = $$2.c();
      jh $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(axp.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dxn $$0, jm $$1, double $$2) {
      if ($$1.o() != jm.a.b && !($$2 > 0.8124F)) {
         jm $$3 = $$0.c(b);
         dyb $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dha $$0, jh $$1, @Nullable jm $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bvf $$0, dha $$1, jh $$2, @Nullable jm $$3) {
      dup $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dun) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dun)$$4).a($$3);
         $$1.a(null, $$2, axf.bZ, axg.e, 2.0F, 1.0F);
         $$1.a($$0, ecj.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fcm o(dxn $$0) {
      jm $$1 = $$0.c(b);
      dyb $$2 = $$0.c(c);
      if ($$2 == dyb.a) {
         return $$1 != jm.c && $$1 != jm.d ? g : f;
      } else if ($$2 == dyb.b) {
         return H;
      } else if ($$2 == dyb.d) {
         return $$1 != jm.c && $$1 != jm.d ? l : k;
      } else if ($$1 == jm.c) {
         return o;
      } else if ($$1 == jm.d) {
         return G;
      } else {
         return $$1 == jm.f ? n : m;
      }
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.o($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.o($$0);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      dha $$3 = $$0.q();
      jm.a $$4 = $$1.o();
      if ($$4 == jm.a.b) {
         dxn $$5 = this.m().b(c, $$1 == jm.a ? dyb.b : dyb.a).b(b, $$0.g());
         if ($$5.a((dhd)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jm.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jm.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jm.e)
            || $$4 == jm.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jm.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jm.c);
         dxn $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dyb.d : dyb.c);
         if ($$7.a((dhd)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jm.b);
         $$7 = $$7.b(c, $$8 ? dyb.a : dyb.b);
         if ($$7.a((dhd)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      dyb $$8 = $$0.c(c);
      jm $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dyb.d) {
         return dkg.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dyb.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dyb.c).b(b, $$4.g());
            }

            if ($$8 == dyb.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dyb.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jm $$3 = q($$0).g();
      return $$3 == jm.b ? dke.a($$1, $$2.d(), jm.a) : dmz.b($$1, $$2, $$3);
   }

   private static jm q(dxn $$0) {
      switch ((dyb)$$0.c(c)) {
         case a:
            return jm.b;
         case b:
            return jm.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.F, $$0.C ? dun::a : dun::b);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   public dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
