import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctu implements cte {
   final ctv a;
   final cqk b;
   final String c;
   final ctd d;
   final boolean e;

   public ctu(String $$0, ctd $$1, ctv $$2, cqk $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public ctu(String $$0, ctd $$1, ctv $$2, cqk $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public ctr<?> ar_() {
      return ctr.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public ctd d() {
      return this.d;
   }

   @Override
   public cqk a(iz $$0) {
      return this.b;
   }

   @Override
   public iu<ctk> a() {
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

   public boolean a(cme $$0, cwz $$1) {
      return this.a.a($$0);
   }

   public cqk a(cme $$0, iz $$1) {
      return this.a($$1).q();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   @Override
   public boolean i() {
      iu<ctk> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements ctr<ctu> {
      public static final Codec<ctu> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awe.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  ctd.e.fieldOf("category").orElse(ctd.d).forGetter($$0x -> $$0x.d),
                  ctv.a.forGetter($$0x -> $$0x.a),
                  cqk.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  awe.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ctu::new)
      );
      public static final xs<vf, ctu> y = xs.a(ctu.a::a, ctu.a::a);

      @Override
      public Codec<ctu> a() {
         return x;
      }

      @Override
      public xs<vf, ctu> b() {
         return y;
      }

      private static ctu a(vf $$0) {
         String $$1 = $$0.p();
         ctd $$2 = $$0.b(ctd.class);
         ctv $$3 = ctv.b.decode($$0);
         cqk $$4 = cqk.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new ctu($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vf $$0, ctu $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         ctv.b.encode($$0, $$1.a);
         cqk.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
