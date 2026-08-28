import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class duu extends dua {
   @Nullable
   private volatile enm n;
   private volatile duz o = duz.c;
   private final List<us> p = Lists.newArrayList();
   private final Map<dxs.a, dtz> q = new Object2ObjectArrayMap();
   @Nullable
   private dxk r;
   private final exi<dfb> s;
   private final exi<enw> t;

   public duu(dbh $$0, dux $$1, dcc $$2, jv<dcz> $$3, @Nullable dyz $$4) {
      this($$0, $$1, null, new exi<>(), new exi<>(), $$2, $$3, $$4);
   }

   public duu(dbh $$0, dux $$1, @Nullable dul[] $$2, exi<dfb> $$3, exi<enw> $$4, dcc $$5, jv<dcz> $$6, @Nullable dyz $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public exn<dfb> o() {
      return this.s;
   }

   @Override
   public exn<enw> p() {
      return this.t;
   }

   @Override
   public dua.a q() {
      return new dua.a(this.s, this.t);
   }

   @Override
   public dse a_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfd.nb.o();
      } else {
         dul $$2 = this.b(this.e($$1));
         return $$2.c() ? dfd.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public enx b_(iz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eny.a.g();
      } else {
         dul $$2 = this.b(this.e($$1));
         return $$2.c() ? eny.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dse a(iz $$0, dse $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         dul $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfd.a)) {
            return $$1;
         } else {
            int $$9 = kb.b($$3);
            int $$10 = kb.b($$4);
            int $$11 = kb.b($$5);
            dse $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(duz.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eno.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dxw.a> $$14 = this.j().h();
            EnumSet<dxw.a> $$15 = null;

            for (dxw.a $$16 : $$14) {
               dxw $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dxw.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dxw.a(this, $$15);
            }

            for (dxw.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfd.nb.o();
      }
   }

   @Override
   public void a(dpj $$0) {
      this.k.put($$0.ay_(), $$0);
   }

   @Nullable
   @Override
   public dpj c_(iz $$0) {
      return this.k.get($$0);
   }

   public Map<iz, dpj> D() {
      return this.k;
   }

   public void b(us $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bsw $$0) {
      if (!$$0.bR()) {
         us $$1 = new us();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eim $$0, eiu $$1) {
      dxk $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eie $$3 = $$1.a();
         dcc $$4 = this.z();
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
   public duz j() {
      return this.o;
   }

   public void a(duz $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ji<dcz> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(duz.f)) {
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

   public static iz a(short $$0, int $$1, dbh $$2) {
      int $$3 = kb.a($$2.e, $$0 & 15);
      int $$4 = kb.a($$1, $$0 >>> 4 & 15);
      int $$5 = kb.a($$2.f, $$0 >>> 8 & 15);
      return new iz($$3, $$4, $$5);
   }

   @Override
   public void e(iz $$0) {
      if (!this.s($$0)) {
         dua.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dua.a(this.b, $$1).add($$0);
   }

   public Map<iz, us> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public us a(iz $$0, jk.a $$1) {
      dpj $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(iz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dtz a(dxs.a $$0) {
      return this.q.get($$0);
   }

   public dtz b(dxs.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dtz(this.J_(), this.I_()));
   }

   public void a(dxs.a $$0, dtz $$1) {
      this.q.put($$0, $$1);
   }

   public void a(enm $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dxk $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dxk x() {
      return this.r;
   }

   private static <T> exf<T> a(exi<T> $$0) {
      return new exf<>($$0.b());
   }

   public exf<dfb> G() {
      return a(this.s);
   }

   public exf<enw> H() {
      return a(this.t);
   }

   @Override
   public dcc z() {
      return (dcc)(this.y() ? dxk.b : this);
   }
}
