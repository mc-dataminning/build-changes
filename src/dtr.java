import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dtr extends dsx {
   @Nullable
   private volatile emj n;
   private volatile dtw o = dtw.c;
   private final List<ud> p = Lists.newArrayList();
   private final Map<dwp.a, dsw> q = new Object2ObjectArrayMap();
   @Nullable
   private dwh r;
   private final evz<ddy> s;
   private final evz<emt> t;

   public dtr(dae $$0, dtu $$1, daz $$2, jk<dbw> $$3, @Nullable dxw $$4) {
      this($$0, $$1, null, new evz<>(), new evz<>(), $$2, $$3, $$4);
   }

   public dtr(dae $$0, dtu $$1, @Nullable dti[] $$2, evz<ddy> $$3, evz<emt> $$4, daz $$5, jk<dbw> $$6, @Nullable dxw $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ewe<ddy> o() {
      return this.s;
   }

   @Override
   public ewe<emt> p() {
      return this.t;
   }

   @Override
   public dsx.a q() {
      return new dsx.a(this.s, this.t);
   }

   @Override
   public drb a_(io $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dea.nb.n();
      } else {
         dti $$2 = this.b(this.e($$1));
         return $$2.c() ? dea.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public emu b_(io $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return emv.a.g();
      } else {
         dti $$2 = this.b(this.e($$1));
         return $$2.c() ? emv.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public drb a(io $$0, drb $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dti $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dea.a)) {
            return $$1;
         } else {
            int $$9 = jq.b($$3);
            int $$10 = jq.b($$4);
            int $$11 = jq.b($$5);
            drb $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dtw.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eml.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dwt.a> $$14 = this.j().h();
            EnumSet<dwt.a> $$15 = null;

            for (dwt.a $$16 : $$14) {
               dwt $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dwt.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dwt.a(this, $$15);
            }

            for (dwt.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dea.nb.n();
      }
   }

   @Override
   public void a(dog $$0) {
      this.k.put($$0.az_(), $$0);
   }

   @Nullable
   @Override
   public dog c_(io $$0) {
      return this.k.get($$0);
   }

   public Map<io, dog> D() {
      return this.k;
   }

   public void b(ud $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bru $$0) {
      if (!$$0.bR()) {
         ud $$1 = new ud();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ehj $$0, ehr $$1) {
      dwh $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         ehb $$3 = $$1.a();
         daz $$4 = this.z();
         if ($$3.i() < $$4.I_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ud> E() {
      return this.p;
   }

   @Override
   public dtw j() {
      return this.o;
   }

   public void a(dtw $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ix<dbw> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dtw.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(io $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static io a(short $$0, int $$1, dae $$2) {
      int $$3 = jq.a($$2.e, $$0 & 15);
      int $$4 = jq.a($$1, $$0 >>> 4 & 15);
      int $$5 = jq.a($$2.f, $$0 >>> 8 & 15);
      return new io($$3, $$4, $$5);
   }

   @Override
   public void e(io $$0) {
      if (!this.s($$0)) {
         dsx.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dsx.a(this.b, $$1).add($$0);
   }

   public Map<io, ud> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ud a(io $$0, iz.a $$1) {
      dog $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(io $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dsw a(dwp.a $$0) {
      return this.q.get($$0);
   }

   public dsw b(dwp.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dsw(this.J_(), this.I_()));
   }

   public void a(dwp.a $$0, dsw $$1) {
      this.q.put($$0, $$1);
   }

   public void a(emj $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dwh $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dwh x() {
      return this.r;
   }

   private static <T> evw<T> a(evz<T> $$0) {
      return new evw<>($$0.b());
   }

   public evw<ddy> G() {
      return a(this.s);
   }

   public evw<emt> H() {
      return a(this.t);
   }

   @Override
   public daz z() {
      return (daz)(this.y() ? dwh.b : this);
   }
}
