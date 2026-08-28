import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dun extends dtt {
   @Nullable
   private volatile enf n;
   private volatile dus o = dus.c;
   private final List<ur> p = Lists.newArrayList();
   private final Map<dxl.a, dts> q = new Object2ObjectArrayMap();
   @Nullable
   private dxd r;
   private final exb<deu> s;
   private final exb<enp> t;

   public dun(dba $$0, duq $$1, dbv $$2, jv<dcs> $$3, @Nullable dys $$4) {
      this($$0, $$1, null, new exb<>(), new exb<>(), $$2, $$3, $$4);
   }

   public dun(dba $$0, duq $$1, @Nullable due[] $$2, exb<deu> $$3, exb<enp> $$4, dbv $$5, jv<dcs> $$6, @Nullable dys $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public exg<deu> o() {
      return this.s;
   }

   @Override
   public exg<enp> p() {
      return this.t;
   }

   @Override
   public dtt.a q() {
      return new dtt.a(this.s, this.t);
   }

   @Override
   public drx a_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dew.nb.n();
      } else {
         due $$2 = this.b(this.e($$1));
         return $$2.c() ? dew.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public enq b_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return enr.a.g();
      } else {
         due $$2 = this.b(this.e($$1));
         return $$2.c() ? enr.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public drx a(iz $$0, drx $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         due $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dew.a)) {
            return $$1;
         } else {
            int $$9 = kb.b($$3);
            int $$10 = kb.b($$4);
            int $$11 = kb.b($$5);
            drx $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dus.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (enh.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dxp.a> $$14 = this.j().h();
            EnumSet<dxp.a> $$15 = null;

            for (dxp.a $$16 : $$14) {
               dxp $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dxp.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dxp.a(this, $$15);
            }

            for (dxp.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dew.nb.n();
      }
   }

   @Override
   public void a(dpc $$0) {
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public dpc c_(iz $$0) {
      return this.k.get($$0);
   }

   public Map<iz, dpc> D() {
      return this.k;
   }

   public void b(ur $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsp $$0) {
      if (!$$0.bR()) {
         ur $$1 = new ur();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eif $$0, ein $$1) {
      dxd $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         ehx $$3 = $$1.a();
         dbv $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ur> E() {
      return this.p;
   }

   @Override
   public dus j() {
      return this.o;
   }

   public void a(dus $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dus.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(iz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static iz a(short $$0, int $$1, dba $$2) {
      int $$3 = kb.a($$2.e, $$0 & 15);
      int $$4 = kb.a($$1, $$0 >>> 4 & 15);
      int $$5 = kb.a($$2.f, $$0 >>> 8 & 15);
      return new iz($$3, $$4, $$5);
   }

   @Override
   public void e(iz $$0) {
      if (!this.s($$0)) {
         dtt.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dtt.a(this.b, $$1).add($$0);
   }

   public Map<iz, ur> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ur a(iz $$0, jk.a $$1) {
      dpc $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dts a(dxl.a $$0) {
      return this.q.get($$0);
   }

   public dts b(dxl.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dts(this.J_(), this.I_()));
   }

   public void a(dxl.a $$0, dts $$1) {
      this.q.put($$0, $$1);
   }

   public void a(enf $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxd $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxd x() {
      return this.r;
   }

   private static <T> ewy<T> a(exb<T> $$0) {
      return new ewy<>($$0.b());
   }

   public ewy<deu> G() {
      return a(this.s);
   }

   public ewy<enp> H() {
      return a(this.t);
   }

   @Override
   public dbv z() {
      return (dbv)(this.y() ? dxd.b : this);
   }
}
