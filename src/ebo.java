import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ebo(ebo.a a, byte b, byte c, byte d, @Nullable ti e) {
   public byte a() {
      return this.a.a();
   }

   public boolean b() {
      return this.a.b();
   }

   public ebo.a c() {
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
   public ti g() {
      return this.e;
   }

   public static enum a implements ask {
      a("player", false, true),
      b("frame", true, true),
      c("red_marker", false, true),
      d("blue_marker", false, true),
      e("target_x", true, false),
      f("target_point", true, false),
      g("player_off_map", false, true),
      h("player_off_limits", false, true),
      i("mansion", true, 5393476, false),
      j("monument", true, 3830373, false),
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
      A("red_x", true, false);

      public static final Codec<ebo.a> B = ask.a(ebo.a::values);
      private final String C;
      private final byte D;
      private final boolean E;
      private final int F;
      private final boolean G;

      private a(String $$0, boolean $$1, boolean $$2) {
         this($$0, $$1, -1, $$2);
      }

      private a(String $$0, boolean $$1, int $$2, boolean $$3) {
         this.C = $$0;
         this.G = $$3;
         this.D = (byte)this.ordinal();
         this.E = $$1;
         this.F = $$2;
      }

      public byte a() {
         return this.D;
      }

      public boolean b() {
         return this.E;
      }

      public boolean d() {
         return this.F >= 0;
      }

      public int e() {
         return this.F;
      }

      public static ebo.a a(byte $$0) {
         return values()[ars.a($$0, 0, values().length - 1)];
      }

      public boolean f() {
         return this.G;
      }

      @Override
      public String c() {
         return this.C;
      }
   }
}
