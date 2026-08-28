import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czh implements cyq {
   final czi a;
   final cuq b;
   final String c;
   final cyo d;
   final boolean e;

   public czh(String $$0, cyo $$1, czi $$2, cuq $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public czh(String $$0, cyo $$1, czi $$2, cuq $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cze<?> at_() {
      return cze.a;
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
   public cuq a(jo.a $$0) {
      return this.b;
   }

   @Override
   public jv<cyw> a() {
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

   public boolean a(cyp $$0, dcw $$1) {
      return this.a.a($$0);
   }

   public cuq a(cyp $$0, jo.a $$1) {
      return this.a($$1).s();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   @Override
   public boolean i() {
      jv<cyw> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cze<czh> {
      public static final MapCodec<czh> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cyo.e.fieldOf("category").orElse(cyo.d).forGetter($$0x -> $$0x.d),
                  czi.a.forGetter($$0x -> $$0x.a),
                  cuq.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, czh::new)
      );
      public static final yx<wk, czh> y = yx.a(czh.a::a, czh.a::a);

      @Override
      public MapCodec<czh> a() {
         return x;
      }

      @Override
      public yx<wk, czh> b() {
         return y;
      }

      private static czh a(wk $$0) {
         String $$1 = $$0.p();
         cyo $$2 = $$0.b(cyo.class);
         czi $$3 = czi.b.decode($$0);
         cuq $$4 = cuq.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new czh($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wk $$0, czh $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         czi.b.encode($$0, $$1.a);
         cuq.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
