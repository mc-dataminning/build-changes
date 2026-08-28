import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyx implements cyh {
   final cyy a;
   final cuk b;
   final String c;
   final cyg d;
   final boolean e;

   public cyx(String $$0, cyg $$1, cyy $$2, cuk $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cyx(String $$0, cyg $$1, cyy $$2, cuk $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cyu<?> ap_() {
      return cyu.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cyg d() {
      return this.d;
   }

   @Override
   public cuk a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyn> a() {
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

   public boolean a(cqf $$0, dbt $$1) {
      return this.a.a($$0);
   }

   public cuk a(cqf $$0, jk.a $$1) {
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
      jr<cyn> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cyu<cyx> {
      public static final MapCodec<cyx> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cyg.e.fieldOf("category").orElse(cyg.d).forGetter($$0x -> $$0x.d),
                  cyy.a.forGetter($$0x -> $$0x.a),
                  cuk.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cyx::new)
      );
      public static final zj<ww, cyx> y = zj.a(cyx.a::a, cyx.a::a);

      @Override
      public MapCodec<cyx> a() {
         return x;
      }

      @Override
      public zj<ww, cyx> b() {
         return y;
      }

      private static cyx a(ww $$0) {
         String $$1 = $$0.p();
         cyg $$2 = $$0.b(cyg.class);
         cyy $$3 = cyy.b.decode($$0);
         cuk $$4 = cuk.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cyx($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(ww $$0, cyx $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cyy.b.encode($$0, $$1.a);
         cuk.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
