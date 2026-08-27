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

public class ejy extends ejs {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   public final int c;
   public final int d;
   public final ajg<cwz> e;
   private final boolean l;
   private final boolean m;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<ejy.a> n = Lists.newArrayList();
   private final Map<cis, ejy.a> o = Maps.newHashMap();
   private final Map<String, ejt> p = Maps.newHashMap();
   final Map<String, eju> q = Maps.newLinkedHashMap();
   private final Map<String, ejv> r = Maps.newHashMap();
   private int s;

   public static ejs.a<ejy> a() {
      return new ejs.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, ejy::b, ayc.j);
   }

   private ejy(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, ajg<cwz> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.l = $$3;
      this.m = $$4;
      this.h = $$5;
      this.c();
   }

   public static ejy a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, ajg<cwz> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = aww.a(($$0 + 64.0) / (double)$$6);
      int $$8 = aww.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new ejy($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static ejy a(byte $$0, boolean $$1, ajg<cwz> $$2) {
      return new ejy(0, 0, $$0, false, false, $$1, $$2);
   }

   public static ejy b(ta $$0, in.a $$1) {
      ajg<cwz> $$2 = (ajg<cwz>)dqm.a(new Dynamic(to.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$3 = $$0.h("xCenter");
      int $$4 = $$0.h("zCenter");
      byte $$5 = (byte)aww.a($$0.f("scale"), 0, 4);
      boolean $$6 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$7 = $$0.q("unlimitedTracking");
      boolean $$8 = $$0.q("locked");
      ejy $$9 = new ejy($$3, $$4, $$5, $$6, $$7, $$8, $$2);
      byte[] $$10 = $$0.m("colors");
      if ($$10.length == 16384) {
         $$9.g = $$10;
      }

      for (ejt $$12 : ejt.b.parse(to.a, $$0.c("banners")).resultOrPartial($$0x -> i.warn("Failed to parse map banner: '{}'", $$0x)).orElse(List.of())) {
         $$9.p.put($$12.b(), $$12);
         $$9.a($$12.a(), null, $$12.b(), (double)$$12.c().u(), (double)$$12.c().w(), 180.0, $$12.e().orElse(null));
      }

      tg $$13 = $$0.c("frames", 10);

      for (int $$14 = 0; $$14 < $$13.size(); $$14++) {
         ejv $$15 = ejv.a($$13.a($$14));
         if ($$15 != null) {
            $$9.r.put($$15.e(), $$15);
            $$9.a(eju.a.b, null, "frame-" + $$15.d(), (double)$$15.b().u(), (double)$$15.b().w(), (double)$$15.c(), null);
         }
      }

      return $$9;
   }

   @Override
   public ta a(ta $$0, in.a $$1) {
      ajh.a.encodeStart(to.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.l);
      $$0.a("unlimitedTracking", this.m);
      $$0.a("locked", this.h);
      $$0.a("banners", ac.a(ejt.b.encodeStart(to.a, List.copyOf(this.p.values())), IllegalStateException::new));
      tg $$2 = new tg();

      for (ejv $$3 : this.r.values()) {
         $$2.add($$3.a());
      }

      $$0.a("frames", $$2);
      return $$0;
   }

   public ejy b() {
      ejy $$0 = new ejy(this.c, this.d, this.f, this.l, this.m, true, this.e);
      $$0.p.putAll(this.p);
      $$0.q.putAll(this.q);
      $$0.s = this.s;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      $$0.c();
      return $$0;
   }

   public ejy a(int $$0) {
      return a((double)this.c, (double)this.d, (byte)aww.a(this.f + $$0, 0, 4), this.l, this.m, this.e);
   }

   private static Predicate<cqk> a(cqk $$0) {
      ejw $$1 = cqr.d($$0);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.d()) && Objects.equals($$1, cqr.d($$2));
   }

   public void a(cis $$0, cqk $$1) {
      if (!this.o.containsKey($$0)) {
         ejy.a $$2 = new ejy.a($$0);
         this.o.put($$0, $$2);
         this.n.add($$2);
      }

      Predicate<cqk> $$3 = a($$1);
      if (!$$0.fZ().b($$3)) {
         this.a($$0.ad().getString());
      }

      for (int $$4 = 0; $$4 < this.n.size(); $$4++) {
         ejy.a $$5 = this.n.get($$4);
         String $$6 = $$5.a.ad().getString();
         if (!$$5.a.dH() && ($$5.a.fZ().b($$3) || $$1.G())) {
            if (!$$1.G() && $$5.a.dM().ad() == this.e && this.l) {
               this.a(eju.a.a, $$5.a.dM(), $$6, $$5.a.dr(), $$5.a.dx(), (double)$$5.a.dC(), null);
            }
         } else {
            this.o.remove($$5.a);
            this.n.remove($$5);
            this.a($$6);
         }
      }

      if ($$1.G() && this.l) {
         cew $$7 = $$1.H();
         ib $$8 = $$7.D();
         ejv $$9 = this.r.get(ejv.a($$8));
         if ($$9 != null && $$7.aj() != $$9.d() && this.r.containsKey($$9.e())) {
            this.a("frame-" + $$9.d());
         }

         ejv $$10 = new ejv($$8, $$7.cE().e() * 90, $$7.aj());
         this.a(eju.a.b, $$0.dM(), "frame-" + $$7.aj(), (double)$$8.u(), (double)$$8.w(), (double)($$7.cE().e() * 90), null);
         this.r.put($$10.e(), $$10);
      }

      ta $$11 = $$1.w();
      if ($$11 != null && $$11.b("Decorations", 9)) {
         tg $$12 = $$11.c("Decorations", 10);

         for (int $$13 = 0; $$13 < $$12.size(); $$13++) {
            ta $$14 = $$12.a($$13);
            if (!this.q.containsKey($$14.l("id"))) {
               this.a(eju.a.a($$14.f("type")), $$0.dM(), $$14.l("id"), $$14.k("x"), $$14.k("z"), $$14.k("rot"), null);
            }
         }
      }
   }

   private void a(String $$0) {
      eju $$1 = this.q.remove($$0);
      if ($$1 != null && $$1.c().h()) {
         this.s--;
      }

      this.h();
   }

   public static void a(cqk $$0, ib $$1, String $$2, eju.a $$3) {
      tg $$4;
      if ($$0.v() && $$0.w().b("Decorations", 9)) {
         $$4 = $$0.w().c("Decorations", 10);
      } else {
         $$4 = new tg();
         $$0.a("Decorations", $$4);
      }

      ta $$6 = new ta();
      $$6.a("type", $$3.b());
      $$6.a("id", $$2);
      $$6.a("x", (double)$$1.u());
      $$6.a("z", (double)$$1.w());
      $$6.a("rot", 180.0);
      $$4.add($$6);
      if ($$3.f()) {
         ta $$7 = $$0.b("display");
         $$7.a("MapColor", $$3.g());
      }
   }

   private void a(eju.a $$0, @Nullable cxa $$1, String $$2, double $$3, double $$4, double $$5, @Nullable vu $$6) {
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
         if (this.e == cwz.i && $$1 != null) {
            int $$14 = (int)($$1.A_().d() / 10L);
            $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 15);
         }
      } else {
         if ($$0 != eju.a.a) {
            this.a($$2);
            return;
         }

         int $$15 = 320;
         if (Math.abs($$8) < 320.0F && Math.abs($$9) < 320.0F) {
            $$0 = eju.a.g;
         } else {
            if (!this.m) {
               this.a($$2);
               return;
            }

            $$0 = eju.a.h;
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

      eju $$18 = new eju($$0, $$10, $$11, $$13, Optional.ofNullable($$6));
      eju $$19 = this.q.put($$2, $$18);
      if (!$$18.equals($$19)) {
         if ($$19 != null && $$19.c().h()) {
            this.s--;
         }

         if ($$0.h()) {
            this.s++;
         }

         this.h();
      }
   }

   @Nullable
   public yb<?> a(ejw $$0, cis $$1) {
      ejy.a $$2 = this.o.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (ejy.a $$2 : this.n) {
         $$2.a($$0, $$1);
      }
   }

   private void h() {
      this.c();
      this.n.forEach(ejy.a::b);
   }

   public ejy.a a(cis $$0) {
      ejy.a $$1 = this.o.get($$0);
      if ($$1 == null) {
         $$1 = new ejy.a($$0);
         this.o.put($$0, $$1);
         this.n.add($$1);
      }

      return $$1;
   }

   public boolean a(cxa $$0, ib $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         ejt $$8 = ejt.a($$0, $$1);
         if ($$8 == null) {
            return false;
         }

         if (this.p.remove($$8.b(), $$8)) {
            this.a($$8.b());
            return true;
         }

         if (!this.b(256)) {
            this.p.put($$8.b(), $$8);
            this.a($$8.a(), $$0, $$8.b(), $$2, $$3, 180.0, $$8.e().orElse(null));
            return true;
         }
      }

      return false;
   }

   public void a(cwf $$0, int $$1, int $$2) {
      Iterator<ejt> $$3 = this.p.values().iterator();

      while ($$3.hasNext()) {
         ejt $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            ejt $$5 = ejt.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
            }
         }
      }
   }

   public Collection<ejt> e() {
      return this.p.values();
   }

   public void a(ib $$0, int $$1) {
      this.a("frame-" + $$1);
      this.r.remove(ejv.a($$0));
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
      for (eju $$0 : this.q.values()) {
         if ($$0.c().d()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<eju> $$0) {
      this.q.clear();
      this.s = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         eju $$2 = $$0.get($$1);
         this.q.put("icon-" + $$1, $$2);
         if ($$2.c().h()) {
            this.s++;
         }
      }
   }

   public Iterable<eju> g() {
      return this.q.values();
   }

   public boolean b(int $$0) {
      return this.s >= $$0;
   }

   public class a {
      public final cis a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(cis $$1) {
         this.a = $$1;
      }

      private ejy.b a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = ejy.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new ejy.b($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      yb<?> a(ejw $$0) {
         ejy.b $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<eju> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = ejy.this.q.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new ace($$0, ejy.this.f, ejy.this.h, $$3, $$1);
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
      public static final xs<ByteBuf, Optional<ejy.b>> a = xs.a(ejy.b::a, ejy.b::a);

      private static void a(ByteBuf $$0, Optional<ejy.b> $$1) {
         if ($$1.isPresent()) {
            ejy.b $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            uu.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<ejy.b> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = uu.a($$0);
            return Optional.of(new ejy.b($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(ejy $$0) {
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
