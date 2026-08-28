import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edk extends ecq {
   @Nullable
   private volatile ewp n;
   private volatile edr o = edr.c;
   private final List<tz> p = Lists.newArrayList();
   @Nullable
   private ecp q;
   @Nullable
   private egg r;
   private final fgs<dmr> s;
   private final fgs<ewz> t;

   public edk(dir $$0, edn $$1, djo $$2, js<dkp> $$3, @Nullable ehv $$4) {
      this($$0, $$1, null, new fgs<>(), new fgs<>(), $$2, $$3, $$4);
   }

   public edk(dir $$0, edn $$1, @Nullable edb[] $$2, fgs<dmr> $$3, fgs<ewz> $$4, djo $$5, js<dkp> $$6, @Nullable ehv $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fgx<dmr> q() {
      return this.s;
   }

   @Override
   public fgx<ewz> r() {
      return this.t;
   }

   @Override
   public ecq.a a(long $$0) {
      return new ecq.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public eat a_(iv $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dmt.nH.m();
      } else {
         edb $$2 = this.b(this.f($$1));
         return $$2.c() ? dmt.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public exa b_(iv $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return exb.a.g();
      } else {
         edb $$2 = this.b(this.f($$1));
         return $$2.c() ? exb.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public eat a(iv $$0, eat $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dmt.nH.m();
      } else {
         int $$6 = this.f($$4);
         edb $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dmt.a)) {
            return $$1;
         } else {
            int $$9 = jy.b($$3);
            int $$10 = jy.b($$4);
            int $$11 = jy.b($$5);
            eat $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(edr.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ewr.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<egs.a> $$14 = this.n().e();
            EnumSet<egs.a> $$15 = null;

            for (egs.a $$16 : $$14) {
               egs $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(egs.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               egs.a(this, $$15);
            }

            for (egs.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dxr $$0) {
      this.j.remove($$0.ax_());
      this.k.put($$0.ax_(), $$0);
   }

   @Nullable
   @Override
   public dxr c_(iv $$0) {
      return this.k.get($$0);
   }

   public Map<iv, dxr> H() {
      return this.k;
   }

   public void b(tz $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bwi $$0) {
      if (!$$0.bX()) {
         tz $$1 = new tz();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ern $$0, erv $$1) {
      egg $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         erf $$3 = $$1.a();
         djo $$4 = this.B();
         if ($$3.i() < $$4.G_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tz> I() {
      return this.p;
   }

   @Override
   public edr n() {
      return this.o;
   }

   public void a(edr $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jf<dkp> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(edr.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iv a(short $$0, int $$1, dir $$2) {
      int $$3 = jy.a($$2.h, $$0 & 15);
      int $$4 = jy.a($$1, $$0 >>> 4 & 15);
      int $$5 = jy.a($$2.i, $$0 >>> 8 & 15);
      return new iv($$3, $$4, $$5);
   }

   @Override
   public void e(iv $$0) {
      if (!this.t($$0)) {
         ecq.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      ecq.a(this.b, $$1).addAll($$0);
   }

   public Map<iv, tz> J() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tz a(iv $$0, jh.a $$1) {
      dxr $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iv $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public ecp E() {
      return this.q;
   }

   public ecp F() {
      if (this.q == null) {
         this.q = new ecp(this.H_(), this.G_());
      }

      return this.q;
   }

   public void a(ecp $$0) {
      this.q = $$0;
   }

   public void a(ewp $$0) {
      this.n = $$0;
   }

   public void a(@Nullable egg $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public egg z() {
      return this.r;
   }

   private static <T> fgp<T> a(fgs<T> $$0) {
      return new fgp<>($$0.b());
   }

   public fgp<dmr> K() {
      return a(this.s);
   }

   public fgp<ewz> L() {
      return a(this.t);
   }

   @Override
   public djo B() {
      return (djo)(this.A() ? egg.b : this);
   }
}
