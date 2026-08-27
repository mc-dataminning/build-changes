import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxk implements cwu {
   final cxl a;
   final csz b;
   final String c;
   final cwt d;
   final boolean e;

   public cxk(String $$0, cwt $$1, cxl $$2, csz $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cxk(String $$0, cwt $$1, cxl $$2, csz $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cxh<?> ao_() {
      return cxh.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cwt d() {
      return this.d;
   }

   @Override
   public csz a(iy.a $$0) {
      return this.b;
   }

   @Override
   public jf<cxa> a() {
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

   public boolean a(cou $$0, dad $$1) {
      return this.a.a($$0);
   }

   public csz a(cou $$0, iy.a $$1) {
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
      jf<cxa> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cxh<cxk> {
      public static final Codec<cxk> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cwt.e.fieldOf("category").orElse(cwt.d).forGetter($$0x -> $$0x.d),
                  cxl.a.forGetter($$0x -> $$0x.a),
                  csz.a.fieldOf("result").forGetter($$0x -> $$0x.b),
                  axh.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cxk::new)
      );
      public static final ys<wf, cxk> y = ys.a(cxk.a::a, cxk.a::a);

      @Override
      public Codec<cxk> a() {
         return x;
      }

      @Override
      public ys<wf, cxk> b() {
         return y;
      }

      private static cxk a(wf $$0) {
         String $$1 = $$0.p();
         cwt $$2 = $$0.b(cwt.class);
         cxl $$3 = cxl.b.decode($$0);
         csz $$4 = csz.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cxk($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wf $$0, cxk $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cxl.b.encode($$0, $$1.a);
         csz.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
