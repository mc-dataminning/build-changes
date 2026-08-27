import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqj implements cpt {
   final cqk a;
   final cmy b;
   final String c;
   final cps d;
   final boolean e;

   public cqj(String $$0, cps $$1, cqk $$2, cmy $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cqj(String $$0, cps $$1, cqk $$2, cmy $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cqg<?> ar_() {
      return cqg.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cps d() {
      return this.d;
   }

   @Override
   public cmy a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cpz> a() {
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

   public boolean a(cir $$0, ctp $$1) {
      return this.a.a($$0);
   }

   public cmy a(cir $$0, iu $$1) {
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
      iq<cpz> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cqg<cqj> {
      public static final Codec<cqj> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atw.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cps.e.fieldOf("category").orElse(cps.d).forGetter($$0x -> $$0x.d),
                  cqk.a.forGetter($$0x -> $$0x.a),
                  cmy.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  atw.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cqj::new)
      );

      @Override
      public Codec<cqj> a() {
         return x;
      }

      public cqj b(ui $$0) {
         String $$1 = $$0.s();
         cps $$2 = $$0.b(cps.class);
         cqk $$3 = cqk.b($$0);
         cmy $$4 = $$0.r();
         boolean $$5 = $$0.readBoolean();
         return new cqj($$1, $$2, $$3, $$4, $$5);
      }

      public void a(ui $$0, cqj $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
         $$0.a($$1.e);
      }
   }
}
