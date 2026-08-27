import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dlg extends dkl {
   @Nullable
   private volatile edo n;
   private volatile dkq o = dkq.c;
   private final List<sj> p = Lists.newArrayList();
   private final Map<dnu.a, dkk> q = new Object2ObjectArrayMap();
   @Nullable
   private dnm r;
   private final eml<cvz> s;
   private final eml<edy> t;

   public dlg(csf $$0, dlj $$1, cta $$2, ir<ctx> $$3, @Nullable dpb $$4) {
      this($$0, $$1, null, new eml<>(), new eml<>(), $$2, $$3, $$4);
   }

   public dlg(csf $$0, dlj $$1, @Nullable dkx[] $$2, eml<cvz> $$3, eml<edy> $$4, cta $$5, ir<ctx> $$6, @Nullable dpb $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public emq<cvz> o() {
      return this.s;
   }

   @Override
   public emq<edy> p() {
      return this.t;
   }

   @Override
   public dkl.a q() {
      return new dkl.a(this.s, this.t);
   }

   @Override
   public dip a_(hv $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cwb.nb.o();
      } else {
         dkx $$2 = this.b(this.e($$1));
         return $$2.c() ? cwb.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public edz b_(hv $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eea.a.g();
      } else {
         dkx $$2 = this.b(this.e($$1));
         return $$2.c() ? eea.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dip a(hv $$0, dip $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.ak()) {
         int $$6 = this.e($$4);
         dkx $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cwb.a)) {
            return $$1;
         } else {
            int $$9 = ix.b($$3);
            int $$10 = ix.b($$4);
            int $$11 = ix.b($$5);
            dip $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dkq.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (edq.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dny.a> $$14 = this.j().h();
            EnumSet<dny.a> $$15 = null;

            for (dny.a $$16 : $$14) {
               dny $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dny.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dny.a(this, $$15);
            }

            for (dny.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cwb.nb.o();
      }
   }

   @Override
   public void a(dgd $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dgd c_(hv $$0) {
      return this.k.get($$0);
   }

   public Map<hv, dgd> D() {
      return this.k;
   }

   public void b(sj $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(blf $$0) {
      if (!$$0.bO()) {
         sj $$1 = new sj();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dyo $$0, dyw $$1) {
      dnm $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dyg $$3 = $$1.a();
         cta $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.ak()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<sj> E() {
      return this.p;
   }

   @Override
   public dkq j() {
      return this.o;
   }

   public void a(dkq $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dkq.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short j(hv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static hv a(short $$0, int $$1, csf $$2) {
      int $$3 = ix.a($$2.e, $$0 & 15);
      int $$4 = ix.a($$1, $$0 >>> 4 & 15);
      int $$5 = ix.a($$2.f, $$0 >>> 8 & 15);
      return new hv($$3, $$4, $$5);
   }

   @Override
   public void e(hv $$0) {
      if (!this.r($$0)) {
         dkl.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dkl.a(this.b, $$1).add($$0);
   }

   public Map<hv, sj> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sj g(hv $$0) {
      dgd $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hv $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dkk a(dnu.a $$0) {
      return this.q.get($$0);
   }

   public dkk b(dnu.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dkk(this.K_(), this.J_()));
   }

   public void a(dnu.a $$0, dkk $$1) {
      this.q.put($$0, $$1);
   }

   public void a(edo $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dnm $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dnm x() {
      return this.r;
   }

   private static <T> emi<T> a(eml<T> $$0) {
      return new emi<>($$0.b());
   }

   public emi<cvz> G() {
      return a(this.s);
   }

   public emi<edy> H() {
      return a(this.t);
   }

   @Override
   public cta z() {
      return (cta)(this.y() ? dnm.b : this);
   }
}
