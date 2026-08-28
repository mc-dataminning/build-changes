import java.util.List;

public record aed(List<aed.a> b, boolean c) implements zc<abr> {
   public static final yt<wg, aed> a = yt.a(aed.a.c.a(yr.a()), aed::b, yr.b, aed::e, aed::new);

   @Override
   public ze<aed> a() {
      return agk.ak;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(dds d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final yt<wg, aed.a> c = yt.a(dds.a, aed.a::c, yr.c, aed.a::d, aed.a::new);

      public a(dds $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dds c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
