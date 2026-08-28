import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eaj extends dzp {
   @Nullable
   private volatile etl n;
   private volatile eaq o = eaq.c;
   private final List<ux> p = Lists.newArrayList();
   @Nullable
   private dzo q;
   @Nullable
   private edd r;
   private final fdn<dkl> s;
   private final fdn<etv> t;

   public eaj(dgn $$0, eam $$1, dhj $$2, kd<dij> $$3, @Nullable ees $$4) {
      this($$0, $$1, null, new fdn<>(), new fdn<>(), $$2, $$3, $$4);
   }

   public eaj(dgn $$0, eam $$1, @Nullable eaa[] $$2, fdn<dkl> $$3, fdn<etv> $$4, dhj $$5, kd<dij> $$6, @Nullable ees $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public fds<dkl> q() {
      return this.s;
   }

   @Override
   public fds<etv> r() {
      return this.t;
   }

   @Override
   public dzp.a a(long $$0) {
      return new dzp.a(this.s.a($$0), this.t.a($$0));
   }

   @Override
   public dxu a_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dkn.nw.m();
      } else {
         eaa $$2 = this.b(this.f($$1));
         return $$2.c() ? dkn.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public etw b_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return etx.a.g();
      } else {
         eaa $$2 = this.b(this.f($$1));
         return $$2.c() ? etx.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dxu a(jh $$0, dxu $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dkn.nw.m();
      } else {
         int $$6 = this.f($$4);
         eaa $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dkn.a)) {
            return $$1;
         } else {
            int $$9 = kj.b($$3);
            int $$10 = kj.b($$4);
            int $$11 = kj.b($$5);
            dxu $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.a(eaq.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (etn.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<edp.a> $$14 = this.n().e();
            EnumSet<edp.a> $$15 = null;

            for (edp.a $$16 : $$14) {
               edp $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(edp.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               edp.a(this, $$15);
            }

            for (edp.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(duw $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public duw c_(jh $$0) {
      return this.k.get($$0);
   }

   public Map<jh, duw> G() {
      return this.k;
   }

   public void b(ux $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bvj $$0) {
      if (!$$0.bZ()) {
         ux $$1 = new ux();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(eoj $$0, eor $$1) {
      edd $$2 = this.y();
      if ($$2 != null && $$1.b()) {
         eob $$3 = $$1.a();
         dhj $$4 = this.A();
         if ($$3.i() < $$4.L_() || $$3.l() > $$4.am()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ux> H() {
      return this.p;
   }

   @Override
   public eaq n() {
      return this.o;
   }

   public void a(eaq $$0) {
      this.o = $$0;
      if (this.r != null && $$0.a(this.r.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jq<dij> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(eaq.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jh $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jh a(short $$0, int $$1, dgn $$2) {
      int $$3 = kj.a($$2.g, $$0 & 15);
      int $$4 = kj.a($$1, $$0 >>> 4 & 15);
      int $$5 = kj.a($$2.h, $$0 >>> 8 & 15);
      return new jh($$3, $$4, $$5);
   }

   @Override
   public void e(jh $$0) {
      if (!this.s($$0)) {
         dzp.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dzp.a(this.b, $$1).addAll($$0);
   }

   public Map<jh, ux> I() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ux a(jh $$0, js.a $$1) {
      duw $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jh $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dzo D() {
      return this.q;
   }

   public dzo E() {
      if (this.q == null) {
         this.q = new dzo(this.M_(), this.L_());
      }

      return this.q;
   }

   public void a(dzo $$0) {
      this.q = $$0;
   }

   public void a(etl $$0) {
      this.n = $$0;
   }

   public void a(@Nullable edd $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public edd y() {
      return this.r;
   }

   private static <T> fdk<T> a(fdn<T> $$0) {
      return new fdk<>($$0.b());
   }

   public fdk<dkl> J() {
      return a(this.s);
   }

   public fdk<etv> K() {
      return a(this.t);
   }

   @Override
   public dhj A() {
      return (dhj)(this.z() ? edd.b : this);
   }
}
