import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyq implements cxz {
   final cyr a;
   final cuc b;
   final String c;
   final cxx d;
   final boolean e;

   public cyq(String $$0, cxx $$1, cyr $$2, cuc $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cyq(String $$0, cxx $$1, cyr $$2, cuc $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cyn<?> ap_() {
      return cyn.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cxx d() {
      return this.d;
   }

   @Override
   public cuc a(jl.a $$0) {
      return this.b;
   }

   @Override
   public js<cyf> a() {
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

   public boolean a(cxy $$0, dcf $$1) {
      return this.a.a($$0);
   }

   public cuc a(cxy $$0, jl.a $$1) {
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
      js<cyf> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cyn<cyq> {
      public static final MapCodec<cyq> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cxx.e.fieldOf("category").orElse(cxx.d).forGetter($$0x -> $$0x.d),
                  cyr.a.forGetter($$0x -> $$0x.a),
                  cuc.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cyq::new)
      );
      public static final ys<wf, cyq> y = ys.a(cyq.a::a, cyq.a::a);

      @Override
      public MapCodec<cyq> a() {
         return x;
      }

      @Override
      public ys<wf, cyq> b() {
         return y;
      }

      private static cyq a(wf $$0) {
         String $$1 = $$0.p();
         cxx $$2 = $$0.b(cxx.class);
         cyr $$3 = cyr.b.decode($$0);
         cuc $$4 = cuc.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cyq($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wf $$0, cyq $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cyr.b.encode($$0, $$1.a);
         cuc.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
