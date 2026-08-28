import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwg extends dvw {
   static final Logger n = LogUtils.getLogger();
   private static final dsy o = new dsy() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public je c() {
         return je.c;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<je, dwg.d> p = Maps.newHashMap();
   private boolean q;
   final dds r;
   @Nullable
   private Supplier<aqw> s;
   @Nullable
   private dwg.c t;
   private final Int2ObjectMap<dza> u;
   private final ezq<dgv> v;
   private final ezq<eqa> w;

   public dwg(dds $$0, dcy $$1) {
      this($$0, $$1, dwt.a, new ezq<>(), new ezq<>(), 0L, null, null, null);
   }

   public dwg(dds $$0, dcy $$1, dwt $$2, ezq<dgv> $$3, ezq<eqa> $$4, long $$5, @Nullable dwh[] $$6, @Nullable dwg.c $$7, @Nullable eaz $$8) {
      super($$1, $$2, $$0, $$0.F_().d(lv.aF), $$5, $$6, $$8);
      this.r = $$0;
      this.u = new Int2ObjectOpenHashMap();

      for (dzw.a $$9 : dzw.a.values()) {
         if (dwx.n.e().contains($$9)) {
            this.h.put($$9, new dzw(this, $$9));
         }
      }

      this.t = $$7;
      this.v = $$3;
      this.w = $$4;
   }

   public dwg(arg $$0, dwq $$1, @Nullable dwg.c $$2) {
      this($$0, $$1.f(), $$1.q(), $$1.H(), $$1.I(), $$1.t(), $$1.d(), $$2, $$1.s());

      for (dre $$3 : $$1.E().values()) {
         this.a($$3);
      }

      this.j.putAll($$1.G());

      for (int $$4 = 0; $$4 < $$1.n().length; $$4++) {
         this.b[$$4] = $$1.n()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for (Entry<dzw.a, dzw> $$5 : $$1.e()) {
         if (dwx.n.e().contains($$5.getKey())) {
            this.a($$5.getKey(), $$5.getValue().a());
         }
      }

      this.i = $$1.i;
      this.b($$1.u());
      this.c = true;
   }

   @Override
   public ezy<dgv> o() {
      return this.v;
   }

   @Override
   public ezy<eqa> p() {
      return this.w;
   }

   @Override
   public dvw.a a(long $$0) {
      return new dvw.a(this.v.a($$0), this.w.a($$0));
   }

   @Override
   public dza a(int $$0) {
      return this.r instanceof arg $$1 ? (dza)this.u.computeIfAbsent($$0, $$2 -> new dyw($$1, $$0, this::h)) : super.a($$0);
   }

   @Override
   public dua a_(je $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.r.aj()) {
         dua $$4 = null;
         if ($$2 == 60) {
            $$4 = dgx.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dzn.a($$1, $$3);
         }

         return $$4 == null ? dgx.a.o() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.m.length) {
               dwh $$6 = this.m[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dgx.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }

   @Override
   public eqb b_(je $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public eqb a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.m.length) {
            dwh $$4 = this.m[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return eqc.a.g();
      } catch (Throwable var7) {
         o $$6 = o.a(var7, "Getting fluid state");
         p $$7 = $$6.a("Block being got");
         $$7.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public dua a(je $$0, dua $$1, boolean $$2) {
      int $$3 = $$0.v();
      dwh $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.l()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         dua $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            dgv $$10 = $$1.b();
            this.h.get(dzw.a.e).a($$6, $$3, $$8, $$1);
            this.h.get(dzw.a.f).a($$6, $$3, $$8, $$1);
            this.h.get(dzw.a.d).a($$6, $$3, $$8, $$1);
            this.h.get(dzw.a.b).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.r.P().p().a($$0, $$11);
            }

            if (eps.a($$9, $$1)) {
               bny $$12 = this.r.ah();
               $$12.a("updateSkyLightSources");
               this.i.a(this, $$6, $$3, $$8);
               $$12.b("queueCheckLight");
               this.r.P().p().a($$0);
               $$12.c();
            }

            boolean $$13 = $$9.x();
            if (!this.r.B) {
               $$9.b(this.r, $$0, $$1, $$2);
            } else if (!$$9.a($$10) && $$13) {
               this.d($$0);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.r.B) {
                  $$1.a(this.r, $$0, $$9, $$2);
               }

               if ($$1.x()) {
                  dre $$14 = this.a($$0, dwg.b.c);
                  if ($$14 != null && !$$14.b($$1)) {
                     n.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$14.q().a().h().a(), $$1});
                     this.d($$0);
                     $$14 = null;
                  }

                  if ($$14 == null) {
                     $$14 = ((djn)$$10).a($$0, $$1);
                     if ($$14 != null) {
                        this.b($$14);
                     }
                  } else {
                     $$14.c($$1);
                     this.c($$14);
                  }
               }

               this.c = true;
               return $$9;
            }
         }
      }
   }

   @Deprecated
   @Override
   public void a(btj $$0) {
   }

   @Nullable
   private dre g(je $$0) {
      dua $$1 = this.a_($$0);
      return !$$1.x() ? null : ((djn)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public dre c_(je $$0) {
      return this.a($$0, dwg.b.c);
   }

   @Nullable
   public dre a(je $$0, dwg.b $$1) {
      dre $$2 = this.k.get($$0);
      if ($$2 == null) {
         uf $$3 = this.j.remove($$0);
         if ($$3 != null) {
            dre $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == dwg.b.a) {
            $$2 = this.g($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.n()) {
         this.k.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(dre $$0) {
      this.a($$0);
      if (this.J()) {
         if (this.r instanceof arg $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }
   }

   private boolean J() {
      return this.q || this.r.w_();
   }

   boolean h(je $$0) {
      if (!this.r.A_().a($$0)) {
         return false;
      } else {
         return !(this.r instanceof arg $$1) ? true : this.C().a(aqw.c) && $$1.c(dcy.a($$0));
      }
   }

   @Override
   public void a(dre $$0) {
      je $$1 = $$0.aD_();
      dua $$2 = this.a_($$1);
      if (!$$2.x()) {
         n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
      } else {
         dua $$3 = $$0.m();
         if ($$2 != $$3) {
            if (!$$0.q().a($$2)) {
               n.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
               return;
            }

            if ($$2.b() != $$3.b()) {
               n.warn("Block state mismatch on block entity {} in position {}, {} != {}, updating", new Object[]{$$0, $$1, $$2, $$3});
            }

            $$0.c($$2);
         }

         $$0.a(this.r);
         $$0.o();
         dre $$4 = this.k.put($$1.j(), $$0);
         if ($$4 != null && $$4 != $$0) {
            $$4.ay_();
         }
      }
   }

   @Nullable
   @Override
   public uf a(je $$0, jp.a $$1) {
      dre $$2 = this.c_($$0);
      if ($$2 != null && !$$2.n()) {
         uf $$3 = $$2.b(this.r.F_());
         $$3.a("keepPacked", false);
         return $$3;
      } else {
         uf $$4 = this.j.get($$0);
         if ($$4 != null) {
            $$4 = $$4.i();
            $$4.a("keepPacked", true);
         }

         return $$4;
      }
   }

   @Override
   public void d(je $$0) {
      if (this.J()) {
         dre $$1 = this.k.remove($$0);
         if ($$1 != null) {
            if (this.r instanceof arg $$2) {
               this.a($$1, $$2);
            }

            $$1.ay_();
         }
      }

      this.k($$0);
   }

   private <T extends dre> void a(T $$0, arg $$1) {
      dgv $$2 = $$0.m().b();
      if ($$2 instanceof djn) {
         dyz $$3 = ((djn)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = kg.a($$0.aD_().v());
            dza $$5 = this.a($$4);
            $$5.b($$3);
         }
      }
   }

   private void h(int $$0) {
      this.u.remove($$0);
   }

   private void k(je $$0) {
      dwg.d $$1 = this.p.remove($$0);
      if ($$1 != null) {
         $$1.a(o);
      }
   }

   public void D() {
      if (this.t != null) {
         this.t.run(this);
         this.t = null;
      }
   }

   public boolean B() {
      return false;
   }

   public void a(wa $$0, uf $$1, Consumer<adk.b> $$2) {
      this.H();

      for (dwh $$3 : this.m) {
         $$3.a($$0);
      }

      for (dzw.a $$4 : dzw.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      this.z();
      $$2.accept(($$0x, $$1x, $$2x) -> {
         dre $$3 = this.a($$0x, dwg.b.a);
         if ($$3 != null && $$2x != null && $$3.q() == $$1x) {
            $$3.c($$2x, this.r.F_());
         }
      });
   }

   public void a(wa $$0) {
      for (dwh $$1 : this.m) {
         $$1.b($$0);
      }
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public dds E() {
      return this.r;
   }

   public Map<je, dre> F() {
      return this.k;
   }

   public void G() {
      dcy $$0 = this.f();

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         if (this.b[$$1] != null) {
            ShortListIterator $$7 = this.b[$$1].iterator();

            while ($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               je $$3 = dwq.a($$2, this.g($$1), $$0);
               dua $$4 = this.a_($$3);
               eqb $$5 = $$4.y();
               if (!$$5.c()) {
                  $$5.a(this.r, $$3, $$4);
               }

               if (!($$4.b() instanceof dll)) {
                  dua $$6 = dgv.b($$4, this.r, $$3);
                  if ($$6 != $$4) {
                     this.r.a($$3, $$6, 20);
                  }
               }
            }

            this.b[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.j.keySet()).iterator();

      while (var9.hasNext()) {
         je $$7 = (je)var9.next();
         this.c_($$7);
      }

      this.j.clear();
      this.f.a(this);
   }

   @Nullable
   private dre a(je $$0, uf $$1) {
      dua $$2 = this.a_($$0);
      dre $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.x()) {
            $$3 = ((djn)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            n.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = dre.a($$0, $$2, $$1, this.r.F_());
      }

      if ($$3 != null) {
         $$3.a(this.r);
         this.b($$3);
      } else {
         n.warn("Tried to load a block entity for block {} but failed at location {}", $$2, $$0);
      }

      return $$3;
   }

   public void d(long $$0) {
      this.v.b($$0);
      this.w.b($$0);
   }

   public void a(arg $$0) {
      $$0.m().a(this.d, this.v);
      $$0.n().a(this.d, this.w);
   }

   public void b(arg $$0) {
      $$0.m().a(this.d);
      $$0.n().a(this.d);
   }

   @Override
   public dwx j() {
      return dwx.n;
   }

   public aqw C() {
      return this.s == null ? aqw.b : this.s.get();
   }

   public void b(Supplier<aqw> $$0) {
      this.s = $$0;
   }

   public void H() {
      this.k.values().forEach(dre::ay_);
      this.k.clear();
      this.p.values().forEach($$0 -> $$0.a(o));
      this.p.clear();
   }

   public void I() {
      this.k.values().forEach($$0 -> {
         if (this.r instanceof arg $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends dre> void b(T $$0, arg $$1) {
      dgv $$2 = $$0.m().b();
      if ($$2 instanceof djn) {
         dyz $$3 = ((djn)$$2).a($$1, $$0);
         if ($$3 != null) {
            this.a(kg.a($$0.aD_().v())).a($$3);
         }
      }
   }

   private <T extends dre> void c(T $$0) {
      dua $$1 = $$0.m();
      drf<T> $$2 = $$1.a(this.r, (drg<T>)$$0.q());
      if ($$2 == null) {
         this.k($$0.aD_());
      } else {
         this.p.compute($$0.aD_(), ($$2x, $$3) -> {
            dsy $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return (dwg.d)$$3;
            } else if (this.J()) {
               dwg.d $$5 = new dwg.d($$4);
               this.r.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }
   }

   private <T extends dre> dsy a(T $$0, drf<T> $$1) {
      return new dwg.a<>($$0, $$1);
   }

   class a<T extends dre> implements dsy {
      private final T b;
      private final drf<T> c;
      private boolean d;

      a(final T $$0, final drf<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.n() && this.b.l()) {
            je $$0 = this.b.aD_();
            if (dwg.this.h($$0)) {
               try {
                  bny $$1 = dwg.this.r.ah();
                  $$1.a(this::d);
                  dua $$2 = dwg.this.a_($$0);
                  if (this.b.q().a($$2)) {
                     this.c.tick(dwg.this.r, this.b.aD_(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     dwg.n.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                  }

                  $$1.c();
               } catch (Throwable var5) {
                  o $$4 = o.a(var5, "Ticking block entity");
                  p $$5 = $$4.a("Block entity being ticked");
                  this.b.a($$5);
                  throw new z($$4);
               }
            }
         }
      }

      @Override
      public boolean b() {
         return this.b.n();
      }

      @Override
      public je c() {
         return this.b.aD_();
      }

      @Override
      public String d() {
         return drg.a(this.b.q()).toString();
      }

      @Override
      public String toString() {
         return "Level ticker for " + this.d() + "@" + this.c();
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   @FunctionalInterface
   public interface c {
      void run(dwg var1);
   }

   class d implements dsy {
      private dsy a;

      d(final dsy $$0) {
         this.a = $$0;
      }

      void a(dsy $$0) {
         this.a = $$0;
      }

      @Override
      public void a() {
         this.a.a();
      }

      @Override
      public boolean b() {
         return this.a.b();
      }

      @Override
      public je c() {
         return this.a.c();
      }

      @Override
      public String d() {
         return this.a.d();
      }

      @Override
      public String toString() {
         return this.a + " <wrapped>";
      }
   }
}
