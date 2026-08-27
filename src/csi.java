import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csi implements crs {
   final csj a;
   final coz b;
   final String c;
   final crr d;
   final boolean e;

   public csi(String $$0, crr $$1, csj $$2, coz $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public csi(String $$0, crr $$1, csj $$2, coz $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public csf<?> at_() {
      return csf.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public crr d() {
      return this.d;
   }

   @Override
   public coz a(iw $$0) {
      return this.b;
   }

   @Override
   public is<cry> a() {
      return this.a.c();
   }

   @Override
   public boolean h() {
      return this.e;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= this.a.a() && $$1 >= this.a.b();
   }

   public boolean a(ckr $$0, cvn $$1) {
      return this.a.a($$0);
   }

   public coz a(ckr $$0, iw $$1) {
      return this.a($$1).q();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   @Override
   public boolean i() {
      is<cry> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements csf<csi> {
      public static final Codec<csi> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avp.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  crr.e.fieldOf("category").orElse(crr.d).forGetter($$0x -> $$0x.d),
                  csj.a.forGetter($$0x -> $$0x.a),
                  coz.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  avp.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, csi::new)
      );
      public static final xo<vb, csi> y = xo.a(csi.a::a, csi.a::a);

      @Override
      public Codec<csi> a() {
         return x;
      }

      @Override
      public xo<vb, csi> b() {
         return y;
      }

      private static csi a(vb $$0) {
         String $$1 = $$0.r();
         crr $$2 = $$0.b(crr.class);
         csj $$3 = csj.b.decode($$0);
         coz $$4 = coz.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new csi($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vb $$0, csi $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         csj.b.encode($$0, $$1.a);
         coz.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
