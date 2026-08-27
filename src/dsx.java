import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dsx extends dsd {
   @Nullable
   private volatile elp n;
   private volatile dtc o = dtc.c;
   private final List<ua> p = Lists.newArrayList();
   private final Map<dvv.a, dsc> q = new Object2ObjectArrayMap();
   @Nullable
   private dvn r;
   private final eve<dde> s;
   private final eve<elz> t;

   public dsx(czk $$0, dta $$1, daf $$2, jj<dbc> $$3, @Nullable dxc $$4) {
      this($$0, $$1, null, new eve<>(), new eve<>(), $$2, $$3, $$4);
   }

   public dsx(czk $$0, dta $$1, @Nullable dso[] $$2, eve<dde> $$3, eve<elz> $$4, daf $$5, jj<dbc> $$6, @Nullable dxc $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public evj<dde> o() {
      return this.s;
   }

   @Override
   public evj<elz> p() {
      return this.t;
   }

   @Override
   public dsd.a q() {
      return new dsd.a(this.s, this.t);
   }

   @Override
   public dqh a_(in $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ddg.nb.n();
      } else {
         dso $$2 = this.b(this.e($$1));
         return $$2.c() ? ddg.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ema b_(in $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return emb.a.g();
      } else {
         dso $$2 = this.b(this.e($$1));
         return $$2.c() ? emb.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dqh a(in $$0, dqh $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dso $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(ddg.a)) {
            return $$1;
         } else {
            int $$9 = jp.b($$3);
            int $$10 = jp.b($$4);
            int $$11 = jp.b($$5);
            dqh $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dtc.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (elr.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dvz.a> $$14 = this.j().h();
            EnumSet<dvz.a> $$15 = null;

            for (dvz.a $$16 : $$14) {
               dvz $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dvz.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dvz.a(this, $$15);
            }

            for (dvz.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return ddg.nb.n();
      }
   }

   @Override
   public void a(dnm $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dnm c_(in $$0) {
      return this.k.get($$0);
   }

   public Map<in, dnm> D() {
      return this.k;
   }

   public void b(ua $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(brh $$0) {
      if (!$$0.bP()) {
         ua $$1 = new ua();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(egp $$0, egx $$1) {
      dvn $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         egh $$3 = $$1.a();
         daf $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ua> E() {
      return this.p;
   }

   @Override
   public dtc j() {
      return this.o;
   }

   public void a(dtc $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public iw<dbc> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dtc.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(in $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static in a(short $$0, int $$1, czk $$2) {
      int $$3 = jp.a($$2.e, $$0 & 15);
      int $$4 = jp.a($$1, $$0 >>> 4 & 15);
      int $$5 = jp.a($$2.f, $$0 >>> 8 & 15);
      return new in($$3, $$4, $$5);
   }

   @Override
   public void e(in $$0) {
      if (!this.s($$0)) {
         dsd.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dsd.a(this.b, $$1).add($$0);
   }

   public Map<in, ua> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ua a(in $$0, iy.a $$1) {
      dnm $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(in $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dsc a(dvv.a $$0) {
      return this.q.get($$0);
   }

   public dsc b(dvv.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dsc(this.J_(), this.I_()));
   }

   public void a(dvv.a $$0, dsc $$1) {
      this.q.put($$0, $$1);
   }

   public void a(elp $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dvn $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dvn x() {
      return this.r;
   }

   private static <T> evb<T> a(eve<T> $$0) {
      return new evb<>($$0.b());
   }

   public evb<dde> G() {
      return a(this.s);
   }

   public evb<elz> H() {
      return a(this.t);
   }

   @Override
   public daf z() {
      return (daf)(this.y() ? dvn.b : this);
   }
}
