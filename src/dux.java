import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dux extends dud {
   @Nullable
   private volatile enq n;
   private volatile dvc o = dvc.c;
   private final List<tx> p = Lists.newArrayList();
   private final Map<dxv.a, duc> q = new Object2ObjectArrayMap();
   @Nullable
   private dxn r;
   private final exo<dff> s;
   private final exo<eoa> t;

   public dux(dbk $$0, dva $$1, dcf $$2, jw<ddd> $$3, @Nullable dzc $$4) {
      this($$0, $$1, null, new exo<>(), new exo<>(), $$2, $$3, $$4);
   }

   public dux(dbk $$0, dva $$1, @Nullable duo[] $$2, exo<dff> $$3, exo<eoa> $$4, dcf $$5, jw<ddd> $$6, @Nullable dzc $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ext<dff> o() {
      return this.s;
   }

   @Override
   public ext<eoa> p() {
      return this.t;
   }

   @Override
   public dud.a q() {
      return new dud.a(this.s, this.t);
   }

   @Override
   public dsh a_(ja $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfh.nb.o();
      } else {
         duo $$2 = this.b(this.e($$1));
         return $$2.c() ? dfh.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eob b_(ja $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eoc.a.g();
      } else {
         duo $$2 = this.b(this.e($$1));
         return $$2.c() ? eoc.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dsh a(ja $$0, dsh $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         duo $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfh.a)) {
            return $$1;
         } else {
            int $$9 = kc.b($$3);
            int $$10 = kc.b($$4);
            int $$11 = kc.b($$5);
            dsh $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dvc.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (ens.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dxz.a> $$14 = this.j().h();
            EnumSet<dxz.a> $$15 = null;

            for (dxz.a $$16 : $$14) {
               dxz $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dxz.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dxz.a(this, $$15);
            }

            for (dxz.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfh.nb.o();
      }
   }

   @Override
   public void a(dpn $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dpn c_(ja $$0) {
      return this.k.get($$0);
   }

   public Map<ja, dpn> D() {
      return this.k;
   }

   public void b(tx $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsd $$0) {
      if (!$$0.bR()) {
         tx $$1 = new tx();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eiq $$0, eiy $$1) {
      dxn $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eii $$3 = $$1.a();
         dcf $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<tx> E() {
      return this.p;
   }

   @Override
   public dvc j() {
      return this.o;
   }

   public void a(dvc $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dvc.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(ja $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ja a(short $$0, int $$1, dbk $$2) {
      int $$3 = kc.a($$2.e, $$0 & 15);
      int $$4 = kc.a($$1, $$0 >>> 4 & 15);
      int $$5 = kc.a($$2.f, $$0 >>> 8 & 15);
      return new ja($$3, $$4, $$5);
   }

   @Override
   public void e(ja $$0) {
      if (!this.s($$0)) {
         dud.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dud.a(this.b, $$1).add($$0);
   }

   public Map<ja, tx> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public tx a(ja $$0, jl.a $$1) {
      dpn $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ja $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public duc a(dxv.a $$0) {
      return this.q.get($$0);
   }

   public duc b(dxv.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new duc(this.J_(), this.I_()));
   }

   public void a(dxv.a $$0, duc $$1) {
      this.q.put($$0, $$1);
   }

   public void a(enq $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxn $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxn x() {
      return this.r;
   }

   private static <T> exl<T> a(exo<T> $$0) {
      return new exl<>($$0.b());
   }

   public exl<dff> G() {
      return a(this.s);
   }

   public exl<eoa> H() {
      return a(this.t);
   }

   @Override
   public dcf z() {
      return (dcf)(this.y() ? dxn.b : this);
   }
}
