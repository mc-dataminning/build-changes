import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctw implements ctg {
   final ctx a;
   final cqm b;
   final String c;
   final ctf d;
   final boolean e;

   public ctw(String $$0, ctf $$1, ctx $$2, cqm $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public ctw(String $$0, ctf $$1, ctx $$2, cqm $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public ctt<?> ar_() {
      return ctt.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public ctf d() {
      return this.d;
   }

   @Override
   public cqm a(iz $$0) {
      return this.b;
   }

   @Override
   public iu<ctm> a() {
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

   public boolean a(cmg $$0, cxb $$1) {
      return this.a.a($$0);
   }

   public cqm a(cmg $$0, iz $$1) {
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
      iu<ctm> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements ctt<ctw> {
      public static final Codec<ctw> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awe.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  ctf.e.fieldOf("category").orElse(ctf.d).forGetter($$0x -> $$0x.d),
                  ctx.a.forGetter($$0x -> $$0x.a),
                  cqm.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  awe.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ctw::new)
      );
      public static final xs<vf, ctw> y = xs.a(ctw.a::a, ctw.a::a);

      @Override
      public Codec<ctw> a() {
         return x;
      }

      @Override
      public xs<vf, ctw> b() {
         return y;
      }

      private static ctw a(vf $$0) {
         String $$1 = $$0.p();
         ctf $$2 = $$0.b(ctf.class);
         ctx $$3 = ctx.b.decode($$0);
         cqm $$4 = cqm.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new ctw($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vf $$0, ctw $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         ctx.b.encode($$0, $$1.a);
         cqm.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
