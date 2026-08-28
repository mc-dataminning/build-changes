import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czd implements cyn {
   final cze a;
   final cuq b;
   final String c;
   final cym d;
   final boolean e;

   public czd(String $$0, cym $$1, cze $$2, cuq $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public czd(String $$0, cym $$1, cze $$2, cuq $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cza<?> ao_() {
      return cza.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cym d() {
      return this.d;
   }

   @Override
   public cuq a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyt> a() {
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

   public boolean a(cql $$0, dbz $$1) {
      return this.a.a($$0);
   }

   public cuq a(cql $$0, jk.a $$1) {
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
      jr<cyt> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cza<czd> {
      public static final MapCodec<czd> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  cym.e.fieldOf("category").orElse(cym.d).forGetter($$0x -> $$0x.d),
                  cze.a.forGetter($$0x -> $$0x.a),
                  cuq.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, czd::new)
      );
      public static final zn<xa, czd> y = zn.a(czd.a::a, czd.a::a);

      @Override
      public MapCodec<czd> a() {
         return x;
      }

      @Override
      public zn<xa, czd> b() {
         return y;
      }

      private static czd a(xa $$0) {
         String $$1 = $$0.p();
         cym $$2 = $$0.b(cym.class);
         cze $$3 = cze.b.decode($$0);
         cuq $$4 = cuq.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new czd($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(xa $$0, czd $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cze.b.encode($$0, $$1.a);
         cuq.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
