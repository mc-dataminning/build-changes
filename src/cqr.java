import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqr implements cqb {
   final cqs a;
   final cng b;
   final String c;
   final cqa d;
   final boolean e;

   public cqr(String $$0, cqa $$1, cqs $$2, cng $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cqr(String $$0, cqa $$1, cqs $$2, cng $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cqo<?> at_() {
      return cqo.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cqa d() {
      return this.d;
   }

   @Override
   public cng a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cqh> a() {
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

   public boolean a(ciz $$0, ctx $$1) {
      return this.a.a($$0);
   }

   public cng a(ciz $$0, iu $$1) {
      return this.a($$1).p();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   @Override
   public boolean i() {
      iq<cqh> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cqo<cqr> {
      public static final Codec<cqr> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atx.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cqa.e.fieldOf("category").orElse(cqa.d).forGetter($$0x -> $$0x.d),
                  cqs.a.forGetter($$0x -> $$0x.a),
                  cng.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  atx.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cqr::new)
      );

      @Override
      public Codec<cqr> a() {
         return x;
      }

      public cqr b(uj $$0) {
         String $$1 = $$0.s();
         cqa $$2 = $$0.b(cqa.class);
         cqs $$3 = cqs.b($$0);
         cng $$4 = $$0.r();
         boolean $$5 = $$0.readBoolean();
         return new cqr($$1, $$2, $$3, $$4, $$5);
      }

      public void a(uj $$0, cqr $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
         $$0.a($$1.e);
      }
   }
}
