import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csm implements crw {
   final csn a;
   final cpd b;
   final String c;
   final crv d;
   final boolean e;

   public csm(String $$0, crv $$1, csn $$2, cpd $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public csm(String $$0, crv $$1, csn $$2, cpd $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public csj<?> at_() {
      return csj.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public crv d() {
      return this.d;
   }

   @Override
   public cpd a(iw $$0) {
      return this.b;
   }

   @Override
   public is<csc> a() {
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

   public boolean a(ckv $$0, cvr $$1) {
      return this.a.a($$0);
   }

   public cpd a(ckv $$0, iw $$1) {
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
      is<csc> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements csj<csm> {
      public static final Codec<csm> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avq.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  crv.e.fieldOf("category").orElse(crv.d).forGetter($$0x -> $$0x.d),
                  csn.a.forGetter($$0x -> $$0x.a),
                  cpd.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  avq.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, csm::new)
      );
      public static final xo<vb, csm> y = xo.a(csm.a::a, csm.a::a);

      @Override
      public Codec<csm> a() {
         return x;
      }

      @Override
      public xo<vb, csm> b() {
         return y;
      }

      private static csm a(vb $$0) {
         String $$1 = $$0.r();
         crv $$2 = $$0.b(crv.class);
         csn $$3 = csn.b.decode($$0);
         cpd $$4 = cpd.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new csm($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vb $$0, csm $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         csn.b.encode($$0, $$1.a);
         cpd.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
