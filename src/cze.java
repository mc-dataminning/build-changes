import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cze implements cyo {
   final czf a;
   final cur b;
   final String c;
   final cyn d;
   final boolean e;

   public cze(String $$0, cyn $$1, czf $$2, cur $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cze(String $$0, cyn $$1, czf $$2, cur $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public czb<?> ao_() {
      return czb.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cyn d() {
      return this.d;
   }

   @Override
   public cur a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyu> a() {
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

   public boolean a(cqm $$0, dca $$1) {
      return this.a.a($$0);
   }

   public cur a(cqm $$0, jk.a $$1) {
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
      jr<cyu> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements czb<cze> {
      public static final MapCodec<cze> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cyn.e.fieldOf("category").orElse(cyn.d).forGetter($$0x -> $$0x.d),
                  czf.a.forGetter($$0x -> $$0x.a),
                  cur.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cze::new)
      );
      public static final zn<xa, cze> y = zn.a(cze.a::a, cze.a::a);

      @Override
      public MapCodec<cze> a() {
         return x;
      }

      @Override
      public zn<xa, cze> b() {
         return y;
      }

      private static cze a(xa $$0) {
         String $$1 = $$0.p();
         cyn $$2 = $$0.b(cyn.class);
         czf $$3 = czf.b.decode($$0);
         cur $$4 = cur.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cze($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(xa $$0, cze $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         czf.b.encode($$0, $$1.a);
         cur.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
