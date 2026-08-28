import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czb implements cyl {
   final czc a;
   final cuo b;
   final String c;
   final cyk d;
   final boolean e;

   public czb(String $$0, cyk $$1, czc $$2, cuo $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public czb(String $$0, cyk $$1, czc $$2, cuo $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cyy<?> ao_() {
      return cyy.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cyk d() {
      return this.d;
   }

   @Override
   public cuo a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyr> a() {
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

   public boolean a(cqj $$0, dbx $$1) {
      return this.a.a($$0);
   }

   public cuo a(cqj $$0, jk.a $$1) {
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
      jr<cyr> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cyy<czb> {
      public static final MapCodec<czb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cyk.e.fieldOf("category").orElse(cyk.d).forGetter($$0x -> $$0x.d),
                  czc.a.forGetter($$0x -> $$0x.a),
                  cuo.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, czb::new)
      );
      public static final zm<wz, czb> y = zm.a(czb.a::a, czb.a::a);

      @Override
      public MapCodec<czb> a() {
         return x;
      }

      @Override
      public zm<wz, czb> b() {
         return y;
      }

      private static czb a(wz $$0) {
         String $$1 = $$0.p();
         cyk $$2 = $$0.b(cyk.class);
         czc $$3 = czc.b.decode($$0);
         cuo $$4 = cuo.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new czb($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wz $$0, czb $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         czc.b.encode($$0, $$1.a);
         cuo.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
