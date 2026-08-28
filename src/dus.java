import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dus extends dty {
   @Nullable
   private volatile enk n;
   private volatile dux o = dux.c;
   private final List<us> p = Lists.newArrayList();
   private final Map<dxq.a, dtx> q = new Object2ObjectArrayMap();
   @Nullable
   private dxi r;
   private final exg<dez> s;
   private final exg<enu> t;

   public dus(dbf $$0, duv $$1, dca $$2, jv<dcx> $$3, @Nullable dyx $$4) {
      this($$0, $$1, null, new exg<>(), new exg<>(), $$2, $$3, $$4);
   }

   public dus(dbf $$0, duv $$1, @Nullable duj[] $$2, exg<dez> $$3, exg<enu> $$4, dca $$5, jv<dcx> $$6, @Nullable dyx $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public exl<dez> o() {
      return this.s;
   }

   @Override
   public exl<enu> p() {
      return this.t;
   }

   @Override
   public dty.a q() {
      return new dty.a(this.s, this.t);
   }

   @Override
   public dsc a_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfb.nb.o();
      } else {
         duj $$2 = this.b(this.e($$1));
         return $$2.c() ? dfb.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public env b_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return enw.a.g();
      } else {
         duj $$2 = this.b(this.e($$1));
         return $$2.c() ? enw.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dsc a(iz $$0, dsc $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         duj $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfb.a)) {
            return $$1;
         } else {
            int $$9 = kb.b($$3);
            int $$10 = kb.b($$4);
            int $$11 = kb.b($$5);
            dsc $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dux.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (enm.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dxu.a> $$14 = this.j().h();
            EnumSet<dxu.a> $$15 = null;

            for (dxu.a $$16 : $$14) {
               dxu $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dxu.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dxu.a(this, $$15);
            }

            for (dxu.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfb.nb.o();
      }
   }

   @Override
   public void a(dph $$0) {
      this.k.put($$0.ay_(), $$0);
   }

   @Nullable
   @Override
   public dph c_(iz $$0) {
      return this.k.get($$0);
   }

   public Map<iz, dph> D() {
      return this.k;
   }

   public void b(us $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsu $$0) {
      if (!$$0.bR()) {
         us $$1 = new us();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eik $$0, eis $$1) {
      dxi $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eic $$3 = $$1.a();
         dca $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<us> E() {
      return this.p;
   }

   @Override
   public dux j() {
      return this.o;
   }

   public void a(dux $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ji<dcx> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dux.f)) {
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

   public static iz a(short $$0, int $$1, dbf $$2) {
      int $$3 = kb.a($$2.e, $$0 & 15);
      int $$4 = kb.a($$1, $$0 >>> 4 & 15);
      int $$5 = kb.a($$2.f, $$0 >>> 8 & 15);
      return new iz($$3, $$4, $$5);
   }

   @Override
   public void e(iz $$0) {
      if (!this.s($$0)) {
         dty.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dty.a(this.b, $$1).add($$0);
   }

   public Map<iz, us> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public us a(iz $$0, jk.a $$1) {
      dph $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dtx a(dxq.a $$0) {
      return this.q.get($$0);
   }

   public dtx b(dxq.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dtx(this.J_(), this.I_()));
   }

   public void a(dxq.a $$0, dtx $$1) {
      this.q.put($$0, $$1);
   }

   public void a(enk $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxi $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxi x() {
      return this.r;
   }

   private static <T> exd<T> a(exg<T> $$0) {
      return new exd<>($$0.b());
   }

   public exd<dez> G() {
      return a(this.s);
   }

   public exd<enu> H() {
      return a(this.t);
   }

   @Override
   public dca z() {
      return (dca)(this.y() ? dxi.b : this);
   }
}
