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

public class eqt extends eql {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   public final int c;
   public final int d;
   public final aks<dca> e;
   private final boolean l;
   private final boolean m;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<eqt.a> n = Lists.newArrayList();
   private final Map<cly, eqt.a> o = Maps.newHashMap();
   private final Map<String, eqm> p = Maps.newHashMap();
   final Map<String, eqn> q = Maps.newLinkedHashMap();
   private final Map<String, eqq> r = Maps.newHashMap();
   private int s;

   public static eql.a<eqt> a() {
      return new eql.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, eqt::b, azs.j);
   }

   private eqt(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, aks<dca> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.l = $$3;
      this.m = $$4;
      this.h = $$5;
      this.c();
   }

   public static eqt a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, aks<dca> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = aym.a(($$0 + 64.0) / (double)$$6);
      int $$8 = aym.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new eqt($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static eqt a(byte $$0, boolean $$1, aks<dca> $$2) {
      return new eqt(0, 0, $$0, false, false, $$1, $$2);
   }

   public static eqt b(uk $$0, jc.a $$1) {
      aks<dca> $$2 = (aks<dca>)dwu.a(new Dynamic(uy.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$3 = $$0.h("xCenter");
      int $$4 = $$0.h("zCenter");
      byte $$5 = (byte)aym.a($$0.f("scale"), 0, 4);
      boolean $$6 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$7 = $$0.q("unlimitedTracking");
      boolean $$8 = $$0.q("locked");
      eqt $$9 = new eqt($$3, $$4, $$5, $$6, $$7, $$8, $$2);
      byte[] $$10 = $$0.m("colors");
      if ($$10.length == 16384) {
         $$9.g = $$10;
      }

      akr<vh> $$11 = $$1.a(uy.a);

      for (eqm $$13 : eqm.b.parse($$11, $$0.c("banners")).resultOrPartial($$0x -> i.warn("Failed to parse map banner: '{}'", $$0x)).orElse(List.of())) {
         $$9.p.put($$13.b(), $$13);
         $$9.a($$13.a(), null, $$13.b(), (double)$$13.c().u(), (double)$$13.c().w(), 180.0, $$13.e().orElse(null));
      }

      uq $$14 = $$0.c("frames", 10);

      for (int $$15 = 0; $$15 < $$14.size(); $$15++) {
         eqq $$16 = eqq.a($$14.a($$15));
         if ($$16 != null) {
            $$9.r.put($$16.e(), $$16);
            $$9.a(eqp.b, null, "frame-" + $$16.d(), (double)$$16.b().u(), (double)$$16.b().w(), (double)$$16.c(), null);
         }
      }

      return $$9;
   }

   @Override
   public uk a(uk $$0, jc.a $$1) {
      akt.a.encodeStart(uy.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.l);
      $$0.a("unlimitedTracking", this.m);
      $$0.a("locked", this.h);
      akr<vh> $$2 = $$1.a(uy.a);
      $$0.a("banners", ad.a(eqm.b.encodeStart($$2, List.copyOf(this.p.values())), IllegalStateException::new));
      uq $$3 = new uq();

      for (eqq $$4 : this.r.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public eqt b() {
      eqt $$0 = new eqt(this.c, this.d, this.f, this.l, this.m, true, this.e);
      $$0.p.putAll(this.p);
      $$0.q.putAll(this.q);
      $$0.s = this.s;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      $$0.c();
      return $$0;
   }

   public eqt e() {
      return a((double)this.c, (double)this.d, (byte)aym.a(this.f + 1, 0, 4), this.l, this.m, this.e);
   }

   private static Predicate<cuh> a(cuh $$0) {
      eqr $$1 = $$0.a(ke.z);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.f()) && Objects.equals($$1, $$2.a(ke.z));
   }

   public void a(cly $$0, cuh $$1) {
      if (!this.o.containsKey($$0)) {
         eqt.a $$2 = new eqt.a($$0);
         this.o.put($$0, $$2);
         this.n.add($$2);
      }

      Predicate<cuh> $$3 = a($$1);
      if (!$$0.gl().c($$3)) {
         this.a($$0.af().getString());
      }

      for (int $$4 = 0; $$4 < this.n.size(); $$4++) {
         eqt.a $$5 = this.n.get($$4);
         String $$6 = $$5.a.af().getString();
         if (!$$5.a.dP() && ($$5.a.gl().c($$3) || $$1.B())) {
            if (!$$1.B() && $$5.a.dU().af() == this.e && this.l) {
               this.a(eqp.a, $$5.a.dU(), $$6, $$5.a.dz(), $$5.a.dF(), (double)$$5.a.dK(), null);
            }
         } else {
            this.o.remove($$5.a);
            this.n.remove($$5);
            this.a($$6);
         }
      }

      if ($$1.B() && this.l) {
         chz $$7 = $$1.C();
         ir $$8 = $$7.D();
         eqq $$9 = this.r.get(eqq.a($$8));
         if ($$9 != null && $$7.al() != $$9.d() && this.r.containsKey($$9.e())) {
            this.a("frame-" + $$9.d());
         }

         eqq $$10 = new eqq($$8, $$7.cM().e() * 90, $$7.al());
         this.a(eqp.b, $$0.dU(), "frame-" + $$7.al(), (double)$$8.u(), (double)$$8.w(), (double)($$7.cM().e() * 90), null);
         this.r.put($$10.e(), $$10);
      }

      cxp $$11 = $$1.a(ke.A, cxp.a);
      if (!this.q.keySet().containsAll($$11.a().keySet())) {
         $$11.a().forEach(($$1x, $$2) -> {
            if (!this.q.containsKey($$1x)) {
               this.a($$2.a(), $$0.dU(), $$1x, $$2.b(), $$2.c(), (double)$$2.d(), null);
            }
         });
      }
   }

   private void a(String $$0) {
      eqn $$1 = this.q.remove($$0);
      if ($$1 != null && $$1.c().a().f()) {
         this.s--;
      }

      this.i();
   }

   public static void a(cuh $$0, ir $$1, String $$2, ja<eqo> $$3) {
      cxp.a $$4 = new cxp.a($$3, (double)$$1.u(), (double)$$1.w(), 180.0F);
      $$0.a(ke.A, cxp.a, $$2x -> $$2x.a($$2, $$4));
      if ($$3.a().a()) {
         $$0.b(ke.y, new cxq($$3.a().d()));
      }
   }

   private void a(ja<eqo> $$0, @Nullable dcb $$1, String $$2, double $$3, double $$4, double $$5, @Nullable xe $$6) {
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
         if (this.e == dca.i && $$1 != null) {
            int $$14 = (int)($$1.B_().d() / 10L);
            $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 15);
         }
      } else {
         if (!$$0.a(eqp.a)) {
            this.a($$2);
            return;
         }

         int $$15 = 320;
         if (Math.abs($$8) < 320.0F && Math.abs($$9) < 320.0F) {
            $$0 = eqp.g;
         } else {
            if (!this.m) {
               this.a($$2);
               return;
            }

            $$0 = eqp.h;
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

      eqn $$18 = new eqn($$0, $$10, $$11, $$13, Optional.ofNullable($$6));
      eqn $$19 = this.q.put($$2, $$18);
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
   public zl<?> a(eqr $$0, cly $$1) {
      eqt.a $$2 = this.o.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (eqt.a $$2 : this.n) {
         $$2.a($$0, $$1);
      }
   }

   private void i() {
      this.c();
      this.n.forEach(eqt.a::b);
   }

   public eqt.a a(cly $$0) {
      eqt.a $$1 = this.o.get($$0);
      if ($$1 == null) {
         $$1 = new eqt.a($$0);
         this.o.put($$0, $$1);
         this.n.add($$1);
      }

      return $$1;
   }

   public boolean a(dcb $$0, ir $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         eqm $$8 = eqm.a($$0, $$1);
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

   public void a(dbg $$0, int $$1, int $$2) {
      Iterator<eqm> $$3 = this.p.values().iterator();

      while ($$3.hasNext()) {
         eqm $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            eqm $$5 = eqm.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
            }
         }
      }
   }

   public Collection<eqm> f() {
      return this.p.values();
   }

   public void a(ir $$0, int $$1) {
      this.a("frame-" + $$1);
      this.r.remove(eqq.a($$0));
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
      for (eqn $$0 : this.q.values()) {
         if ($$0.c().a().e()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<eqn> $$0) {
      this.q.clear();
      this.s = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         eqn $$2 = $$0.get($$1);
         this.q.put("icon-" + $$1, $$2);
         if ($$2.c().a().f()) {
            this.s++;
         }
      }
   }

   public Iterable<eqn> h() {
      return this.q.values();
   }

   public boolean a(int $$0) {
      return this.s >= $$0;
   }

   public class a {
      public final cly a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(cly $$1) {
         this.a = $$1;
      }

      private eqt.b a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = eqt.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new eqt.b($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      zl<?> a(eqr $$0) {
         eqt.b $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<eqn> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = eqt.this.q.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new adp($$0, eqt.this.f, eqt.this.h, $$3, $$1);
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
      public static final zc<ByteBuf, Optional<eqt.b>> a = zc.a(eqt.b::a, eqt.b::a);

      private static void a(ByteBuf $$0, Optional<eqt.b> $$1) {
         if ($$1.isPresent()) {
            eqt.b $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            we.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<eqt.b> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = we.a($$0);
            return Optional.of(new eqt.b($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(eqt $$0) {
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
