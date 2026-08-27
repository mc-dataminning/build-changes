import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dlr extends dkw {
   @Nullable
   private volatile edz n;
   private volatile dlb o = dlb.c;
   private final List<sl> p = Lists.newArrayList();
   private final Map<dof.a, dkv> q = new Object2ObjectArrayMap();
   @Nullable
   private dnx r;
   private final enb<cwj> s;
   private final enb<eej> t;

   public dlr(csp $$0, dlu $$1, ctk $$2, it<cuh> $$3, @Nullable dpm $$4) {
      this($$0, $$1, null, new enb<>(), new enb<>(), $$2, $$3, $$4);
   }

   public dlr(csp $$0, dlu $$1, @Nullable dli[] $$2, enb<cwj> $$3, enb<eej> $$4, ctk $$5, it<cuh> $$6, @Nullable dpm $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eng<cwj> o() {
      return this.s;
   }

   @Override
   public eng<eej> p() {
      return this.t;
   }

   @Override
   public dkw.a q() {
      return new dkw.a(this.s, this.t);
   }

   @Override
   public dja a_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cwl.nb.o();
      } else {
         dli $$2 = this.b(this.e($$1));
         return $$2.c() ? cwl.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public eek b_(hx $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return eel.a.g();
      } else {
         dli $$2 = this.b(this.e($$1));
         return $$2.c() ? eel.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dja a(hx $$0, dja $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dli $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cwl.a)) {
            return $$1;
         } else {
            int $$9 = iz.b($$3);
            int $$10 = iz.b($$4);
            int $$11 = iz.b($$5);
            dja $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dlb.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eeb.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<doj.a> $$14 = this.j().h();
            EnumSet<doj.a> $$15 = null;

            for (doj.a $$16 : $$14) {
               doj $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(doj.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               doj.a(this, $$15);
            }

            for (doj.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cwl.nb.o();
      }
   }

   @Override
   public void a(dgo $$0) {
      this.k.put($$0.aB_(), $$0);
   }

   @Nullable
   @Override
   public dgo c_(hx $$0) {
      return this.k.get($$0);
   }

   public Map<hx, dgo> D() {
      return this.k;
   }

   public void b(sl $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(blp $$0) {
      if (!$$0.bO()) {
         sl $$1 = new sl();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dyz $$0, dzh $$1) {
      dnx $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dyr $$3 = $$1.a();
         ctk $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<sl> E() {
      return this.p;
   }

   @Override
   public dlb j() {
      return this.o;
   }

   public void a(dlb $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dlb.f)) {
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

   public static hx a(short $$0, int $$1, csp $$2) {
      int $$3 = iz.a($$2.e, $$0 & 15);
      int $$4 = iz.a($$1, $$0 >>> 4 & 15);
      int $$5 = iz.a($$2.f, $$0 >>> 8 & 15);
      return new hx($$3, $$4, $$5);
   }

   @Override
   public void e(hx $$0) {
      if (!this.s($$0)) {
         dkw.a(this.b, this.e($$0.v())).add(h($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dkw.a(this.b, $$1).add($$0);
   }

   public Map<hx, sl> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sl g(hx $$0) {
      dgo $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hx $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dkv a(dof.a $$0) {
      return this.q.get($$0);
   }

   public dkv b(dof.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dkv(this.K_(), this.J_()));
   }

   public void a(dof.a $$0, dkv $$1) {
      this.q.put($$0, $$1);
   }

   public void a(edz $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dnx $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dnx x() {
      return this.r;
   }

   private static <T> emy<T> a(enb<T> $$0) {
      return new emy<>($$0.b());
   }

   public emy<cwj> G() {
      return a(this.s);
   }

   public emy<eej> H() {
      return a(this.t);
   }

   @Override
   public ctk z() {
      return (ctk)(this.y() ? dnx.b : this);
   }
}
