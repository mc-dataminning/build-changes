import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dnw extends dnb {
   @Nullable
   private volatile ege n;
   private volatile dng o = dng.c;
   private final List<sw> p = Lists.newArrayList();
   private final Map<dqk.a, dna> q = new Object2ObjectArrayMap();
   @Nullable
   private dqc r;
   private final eph<cyo> s;
   private final eph<ego> t;

   public dnw(cuu $$0, dnz $$1, cvp $$2, iv<cwm> $$3, @Nullable drr $$4) {
      this($$0, $$1, null, new eph<>(), new eph<>(), $$2, $$3, $$4);
   }

   public dnw(cuu $$0, dnz $$1, @Nullable dnn[] $$2, eph<cyo> $$3, eph<ego> $$4, cvp $$5, iv<cwm> $$6, @Nullable drr $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public epm<cyo> o() {
      return this.s;
   }

   @Override
   public epm<ego> p() {
      return this.t;
   }

   @Override
   public dnb.a q() {
      return new dnb.a(this.s, this.t);
   }

   @Override
   public dlf a_(hz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cyq.nb.o();
      } else {
         dnn $$2 = this.b(this.e($$1));
         return $$2.c() ? cyq.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public egp b_(hz $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return egq.a.g();
      } else {
         dnn $$2 = this.b(this.e($$1));
         return $$2.c() ? egq.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dlf a(hz $$0, dlf $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.J_() && $$4 < this.al()) {
         int $$6 = this.e($$4);
         dnn $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cyq.a)) {
            return $$1;
         } else {
            int $$9 = jb.b($$3);
            int $$10 = jb.b($$4);
            int $$11 = jb.b($$5);
            dlf $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dng.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (egg.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dqo.a> $$14 = this.j().h();
            EnumSet<dqo.a> $$15 = null;

            for (dqo.a $$16 : $$14) {
               dqo $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dqo.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dqo.a(this, $$15);
            }

            for (dqo.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cyq.nb.o();
      }
   }

   @Override
   public void a(dit $$0) {
      this.k.put($$0.aE_(), $$0);
   }

   @Nullable
   @Override
   public dit c_(hz $$0) {
      return this.k.get($$0);
   }

   public Map<hz, dit> D() {
      return this.k;
   }

   public void b(sw $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bno $$0) {
      if (!$$0.bO()) {
         sw $$1 = new sw();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(ebe $$0, ebm $$1) {
      dqc $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         eaw $$3 = $$1.a();
         cvp $$4 = this.z();
         if ($$3.i() < $$4.J_() || $$3.l() >= $$4.al()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<sw> E() {
      return this.p;
   }

   @Override
   public dng j() {
      return this.o;
   }

   public void a(dng $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dng.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short h(hz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static hz a(short $$0, int $$1, cuu $$2) {
      int $$3 = jb.a($$2.e, $$0 & 15);
      int $$4 = jb.a($$1, $$0 >>> 4 & 15);
      int $$5 = jb.a($$2.f, $$0 >>> 8 & 15);
      return new hz($$3, $$4, $$5);
   }

   @Override
   public void e(hz $$0) {
      if (!this.s($$0)) {
         dnb.a(this.b, this.e($$0.v())).add(h($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dnb.a(this.b, $$1).add($$0);
   }

   public Map<hz, sw> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public sw g(hz $$0) {
      dit $$1 = this.c_($$0);
      return $$1 != null ? $$1.o() : this.j.get($$0);
   }

   @Override
   public void d(hz $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dna a(dqk.a $$0) {
      return this.q.get($$0);
   }

   public dna b(dqk.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dna(this.K_(), this.J_()));
   }

   public void a(dqk.a $$0, dna $$1) {
      this.q.put($$0, $$1);
   }

   public void a(ege $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dqc $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dqc x() {
      return this.r;
   }

   private static <T> epe<T> a(eph<T> $$0) {
      return new epe<>($$0.b());
   }

   public epe<cyo> G() {
      return a(this.s);
   }

   public epe<ego> H() {
      return a(this.t);
   }

   @Override
   public cvp z() {
      return (cvp)(this.y() ? dqc.b : this);
   }
}
