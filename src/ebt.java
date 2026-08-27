import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ebt(ebt.a a, byte b, byte c, byte d, @Nullable tl e) {
   public byte a() {
      return this.a.a();
   }

   public boolean b() {
      return this.a.d();
   }

   public ebt.a c() {
      return this.a;
   }

   public byte d() {
      return this.b;
   }

   public byte e() {
      return this.c;
   }

   public byte f() {
      return this.d;
   }

   @Nullable
   public tl g() {
      return this.e;
   }

   public static enum a implements asp {
      a("player", false, true),
      b("frame", true, true),
      c("red_marker", false, true),
      d("blue_marker", false, true),
      e("target_x", true, false),
      f("target_point", true, false),
      g("player_off_map", false, true),
      h("player_off_limits", false, true),
      i("mansion", true, 5393476, false, true),
      j("monument", true, 3830373, false, true),
      k("banner_white", true, true),
      l("banner_orange", true, true),
      m("banner_magenta", true, true),
      n("banner_light_blue", true, true),
      o("banner_yellow", true, true),
      p("banner_lime", true, true),
      q("banner_pink", true, true),
      r("banner_gray", true, true),
      s("banner_light_gray", true, true),
      t("banner_cyan", true, true),
      u("banner_purple", true, true),
      v("banner_blue", true, true),
      w("banner_brown", true, true),
      x("banner_green", true, true),
      y("banner_red", true, true),
      z("banner_black", true, true),
      A("red_x", true, false),
      B("village_desert", true, eaq.w.ak, false, true),
      C("village_plains", true, eaq.w.ak, false, true),
      D("village_savanna", true, eaq.w.ak, false, true),
      E("village_snowy", true, eaq.w.ak, false, true),
      F("village_taiga", true, eaq.w.ak, false, true),
      G("jungle_temple", true, eaq.w.ak, false, true),
      H("swamp_hut", true, eaq.w.ak, false, true);

      public static final Codec<ebt.a> I = asp.a(ebt.a::values);
      private final String J;
      private final byte K;
      private final boolean L;
      private final int M;
      private final boolean N;
      private final boolean O;

      private a(String $$0, boolean $$1, boolean $$2) {
         this($$0, $$1, -1, $$2, false);
      }

      private a(String $$0, boolean $$1, int $$2, boolean $$3, boolean $$4) {
         this.J = $$0;
         this.O = $$3;
         this.K = (byte)this.ordinal();
         this.L = $$1;
         this.M = $$2;
         this.N = $$4;
      }

      public byte a() {
         return this.K;
      }

      public boolean b() {
         return this.N;
      }

      public boolean d() {
         return this.L;
      }

      public boolean e() {
         return this.M >= 0;
      }

      public int f() {
         return this.M;
      }

      public static ebt.a a(byte $$0) {
         return values()[arx.a($$0, 0, values().length - 1)];
      }

      public boolean g() {
         return this.O;
      }

      @Override
      public String c() {
         return this.J;
      }
   }
}
