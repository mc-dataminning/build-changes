import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eig extends eib {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   public final int c;
   public final int d;
   public final aix<cvr> e;
   private final boolean l;
   private final boolean m;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<eig.a> n = Lists.newArrayList();
   private final Map<chl, eig.a> o = Maps.newHashMap();
   private final Map<String, eic> p = Maps.newHashMap();
   final Map<String, eid> q = Maps.newLinkedHashMap();
   private final Map<String, eie> r = Maps.newHashMap();
   private int s;

   public static eib.a<eig> a() {
      return new eib.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, eig::b, axo.j);
   }

   private eig(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, aix<cvr> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.l = $$3;
      this.m = $$4;
      this.h = $$5;
      this.c();
   }

   public static eig a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, aix<cvr> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = awi.a(($$0 + 64.0) / (double)$$6);
      int $$8 = awi.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new eig($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static eig a(byte $$0, boolean $$1, aix<cvr> $$2) {
      return new eig(0, 0, $$0, false, false, $$1, $$2);
   }

   public static eig b(sw $$0) {
      aix<cvr> $$1 = (aix<cvr>)dov.a(new Dynamic(tk.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$2 = $$0.h("xCenter");
      int $$3 = $$0.h("zCenter");
      byte $$4 = (byte)awi.a($$0.f("scale"), 0, 4);
      boolean $$5 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$6 = $$0.q("unlimitedTracking");
      boolean $$7 = $$0.q("locked");
      eig $$8 = new eig($$2, $$3, $$4, $$5, $$6, $$7, $$1);
      byte[] $$9 = $$0.m("colors");
      if ($$9.length == 16384) {
         $$8.g = $$9;
      }

      tc $$10 = $$0.c("banners", 10);

      for (int $$11 = 0; $$11 < $$10.size(); $$11++) {
         eic $$12 = eic.a($$10.a($$11));
         $$8.p.put($$12.f(), $$12);
         $$8.a($$12.c(), null, $$12.f(), (double)$$12.a().u(), (double)$$12.a().w(), 180.0, $$12.d());
      }

      tc $$13 = $$0.c("frames", 10);

      for (int $$14 = 0; $$14 < $$13.size(); $$14++) {
         eie $$15 = eie.a($$13.a($$14));
         $$8.r.put($$15.e(), $$15);
         $$8.a(eid.a.b, null, "frame-" + $$15.d(), (double)$$15.b().u(), (double)$$15.b().w(), (double)$$15.c(), null);
      }

      return $$8;
   }

   @Override
   public sw a(sw $$0) {
      aiy.a.encodeStart(tk.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.l);
      $$0.a("unlimitedTracking", this.m);
      $$0.a("locked", this.h);
      tc $$1 = new tc();

      for (eic $$2 : this.p.values()) {
         $$1.add($$2.e());
      }

      $$0.a("banners", $$1);
      tc $$3 = new tc();

      for (eie $$4 : this.r.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public eig b() {
      eig $$0 = new eig(this.c, this.d, this.f, this.l, this.m, true, this.e);
      $$0.p.putAll(this.p);
      $$0.q.putAll(this.q);
      $$0.s = this.s;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      $$0.c();
      return $$0;
   }

   public eig a(int $$0) {
      return a((double)this.c, (double)this.d, (byte)awi.a(this.f + $$0, 0, 4), this.l, this.m, this.e);
   }

   private static Predicate<cpd> a(cpd $$0) {
      Integer $$1 = cpk.d($$0);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.d()) && Objects.equals($$1, cpk.d($$2));
   }

   public void a(chl $$0, cpd $$1) {
      if (!this.o.containsKey($$0)) {
         eig.a $$2 = new eig.a($$0);
         this.o.put($$0, $$2);
         this.n.add($$2);
      }

      Predicate<cpd> $$3 = a($$1);
      if (!$$0.fT().b($$3)) {
         this.a($$0.ad().getString());
      }

      for (int $$4 = 0; $$4 < this.n.size(); $$4++) {
         eig.a $$5 = this.n.get($$4);
         String $$6 = $$5.a.ad().getString();
         if (!$$5.a.dH() && ($$5.a.fT().b($$3) || $$1.G())) {
            if (!$$1.G() && $$5.a.dM().ad() == this.e && this.l) {
               this.a(eid.a.a, $$5.a.dM(), $$6, $$5.a.dr(), $$5.a.dx(), (double)$$5.a.dC(), null);
            }
         } else {
            this.o.remove($$5.a);
            this.n.remove($$5);
            this.a($$6);
         }
      }

      if ($$1.G() && this.l) {
         cdp $$7 = $$1.H();
         hz $$8 = $$7.E();
         eie $$9 = this.r.get(eie.a($$8));
         if ($$9 != null && $$7.aj() != $$9.d() && this.r.containsKey($$9.e())) {
            this.a("frame-" + $$9.d());
         }

         eie $$10 = new eie($$8, $$7.cE().e() * 90, $$7.aj());
         this.a(eid.a.b, $$0.dM(), "frame-" + $$7.aj(), (double)$$8.u(), (double)$$8.w(), (double)($$7.cE().e() * 90), null);
         this.r.put($$10.e(), $$10);
      }

      sw $$11 = $$1.w();
      if ($$11 != null && $$11.b("Decorations", 9)) {
         tc $$12 = $$11.c("Decorations", 10);

         for (int $$13 = 0; $$13 < $$12.size(); $$13++) {
            sw $$14 = $$12.a($$13);
            if (!this.q.containsKey($$14.l("id"))) {
               this.a(eid.a.a($$14.f("type")), $$0.dM(), $$14.l("id"), $$14.k("x"), $$14.k("z"), $$14.k("rot"), null);
            }
         }
      }
   }

   private void a(String $$0) {
      eid $$1 = this.q.remove($$0);
      if ($$1 != null && $$1.c().g()) {
         this.s--;
      }

      this.h();
   }

   public static void a(cpd $$0, hz $$1, String $$2, eid.a $$3) {
      tc $$4;
      if ($$0.v() && $$0.w().b("Decorations", 9)) {
         $$4 = $$0.w().c("Decorations", 10);
      } else {
         $$4 = new tc();
         $$0.a("Decorations", $$4);
      }

      sw $$6 = new sw();
      $$6.a("type", $$3.a());
      $$6.a("id", $$2);
      $$6.a("x", (double)$$1.u());
      $$6.a("z", (double)$$1.w());
      $$6.a("rot", 180.0);
      $$4.add($$6);
      if ($$3.e()) {
         sw $$7 = $$0.a("display");
         $$7.a("MapColor", $$3.f());
      }
   }

   private void a(eid.a $$0, @Nullable cvs $$1, String $$2, double $$3, double $$4, double $$5, @Nullable vq $$6) {
      int $$7 = 1 << this.f;
      float $$8 = (float)($$3 - (double)this.c) / (float)$$7;
      float $$9 = (float)($$4 - (double)this.d) / (float)$$7;
      byte $$10 = (byte)((int)((double)($$8 * 2.0F) + 0.5));
      byte $$11 = (byte)((int)((double)($$9 * 2.0F) + 0.5));
      int $$12 = 63;
      byte $$13;
      if ($$8 >= -63.0F && $$9 >= -63.0F && $$8 <= 63.0F && $$9 <= 63.0F) {
         $$5 += $$5 < 0.0 ? -8.0 : 8.0;
         $$13 = (byte)((int)($$5 * 16.0 / 360.0));
         if (this.e == cvr.i && $$1 != null) {
            int $$14 = (int)($$1.B_().d() / 10L);
            $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 15);
         }
      } else {
         if ($$0 != eid.a.a) {
            this.a($$2);
            return;
         }

         int $$15 = 320;
         if (Math.abs($$8) < 320.0F && Math.abs($$9) < 320.0F) {
            $$0 = eid.a.g;
         } else {
            if (!this.m) {
               this.a($$2);
               return;
            }

            $$0 = eid.a.h;
         }

         $$13 = 0;
         if ($$8 <= -63.0F) {
            $$10 = -128;
         }

         if ($$9 <= -63.0F) {
            $$11 = -128;
         }

         if ($$8 >= 63.0F) {
            $$10 = 127;
         }

         if ($$9 >= 63.0F) {
            $$11 = 127;
         }
      }

      eid $$18 = new eid($$0, $$10, $$11, $$13, $$6);
      eid $$19 = this.q.put($$2, $$18);
      if (!$$18.equals($$19)) {
         if ($$19 != null && $$19.c().g()) {
            this.s--;
         }

         if ($$0.g()) {
            this.s++;
         }

         this.h();
      }
   }

   @Nullable
   public xx<?> a(int $$0, chl $$1) {
      eig.a $$2 = this.o.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (eig.a $$2 : this.n) {
         $$2.a($$0, $$1);
      }
   }

   private void h() {
      this.c();
      this.n.forEach(eig.a::b);
   }

   public eig.a a(chl $$0) {
      eig.a $$1 = this.o.get($$0);
      if ($$1 == null) {
         $$1 = new eig.a($$0);
         this.o.put($$0, $$1);
         this.n.add($$1);
      }

      return $$1;
   }

   public boolean a(cvs $$0, hz $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         eic $$8 = eic.a($$0, $$1);
         if ($$8 == null) {
            return false;
         }

         if (this.p.remove($$8.f(), $$8)) {
            this.a($$8.f());
            return true;
         }

         if (!this.b(256)) {
            this.p.put($$8.f(), $$8);
            this.a($$8.c(), $$0, $$8.f(), $$2, $$3, 180.0, $$8.d());
            return true;
         }
      }

      return false;
   }

   public void a(cux $$0, int $$1, int $$2) {
      Iterator<eic> $$3 = this.p.values().iterator();

      while ($$3.hasNext()) {
         eic $$4 = $$3.next();
         if ($$4.a().u() == $$1 && $$4.a().w() == $$2) {
            eic $$5 = eic.a($$0, $$4.a());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.f());
            }
         }
      }
   }

   public Collection<eic> e() {
      return this.p.values();
   }

   public void a(hz $$0, int $$1) {
      this.a("frame-" + $$1);
      this.r.remove(eie.a($$0));
   }

   public boolean a(int $$0, int $$1, byte $$2) {
      byte $$3 = this.g[$$0 + $$1 * 128];
      if ($$3 != $$2) {
         this.b($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   public void b(int $$0, int $$1, byte $$2) {
      this.g[$$0 + $$1 * 128] = $$2;
      this.a($$0, $$1);
   }

   public boolean f() {
      for (eid $$0 : this.q.values()) {
         if ($$0.c().b()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<eid> $$0) {
      this.q.clear();
      this.s = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         eid $$2 = $$0.get($$1);
         this.q.put("icon-" + $$1, $$2);
         if ($$2.c().g()) {
            this.s++;
         }
      }
   }

   public Iterable<eid> g() {
      return this.q.values();
   }

   public boolean b(int $$0) {
      return this.s >= $$0;
   }

   public class a {
      public final chl a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(chl $$1) {
         this.a = $$1;
      }

      private eig.b a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = eig.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new eig.b($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      xx<?> a(int $$0) {
         eig.b $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<eid> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = eig.this.q.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new abx($$0, eig.this.f, eig.this.h, $$3, $$1);
      }

      void a(int $$0, int $$1) {
         if (this.d) {
            this.e = Math.min(this.e, $$0);
            this.f = Math.min(this.f, $$1);
            this.g = Math.max(this.g, $$0);
            this.h = Math.max(this.h, $$1);
         } else {
            this.d = true;
            this.e = $$0;
            this.f = $$1;
            this.g = $$0;
            this.h = $$1;
         }
      }

      private void b() {
         this.i = true;
      }
   }

   public static class b {
      public final int a;
      public final int b;
      public final int c;
      public final int d;
      public final byte[] e;

      public b(int $$0, int $$1, int $$2, int $$3, byte[] $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a(eig $$0) {
         for (int $$1 = 0; $$1 < this.c; $$1++) {
            for (int $$2 = 0; $$2 < this.d; $$2++) {
               $$0.b(this.a + $$1, this.b + $$2, this.e[$$1 + $$2 * this.c]);
            }
         }
      }
   }
}
