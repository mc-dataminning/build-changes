import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ebd extends eaj {
   @Nullable
   private volatile eui n;
   private volatile ebk o = ebk.c;
   private final List<tw> p = Lists.newArrayList();
   @Nullable
   private eai q;
   @Nullable
   private edz r;
   private final fek<dku> s;
   private final fek<eus> t;

   public ebd(dgw $$0, ebg $$1, dhr $$2, kf<dis> $$3, @Nullable efo $$4) {
      this($$0, $$1, null, new fek<>(), new fek<>(), $$2, $$3, $$4);
   }

   public ebd(dgw $$0, ebg $$1, @Nullable eau[] $$2, fek<dku> $$3, fek<eus> $$4, dhr $$5, kf<dis> $$6, @Nullable efo $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fep<dku> q() {
      return this.s;
   }

   @Override
   public fep<eus> r() {
      return this.t;
   }

   @Override
   public eaj.a a(long $$0) {
      return new eaj.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dym a_(jj $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dkw.nD.m();
      } else {
         eau $$2 = this.b(this.f($$1));
         return $$2.c() ? dkw.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eut b_(jj $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return euu.a.g();
      } else {
         eau $$2 = this.b(this.f($$1));
         return $$2.c() ? euu.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dym a(jj $$0, dym $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dkw.nD.m();
      } else {
         int $$6 = this.f($$4);
         eau $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dkw.a)) {
            return $$1;
         } else {
            int $$9 = kl.b($$3);
            int $$10 = kl.b($$4);
            int $$11 = kl.b($$5);
            dym $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(ebk.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (euk.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<eel.a> $$14 = this.n().e();
            EnumSet<eel.a> $$15 = null;

            for (eel.a $$16 : $$14) {
               eel $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(eel.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               eel.a(this, $$15);
            }

            for (eel.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dvl $$0) {
      this.j.remove($$0.aw_());
      this.k.put($$0.aw_(), $$0);
   }

   @Nullable
   @Override
   public dvl c_(jj $$0) {
      return this.k.get($$0);
   }

   public Map<jj, dvl> H() {
      return this.k;
   }

   public void b(tw $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bvs $$0) {
      if (!$$0.bZ()) {
         tw $$1 = new tw();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(epg $$0, epo $$1) {
      edz $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         eoy $$3 = $$1.a();
         dhr $$4 = this.B();
         if ($$3.i() < $$4.G_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tw> I() {
      return this.p;
   }

   @Override
   public ebk n() {
      return this.o;
   }

   public void a(ebk $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public js<dis> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(ebk.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jj $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jj a(short $$0, int $$1, dgw $$2) {
      int $$3 = kl.a($$2.h, $$0 & 15);
      int $$4 = kl.a($$1, $$0 >>> 4 & 15);
      int $$5 = kl.a($$2.i, $$0 >>> 8 & 15);
      return new jj($$3, $$4, $$5);
   }

   @Override
   public void e(jj $$0) {
      if (!this.s($$0)) {
         eaj.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      eaj.a(this.b, $$1).addAll($$0);
   }

   public Map<jj, tw> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tw a(jj $$0, ju.a $$1) {
      dvl $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jj $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public eai E() {
      return this.q;
   }

   public eai F() {
      if (this.q == null) {
         this.q = new eai(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(eai $$0) {
      this.q = $$0;
   }

   public void a(eui $$0) {
      this.n = $$0;
   }

   public void a(@Nullable edz $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public edz z() {
      return this.r;
   }

   private static <T> feh<T> a(fek<T> $$0) {
      return new feh<>($$0.b());
   }

   public feh<dku> K() {
      return a(this.s);
   }

   public feh<eus> L() {
      return a(this.t);
   }

   @Override
   public dhr B() {
      return (dhr)(this.A() ? edz.b : this);
   }
}
