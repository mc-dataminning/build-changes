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

public class ebl extends ebg {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   public final int c;
   public final int d;
   public final aeo<cpk> e;
   private final boolean l;
   private final boolean m;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<ebl.a> n = Lists.newArrayList();
   private final Map<cbl, ebl.a> o = Maps.newHashMap();
   private final Map<String, ebh> p = Maps.newHashMap();
   final Map<String, ebi> q = Maps.newLinkedHashMap();
   private final Map<String, ebj> r = Maps.newHashMap();
   private int s;

   public static ebg.a<ebl> a() {
      return new ebg.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, ebl::b, asq.j);
   }

   private ebl(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, aeo<cpk> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.l = $$3;
      this.m = $$4;
      this.h = $$5;
      this.c();
   }

   public static ebl a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, aeo<cpk> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = aro.a(($$0 + 64.0) / (double)$$6);
      int $$8 = aro.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new ebl($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static ebl a(byte $$0, boolean $$1, aeo<cpk> $$2) {
      return new ebl(0, 0, $$0, false, false, $$1, $$2);
   }

   public static ebl b(qs $$0) {
      aeo<cpk> $$1 = (aeo<cpk>)dih.a(new Dynamic(rd.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$2 = $$0.h("xCenter");
      int $$3 = $$0.h("zCenter");
      byte $$4 = (byte)aro.a($$0.f("scale"), 0, 4);
      boolean $$5 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$6 = $$0.q("unlimitedTracking");
      boolean $$7 = $$0.q("locked");
      ebl $$8 = new ebl($$2, $$3, $$4, $$5, $$6, $$7, $$1);
      byte[] $$9 = $$0.m("colors");
      if ($$9.length == 16384) {
         $$8.g = $$9;
      }

      qy $$10 = $$0.c("banners", 10);

      for (int $$11 = 0; $$11 < $$10.size(); $$11++) {
         ebh $$12 = ebh.a($$10.a($$11));
         $$8.p.put($$12.f(), $$12);
         $$8.a($$12.c(), null, $$12.f(), (double)$$12.a().u(), (double)$$12.a().w(), 180.0, $$12.d());
      }

      qy $$13 = $$0.c("frames", 10);

      for (int $$14 = 0; $$14 < $$13.size(); $$14++) {
         ebj $$15 = ebj.a($$13.a($$14));
         $$8.r.put($$15.e(), $$15);
         $$8.a(ebi.a.b, null, "frame-" + $$15.d(), (double)$$15.b().u(), (double)$$15.b().w(), (double)$$15.c(), null);
      }

      return $$8;
   }

   @Override
   public qs a(qs $$0) {
      aep.a.encodeStart(rd.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.l);
      $$0.a("unlimitedTracking", this.m);
      $$0.a("locked", this.h);
      qy $$1 = new qy();

      for (ebh $$2 : this.p.values()) {
         $$1.add($$2.e());
      }

      $$0.a("banners", $$1);
      qy $$3 = new qy();

      for (ebj $$4 : this.r.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public ebl b() {
      ebl $$0 = new ebl(this.c, this.d, this.f, this.l, this.m, true, this.e);
      $$0.p.putAll(this.p);
      $$0.q.putAll(this.q);
      $$0.s = this.s;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      $$0.c();
      return $$0;
   }

   public ebl a(int $$0) {
      return a((double)this.c, (double)this.d, (byte)aro.a(this.f + $$0, 0, 4), this.l, this.m, this.e);
   }

   public void a(cbl $$0, ciw $$1) {
      if (!this.o.containsKey($$0)) {
         ebl.a $$2 = new ebl.a($$0);
         this.o.put($$0, $$2);
         this.n.add($$2);
      }

      if (!$$0.fQ().h($$1)) {
         this.a($$0.ab().getString());
      }

      for (int $$3 = 0; $$3 < this.n.size(); $$3++) {
         ebl.a $$4 = this.n.get($$3);
         String $$5 = $$4.a.ab().getString();
         if (!$$4.a.dF() && ($$4.a.fQ().h($$1) || $$1.F())) {
            if (!$$1.F() && $$4.a.dK().ac() == this.e && this.l) {
               this.a(ebi.a.a, $$4.a.dK(), $$5, $$4.a.dp(), $$4.a.dv(), (double)$$4.a.dA(), null);
            }
         } else {
            this.o.remove($$4.a);
            this.n.remove($$4);
            this.a($$5);
         }
      }

      if ($$1.F() && this.l) {
         bxx $$6 = $$1.G();
         gv $$7 = $$6.y();
         ebj $$8 = this.r.get(ebj.a($$7));
         if ($$8 != null && $$6.ah() != $$8.d() && this.r.containsKey($$8.e())) {
            this.a("frame-" + $$8.d());
         }

         ebj $$9 = new ebj($$7, $$6.cD().e() * 90, $$6.ah());
         this.a(ebi.a.b, $$0.dK(), "frame-" + $$6.ah(), (double)$$7.u(), (double)$$7.w(), (double)($$6.cD().e() * 90), null);
         this.r.put($$9.e(), $$9);
      }

      qs $$10 = $$1.v();
      if ($$10 != null && $$10.b("Decorations", 9)) {
         qy $$11 = $$10.c("Decorations", 10);

         for (int $$12 = 0; $$12 < $$11.size(); $$12++) {
            qs $$13 = $$11.a($$12);
            if (!this.q.containsKey($$13.l("id"))) {
               this.a(ebi.a.a($$13.f("type")), $$0.dK(), $$13.l("id"), $$13.k("x"), $$13.k("z"), $$13.k("rot"), null);
            }
         }
      }
   }

   private void a(String $$0) {
      ebi $$1 = this.q.remove($$0);
      if ($$1 != null && $$1.b().e()) {
         this.s--;
      }

      this.h();
   }

   public static void a(ciw $$0, gv $$1, String $$2, ebi.a $$3) {
      qy $$4;
      if ($$0.u() && $$0.v().b("Decorations", 9)) {
         $$4 = $$0.v().c("Decorations", 10);
      } else {
         $$4 = new qy();
         $$0.a("Decorations", $$4);
      }

      qs $$6 = new qs();
      $$6.a("type", $$3.a());
      $$6.a("id", $$2);
      $$6.a("x", (double)$$1.u());
      $$6.a("z", (double)$$1.w());
      $$6.a("rot", 180.0);
      $$4.add($$6);
      if ($$3.c()) {
         qs $$7 = $$0.a("display");
         $$7.a("MapColor", $$3.d());
      }
   }

   private void a(ebi.a $$0, @Nullable cpl $$1, String $$2, double $$3, double $$4, double $$5, @Nullable te $$6) {
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
         if (this.e == cpk.i && $$1 != null) {
            int $$14 = (int)($$1.u_().f() / 10L);
            $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 15);
         }
      } else {
         if ($$0 != ebi.a.a) {
            this.a($$2);
            return;
         }

         int $$15 = 320;
         if (Math.abs($$8) < 320.0F && Math.abs($$9) < 320.0F) {
            $$0 = ebi.a.g;
         } else {
            if (!this.m) {
               this.a($$2);
               return;
            }

            $$0 = ebi.a.h;
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

      ebi $$18 = new ebi($$0, $$10, $$11, $$13, $$6);
      ebi $$19 = this.q.put($$2, $$18);
      if (!$$18.equals($$19)) {
         if ($$19 != null && $$19.b().e()) {
            this.s--;
         }

         if ($$0.e()) {
            this.s++;
         }

         this.h();
      }
   }

   @Nullable
   public uw<?> a(int $$0, cbl $$1) {
      ebl.a $$2 = this.o.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (ebl.a $$2 : this.n) {
         $$2.a($$0, $$1);
      }
   }

   private void h() {
      this.c();
      this.n.forEach(ebl.a::b);
   }

   public ebl.a a(cbl $$0) {
      ebl.a $$1 = this.o.get($$0);
      if ($$1 == null) {
         $$1 = new ebl.a($$0);
         this.o.put($$0, $$1);
         this.n.add($$1);
      }

      return $$1;
   }

   public boolean a(cpl $$0, gv $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         ebh $$8 = ebh.a($$0, $$1);
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

   public void a(coq $$0, int $$1, int $$2) {
      Iterator<ebh> $$3 = this.p.values().iterator();

      while ($$3.hasNext()) {
         ebh $$4 = $$3.next();
         if ($$4.a().u() == $$1 && $$4.a().w() == $$2) {
            ebh $$5 = ebh.a($$0, $$4.a());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.f());
            }
         }
      }
   }

   public Collection<ebh> e() {
      return this.p.values();
   }

   public void a(gv $$0, int $$1) {
      this.a("frame-" + $$1);
      this.r.remove(ebj.a($$0));
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
      for (ebi $$0 : this.q.values()) {
         if ($$0.b() == ebi.a.i || $$0.b() == ebi.a.j) {
            return true;
         }
      }

      return false;
   }

   public void a(List<ebi> $$0) {
      this.q.clear();
      this.s = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ebi $$2 = $$0.get($$1);
         this.q.put("icon-" + $$1, $$2);
         if ($$2.b().e()) {
            this.s++;
         }
      }
   }

   public Iterable<ebi> g() {
      return this.q.values();
   }

   public boolean b(int $$0) {
      return this.s >= $$0;
   }

   public class a {
      public final cbl a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(cbl $$1) {
         this.a = $$1;
      }

      private ebl.b a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = ebl.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new ebl.b($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      uw<?> a(int $$0) {
         ebl.b $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<ebi> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = ebl.this.q.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new yf($$0, ebl.this.f, ebl.this.h, $$3, $$1);
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

      public void a(ebl $$0) {
         for (int $$1 = 0; $$1 < this.c; $$1++) {
            for (int $$2 = 0; $$2 < this.d; $$2++) {
               $$0.b(this.a + $$1, this.b + $$2, this.e[$$1 + $$2 * this.c]);
            }
         }
      }
   }
}
