import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyq extends eyh {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 128;
   private static final int l = 64;
   public static final int a = 4;
   public static final int b = 256;
   private static final String m = "frame-";
   public static final Codec<eyq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djh.h.fieldOf("dimension").forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("xCenter").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("zCenter").forGetter($$0x -> $$0x.e),
               Codec.BYTE.optionalFieldOf("scale", (byte)0).forGetter($$0x -> $$0x.g),
               Codec.BYTE_BUFFER.fieldOf("colors").forGetter($$0x -> ByteBuffer.wrap($$0x.h)),
               Codec.BOOL.optionalFieldOf("trackingPosition", true).forGetter($$0x -> $$0x.n),
               Codec.BOOL.optionalFieldOf("unlimitedTracking", false).forGetter($$0x -> $$0x.o),
               Codec.BOOL.optionalFieldOf("locked", false).forGetter($$0x -> $$0x.i),
               eyj.a.listOf().optionalFieldOf("banners", List.of()).forGetter($$0x -> List.copyOf($$0x.r.values())),
               eyn.a.listOf().optionalFieldOf("frames", List.of()).forGetter($$0x -> List.copyOf($$0x.t.values()))
            )
            .apply($$0, eyq::new)
   );
   public final int d;
   public final int e;
   public final alf<djh> f;
   private final boolean n;
   private final boolean o;
   public final byte g;
   public byte[] h = new byte[16384];
   public final boolean i;
   private final List<eyq.a> p = Lists.newArrayList();
   private final Map<crj, eyq.a> q = Maps.newHashMap();
   private final Map<String, eyj> r = Maps.newHashMap();
   final Map<String, eyk> s = Maps.newLinkedHashMap();
   private final Map<String, eyn> t = Maps.newHashMap();
   private int u;

   public static eyi<eyq> a(eyo $$0) {
      return new eyi<>($$0.a(), () -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, c, bbb.j);
   }

   private eyq(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, alf<djh> $$6) {
      this.g = $$2;
      this.d = $$0;
      this.e = $$1;
      this.f = $$6;
      this.n = $$3;
      this.o = $$4;
      this.i = $$5;
   }

   private eyq(alf<djh> $$0, int $$1, int $$2, byte $$3, ByteBuffer $$4, boolean $$5, boolean $$6, boolean $$7, List<eyj> $$8, List<eyn> $$9) {
      this($$1, $$2, (byte)azm.a($$3, 0, 4), $$5, $$6, $$7, $$0);
      if ($$4.array().length == 16384) {
         this.h = $$4.array();
      }

      for (eyj $$10 : $$8) {
         this.r.put($$10.b(), $$10);
         this.a($$10.a(), null, $$10.b(), (double)$$10.c().u(), (double)$$10.c().w(), 180.0, $$10.e().orElse(null));
      }

      for (eyn $$11 : $$9) {
         this.t.put($$11.a(), $$11);
         this.a(eym.b, null, b($$11.d()), (double)$$11.b().u(), (double)$$11.b().w(), (double)$$11.c(), null);
      }
   }

   public static eyq a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, alf<djh> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = azm.a(($$0 + 64.0) / (double)$$6);
      int $$8 = azm.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new eyq($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static eyq a(byte $$0, boolean $$1, alf<djh> $$2) {
      return new eyq(0, 0, $$0, false, false, $$1, $$2);
   }

   public eyq a() {
      eyq $$0 = new eyq(this.d, this.e, this.g, this.n, this.o, true, this.f);
      $$0.r.putAll(this.r);
      $$0.s.putAll(this.s);
      $$0.u = this.u;
      System.arraycopy(this.h, 0, $$0.h, 0, this.h.length);
      return $$0;
   }

   public eyq b() {
      return a((double)this.d, (double)this.e, (byte)azm.a(this.g + 1, 0, 4), this.n, this.o, this.f);
   }

   private static Predicate<czk> a(czk $$0) {
      eyo $$1 = $$0.a(kk.M);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.h()) && Objects.equals($$1, $$2.a(kk.M));
   }

   public void a(crj $$0, czk $$1) {
      if (!this.q.containsKey($$0)) {
         eyq.a $$2 = new eyq.a($$0);
         this.q.put($$0, $$2);
         this.p.add($$2);
      }

      Predicate<czk> $$3 = a($$1);
      if (!$$0.gi().b($$3)) {
         this.a($$0.ai().getString());
      }

      for (int $$4 = 0; $$4 < this.p.size(); $$4++) {
         eyq.a $$5 = this.p.get($$4);
         crj $$6 = $$5.a;
         String $$7 = $$6.ai().getString();
         if (!$$6.dP() && ($$6.gi().b($$3) || $$1.H())) {
            if (!$$1.H() && $$6.dU().aj() == this.f && this.n) {
               this.a(eym.a, $$6.dU(), $$7, $$6.dz(), $$6.dF(), (double)$$6.dK(), null);
            }
         } else {
            this.q.remove($$6);
            this.p.remove($$5);
            this.a($$7);
         }

         if (!$$6.equals($$0) && b($$6)) {
            this.a($$7);
         }
      }

      if ($$1.H() && this.n) {
         cnh $$8 = $$1.I();
         iv $$9 = $$8.j();
         eyn $$10 = this.t.get(eyn.a($$9));
         if ($$10 != null && $$8.ao() != $$10.d() && this.t.containsKey($$10.a())) {
            this.a(b($$10.d()));
         }

         eyn $$11 = new eyn($$9, $$8.cN().e() * 90, $$8.ao());
         this.a(eym.b, $$0.dU(), b($$8.ao()), (double)$$9.u(), (double)$$9.w(), (double)($$8.cN().e() * 90), null);
         eyn $$12 = this.t.put($$11.a(), $$11);
         if (!$$11.equals($$12)) {
            this.f();
         }
      }

      dcf $$13 = $$1.a(kk.N, dcf.a);
      if (!this.s.keySet().containsAll($$13.a().keySet())) {
         $$13.a().forEach(($$1x, $$2) -> {
            if (!this.s.containsKey($$1x)) {
               this.a($$2.a(), $$0.dU(), $$1x, $$2.b(), $$2.c(), (double)$$2.d(), null);
            }
         });
      }
   }

   private static boolean b(crj $$0) {
      for (bws $$1 : bws.values()) {
         if ($$1 != bws.a && $$1 != bws.b && $$0.a($$1).a(axk.cr)) {
            return true;
         }
      }

      return false;
   }

   private void a(String $$0) {
      eyk $$1 = this.s.remove($$0);
      if ($$1 != null && $$1.c().a().f()) {
         this.u--;
      }

      this.h();
   }

   public static void a(czk $$0, iv $$1, String $$2, jf<eyl> $$3) {
      dcf.a $$4 = new dcf.a($$3, (double)$$1.u(), (double)$$1.w(), 180.0F);
      $$0.a(kk.N, dcf.a, $$2x -> $$2x.a($$2, $$4));
      if ($$3.a().a()) {
         $$0.b(kk.L, new dcg($$3.a().d()));
      }
   }

   private void a(jf<eyl> $$0, @Nullable dji $$1, String $$2, double $$3, double $$4, double $$5, @Nullable wy $$6) {
      int $$7 = 1 << this.g;
      float $$8 = (float)($$3 - (double)this.d) / (float)$$7;
      float $$9 = (float)($$4 - (double)this.e) / (float)$$7;
      eyq.b $$10 = this.a($$0, $$1, $$5, $$8, $$9);
      if ($$10 == null) {
         this.a($$2);
      } else {
         eyk $$11 = new eyk($$10.a(), $$10.b(), $$10.c(), $$10.d(), Optional.ofNullable($$6));
         eyk $$12 = this.s.put($$2, $$11);
         if (!$$11.equals($$12)) {
            if ($$12 != null && $$12.c().a().f()) {
               this.u--;
            }

            if ($$10.a().a().f()) {
               this.u++;
            }

            this.h();
         }
      }
   }

   @Nullable
   private eyq.b a(jf<eyl> $$0, @Nullable dji $$1, double $$2, float $$3, float $$4) {
      byte $$5 = a($$3);
      byte $$6 = a($$4);
      if ($$0.a(eym.a)) {
         Pair<jf<eyl>, Byte> $$7 = this.b($$0, $$1, $$2, $$3, $$4);
         return $$7 == null ? null : new eyq.b((jf<eyl>)$$7.getFirst(), $$5, $$6, (Byte)$$7.getSecond());
      } else {
         return !a($$3, $$4) && !this.o ? null : new eyq.b($$0, $$5, $$6, this.a($$1, $$2));
      }
   }

   @Nullable
   private Pair<jf<eyl>, Byte> b(jf<eyl> $$0, @Nullable dji $$1, double $$2, float $$3, float $$4) {
      if (a($$3, $$4)) {
         return Pair.of($$0, this.a($$1, $$2));
      } else {
         jf<eyl> $$5 = this.b($$3, $$4);
         return $$5 == null ? null : Pair.of($$5, (byte)0);
      }
   }

   private byte a(@Nullable dji $$0, double $$1) {
      if (this.f == djh.j && $$0 != null) {
         int $$2 = (int)($$0.y_().d() / 10L);
         return (byte)($$2 * $$2 * 34187121 + $$2 * 121 >> 15 & 15);
      } else {
         double $$3 = $$1 < 0.0 ? $$1 - 8.0 : $$1 + 8.0;
         return (byte)((int)($$3 * 16.0 / 360.0));
      }
   }

   private static boolean a(float $$0, float $$1) {
      int $$2 = 63;
      return $$0 >= -63.0F && $$1 >= -63.0F && $$0 <= 63.0F && $$1 <= 63.0F;
   }

   @Nullable
   private jf<eyl> b(float $$0, float $$1) {
      int $$2 = 320;
      boolean $$3 = Math.abs($$0) < 320.0F && Math.abs($$1) < 320.0F;
      if ($$3) {
         return eym.g;
      } else {
         return this.o ? eym.h : null;
      }
   }

   private static byte a(float $$0) {
      int $$1 = 63;
      if ($$0 <= -63.0F) {
         return -128;
      } else {
         return $$0 >= 63.0F ? 127 : (byte)((int)((double)($$0 * 2.0F) + 0.5));
      }
   }

   @Nullable
   public zf<?> a(eyo $$0, crj $$1) {
      eyq.a $$2 = this.q.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.f();

      for (eyq.a $$2 : this.p) {
         $$2.a($$0, $$1);
      }
   }

   private void h() {
      this.p.forEach(eyq.a::b);
   }

   public eyq.a a(crj $$0) {
      eyq.a $$1 = this.q.get($$0);
      if ($$1 == null) {
         $$1 = new eyq.a($$0);
         this.q.put($$0, $$1);
         this.p.add($$1);
      }

      return $$1;
   }

   public boolean a(dji $$0, iv $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.g;
      double $$5 = ($$2 - (double)this.d) / (double)$$4;
      double $$6 = ($$3 - (double)this.e) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         eyj $$8 = eyj.a($$0, $$1);
         if ($$8 == null) {
            return false;
         }

         if (this.r.remove($$8.b(), $$8)) {
            this.a($$8.b());
            this.f();
            return true;
         }

         if (!this.a(256)) {
            this.r.put($$8.b(), $$8);
            this.a($$8.a(), $$0, $$8.b(), $$2, $$3, 180.0, $$8.e().orElse(null));
            this.f();
            return true;
         }
      }

      return false;
   }

   public void a(din $$0, int $$1, int $$2) {
      Iterator<eyj> $$3 = this.r.values().iterator();

      while ($$3.hasNext()) {
         eyj $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            eyj $$5 = eyj.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
               this.f();
            }
         }
      }
   }

   public Collection<eyj> c() {
      return this.r.values();
   }

   public void a(iv $$0, int $$1) {
      this.a(b($$1));
      this.t.remove(eyn.a($$0));
      this.f();
   }

   public boolean a(int $$0, int $$1, byte $$2) {
      byte $$3 = this.h[$$0 + $$1 * 128];
      if ($$3 != $$2) {
         this.b($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   public void b(int $$0, int $$1, byte $$2) {
      this.h[$$0 + $$1 * 128] = $$2;
      this.a($$0, $$1);
   }

   public boolean d() {
      for (eyk $$0 : this.s.values()) {
         if ($$0.c().a().e()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<eyk> $$0) {
      this.s.clear();
      this.u = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         eyk $$2 = $$0.get($$1);
         this.s.put("icon-" + $$1, $$2);
         if ($$2.c().a().f()) {
            this.u++;
         }
      }
   }

   public Iterable<eyk> e() {
      return this.s.values();
   }

   public boolean a(int $$0) {
      return this.u >= $$0;
   }

   private static String b(int $$0) {
      return "frame-" + $$0;
   }

   public class a {
      public final crj a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(final crj $$1) {
         this.a = $$1;
      }

      private eyq.c a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = eyq.this.h[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new eyq.c($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      zf<?> a(eyo $$0) {
         eyq.c $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<eyk> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = eyq.this.s.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new adm($$0, eyq.this.g, eyq.this.i, $$3, $$1);
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

   static record b(jf<eyl> a, byte b, byte c, byte d) {
   }

   public static record c(int b, int c, int d, int e, byte[] f) {
      public static final yw<ByteBuf, Optional<eyq.c>> a = yw.a(eyq.c::a, eyq.c::a);

      private static void a(ByteBuf $$0, Optional<eyq.c> $$1) {
         if ($$1.isPresent()) {
            eyq.c $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            vu.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<eyq.c> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = vu.a($$0);
            return Optional.of(new eyq.c($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(eyq $$0) {
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
