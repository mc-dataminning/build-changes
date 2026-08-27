import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dly extends dld {
   @Nullable
   private volatile eeg n;
   private volatile dli o = dli.c;
   private final List<sn> p = Lists.newArrayList();
   private final Map<dom.a, dlc> q = new Object2ObjectArrayMap();
   @Nullable
   private doe r;
   private final eni<cwq> s;
   private final eni<eeq> t;

   public dly(csw $$0, dmb $$1, ctr $$2, it<cuo> $$3, @Nullable dpt $$4) {
      this($$0, $$1, null, new eni<>(), new eni<>(), $$2, $$3, $$4);
   }

   public dly(csw $$0, dmb $$1, @Nullable dlp[] $$2, eni<cwq> $$3, eni<eeq> $$4, ctr $$5, it<cuo> $$6, @Nullable dpt $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public enn<cwq> o() {
      return this.s;
   }

   @Override
   public enn<eeq> p() {
      return this.t;
   }

   @Override
   public dld.a q() {
      return new dld.a(this.s, this.t);
   }

   @Override
   public djh a_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cws.nb.o();
      } else {
         dlp $$2 = this.b(this.e($$1));
         return $$2.c() ? cws.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eer b_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ees.a.g();
      } else {
         dlp $$2 = this.b(this.e($$1));
         return $$2.c() ? ees.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public djh a(hx $$0, djh $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dlp $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cws.a)) {
            return $$1;
         } else {
            int $$9 = iz.b($$3);
            int $$10 = iz.b($$4);
            int $$11 = iz.b($$5);
            djh $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dli.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eei.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<doq.a> $$14 = this.j().h();
            EnumSet<doq.a> $$15 = null;

            for (doq.a $$16 : $$14) {
               doq $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(doq.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               doq.a(this, $$15);
            }

            for (doq.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cws.nb.o();
      }
   }

   @Override
   public void a(dgv $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dgv c_(hx $$0) {
      return this.k.get($$0);
   }

   public Map<hx, dgv> D() {
      return this.k;
   }

   public void b(sn $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(blv $$0) {
      if (!$$0.bO()) {
         sn $$1 = new sn();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dzg $$0, dzo $$1) {
      doe $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dyy $$3 = $$1.a();
         ctr $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<sn> E() {
      return this.p;
   }

   @Override
   public dli j() {
      return this.o;
   }

   public void a(dli $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ih<cuo> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dli.f)) {
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

   public static hx a(short $$0, int $$1, csw $$2) {
      int $$3 = iz.a($$2.e, $$0 & 15);
      int $$4 = iz.a($$1, $$0 >>> 4 & 15);
      int $$5 = iz.a($$2.f, $$0 >>> 8 & 15);
      return new hx($$3, $$4, $$5);
   }

   @Override
   public void e(hx $$0) {
      if (!this.s($$0)) {
         dld.a(this.b, this.e($$0.v())).add(h($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dld.a(this.b, $$1).add($$0);
   }

   public Map<hx, sn> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sn g(hx $$0) {
      dgv $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hx $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dlc a(dom.a $$0) {
      return this.q.get($$0);
   }

   public dlc b(dom.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dlc(this.K_(), this.J_()));
   }

   public void a(dom.a $$0, dlc $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eeg $$0) {
      this.n = $$0;
   }

   public void a(@Nullable doe $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public doe x() {
      return this.r;
   }

   private static <T> enf<T> a(eni<T> $$0) {
      return new enf<>($$0.b());
   }

   public enf<cwq> G() {
      return a(this.s);
   }

   public enf<eeq> H() {
      return a(this.t);
   }

   @Override
   public ctr z() {
      return (ctr)(this.y() ? doe.b : this);
   }
}
