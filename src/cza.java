import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cza implements cyk {
   final czb a;
   final cun b;
   final String c;
   final cyj d;
   final boolean e;

   public cza(String $$0, cyj $$1, czb $$2, cun $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cza(String $$0, cyj $$1, czb $$2, cun $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cyx<?> ap_() {
      return cyx.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cyj d() {
      return this.d;
   }

   @Override
   public cun a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyq> a() {
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

   public boolean a(cqi $$0, dbw $$1) {
      return this.a.a($$0);
   }

   public cun a(cqi $$0, jk.a $$1) {
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
      jr<cyq> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cyx<cza> {
      public static final MapCodec<cza> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cyj.e.fieldOf("category").orElse(cyj.d).forGetter($$0x -> $$0x.d),
                  czb.a.forGetter($$0x -> $$0x.a),
                  cun.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cza::new)
      );
      public static final zm<wz, cza> y = zm.a(cza.a::a, cza.a::a);

      @Override
      public MapCodec<cza> a() {
         return x;
      }

      @Override
      public zm<wz, cza> b() {
         return y;
      }

      private static cza a(wz $$0) {
         String $$1 = $$0.p();
         cyj $$2 = $$0.b(cyj.class);
         czb $$3 = czb.b.decode($$0);
         cun $$4 = cun.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cza($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wz $$0, cza $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         czb.b.encode($$0, $$1.a);
         cun.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
