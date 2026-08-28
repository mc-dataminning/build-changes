import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxz extends dxf {
   @Nullable
   private volatile eqz o;
   private volatile dyg p = dyg.c;
   private final List<uk> q = Lists.newArrayList();
   @Nullable
   private dxe r;
   @Nullable
   private eat s;
   private final fbd<die> t;
   private final fbd<erj> u;

   public dxz(deh $$0, dyc $$1, dfd $$2, kd<dgc> $$3, @Nullable eci $$4) {
      this($$0, $$1, null, new fbd<>(), new fbd<>(), $$2, $$3, $$4);
   }

   public dxz(deh $$0, dyc $$1, @Nullable dxq[] $$2, fbd<die> $$3, fbd<erj> $$4, dfd $$5, kd<dgc> $$6, @Nullable eci $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.t = $$3;
      this.u = $$4;
   }

   @Override
   public fbi<die> o() {
      return this.t;
   }

   @Override
   public fbi<erj> p() {
      return this.u;
   }

   @Override
   public dxf.a a(long $$0) {
      return new dxf.a(this.t.a($$0), this.u.a($$0));
   }

   @Override
   public dvj a_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dig.nb.m();
      } else {
         dxq $$2 = this.b(this.f($$1));
         return $$2.c() ? dig.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public erk b_(jh $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return erl.a.g();
      } else {
         dxq $$2 = this.b(this.f($$1));
         return $$2.c() ? erl.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dvj a(jh $$0, dvj $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dig.nb.m();
      } else {
         int $$6 = this.f($$4);
         dxq $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dig.a)) {
            return $$1;
         } else {
            int $$9 = kj.b($$3);
            int $$10 = kj.b($$4);
            int $$11 = kj.b($$5);
            dvj $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.p.a(dyg.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.o.a($$0, $$13);
               }

               if (erb.a($$12, $$1)) {
                  this.j.a(this, $$9, $$4, $$11);
                  this.o.a($$0);
               }
            }

            EnumSet<ebf.a> $$14 = this.j().e();
            EnumSet<ebf.a> $$15 = null;

            for (ebf.a $$16 : $$14) {
               ebf $$17 = this.i.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(ebf.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               ebf.a(this, $$15);
            }

            for (ebf.a $$18 : $$14) {
               this.i.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(dsm $$0) {
      this.l.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dsm c_(jh $$0) {
      return this.l.get($$0);
   }

   public Map<jh, dsm> E() {
      return this.l;
   }

   public void b(uk $$0) {
      this.q.add($$0);
   }

   @Override
   public void a(bue $$0) {
      if (!$$0.ca()) {
         uk $$1 = new uk();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(elx $$0, emf $$1) {
      eat $$2 = this.w();
      if ($$2 != null && $$1.b()) {
         elp $$3 = $$1.a();
         dfd $$4 = this.y();
         if ($$3.i() < $$4.I_() || $$3.l() > $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<uk> F() {
      return this.q;
   }

   @Override
   public dyg j() {
      return this.p;
   }

   public void a(dyg $$0) {
      this.p = $$0;
      if (this.s != null && $$0.a(this.s.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public jq<dgc> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.m().a(dyg.f)) {
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

   public static jh a(short $$0, int $$1, deh $$2) {
      int $$3 = kj.a($$2.g, $$0 & 15);
      int $$4 = kj.a($$1, $$0 >>> 4 & 15);
      int $$5 = kj.a($$2.h, $$0 >>> 8 & 15);
      return new jh($$3, $$4, $$5);
   }

   @Override
   public void e(jh $$0) {
      if (!this.s($$0)) {
         dxf.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      dxf.a(this.b, $$1).addAll($$0);
   }

   public Map<jh, uk> G() {
      return Collections.unmodifiableMap(this.k);
   }

   @Nullable
   @Override
   public uk a(jh $$0, js.a $$1) {
      dsm $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.k.get($$0);
   }

   @Override
   public void d(jh $$0) {
      this.l.remove($$0);
      this.k.remove($$0);
   }

   @Nullable
   public dxe B() {
      return this.r;
   }

   public dxe C() {
      if (this.r == null) {
         this.r = new dxe(this.J_(), this.I_());
      }

      return this.r;
   }

   public void a(dxe $$0) {
      this.r = $$0;
   }

   public void a(eqz $$0) {
      this.o = $$0;
   }

   public void a(@Nullable eat $$0) {
      this.s = $$0;
   }

   @Nullable
   @Override
   public eat w() {
      return this.s;
   }

   private static <T> fba<T> a(fbd<T> $$0) {
      return new fba<>($$0.b());
   }

   public fba<die> H() {
      return a(this.t);
   }

   public fba<erj> I() {
      return a(this.u);
   }

   @Override
   public dfd y() {
      return (dfd)(this.x() ? eat.b : this);
   }
}
