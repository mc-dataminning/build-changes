import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czc implements cym {
   final czd a;
   final cup b;
   final String c;
   final cyl d;
   final boolean e;

   public czc(String $$0, cyl $$1, czd $$2, cup $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public czc(String $$0, cyl $$1, czd $$2, cup $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cyz<?> ao_() {
      return cyz.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cyl d() {
      return this.d;
   }

   @Override
   public cup a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cys> a() {
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

   public boolean a(cqk $$0, dby $$1) {
      return this.a.a($$0);
   }

   public cup a(cqk $$0, jk.a $$1) {
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
      jr<cys> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cyz<czc> {
      public static final MapCodec<czc> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cyl.e.fieldOf("category").orElse(cyl.d).forGetter($$0x -> $$0x.d),
                  czd.a.forGetter($$0x -> $$0x.a),
                  cup.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, czc::new)
      );
      public static final zn<xa, czc> y = zn.a(czc.a::a, czc.a::a);

      @Override
      public MapCodec<czc> a() {
         return x;
      }

      @Override
      public zn<xa, czc> b() {
         return y;
      }

      private static czc a(xa $$0) {
         String $$1 = $$0.p();
         cyl $$2 = $$0.b(cyl.class);
         czd $$3 = czd.b.decode($$0);
         cup $$4 = cup.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new czc($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(xa $$0, czc $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         czd.b.encode($$0, $$1.a);
         cup.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
