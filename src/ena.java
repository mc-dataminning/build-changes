import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record ena(ena.a b, byte c, byte d, byte e, Optional<ws> f) {
   public static final yq<wd, ena> a = yq.a(ena.a.K, ena::c, yo.c, ena::d, yo.c, ena::e, yo.c, ena::f, wu.c, ena::g, ena::new);

   public ena(ena.a b, byte c, byte d, byte e, Optional<ws> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public byte a() {
      return this.b.b();
   }

   public boolean b() {
      return this.b.e();
   }

   public ena.a c() {
      return this.b;
   }

   public byte d() {
      return this.c;
   }

   public byte e() {
      return this.d;
   }

   public byte f() {
      return this.e;
   }

   public Optional<ws> g() {
      return this.f;
   }

   public static enum a implements ayq {
      a(0, "player", false, true),
      b(1, "frame", true, true),
      c(2, "red_marker", false, true),
      d(3, "blue_marker", false, true),
      e(4, "target_x", true, false),
      f(5, "target_point", true, false),
      g(6, "player_off_map", false, true),
      h(7, "player_off_limits", false, true),
      i(8, "mansion", true, 5393476, false, true),
      j(9, "monument", true, 3830373, false, true),
      k(10, "banner_white", true, true),
      l(11, "banner_orange", true, true),
      m(12, "banner_magenta", true, true),
      n(13, "banner_light_blue", true, true),
      o(14, "banner_yellow", true, true),
      p(15, "banner_lime", true, true),
      q(16, "banner_pink", true, true),
      r(17, "banner_gray", true, true),
      s(18, "banner_light_gray", true, true),
      t(19, "banner_cyan", true, true),
      u(20, "banner_purple", true, true),
      v(21, "banner_blue", true, true),
      w(22, "banner_brown", true, true),
      x(23, "banner_green", true, true),
      y(24, "banner_red", true, true),
      z(25, "banner_black", true, true),
      A(26, "red_x", true, false),
      B(27, "village_desert", true, elv.w.ak, false, true),
      C(28, "village_plains", true, elv.w.ak, false, true),
      D(29, "village_savanna", true, elv.w.ak, false, true),
      E(30, "village_snowy", true, elv.w.ak, false, true),
      F(31, "village_taiga", true, elv.w.ak, false, true),
      G(32, "jungle_temple", true, elv.w.ak, false, true),
      H(33, "swamp_hut", true, elv.w.ak, false, true);

      public static final IntFunction<ena.a> I = awn.a(ena.a::a, values(), awn.a.a);
      public static final Codec<ena.a> J = ayq.a(ena.a::values);
      public static final yq<ByteBuf, ena.a> K = yo.a(I, ena.a::a);
      private final int L;
      private final String M;
      private final byte N;
      private final boolean O;
      private final int P;
      private final boolean Q;
      private final boolean R;

      private a(int $$0, String $$1, boolean $$2, boolean $$3) {
         this($$0, $$1, $$2, -1, $$3, false);
      }

      private a(int $$0, String $$1, boolean $$2, int $$3, boolean $$4, boolean $$5) {
         this.L = $$0;
         this.M = $$1;
         this.R = $$4;
         this.N = (byte)this.ordinal();
         this.O = $$2;
         this.P = $$3;
         this.Q = $$5;
      }

      public int a() {
         return this.L;
      }

      public byte b() {
         return this.N;
      }

      public boolean d() {
         return this.Q;
      }

      public boolean e() {
         return this.O;
      }

      public boolean f() {
         return this.P >= 0;
      }

      public int g() {
         return this.P;
      }

      public boolean h() {
         return this.R;
      }

      @Override
      public String c() {
         return this.M;
      }
   }
}
