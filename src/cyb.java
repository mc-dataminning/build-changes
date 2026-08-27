import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyb implements cxl {
   final cyc a;
   final cto b;
   final String c;
   final cxk d;
   final boolean e;

   public cyb(String $$0, cxk $$1, cyc $$2, cto $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cyb(String $$0, cxk $$1, cyc $$2, cto $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cxy<?> ao_() {
      return cxy.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cxk d() {
      return this.d;
   }

   @Override
   public cto a(iz.a $$0) {
      return this.b;
   }

   @Override
   public jg<cxr> a() {
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

   public boolean a(cpj $$0, dax $$1) {
      return this.a.a($$0);
   }

   public cto a(cpj $$0, iz.a $$1) {
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
      jg<cxr> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cxy<cyb> {
      public static final MapCodec<cyb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cxk.e.fieldOf("category").orElse(cxk.d).forGetter($$0x -> $$0x.d),
                  cyc.a.forGetter($$0x -> $$0x.a),
                  cto.a.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cyb::new)
      );
      public static final yv<wi, cyb> y = yv.a(cyb.a::a, cyb.a::a);

      @Override
      public MapCodec<cyb> a() {
         return x;
      }

      @Override
      public yv<wi, cyb> b() {
         return y;
      }

      private static cyb a(wi $$0) {
         String $$1 = $$0.p();
         cxk $$2 = $$0.b(cxk.class);
         cyc $$3 = cyc.b.decode($$0);
         cto $$4 = cto.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cyb($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wi $$0, cyb $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cyc.b.encode($$0, $$1.a);
         cto.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
