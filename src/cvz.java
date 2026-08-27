import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvz implements cvj {
   final cwa a;
   final crs b;
   final String c;
   final cvi d;
   final boolean e;

   public cvz(String $$0, cvi $$1, cwa $$2, crs $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cvz(String $$0, cvi $$1, cwa $$2, crs $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cvw<?> ao_() {
      return cvw.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cvi d() {
      return this.d;
   }

   @Override
   public crs a(jb $$0) {
      return this.b;
   }

   @Override
   public iw<cvp> a() {
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

   public boolean a(cnm $$0, czg $$1) {
      return this.a.a($$0);
   }

   public crs a(cnm $$0, jb $$1) {
      return this.a($$1).r();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   @Override
   public boolean i() {
      iw<cvp> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cvw<cvz> {
      public static final Codec<cvz> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cvi.e.fieldOf("category").orElse(cvi.d).forGetter($$0x -> $$0x.d),
                  cwa.a.forGetter($$0x -> $$0x.a),
                  crs.a.fieldOf("result").forGetter($$0x -> $$0x.b),
                  awu.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cvz::new)
      );
      public static final yg<vt, cvz> y = yg.a(cvz.a::a, cvz.a::a);

      @Override
      public Codec<cvz> a() {
         return x;
      }

      @Override
      public yg<vt, cvz> b() {
         return y;
      }

      private static cvz a(vt $$0) {
         String $$1 = $$0.p();
         cvi $$2 = $$0.b(cvi.class);
         cwa $$3 = cwa.b.decode($$0);
         crs $$4 = crs.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cvz($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vt $$0, cvz $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cwa.b.encode($$0, $$1.a);
         crs.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
