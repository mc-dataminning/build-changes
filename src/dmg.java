import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dmg extends dll {
   @Nullable
   private volatile eeo n;
   private volatile dlq o = dlq.c;
   private final List<so> p = Lists.newArrayList();
   private final Map<dou.a, dlk> q = new Object2ObjectArrayMap();
   @Nullable
   private dom r;
   private final enr<cwy> s;
   private final enr<eey> t;

   public dmg(cte $$0, dmj $$1, ctz $$2, it<cuw> $$3, @Nullable dqb $$4) {
      this($$0, $$1, null, new enr<>(), new enr<>(), $$2, $$3, $$4);
   }

   public dmg(cte $$0, dmj $$1, @Nullable dlx[] $$2, enr<cwy> $$3, enr<eey> $$4, ctz $$5, it<cuw> $$6, @Nullable dqb $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public enw<cwy> o() {
      return this.s;
   }

   @Override
   public enw<eey> p() {
      return this.t;
   }

   @Override
   public dll.a q() {
      return new dll.a(this.s, this.t);
   }

   @Override
   public djp a_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cxa.nb.o();
      } else {
         dlx $$2 = this.b(this.e($$1));
         return $$2.c() ? cxa.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eez b_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return efa.a.g();
      } else {
         dlx $$2 = this.b(this.e($$1));
         return $$2.c() ? efa.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public djp a(hx $$0, djp $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dlx $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cxa.a)) {
            return $$1;
         } else {
            int $$9 = iz.b($$3);
            int $$10 = iz.b($$4);
            int $$11 = iz.b($$5);
            djp $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dlq.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eeq.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<doy.a> $$14 = this.j().h();
            EnumSet<doy.a> $$15 = null;

            for (doy.a $$16 : $$14) {
               doy $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(doy.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               doy.a(this, $$15);
            }

            for (doy.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cxa.nb.o();
      }
   }

   @Override
   public void a(dhd $$0) {
      this.k.put($$0.aE_(), $$0);
   }

   @Nullable
   @Override
   public dhd c_(hx $$0) {
      return this.k.get($$0);
   }

   public Map<hx, dhd> D() {
      return this.k;
   }

   public void b(so $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(blw $$0) {
      if (!$$0.bO()) {
         so $$1 = new so();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dzo $$0, dzw $$1) {
      dom $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dzg $$3 = $$1.a();
         ctz $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<so> E() {
      return this.p;
   }

   @Override
   public dlq j() {
      return this.o;
   }

   public void a(dlq $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ih<cuw> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dlq.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short h(hx $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static hx a(short $$0, int $$1, cte $$2) {
      int $$3 = iz.a($$2.e, $$0 & 15);
      int $$4 = iz.a($$1, $$0 >>> 4 & 15);
      int $$5 = iz.a($$2.f, $$0 >>> 8 & 15);
      return new hx($$3, $$4, $$5);
   }

   @Override
   public void e(hx $$0) {
      if (!this.s($$0)) {
         dll.a(this.b, this.e($$0.v())).add(h($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dll.a(this.b, $$1).add($$0);
   }

   public Map<hx, so> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public so g(hx $$0) {
      dhd $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hx $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dlk a(dou.a $$0) {
      return this.q.get($$0);
   }

   public dlk b(dou.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dlk(this.K_(), this.J_()));
   }

   public void a(dou.a $$0, dlk $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eeo $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dom $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dom x() {
      return this.r;
   }

   private static <T> eno<T> a(enr<T> $$0) {
      return new eno<>($$0.b());
   }

   public eno<cwy> G() {
      return a(this.s);
   }

   public eno<eey> H() {
      return a(this.t);
   }

   @Override
   public ctz z() {
      return (ctz)(this.y() ? dom.b : this);
   }
}
