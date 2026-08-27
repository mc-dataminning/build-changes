import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class doa extends dnf {
   @Nullable
   private volatile egl n;
   private volatile dnk o = dnk.c;
   private final List<sw> p = Lists.newArrayList();
   private final Map<dqr.a, dne> q = new Object2ObjectArrayMap();
   @Nullable
   private dqj r;
   private final epo<cys> s;
   private final epo<egv> t;

   public doa(cuy $$0, dod $$1, cvt $$2, iv<cwq> $$3, @Nullable dry $$4) {
      this($$0, $$1, null, new epo<>(), new epo<>(), $$2, $$3, $$4);
   }

   public doa(cuy $$0, dod $$1, @Nullable dnr[] $$2, epo<cys> $$3, epo<egv> $$4, cvt $$5, iv<cwq> $$6, @Nullable dry $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ept<cys> o() {
      return this.s;
   }

   @Override
   public ept<egv> p() {
      return this.t;
   }

   @Override
   public dnf.a q() {
      return new dnf.a(this.s, this.t);
   }

   @Override
   public dlj a_(hz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cyu.nb.o();
      } else {
         dnr $$2 = this.b(this.e($$1));
         return $$2.c() ? cyu.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public egw b_(hz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return egx.a.g();
      } else {
         dnr $$2 = this.b(this.e($$1));
         return $$2.c() ? egx.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dlj a(hz $$0, dlj $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.ak()) {
         int $$6 = this.e($$4);
         dnr $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cyu.a)) {
            return $$1;
         } else {
            int $$9 = jb.b($$3);
            int $$10 = jb.b($$4);
            int $$11 = jb.b($$5);
            dlj $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dnk.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (egn.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dqv.a> $$14 = this.j().h();
            EnumSet<dqv.a> $$15 = null;

            for (dqv.a $$16 : $$14) {
               dqv $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dqv.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dqv.a(this, $$15);
            }

            for (dqv.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cyu.nb.o();
      }
   }

   @Override
   public void a(dix $$0) {
      this.k.put($$0.aE_(), $$0);
   }

   @Nullable
   @Override
   public dix c_(hz $$0) {
      return this.k.get($$0);
   }

   public Map<hz, dix> D() {
      return this.k;
   }

   public void b(sw $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bnq $$0) {
      if (!$$0.bO()) {
         sw $$1 = new sw();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ebl $$0, ebt $$1) {
      dqj $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         ebd $$3 = $$1.a();
         cvt $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.ak()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<sw> E() {
      return this.p;
   }

   @Override
   public dnk j() {
      return this.o;
   }

   public void a(dnk $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dnk.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short h(hz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static hz a(short $$0, int $$1, cuy $$2) {
      int $$3 = jb.a($$2.e, $$0 & 15);
      int $$4 = jb.a($$1, $$0 >>> 4 & 15);
      int $$5 = jb.a($$2.f, $$0 >>> 8 & 15);
      return new hz($$3, $$4, $$5);
   }

   @Override
   public void e(hz $$0) {
      if (!this.s($$0)) {
         dnf.a(this.b, this.e($$0.v())).add(h($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dnf.a(this.b, $$1).add($$0);
   }

   public Map<hz, sw> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sw g(hz $$0) {
      dix $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dne a(dqr.a $$0) {
      return this.q.get($$0);
   }

   public dne b(dqr.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dne(this.K_(), this.J_()));
   }

   public void a(dqr.a $$0, dne $$1) {
      this.q.put($$0, $$1);
   }

   public void a(egl $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dqj $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dqj x() {
      return this.r;
   }

   private static <T> epl<T> a(epo<T> $$0) {
      return new epl<>($$0.b());
   }

   public epl<cys> G() {
      return a(this.s);
   }

   public epl<egv> H() {
      return a(this.t);
   }

   @Override
   public cvt z() {
      return (cvt)(this.y() ? dqj.b : this);
   }
}
