import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czh implements cyp {
   final czi a;
   final cuh b;
   final String c;
   final cyo d;
   final boolean e;

   public czh(String $$0, cyo $$1, czi $$2, cuh $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public czh(String $$0, cyo $$1, czi $$2, cuh $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cze<?> ao_() {
      return cze.b;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cyo d() {
      return this.d;
   }

   @Override
   public cuh a(jc.a $$0) {
      return this.b;
   }

   @Override
   public jj<cyv> a() {
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

   public boolean a(cpw $$0, dca $$1) {
      return this.a.a($$0);
   }

   public cuh a(cpw $$0, jc.a $$1) {
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
      jj<cyv> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cze<czh> {
      public static final Codec<czh> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cyo.e.fieldOf("category").orElse(cyo.d).forGetter($$0x -> $$0x.d),
                  czi.a.forGetter($$0x -> $$0x.a),
                  cuh.a.fieldOf("result").forGetter($$0x -> $$0x.b),
                  axu.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, czh::new)
      );
      public static final zc<wp, czh> A = zc.a(czh.a::a, czh.a::a);

      @Override
      public Codec<czh> a() {
         return a;
      }

      @Override
      public zc<wp, czh> b() {
         return A;
      }

      private static czh a(wp $$0) {
         String $$1 = $$0.p();
         cyo $$2 = $$0.b(cyo.class);
         czi $$3 = czi.b.decode($$0);
         cuh $$4 = cuh.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new czh($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wp $$0, czh $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         czi.b.encode($$0, $$1.a);
         cuh.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
