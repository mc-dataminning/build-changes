import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyr implements cya {
   final cys a;
   final cud b;
   final String c;
   final cxy d;
   final boolean e;

   public cyr(String $$0, cxy $$1, cys $$2, cud $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cyr(String $$0, cxy $$1, cys $$2, cud $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cyo<?> ap_() {
      return cyo.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cxy d() {
      return this.d;
   }

   @Override
   public cud a(jl.a $$0) {
      return this.b;
   }

   @Override
   public js<cyg> a() {
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

   public boolean a(cxz $$0, dcg $$1) {
      return this.a.a($$0);
   }

   public cud a(cxz $$0, jl.a $$1) {
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
      js<cyg> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cyo<cyr> {
      public static final MapCodec<cyr> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cxy.e.fieldOf("category").orElse(cxy.d).forGetter($$0x -> $$0x.d),
                  cys.a.forGetter($$0x -> $$0x.a),
                  cud.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cyr::new)
      );
      public static final ys<wf, cyr> y = ys.a(cyr.a::a, cyr.a::a);

      @Override
      public MapCodec<cyr> a() {
         return x;
      }

      @Override
      public ys<wf, cyr> b() {
         return y;
      }

      private static cyr a(wf $$0) {
         String $$1 = $$0.p();
         cxy $$2 = $$0.b(cxy.class);
         cys $$3 = cys.b.decode($$0);
         cud $$4 = cud.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cyr($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wf $$0, cyr $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cys.b.encode($$0, $$1.a);
         cud.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
