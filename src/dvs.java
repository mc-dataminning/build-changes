import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dvs extends duy {
   @Nullable
   private volatile eot n;
   private volatile dvx o = dvx.c;
   private final List<uk> p = Lists.newArrayList();
   private final Map<dyq.a, dux> q = new Object2ObjectArrayMap();
   @Nullable
   private dyi r;
   private final eyj<dfc> s;
   private final eyj<epd> t;

   public dvs(dbh $$0, dvv $$1, dcc $$2, jn<dcz> $$3, @Nullable dzx $$4) {
      this($$0, $$1, null, new eyj<>(), new eyj<>(), $$2, $$3, $$4);
   }

   public dvs(dbh $$0, dvv $$1, @Nullable dvj[] $$2, eyj<dfc> $$3, eyj<epd> $$4, dcc $$5, jn<dcz> $$6, @Nullable dzx $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eyo<dfc> p() {
      return this.s;
   }

   @Override
   public eyo<epd> q() {
      return this.t;
   }

   @Override
   public duy.a r() {
      return new duy.a(this.s, this.t);
   }

   @Override
   public dtc a_(ir $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dfe.nZ.n();
      } else {
         dvj $$2 = this.b(this.e($$1));
         return $$2.c() ? dfe.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public epe b_(ir $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return epf.a.g();
      } else {
         dvj $$2 = this.b(this.e($$1));
         return $$2.c() ? epf.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dtc a(ir $$0, dtc $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.am()) {
         int $$6 = this.e($$4);
         dvj $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dfe.a)) {
            return $$1;
         } else {
            int $$9 = jt.b($$3);
            int $$10 = jt.b($$4);
            int $$11 = jt.b($$5);
            dtc $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dvx.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eov.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dyu.a> $$14 = this.k().h();
            EnumSet<dyu.a> $$15 = null;

            for (dyu.a $$16 : $$14) {
               dyu $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dyu.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dyu.a(this, $$15);
            }

            for (dyu.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dfe.nZ.n();
      }
   }

   @Override
   public void a(dqc $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      return this.k.get($$0);
   }

   public Map<ir, dqc> E() {
      return this.k;
   }

   public void b(uk $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(brv $$0) {
      if (!$$0.bW()) {
         uk $$1 = new uk();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ejt $$0, ekb $$1) {
      dyi $$2 = this.y();
      if ($$2 != null && $$1.b()) {
         ejl $$3 = $$1.a();
         dcc $$4 = this.A();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<uk> F() {
      return this.p;
   }

   @Override
   public dvx k() {
      return this.o;
   }

   public void a(dvx $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ja<dcz> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.l().b(dvx.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(ir $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ir a(short $$0, int $$1, dbh $$2) {
      int $$3 = jt.a($$2.e, $$0 & 15);
      int $$4 = jt.a($$1, $$0 >>> 4 & 15);
      int $$5 = jt.a($$2.f, $$0 >>> 8 & 15);
      return new ir($$3, $$4, $$5);
   }

   @Override
   public void e(ir $$0) {
      if (!this.s($$0)) {
         duy.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      duy.a(this.b, $$1).add($$0);
   }

   public Map<ir, uk> G() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public uk a(ir $$0, jc.a $$1) {
      dqc $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(ir $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dux a(dyq.a $$0) {
      return this.q.get($$0);
   }

   public dux b(dyq.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dux(this.K_(), this.J_()));
   }

   public void a(dyq.a $$0, dux $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eot $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dyi $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dyi y() {
      return this.r;
   }

   private static <T> eyg<T> a(eyj<T> $$0) {
      return new eyg<>($$0.b());
   }

   public eyg<dfc> H() {
      return a(this.s);
   }

   public eyg<epd> I() {
      return a(this.t);
   }

   @Override
   public dcc A() {
      return (dcc)(this.z() ? dyi.b : this);
   }
}
