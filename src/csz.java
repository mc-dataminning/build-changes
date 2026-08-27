import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csz implements csj {
   final cta a;
   final cpq b;
   final String c;
   final csi d;
   final boolean e;

   public csz(String $$0, csi $$1, cta $$2, cpq $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public csz(String $$0, csi $$1, cta $$2, cpq $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public csw<?> as_() {
      return csw.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public csi d() {
      return this.d;
   }

   @Override
   public cpq a(iy $$0) {
      return this.b;
   }

   @Override
   public iu<csp> a() {
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

   public boolean a(clk $$0, cwe $$1) {
      return this.a.a($$0);
   }

   public cpq a(clk $$0, iy $$1) {
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
      iu<csp> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements csw<csz> {
      public static final Codec<csz> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avu.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  csi.e.fieldOf("category").orElse(csi.d).forGetter($$0x -> $$0x.d),
                  cta.a.forGetter($$0x -> $$0x.a),
                  cpq.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  avu.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, csz::new)
      );
      public static final xq<vd, csz> y = xq.a(csz.a::a, csz.a::a);

      @Override
      public Codec<csz> a() {
         return x;
      }

      @Override
      public xq<vd, csz> b() {
         return y;
      }

      private static csz a(vd $$0) {
         String $$1 = $$0.p();
         csi $$2 = $$0.b(csi.class);
         cta $$3 = cta.b.decode($$0);
         cpq $$4 = cpq.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new csz($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vd $$0, csz $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cta.b.encode($$0, $$1.a);
         cpq.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
