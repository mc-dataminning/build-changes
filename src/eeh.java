import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eeh extends eec {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   public final int c;
   public final int d;
   public final agl<csf> e;
   private final boolean l;
   private final boolean m;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<eeh.a> n = Lists.newArrayList();
   private final Map<cdz, eeh.a> o = Maps.newHashMap();
   private final Map<String, eed> p = Maps.newHashMap();
   final Map<String, eee> q = Maps.newLinkedHashMap();
   private final Map<String, eef> r = Maps.newHashMap();
   private int s;

   public static eec.a<eeh> a() {
      return new eec.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, eeh::b, auw.j);
   }

   private eeh(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, agl<csf> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.l = $$3;
      this.m = $$4;
      this.h = $$5;
      this.c();
   }

   public static eeh a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, agl<csf> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = atq.a(($$0 + 64.0) / (double)$$6);
      int $$8 = atq.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new eeh($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static eeh a(byte $$0, boolean $$1, agl<csf> $$2) {
      return new eeh(0, 0, $$0, false, false, $$1, $$2);
   }

   public static eeh b(sd $$0) {
      agl<csf> $$1 = (agl<csf>)dkw.a(new Dynamic(sr.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$2 = $$0.h("xCenter");
      int $$3 = $$0.h("zCenter");
      byte $$4 = (byte)atq.a($$0.f("scale"), 0, 4);
      boolean $$5 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$6 = $$0.q("unlimitedTracking");
      boolean $$7 = $$0.q("locked");
      eeh $$8 = new eeh($$2, $$3, $$4, $$5, $$6, $$7, $$1);
      byte[] $$9 = $$0.m("colors");
      if ($$9.length == 16384) {
         $$8.g = $$9;
      }

      sj $$10 = $$0.c("banners", 10);

      for (int $$11 = 0; $$11 < $$10.size(); $$11++) {
         eed $$12 = eed.a($$10.a($$11));
         $$8.p.put($$12.f(), $$12);
         $$8.a($$12.c(), null, $$12.f(), (double)$$12.a().u(), (double)$$12.a().w(), 180.0, $$12.d());
      }

      sj $$13 = $$0.c("frames", 10);

      for (int $$14 = 0; $$14 < $$13.size(); $$14++) {
         eef $$15 = eef.a($$13.a($$14));
         $$8.r.put($$15.e(), $$15);
         $$8.a(eee.a.b, null, "frame-" + $$15.d(), (double)$$15.b().u(), (double)$$15.b().w(), (double)$$15.c(), null);
      }

      return $$8;
   }

   @Override
   public sd a(sd $$0) {
      agm.a.encodeStart(sr.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.l);
      $$0.a("unlimitedTracking", this.m);
      $$0.a("locked", this.h);
      sj $$1 = new sj();

      for (eed $$2 : this.p.values()) {
         $$1.add($$2.e());
      }

      $$0.a("banners", $$1);
      sj $$3 = new sj();

      for (eef $$4 : this.r.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public eeh b() {
      eeh $$0 = new eeh(this.c, this.d, this.f, this.l, this.m, true, this.e);
      $$0.p.putAll(this.p);
      $$0.q.putAll(this.q);
      $$0.s = this.s;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      $$0.c();
      return $$0;
   }

   public eeh a(int $$0) {
      return a((double)this.c, (double)this.d, (byte)atq.a(this.f + $$0, 0, 4), this.l, this.m, this.e);
   }

   public void a(cdz $$0, clo $$1) {
      if (!this.o.containsKey($$0)) {
         eeh.a $$2 = new eeh.a($$0);
         this.o.put($$0, $$2);
         this.n.add($$2);
      }

      if (!$$0.fT().h($$1)) {
         this.a($$0.ad().getString());
      }

      for (int $$3 = 0; $$3 < this.n.size(); $$3++) {
         eeh.a $$4 = this.n.get($$3);
         String $$5 = $$4.a.ad().getString();
         if (!$$4.a.dI() && ($$4.a.fT().h($$1) || $$1.F())) {
            if (!$$1.F() && $$4.a.dN().ad() == this.e && this.l) {
               this.a(eee.a.a, $$4.a.dN(), $$5, $$4.a.ds(), $$4.a.dy(), (double)$$4.a.dD(), null);
            }
         } else {
            this.o.remove($$4.a);
            this.n.remove($$4);
            this.a($$5);
         }
      }

      if ($$1.F() && this.l) {
         cal $$6 = $$1.G();
         hx $$7 = $$6.E();
         eef $$8 = this.r.get(eef.a($$7));
         if ($$8 != null && $$6.aj() != $$8.d() && this.r.containsKey($$8.e())) {
            this.a("frame-" + $$8.d());
         }

         eef $$9 = new eef($$7, $$6.cE().e() * 90, $$6.aj());
         this.a(eee.a.b, $$0.dN(), "frame-" + $$6.aj(), (double)$$7.u(), (double)$$7.w(), (double)($$6.cE().e() * 90), null);
         this.r.put($$9.e(), $$9);
      }

      sd $$10 = $$1.v();
      if ($$10 != null && $$10.b("Decorations", 9)) {
         sj $$11 = $$10.c("Decorations", 10);

         for (int $$12 = 0; $$12 < $$11.size(); $$12++) {
            sd $$13 = $$11.a($$12);
            if (!this.q.containsKey($$13.l("id"))) {
               this.a(eee.a.a($$13.f("type")), $$0.dN(), $$13.l("id"), $$13.k("x"), $$13.k("z"), $$13.k("rot"), null);
            }
         }
      }
   }

   private void a(String $$0) {
      eee $$1 = this.q.remove($$0);
      if ($$1 != null && $$1.c().g()) {
         this.s--;
      }

      this.h();
   }

   public static void a(clo $$0, hx $$1, String $$2, eee.a $$3) {
      sj $$4;
      if ($$0.u() && $$0.v().b("Decorations", 9)) {
         $$4 = $$0.v().c("Decorations", 10);
      } else {
         $$4 = new sj();
         $$0.a("Decorations", $$4);
      }

      sd $$6 = new sd();
      $$6.a("type", $$3.a());
      $$6.a("id", $$2);
      $$6.a("x", (double)$$1.u());
      $$6.a("z", (double)$$1.w());
      $$6.a("rot", 180.0);
      $$4.add($$6);
      if ($$3.e()) {
         sd $$7 = $$0.a("display");
         $$7.a("MapColor", $$3.f());
      }
   }

   private void a(eee.a $$0, @Nullable csg $$1, String $$2, double $$3, double $$4, double $$5, @Nullable uv $$6) {
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
         if (this.e == csf.i && $$1 != null) {
            int $$14 = (int)($$1.B_().f() / 10L);
            $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 15);
         }
      } else {
         if ($$0 != eee.a.a) {
            this.a($$2);
            return;
         }

         int $$15 = 320;
         if (Math.abs($$8) < 320.0F && Math.abs($$9) < 320.0F) {
            $$0 = eee.a.g;
         } else {
            if (!this.m) {
               this.a($$2);
               return;
            }

            $$0 = eee.a.h;
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

      eee $$18 = new eee($$0, $$10, $$11, $$13, $$6);
      eee $$19 = this.q.put($$2, $$18);
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
   public wo<?> a(int $$0, cdz $$1) {
      eeh.a $$2 = this.o.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (eeh.a $$2 : this.n) {
         $$2.a($$0, $$1);
      }
   }

   private void h() {
      this.c();
      this.n.forEach(eeh.a::b);
   }

   public eeh.a a(cdz $$0) {
      eeh.a $$1 = this.o.get($$0);
      if ($$1 == null) {
         $$1 = new eeh.a($$0);
         this.o.put($$0, $$1);
         this.n.add($$1);
      }

      return $$1;
   }

   public boolean a(csg $$0, hx $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         eed $$8 = eed.a($$0, $$1);
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

   public void a(crl $$0, int $$1, int $$2) {
      Iterator<eed> $$3 = this.p.values().iterator();

      while ($$3.hasNext()) {
         eed $$4 = $$3.next();
         if ($$4.a().u() == $$1 && $$4.a().w() == $$2) {
            eed $$5 = eed.a($$0, $$4.a());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.f());
            }
         }
      }
   }

   public Collection<eed> e() {
      return this.p.values();
   }

   public void a(hx $$0, int $$1) {
      this.a("frame-" + $$1);
      this.r.remove(eef.a($$0));
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
      for (eee $$0 : this.q.values()) {
         if ($$0.c().b()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<eee> $$0) {
      this.q.clear();
      this.s = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         eee $$2 = $$0.get($$1);
         this.q.put("icon-" + $$1, $$2);
         if ($$2.c().g()) {
            this.s++;
         }
      }
   }

   public Iterable<eee> g() {
      return this.q.values();
   }

   public boolean b(int $$0) {
      return this.s >= $$0;
   }

   public class a {
      public final cdz a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(cdz $$1) {
         this.a = $$1;
      }

      private eeh.b a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = eeh.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new eeh.b($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      wo<?> a(int $$0) {
         eeh.b $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<eee> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = eeh.this.q.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new zx($$0, eeh.this.f, eeh.this.h, $$3, $$1);
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

      public void a(eeh $$0) {
         for (int $$1 = 0; $$1 < this.c; $$1++) {
            for (int $$2 = 0; $$2 < this.d; $$2++) {
               $$0.b(this.a + $$1, this.b + $$2, this.e[$$1 + $$2 * this.c]);
            }
         }
      }
   }
}
