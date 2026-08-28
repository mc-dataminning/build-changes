import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czf implements cyo {
   final czg a;
   final cuo b;
   final String c;
   final cym d;
   final boolean e;

   public czf(String $$0, cym $$1, czg $$2, cuo $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public czf(String $$0, cym $$1, czg $$2, cuo $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public czc<?> ap_() {
      return czc.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cym d() {
      return this.d;
   }

   @Override
   public cuo a(jo.a $$0) {
      return this.b;
   }

   @Override
   public jv<cyu> a() {
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

   public boolean a(cyn $$0, dcu $$1) {
      return this.a.a($$0);
   }

   public cuo a(cyn $$0, jo.a $$1) {
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
      jv<cyu> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements czc<czf> {
      public static final MapCodec<czf> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cym.e.fieldOf("category").orElse(cym.d).forGetter($$0x -> $$0x.d),
                  czg.a.forGetter($$0x -> $$0x.a),
                  cuo.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, czf::new)
      );
      public static final yw<wj, czf> y = yw.a(czf.a::a, czf.a::a);

      @Override
      public MapCodec<czf> a() {
         return x;
      }

      @Override
      public yw<wj, czf> b() {
         return y;
      }

      private static czf a(wj $$0) {
         String $$1 = $$0.p();
         cym $$2 = $$0.b(cym.class);
         czg $$3 = czg.b.decode($$0);
         cuo $$4 = cuo.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new czf($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wj $$0, czf $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         czg.b.encode($$0, $$1.a);
         cuo.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
