import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqi implements cps {
   final cqj a;
   final cmx b;
   final String c;
   final cpr d;
   final boolean e;

   public cqi(String $$0, cpr $$1, cqj $$2, cmx $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cqi(String $$0, cpr $$1, cqj $$2, cmx $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cqf<?> ar_() {
      return cqf.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cpr d() {
      return this.d;
   }

   @Override
   public cmx a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cpy> a() {
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

   public boolean a(ciq $$0, cto $$1) {
      return this.a.a($$0);
   }

   public cmx a(ciq $$0, iu $$1) {
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
      iq<cpy> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cqf<cqi> {
      public static final Codec<cqi> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cpr.e.fieldOf("category").orElse(cpr.d).forGetter($$0x -> $$0x.d),
                  cqj.a.forGetter($$0x -> $$0x.a),
                  cmx.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  atv.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cqi::new)
      );

      @Override
      public Codec<cqi> a() {
         return x;
      }

      public cqi b(ui $$0) {
         String $$1 = $$0.s();
         cpr $$2 = $$0.b(cpr.class);
         cqj $$3 = cqj.b($$0);
         cmx $$4 = $$0.r();
         boolean $$5 = $$0.readBoolean();
         return new cqi($$1, $$2, $$3, $$4, $$5);
      }

      public void a(ui $$0, cqi $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
         $$0.a($$1.e);
      }
   }
}
