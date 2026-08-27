import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dry extends dre {
   @Nullable
   private volatile ekq n;
   private volatile dsd o = dsd.c;
   private final List<to> p = Lists.newArrayList();
   private final Map<duw.a, drd> q = new Object2ObjectArrayMap();
   @Nullable
   private duo r;
   private final ety<dch> s;
   private final ety<ela> t;

   public dry(cyn $$0, dsb $$1, czi $$2, ja<daf> $$3, @Nullable dwd $$4) {
      this($$0, $$1, null, new ety<>(), new ety<>(), $$2, $$3, $$4);
   }

   public dry(cyn $$0, dsb $$1, @Nullable drp[] $$2, ety<dch> $$3, ety<ela> $$4, czi $$5, ja<daf> $$6, @Nullable dwd $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eud<dch> o() {
      return this.s;
   }

   @Override
   public eud<ela> p() {
      return this.t;
   }

   @Override
   public dre.a q() {
      return new dre.a(this.s, this.t);
   }

   @Override
   public dpi a_(id $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dcj.nb.n();
      } else {
         drp $$2 = this.b(this.e($$1));
         return $$2.c() ? dcj.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public elb b_(id $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return elc.a.g();
      } else {
         drp $$2 = this.b(this.e($$1));
         return $$2.c() ? elc.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dpi a(id $$0, dpi $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         drp $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dcj.a)) {
            return $$1;
         } else {
            int $$9 = jg.b($$3);
            int $$10 = jg.b($$4);
            int $$11 = jg.b($$5);
            dpi $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dsd.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eks.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dva.a> $$14 = this.j().h();
            EnumSet<dva.a> $$15 = null;

            for (dva.a $$16 : $$14) {
               dva $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dva.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dva.a(this, $$15);
            }

            for (dva.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dcj.nb.n();
      }
   }

   @Override
   public void a(dmo $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dmo c_(id $$0) {
      return this.k.get($$0);
   }

   public Map<id, dmo> D() {
      return this.k;
   }

   public void b(to $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bqa $$0) {
      if (!$$0.bO()) {
         to $$1 = new to();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(efq $$0, efy $$1) {
      duo $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         efi $$3 = $$1.a();
         czi $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<to> E() {
      return this.p;
   }

   @Override
   public dsd j() {
      return this.o;
   }

   public void a(dsd $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public in<daf> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dsd.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(id $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static id a(short $$0, int $$1, cyn $$2) {
      int $$3 = jg.a($$2.e, $$0 & 15);
      int $$4 = jg.a($$1, $$0 >>> 4 & 15);
      int $$5 = jg.a($$2.f, $$0 >>> 8 & 15);
      return new id($$3, $$4, $$5);
   }

   @Override
   public void e(id $$0) {
      if (!this.s($$0)) {
         dre.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dre.a(this.b, $$1).add($$0);
   }

   public Map<id, to> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public to a(id $$0, ip.a $$1) {
      dmo $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(id $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public drd a(duw.a $$0) {
      return this.q.get($$0);
   }

   public drd b(duw.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new drd(this.J_(), this.I_()));
   }

   public void a(duw.a $$0, drd $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ekq $$0) {
      this.n = $$0;
   }

   public void a(@Nullable duo $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public duo x() {
      return this.r;
   }

   private static <T> etv<T> a(ety<T> $$0) {
      return new etv<>($$0.b());
   }

   public etv<dch> G() {
      return a(this.s);
   }

   public etv<ela> H() {
      return a(this.t);
   }

   @Override
   public czi z() {
      return (czi)(this.y() ? duo.b : this);
   }
}
