import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyo implements cxx {
   final cyp a;
   final cua b;
   final String c;
   final cxv d;
   final boolean e;

   public cyo(String $$0, cxv $$1, cyp $$2, cua $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cyo(String $$0, cxv $$1, cyp $$2, cua $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cyl<?> ap_() {
      return cyl.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cxv d() {
      return this.d;
   }

   @Override
   public cua a(jl.a $$0) {
      return this.b;
   }

   @Override
   public js<cyd> a() {
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

   public boolean a(cxw $$0, dcd $$1) {
      return this.a.a($$0);
   }

   public cua a(cxw $$0, jl.a $$1) {
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
      js<cyd> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cyl<cyo> {
      public static final MapCodec<cyo> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cxv.e.fieldOf("category").orElse(cxv.d).forGetter($$0x -> $$0x.d),
                  cyp.a.forGetter($$0x -> $$0x.a),
                  cua.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cyo::new)
      );
      public static final ys<wf, cyo> y = ys.a(cyo.a::a, cyo.a::a);

      @Override
      public MapCodec<cyo> a() {
         return x;
      }

      @Override
      public ys<wf, cyo> b() {
         return y;
      }

      private static cyo a(wf $$0) {
         String $$1 = $$0.p();
         cxv $$2 = $$0.b(cxv.class);
         cyp $$3 = cyp.b.decode($$0);
         cua $$4 = cua.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cyo($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wf $$0, cyo $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cyp.b.encode($$0, $$1.a);
         cua.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
