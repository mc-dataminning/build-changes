import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dyk extends dxq {
   @Nullable
   private volatile erk o;
   private volatile dyr p = dyr.c;
   private final List<ul> q = Lists.newArrayList();
   @Nullable
   private dxp r;
   @Nullable
   private ebe s;
   private final fbo<diq> t;
   private final fbo<eru> u;

   public dyk(des $$0, dyn $$1, dfo $$2, kd<dgo> $$3, @Nullable ect $$4) {
      this($$0, $$1, null, new fbo<>(), new fbo<>(), $$2, $$3, $$4);
   }

   public dyk(des $$0, dyn $$1, @Nullable dyb[] $$2, fbo<diq> $$3, fbo<eru> $$4, dfo $$5, kd<dgo> $$6, @Nullable ect $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.t = $$3;
      this.u = $$4;
   }

   @Override
   public fbt<diq> o() {
      return this.t;
   }

   @Override
   public fbt<eru> p() {
      return this.u;
   }

   @Override
   public dxq.a a(long $$0) {
      return new dxq.a(this.t.a($$0), this.u.a($$0));
   }

   @Override
   public dvv a_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dis.nb.m();
      } else {
         dyb $$2 = this.b(this.f($$1));
         return $$2.c() ? dis.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public erv b_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return erw.a.g();
      } else {
         dyb $$2 = this.b(this.f($$1));
         return $$2.c() ? erw.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dvv a(jh $$0, dvv $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dis.nb.m();
      } else {
         int $$6 = this.f($$4);
         dyb $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dis.a)) {
            return $$1;
         } else {
            int $$9 = kj.b($$3);
            int $$10 = kj.b($$4);
            int $$11 = kj.b($$5);
            dvv $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.p.a(dyr.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.o.a($$0, $$13);
               }

               if (erm.a($$12, $$1)) {
                  this.j.a(this, $$9, $$4, $$11);
                  this.o.a($$0);
               }
            }

            EnumSet<ebq.a> $$14 = this.j().e();
            EnumSet<ebq.a> $$15 = null;

            for (ebq.a $$16 : $$14) {
               ebq $$17 = this.i.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ebq.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ebq.a(this, $$15);
            }

            for (ebq.a $$18 : $$14) {
               this.i.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dsy $$0) {
      this.l.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dsy c_(jh $$0) {
      return this.l.get($$0);
   }

   public Map<jh, dsy> E() {
      return this.l;
   }

   public void b(ul $$0) {
      this.q.add($$0);
   }

   @Override
   public void a(bul $$0) {
      if (!$$0.bZ()) {
         ul $$1 = new ul();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(emi $$0, emq $$1) {
      ebe $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         ema $$3 = $$1.a();
         dfo $$4 = this.y();
         if ($$3.i() < $$4.K_() || $$3.l() > $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ul> F() {
      return this.q;
   }

   @Override
   public dyr j() {
      return this.p;
   }

   public void a(dyr $$0) {
      this.p = $$0;
      if (this.s != null && $$0.a(this.s.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jq<dgo> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().a(dyr.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jh $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jh a(short $$0, int $$1, des $$2) {
      int $$3 = kj.a($$2.g, $$0 & 15);
      int $$4 = kj.a($$1, $$0 >>> 4 & 15);
      int $$5 = kj.a($$2.h, $$0 >>> 8 & 15);
      return new jh($$3, $$4, $$5);
   }

   @Override
   public void e(jh $$0) {
      if (!this.s($$0)) {
         dxq.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dxq.a(this.b, $$1).addAll($$0);
   }

   public Map<jh, ul> G() {
      return Collections.unmodifiableMap(this.k);
   }

   @Nullable
   @Override
   public ul a(jh $$0, js.a $$1) {
      dsy $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.k.get($$0);
   }

   @Override
   public void d(jh $$0) {
      this.l.remove($$0);
      this.k.remove($$0);
   }

   @Nullable
   public dxp B() {
      return this.r;
   }

   public dxp C() {
      if (this.r == null) {
         this.r = new dxp(this.L_(), this.K_());
      }

      return this.r;
   }

   public void a(dxp $$0) {
      this.r = $$0;
   }

   public void a(erk $$0) {
      this.o = $$0;
   }

   public void a(@Nullable ebe $$0) {
      this.s = $$0;
   }

   @Nullable
   @Override
   public ebe w() {
      return this.s;
   }

   private static <T> fbl<T> a(fbo<T> $$0) {
      return new fbl<>($$0.b());
   }

   public fbl<diq> H() {
      return a(this.t);
   }

   public fbl<eru> I() {
      return a(this.u);
   }

   @Override
   public dfo y() {
      return (dfo)(this.x() ? ebe.b : this);
   }
}
