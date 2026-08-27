import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dke extends djj {
   @Nullable
   private volatile ecm n;
   private volatile djo o = djo.c;
   private final List<sd> p = Lists.newArrayList();
   private final Map<dms.a, dji> q = new Object2ObjectArrayMap();
   @Nullable
   private dmk r;
   private final elj<cvf> s;
   private final elj<ecw> t;

   public dke(crm $$0, dkh $$1, csh $$2, is<ctd> $$3, @Nullable dnz $$4) {
      this($$0, $$1, null, new elj<>(), new elj<>(), $$2, $$3, $$4);
   }

   public dke(crm $$0, dkh $$1, @Nullable djv[] $$2, elj<cvf> $$3, elj<ecw> $$4, csh $$5, is<ctd> $$6, @Nullable dnz $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public elo<cvf> o() {
      return this.s;
   }

   @Override
   public elo<ecw> p() {
      return this.t;
   }

   @Override
   public djj.a q() {
      return new djj.a(this.s, this.t);
   }

   @Override
   public dhn a_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cvh.nb.o();
      } else {
         djv $$2 = this.b(this.e($$1));
         return $$2.c() ? cvh.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ecx b_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ecy.a.g();
      } else {
         djv $$2 = this.b(this.e($$1));
         return $$2.c() ? ecy.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dhn a(hx $$0, dhn $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.ak()) {
         int $$6 = this.e($$4);
         djv $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cvh.a)) {
            return $$1;
         } else {
            int $$9 = iy.b($$3);
            int $$10 = iy.b($$4);
            int $$11 = iy.b($$5);
            dhn $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(djo.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eco.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dmw.a> $$14 = this.j().h();
            EnumSet<dmw.a> $$15 = null;

            for (dmw.a $$16 : $$14) {
               dmw $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dmw.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dmw.a(this, $$15);
            }

            for (dmw.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cvh.nb.o();
      }
   }

   @Override
   public void a(dfi $$0) {
      this.k.put($$0.aC_(), $$0);
   }

   @Nullable
   @Override
   public dfi c_(hx $$0) {
      return this.k.get($$0);
   }

   public Map<hx, dfi> D() {
      return this.k;
   }

   public void b(sd $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bkv $$0) {
      if (!$$0.bO()) {
         sd $$1 = new sd();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dxm $$0, dxu $$1) {
      dmk $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dxe $$3 = $$1.a();
         csh $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.ak()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<sd> E() {
      return this.p;
   }

   @Override
   public djo j() {
      return this.o;
   }

   public void a(djo $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(djo.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short j(hx $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static hx a(short $$0, int $$1, crm $$2) {
      int $$3 = iy.a($$2.e, $$0 & 15);
      int $$4 = iy.a($$1, $$0 >>> 4 & 15);
      int $$5 = iy.a($$2.f, $$0 >>> 8 & 15);
      return new hx($$3, $$4, $$5);
   }

   @Override
   public void e(hx $$0) {
      if (!this.r($$0)) {
         djj.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      djj.a(this.b, $$1).add($$0);
   }

   public Map<hx, sd> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sd g(hx $$0) {
      dfi $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hx $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dji a(dms.a $$0) {
      return this.q.get($$0);
   }

   public dji b(dms.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dji(this.K_(), this.J_()));
   }

   public void a(dms.a $$0, dji $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ecm $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dmk $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dmk x() {
      return this.r;
   }

   private static <T> elg<T> a(elj<T> $$0) {
      return new elg<>($$0.b());
   }

   public elg<cvf> G() {
      return a(this.s);
   }

   public elg<ecw> H() {
      return a(this.t);
   }

   @Override
   public csh z() {
      return (csh)(this.y() ? dmk.b : this);
   }
}
