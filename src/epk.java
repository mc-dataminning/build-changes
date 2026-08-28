import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epk extends epc {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   public final int c;
   public final int d;
   public final ale<dby> e;
   private final boolean l;
   private final boolean m;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<epk.a> n = Lists.newArrayList();
   private final Map<cmx, epk.a> o = Maps.newHashMap();
   private final Map<String, epd> p = Maps.newHashMap();
   final Map<String, epe> q = Maps.newLinkedHashMap();
   private final Map<String, eph> r = Maps.newHashMap();
   private int s;

   public static epc.a<epk> a() {
      return new epc.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, epk::b, bag.j);
   }

   private epk(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, ale<dby> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.l = $$3;
      this.m = $$4;
      this.h = $$5;
      this.c();
   }

   public static epk a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, ale<dby> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = ayz.a(($$0 + 64.0) / (double)$$6);
      int $$8 = ayz.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new epk($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static epk a(byte $$0, boolean $$1, ale<dby> $$2) {
      return new epk(0, 0, $$0, false, false, $$1, $$2);
   }

   public static epk b(us $$0, jk.a $$1) {
      ale<dby> $$2 = (ale<dby>)dvu.a(new Dynamic(vg.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$3 = $$0.h("xCenter");
      int $$4 = $$0.h("zCenter");
      byte $$5 = (byte)ayz.a($$0.f("scale"), 0, 4);
      boolean $$6 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$7 = $$0.q("unlimitedTracking");
      boolean $$8 = $$0.q("locked");
      epk $$9 = new epk($$3, $$4, $$5, $$6, $$7, $$8, $$2);
      byte[] $$10 = $$0.m("colors");
      if ($$10.length == 16384) {
         $$9.g = $$10;
      }

      ald<vp> $$11 = $$1.a(vg.a);

      for (epd $$13 : epd.b.parse($$11, $$0.c("banners")).resultOrPartial($$0x -> i.warn("Failed to parse map banner: '{}'", $$0x)).orElse(List.of())) {
         $$9.p.put($$13.b(), $$13);
         $$9.a($$13.a(), null, $$13.b(), (double)$$13.c().u(), (double)$$13.c().w(), 180.0, $$13.e().orElse(null));
      }

      uy $$14 = $$0.c("frames", 10);

      for (int $$15 = 0; $$15 < $$14.size(); $$15++) {
         eph $$16 = eph.a($$14.a($$15));
         if ($$16 != null) {
            $$9.r.put($$16.e(), $$16);
            $$9.a(epg.b, null, "frame-" + $$16.d(), (double)$$16.b().u(), (double)$$16.b().w(), (double)$$16.c(), null);
         }
      }

      return $$9;
   }

   @Override
   public us a(us $$0, jk.a $$1) {
      alf.a.encodeStart(vg.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.l);
      $$0.a("unlimitedTracking", this.m);
      $$0.a("locked", this.h);
      ald<vp> $$2 = $$1.a(vg.a);
      $$0.a("banners", (vp)epd.b.encodeStart($$2, List.copyOf(this.p.values())).getOrThrow());
      uy $$3 = new uy();

      for (eph $$4 : this.r.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public epk b() {
      epk $$0 = new epk(this.c, this.d, this.f, this.l, this.m, true, this.e);
      $$0.p.putAll(this.p);
      $$0.q.putAll(this.q);
      $$0.s = this.s;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      $$0.c();
      return $$0;
   }

   public epk e() {
      return a((double)this.c, (double)this.d, (byte)ayz.a(this.f + 1, 0, 4), this.l, this.m, this.e);
   }

   private static Predicate<cup> a(cup $$0) {
      epi $$1 = $$0.a(km.B);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.g()) && Objects.equals($$1, $$2.a(km.B));
   }

   public void a(cmx $$0, cup $$1) {
      if (!this.o.containsKey($$0)) {
         epk.a $$2 = new epk.a($$0);
         this.o.put($$0, $$2);
         this.n.add($$2);
      }

      Predicate<cup> $$3 = a($$1);
      if (!$$0.gc().b($$3)) {
         this.a($$0.af().getString());
      }

      for (int $$4 = 0; $$4 < this.n.size(); $$4++) {
         epk.a $$5 = this.n.get($$4);
         String $$6 = $$5.a.af().getString();
         if (!$$5.a.dK() && ($$5.a.gc().b($$3) || $$1.D())) {
            if (!$$1.D() && $$5.a.dP().af() == this.e && this.l) {
               this.a(epg.a, $$5.a.dP(), $$6, $$5.a.du(), $$5.a.dA(), (double)$$5.a.dF(), null);
            }
         } else {
            this.o.remove($$5.a);
            this.n.remove($$5);
            this.a($$6);
         }
      }

      if ($$1.D() && this.l) {
         cja $$7 = $$1.E();
         iz $$8 = $$7.D();
         eph $$9 = this.r.get(eph.a($$8));
         if ($$9 != null && $$7.al() != $$9.d() && this.r.containsKey($$9.e())) {
            this.a("frame-" + $$9.d());
         }

         eph $$10 = new eph($$8, $$7.cH().e() * 90, $$7.al());
         this.a(epg.b, $$0.dP(), "frame-" + $$7.al(), (double)$$8.u(), (double)$$8.w(), (double)($$7.cH().e() * 90), null);
         this.r.put($$10.e(), $$10);
      }

      cxo $$11 = $$1.a(km.C, cxo.a);
      if (!this.q.keySet().containsAll($$11.a().keySet())) {
         $$11.a().forEach(($$1x, $$2) -> {
            if (!this.q.containsKey($$1x)) {
               this.a($$2.a(), $$0.dP(), $$1x, $$2.b(), $$2.c(), (double)$$2.d(), null);
            }
         });
      }
   }

   private void a(String $$0) {
      epe $$1 = this.q.remove($$0);
      if ($$1 != null && $$1.c().a().f()) {
         this.s--;
      }

      this.i();
   }

   public static void a(cup $$0, iz $$1, String $$2, ji<epf> $$3) {
      cxo.a $$4 = new cxo.a($$3, (double)$$1.u(), (double)$$1.w(), 180.0F);
      $$0.a(km.C, cxo.a, $$2x -> $$2x.a($$2, $$4));
      if ($$3.a().a()) {
         $$0.b(km.A, new cxp($$3.a().d()));
      }
   }

   private void a(ji<epf> $$0, @Nullable dbz $$1, String $$2, double $$3, double $$4, double $$5, @Nullable xp $$6) {
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
         if (this.e == dby.i && $$1 != null) {
            int $$14 = (int)($$1.A_().d() / 10L);
            $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 15);
         }
      } else {
         if (!$$0.a(epg.a)) {
            this.a($$2);
            return;
         }

         int $$15 = 320;
         if (Math.abs($$8) < 320.0F && Math.abs($$9) < 320.0F) {
            $$0 = epg.g;
         } else {
            if (!this.m) {
               this.a($$2);
               return;
            }

            $$0 = epg.h;
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

      epe $$18 = new epe($$0, $$10, $$11, $$13, Optional.ofNullable($$6));
      epe $$19 = this.q.put($$2, $$18);
      if (!$$18.equals($$19)) {
         if ($$19 != null && $$19.c().a().f()) {
            this.s--;
         }

         if ($$0.a().f()) {
            this.s++;
         }

         this.i();
      }
   }

   @Nullable
   public zw<?> a(epi $$0, cmx $$1) {
      epk.a $$2 = this.o.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (epk.a $$2 : this.n) {
         $$2.a($$0, $$1);
      }
   }

   private void i() {
      this.c();
      this.n.forEach(epk.a::b);
   }

   public epk.a a(cmx $$0) {
      epk.a $$1 = this.o.get($$0);
      if ($$1 == null) {
         $$1 = new epk.a($$0);
         this.o.put($$0, $$1);
         this.n.add($$1);
      }

      return $$1;
   }

   public boolean a(dbz $$0, iz $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         epd $$8 = epd.a($$0, $$1);
         if ($$8 == null) {
            return false;
         }

         if (this.p.remove($$8.b(), $$8)) {
            this.a($$8.b());
            return true;
         }

         if (!this.a(256)) {
            this.p.put($$8.b(), $$8);
            this.a($$8.a(), $$0, $$8.b(), $$2, $$3, 180.0, $$8.e().orElse(null));
            return true;
         }
      }

      return false;
   }

   public void a(dbe $$0, int $$1, int $$2) {
      Iterator<epd> $$3 = this.p.values().iterator();

      while ($$3.hasNext()) {
         epd $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            epd $$5 = epd.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
            }
         }
      }
   }

   public Collection<epd> f() {
      return this.p.values();
   }

   public void a(iz $$0, int $$1) {
      this.a("frame-" + $$1);
      this.r.remove(eph.a($$0));
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

   public boolean g() {
      for (epe $$0 : this.q.values()) {
         if ($$0.c().a().e()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<epe> $$0) {
      this.q.clear();
      this.s = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         epe $$2 = $$0.get($$1);
         this.q.put("icon-" + $$1, $$2);
         if ($$2.c().a().f()) {
            this.s++;
         }
      }
   }

   public Iterable<epe> h() {
      return this.q.values();
   }

   public boolean a(int $$0) {
      return this.s >= $$0;
   }

   public class a {
      public final cmx a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(final cmx $$1) {
         this.a = $$1;
      }

      private epk.b a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = epk.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new epk.b($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      zw<?> a(epi $$0) {
         epk.b $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<epe> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = epk.this.q.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new aea($$0, epk.this.f, epk.this.h, $$3, $$1);
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

   public static record b(int b, int c, int d, int e, byte[] f) {
      public static final zn<ByteBuf, Optional<epk.b>> a = zn.a(epk.b::a, epk.b::a);

      private static void a(ByteBuf $$0, Optional<epk.b> $$1) {
         if ($$1.isPresent()) {
            epk.b $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            wm.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<epk.b> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = wm.a($$0);
            return Optional.of(new epk.b($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(epk $$0) {
         for (int $$1 = 0; $$1 < this.d; $$1++) {
            for (int $$2 = 0; $$2 < this.e; $$2++) {
               $$0.b(this.b + $$1, this.c + $$2, this.f[$$1 + $$2 * this.d]);
            }
         }
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public byte[] e() {
         return this.f;
      }
   }
}
