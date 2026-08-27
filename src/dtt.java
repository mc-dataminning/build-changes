import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dtt extends dsz {
   @Nullable
   private volatile eml n;
   private volatile dty o = dty.c;
   private final List<ud> p = Lists.newArrayList();
   private final Map<dwr.a, dsy> q = new Object2ObjectArrayMap();
   @Nullable
   private dwj r;
   private final ewb<dea> s;
   private final ewb<emv> t;

   public dtt(dag $$0, dtw $$1, dbb $$2, jk<dby> $$3, @Nullable dxy $$4) {
      this($$0, $$1, null, new ewb<>(), new ewb<>(), $$2, $$3, $$4);
   }

   public dtt(dag $$0, dtw $$1, @Nullable dtk[] $$2, ewb<dea> $$3, ewb<emv> $$4, dbb $$5, jk<dby> $$6, @Nullable dxy $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public ewg<dea> o() {
      return this.s;
   }

   @Override
   public ewg<emv> p() {
      return this.t;
   }

   @Override
   public dsz.a q() {
      return new dsz.a(this.s, this.t);
   }

   @Override
   public drd a_(io $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dec.nb.n();
      } else {
         dtk $$2 = this.b(this.e($$1));
         return $$2.c() ? dec.a.n() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public emw b_(io $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return emx.a.g();
      } else {
         dtk $$2 = this.b(this.e($$1));
         return $$2.c() ? emx.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public drd a(io $$0, drd $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dtk $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dec.a)) {
            return $$1;
         } else {
            int $$9 = jq.b($$3);
            int $$10 = jq.b($$4);
            int $$11 = jq.b($$5);
            drd $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dty.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (emn.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dwv.a> $$14 = this.j().h();
            EnumSet<dwv.a> $$15 = null;

            for (dwv.a $$16 : $$14) {
               dwv $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dwv.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dwv.a(this, $$15);
            }

            for (dwv.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return dec.nb.n();
      }
   }

   @Override
   public void a(doi $$0) {
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public doi c_(io $$0) {
      return this.k.get($$0);
   }

   public Map<io, doi> D() {
      return this.k;
   }

   public void b(ud $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(brw $$0) {
      if (!$$0.bR()) {
         ud $$1 = new ud();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ehl $$0, eht $$1) {
      dwj $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         ehd $$3 = $$1.a();
         dbb $$4 = this.z();
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
   public dty j() {
      return this.o;
   }

   public void a(dty $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dty.f)) {
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

   public static io a(short $$0, int $$1, dag $$2) {
      int $$3 = jq.a($$2.e, $$0 & 15);
      int $$4 = jq.a($$1, $$0 >>> 4 & 15);
      int $$5 = jq.a($$2.f, $$0 >>> 8 & 15);
      return new io($$3, $$4, $$5);
   }

   @Override
   public void e(io $$0) {
      if (!this.s($$0)) {
         dsz.a(this.b, this.e($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dsz.a(this.b, $$1).add($$0);
   }

   public Map<io, ud> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ud a(io $$0, iz.a $$1) {
      doi $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(io $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dsy a(dwr.a $$0) {
      return this.q.get($$0);
   }

   public dsy b(dwr.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dsy(this.J_(), this.I_()));
   }

   public void a(dwr.a $$0, dsy $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eml $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dwj $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dwj x() {
      return this.r;
   }

   private static <T> evy<T> a(ewb<T> $$0) {
      return new evy<>($$0.b());
   }

   public evy<dea> G() {
      return a(this.s);
   }

   public evy<emv> H() {
      return a(this.t);
   }

   @Override
   public dbb z() {
      return (dbb)(this.y() ? dwj.b : this);
   }
}
