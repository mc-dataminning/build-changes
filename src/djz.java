import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class djz extends dje {
   @Nullable
   private volatile ech n;
   private volatile djj o = djj.c;
   private final List<rz> p = Lists.newArrayList();
   private final Map<dmn.a, djd> q = new Object2ObjectArrayMap();
   @Nullable
   private dmf r;
   private final ele<cva> s;
   private final ele<ecr> t;

   public djz(crh $$0, dkc $$1, csc $$2, io<csy> $$3, @Nullable dnu $$4) {
      this($$0, $$1, null, new ele<>(), new ele<>(), $$2, $$3, $$4);
   }

   public djz(crh $$0, dkc $$1, @Nullable djq[] $$2, ele<cva> $$3, ele<ecr> $$4, csc $$5, io<csy> $$6, @Nullable dnu $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public elj<cva> o() {
      return this.s;
   }

   @Override
   public elj<ecr> p() {
      return this.t;
   }

   @Override
   public dje.a q() {
      return new dje.a(this.s, this.t);
   }

   @Override
   public dhi a_(ht $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cvc.nb.o();
      } else {
         djq $$2 = this.b(this.e($$1));
         return $$2.c() ? cvc.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ecs b_(ht $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ect.a.g();
      } else {
         djq $$2 = this.b(this.e($$1));
         return $$2.c() ? ect.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dhi a(ht $$0, dhi $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.ak()) {
         int $$6 = this.e($$4);
         djq $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cvc.a)) {
            return $$1;
         } else {
            int $$9 = iu.b($$3);
            int $$10 = iu.b($$4);
            int $$11 = iu.b($$5);
            dhi $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(djj.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ecj.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dmr.a> $$14 = this.j().h();
            EnumSet<dmr.a> $$15 = null;

            for (dmr.a $$16 : $$14) {
               dmr $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dmr.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dmr.a(this, $$15);
            }

            for (dmr.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cvc.nb.o();
      }
   }

   @Override
   public void a(dfd $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public dfd c_(ht $$0) {
      return this.k.get($$0);
   }

   public Map<ht, dfd> D() {
      return this.k;
   }

   public void b(rz $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bkq $$0) {
      if (!$$0.bO()) {
         rz $$1 = new rz();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dxh $$0, dxp $$1) {
      dmf $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dwz $$3 = $$1.a();
         csc $$4 = this.z();
         if ($$3.h() < $$4.I_() || $$3.k() >= $$4.ak()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<rz> E() {
      return this.p;
   }

   @Override
   public djj j() {
      return this.o;
   }

   public void a(djj $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ib<csy> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(djj.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short j(ht $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ht a(short $$0, int $$1, crh $$2) {
      int $$3 = iu.a($$2.e, $$0 & 15);
      int $$4 = iu.a($$1, $$0 >>> 4 & 15);
      int $$5 = iu.a($$2.f, $$0 >>> 8 & 15);
      return new ht($$3, $$4, $$5);
   }

   @Override
   public void e(ht $$0) {
      if (!this.r($$0)) {
         dje.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dje.a(this.b, $$1).add($$0);
   }

   public Map<ht, rz> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public rz g(ht $$0) {
      dfd $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(ht $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public djd a(dmn.a $$0) {
      return this.q.get($$0);
   }

   public djd b(dmn.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new djd(this.J_(), this.I_()));
   }

   public void a(dmn.a $$0, djd $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ech $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dmf $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dmf x() {
      return this.r;
   }

   private static <T> elb<T> a(ele<T> $$0) {
      return new elb<>($$0.b());
   }

   public elb<cva> G() {
      return a(this.s);
   }

   public elb<ecr> H() {
      return a(this.t);
   }

   @Override
   public csc z() {
      return (csc)(this.y() ? dmf.b : this);
   }
}
