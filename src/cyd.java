import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyd implements cxn {
   final cye a;
   final ctq b;
   final String c;
   final cxm d;
   final boolean e;

   public cyd(String $$0, cxm $$1, cye $$2, ctq $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cyd(String $$0, cxm $$1, cye $$2, ctq $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cya<?> ap_() {
      return cya.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cxm d() {
      return this.d;
   }

   @Override
   public ctq a(iz.a $$0) {
      return this.b;
   }

   @Override
   public jg<cxt> a() {
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

   public boolean a(cpl $$0, daz $$1) {
      return this.a.a($$0);
   }

   public ctq a(cpl $$0, iz.a $$1) {
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
      jg<cxt> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cya<cyd> {
      public static final MapCodec<cyd> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cxm.e.fieldOf("category").orElse(cxm.d).forGetter($$0x -> $$0x.d),
                  cye.a.forGetter($$0x -> $$0x.a),
                  ctq.a.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cyd::new)
      );
      public static final yv<wi, cyd> y = yv.a(cyd.a::a, cyd.a::a);

      @Override
      public MapCodec<cyd> a() {
         return x;
      }

      @Override
      public yv<wi, cyd> b() {
         return y;
      }

      private static cyd a(wi $$0) {
         String $$1 = $$0.p();
         cxm $$2 = $$0.b(cxm.class);
         cye $$3 = cye.b.decode($$0);
         ctq $$4 = ctq.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cyd($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wi $$0, cyd $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cye.b.encode($$0, $$1.a);
         ctq.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
