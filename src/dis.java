import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dis extends dhx {
   @Nullable
   private volatile eat n;
   private volatile dic o = dic.c;
   private final List<rt> p = Lists.newArrayList();
   private final Map<dlg.a, dhw> q = new Object2ObjectArrayMap();
   @Nullable
   private dky r;
   private final ejp<cua> s;
   private final ejp<ebd> t;

   public dis(cqg $$0, div $$1, crb $$2, io<crx> $$3, @Nullable dmn $$4) {
      this($$0, $$1, null, new ejp<>(), new ejp<>(), $$2, $$3, $$4);
   }

   public dis(cqg $$0, div $$1, @Nullable dij[] $$2, ejp<cua> $$3, ejp<ebd> $$4, crb $$5, io<crx> $$6, @Nullable dmn $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.s = $$3;
      this.t = $$4;
   }

   @Override
   public eju<cua> o() {
      return this.s;
   }

   @Override
   public eju<ebd> p() {
      return this.t;
   }

   @Override
   public dhx.a q() {
      return new dhx.a(this.s, this.t);
   }

   @Override
   public dgb a_(ht $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cuc.nb.o();
      } else {
         dij $$2 = this.b(this.e($$1));
         return $$2.c() ? cuc.a.o() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public ebe b_(ht $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return ebf.a.g();
      } else {
         dij $$2 = this.b(this.e($$1));
         return $$2.c() ? ebf.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public dgb a(ht $$0, dgb $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.I_() && $$4 < this.aj()) {
         int $$6 = this.e($$4);
         dij $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(cuc.a)) {
            return $$1;
         } else {
            int $$9 = iu.b($$3);
            int $$10 = iu.b($$4);
            int $$11 = iu.b($$5);
            dgb $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.o.b(dic.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.n.a($$0, $$13);
               }

               if (eav.a(this, $$0, $$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.n.a($$0);
               }
            }

            EnumSet<dlk.a> $$14 = this.j().h();
            EnumSet<dlk.a> $$15 = null;

            for (dlk.a $$16 : $$14) {
               dlk $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(dlk.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               dlk.a(this, $$15);
            }

            for (dlk.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      } else {
         return cuc.nb.o();
      }
   }

   @Override
   public void a(ddx $$0) {
      this.k.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public ddx c_(ht $$0) {
      return this.k.get($$0);
   }

   public Map<ht, ddx> D() {
      return this.k;
   }

   public void b(rt $$0) {
      this.p.add($$0);
   }

   @Override
   public void a(bjt $$0) {
      if (!$$0.bN()) {
         rt $$1 = new rt();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dwa $$0, dwi $$1) {
      dky $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dvs $$3 = $$1.a();
         crb $$4 = this.z();
         if ($$3.h() < $$4.I_() || $$3.k() >= $$4.aj()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<rt> E() {
      return this.p;
   }

   @Override
   public dic j() {
      return this.o;
   }

   public void a(dic $$0) {
      this.o = $$0;
      if (this.r != null && $$0.b(this.r.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public ib<crx> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.k().b(dic.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short j(ht $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static ht a(short $$0, int $$1, cqg $$2) {
      int $$3 = iu.a($$2.e, $$0 & 15);
      int $$4 = iu.a($$1, $$0 >>> 4 & 15);
      int $$5 = iu.a($$2.f, $$0 >>> 8 & 15);
      return new ht($$3, $$4, $$5);
   }

   @Override
   public void e(ht $$0) {
      if (!this.r($$0)) {
         dhx.a(this.b, this.e($$0.v())).add(j($$0));
      }
   }

   @Override
   public void a(short $$0, int $$1) {
      dhx.a(this.b, $$1).add($$0);
   }

   public Map<ht, rt> F() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public rt g(ht $$0) {
      ddx $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : this.j.get($$0);
   }

   @Override
   public void d(ht $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public dhw a(dlg.a $$0) {
      return this.q.get($$0);
   }

   public dhw b(dlg.a $$0) {
      return this.q.computeIfAbsent($$0, $$0x -> new dhw(this.J_(), this.I_()));
   }

   public void a(dlg.a $$0, dhw $$1) {
      this.q.put($$0, $$1);
   }

   public void a(eat $$0) {
      this.n = $$0;
   }

   public void a(@Nullable dky $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public dky x() {
      return this.r;
   }

   private static <T> ejm<T> a(ejp<T> $$0) {
      return new ejm<>($$0.b());
   }

   public ejm<cua> G() {
      return a(this.s);
   }

   public ejm<ebd> H() {
      return a(this.t);
   }

   @Override
   public crb z() {
      return (crb)(this.y() ? dky.b : this);
   }
}
