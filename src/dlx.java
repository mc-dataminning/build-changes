import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dlx extends dlc {
   @Nullable
   private volatile eef n;
   private volatile dlh o = dlh.c;
   private final List<sn> p = Lists.newArrayList();
   private final Map<dol.a, dlb> q = new Object2ObjectArrayMap();
   @Nullable
   private dod r;
   private final enh<cwp> s;
   private final enh<eep> t;

   public dlx(csv $$0, dma $$1, ctq $$2, it<cun> $$3, @Nullable dps $$4) {
      this($$0, $$1, null, new enh<>(), new enh<>(), $$2, $$3, $$4);
   }

   public dlx(csv $$0, dma $$1, @Nullable dlo[] $$2, enh<cwp> $$3, enh<eep> $$4, ctq $$5, it<cun> $$6, @Nullable dps $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public enm<cwp> o() {
      return this.s;
   }

   @Override
   public enm<eep> p() {
      return this.t;
   }

   @Override
   public dlc.a q() {
      return new dlc.a(this.s, this.t);
   }

   @Override
   public djg a_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cwr.nb.o();
      } else {
         dlo $$2 = this.b(this.e($$1));
         return $$2.c() ? cwr.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eeq b_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eer.a.g();
      } else {
         dlo $$2 = this.b(this.e($$1));
         return $$2.c() ? eer.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public djg a(hx $$0, djg $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dlo $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cwr.a)) {
            return $$1;
         } else {
            int $$9 = iz.b($$3);
            int $$10 = iz.b($$4);
            int $$11 = iz.b($$5);
            djg $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dlh.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eeh.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dop.a> $$14 = this.j().h();
            EnumSet<dop.a> $$15 = null;

            for (dop.a $$16 : $$14) {
               dop $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dop.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dop.a(this, $$15);
            }

            for (dop.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cwr.nb.o();
      }
   }

   @Override
   public void a(dgu $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dgu c_(hx $$0) {
      return this.k.get($$0);
   }

   public Map<hx, dgu> D() {
      return this.k;
   }

   public void b(sn $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(blu $$0) {
      if (!$$0.bO()) {
         sn $$1 = new sn();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dzf $$0, dzn $$1) {
      dod $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dyx $$3 = $$1.a();
         ctq $$4 = this.z();
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
   public dlh j() {
      return this.o;
   }

   public void a(dlh $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ih<cun> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dlh.f)) {
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

   public static hx a(short $$0, int $$1, csv $$2) {
      int $$3 = iz.a($$2.e, $$0 & 15);
      int $$4 = iz.a($$1, $$0 >>> 4 & 15);
      int $$5 = iz.a($$2.f, $$0 >>> 8 & 15);
      return new hx($$3, $$4, $$5);
   }

   @Override
   public void e(hx $$0) {
      if (!this.s($$0)) {
         dlc.a(this.b, this.e($$0.v())).add(h($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dlc.a(this.b, $$1).add($$0);
   }

   public Map<hx, sn> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sn g(hx $$0) {
      dgu $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hx $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dlb a(dol.a $$0) {
      return this.q.get($$0);
   }

   public dlb b(dol.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dlb(this.K_(), this.J_()));
   }

   public void a(dol.a $$0, dlb $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eef $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dod $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dod x() {
      return this.r;
   }

   private static <T> ene<T> a(enh<T> $$0) {
      return new ene<>($$0.b());
   }

   public ene<cwp> G() {
      return a(this.s);
   }

   public ene<eep> H() {
      return a(this.t);
   }

   @Override
   public ctq z() {
      return (ctq)(this.y() ? dod.b : this);
   }
}
