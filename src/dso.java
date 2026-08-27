import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dso extends dru {
   @Nullable
   private volatile elg n;
   private volatile dst o = dst.c;
   private final List<ty> p = Lists.newArrayList();
   private final Map<dvm.a, drt> q = new Object2ObjectArrayMap();
   @Nullable
   private dve r;
   private final euu<dcv> s;
   private final euu<elq> t;

   public dso(czb $$0, dsr $$1, czw $$2, ji<dat> $$3, @Nullable dwt $$4) {
      this($$0, $$1, null, new euu<>(), new euu<>(), $$2, $$3, $$4);
   }

   public dso(czb $$0, dsr $$1, @Nullable dsf[] $$2, euu<dcv> $$3, euu<elq> $$4, czw $$5, ji<dat> $$6, @Nullable dwt $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public euz<dcv> o() {
      return this.s;
   }

   @Override
   public euz<elq> p() {
      return this.t;
   }

   @Override
   public dru.a q() {
      return new dru.a(this.s, this.t);
   }

   @Override
   public dpy a_(im $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dcx.nb.n();
      } else {
         dsf $$2 = this.b(this.e($$1));
         return $$2.c() ? dcx.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public elr b_(im $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return els.a.g();
      } else {
         dsf $$2 = this.b(this.e($$1));
         return $$2.c() ? els.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dpy a(im $$0, dpy $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dsf $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dcx.a)) {
            return $$1;
         } else {
            int $$9 = jo.b($$3);
            int $$10 = jo.b($$4);
            int $$11 = jo.b($$5);
            dpy $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dst.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eli.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dvq.a> $$14 = this.j().h();
            EnumSet<dvq.a> $$15 = null;

            for (dvq.a $$16 : $$14) {
               dvq $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dvq.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dvq.a(this, $$15);
            }

            for (dvq.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dcx.nb.n();
      }
   }

   @Override
   public void a(dnd $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dnd c_(im $$0) {
      return this.k.get($$0);
   }

   public Map<im, dnd> D() {
      return this.k;
   }

   public void b(ty $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bql $$0) {
      if (!$$0.bP()) {
         ty $$1 = new ty();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(egg $$0, ego $$1) {
      dve $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         efy $$3 = $$1.a();
         czw $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ty> E() {
      return this.p;
   }

   @Override
   public dst j() {
      return this.o;
   }

   public void a(dst $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dst.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(im $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static im a(short $$0, int $$1, czb $$2) {
      int $$3 = jo.a($$2.e, $$0 & 15);
      int $$4 = jo.a($$1, $$0 >>> 4 & 15);
      int $$5 = jo.a($$2.f, $$0 >>> 8 & 15);
      return new im($$3, $$4, $$5);
   }

   @Override
   public void e(im $$0) {
      if (!this.s($$0)) {
         dru.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dru.a(this.b, $$1).add($$0);
   }

   public Map<im, ty> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ty a(im $$0, ix.a $$1) {
      dnd $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(im $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public drt a(dvm.a $$0) {
      return this.q.get($$0);
   }

   public drt b(dvm.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new drt(this.J_(), this.I_()));
   }

   public void a(dvm.a $$0, drt $$1) {
      this.q.put($$0, $$1);
   }

   public void a(elg $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dve $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dve x() {
      return this.r;
   }

   private static <T> eur<T> a(euu<T> $$0) {
      return new eur<>($$0.b());
   }

   public eur<dcv> G() {
      return a(this.s);
   }

   public eur<elq> H() {
      return a(this.t);
   }

   @Override
   public czw z() {
      return (czw)(this.y() ? dve.b : this);
   }
}
