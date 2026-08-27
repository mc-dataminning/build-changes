import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwn implements cvx {
   final cwo a;
   final csd b;
   final String c;
   final cvw d;
   final boolean e;

   public cwn(String $$0, cvw $$1, cwo $$2, csd $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cwn(String $$0, cvw $$1, cwo $$2, csd $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cwk<?> ao_() {
      return cwk.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cvw d() {
      return this.d;
   }

   @Override
   public csd a(jj $$0) {
      return this.b;
   }

   @Override
   public je<cwd> a() {
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

   public boolean a(cnx $$0, czu $$1) {
      return this.a.a($$0);
   }

   public csd a(cnx $$0, jj $$1) {
      return this.a($$1).r();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   @Override
   public boolean i() {
      je<cwd> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cwk<cwn> {
      public static final Codec<cwn> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cvw.e.fieldOf("category").orElse(cvw.d).forGetter($$0x -> $$0x.d),
                  cwo.a.forGetter($$0x -> $$0x.a),
                  csd.a.fieldOf("result").forGetter($$0x -> $$0x.b),
                  axe.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cwn::new)
      );
      public static final yq<wd, cwn> y = yq.a(cwn.a::a, cwn.a::a);

      @Override
      public Codec<cwn> a() {
         return x;
      }

      @Override
      public yq<wd, cwn> b() {
         return y;
      }

      private static cwn a(wd $$0) {
         String $$1 = $$0.p();
         cvw $$2 = $$0.b(cvw.class);
         cwo $$3 = cwo.b.decode($$0);
         csd $$4 = csd.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cwn($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wd $$0, cwn $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cwo.b.encode($$0, $$1.a);
         csd.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
