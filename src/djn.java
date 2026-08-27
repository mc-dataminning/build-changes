import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class djn extends dis {
   @Nullable
   private volatile ebv n;
   private volatile dix o = dix.c;
   private final List<rz> p = Lists.newArrayList();
   private final Map<dmb.a, dir> q = new Object2ObjectArrayMap();
   @Nullable
   private dlt r;
   private final eks<cut> s;
   private final eks<ecf> t;

   public djn(cqz $$0, djq $$1, cru $$2, io<csq> $$3, @Nullable dni $$4) {
      this($$0, $$1, null, new eks<>(), new eks<>(), $$2, $$3, $$4);
   }

   public djn(cqz $$0, djq $$1, @Nullable dje[] $$2, eks<cut> $$3, eks<ecf> $$4, cru $$5, io<csq> $$6, @Nullable dni $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ekx<cut> o() {
      return this.s;
   }

   @Override
   public ekx<ecf> p() {
      return this.t;
   }

   @Override
   public dis.a q() {
      return new dis.a(this.s, this.t);
   }

   @Override
   public dgw a_(ht $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cuv.nb.o();
      } else {
         dje $$2 = this.b(this.e($$1));
         return $$2.c() ? cuv.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ecg b_(ht $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ech.a.g();
      } else {
         dje $$2 = this.b(this.e($$1));
         return $$2.c() ? ech.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dgw a(ht $$0, dgw $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dje $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cuv.a)) {
            return $$1;
         } else {
            int $$9 = iu.b($$3);
            int $$10 = iu.b($$4);
            int $$11 = iu.b($$5);
            dgw $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dix.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ebx.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dmf.a> $$14 = this.j().h();
            EnumSet<dmf.a> $$15 = null;

            for (dmf.a $$16 : $$14) {
               dmf $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dmf.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dmf.a(this, $$15);
            }

            for (dmf.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cuv.nb.o();
      }
   }

   @Override
   public void a(der $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public der c_(ht $$0) {
      return this.k.get($$0);
   }

   public Map<ht, der> D() {
      return this.k;
   }

   public void b(rz $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bki $$0) {
      if (!$$0.bN()) {
         rz $$1 = new rz();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dwv $$0, dxd $$1) {
      dlt $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dwn $$3 = $$1.a();
         cru $$4 = this.z();
         if ($$3.h() < $$4.I_() || $$3.k() >= $$4.aj()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<rz> E() {
      return this.p;
   }

   @Override
   public dix j() {
      return this.o;
   }

   public void a(dix $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ib<csq> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dix.f)) {
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

   public static ht a(short $$0, int $$1, cqz $$2) {
      int $$3 = iu.a($$2.e, $$0 & 15);
      int $$4 = iu.a($$1, $$0 >>> 4 & 15);
      int $$5 = iu.a($$2.f, $$0 >>> 8 & 15);
      return new ht($$3, $$4, $$5);
   }

   @Override
   public void e(ht $$0) {
      if (!this.r($$0)) {
         dis.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dis.a(this.b, $$1).add($$0);
   }

   public Map<ht, rz> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public rz g(ht $$0) {
      der $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(ht $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dir a(dmb.a $$0) {
      return this.q.get($$0);
   }

   public dir b(dmb.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dir(this.J_(), this.I_()));
   }

   public void a(dmb.a $$0, dir $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ebv $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dlt $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dlt x() {
      return this.r;
   }

   private static <T> ekp<T> a(eks<T> $$0) {
      return new ekp<>($$0.b());
   }

   public ekp<cut> G() {
      return a(this.s);
   }

   public ekp<ecf> H() {
      return a(this.t);
   }

   @Override
   public cru z() {
      return (cru)(this.y() ? dlt.b : this);
   }
}
