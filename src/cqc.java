import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqc implements cpm {
   final cqd a;
   final cmr b;
   final String c;
   final cpl d;
   final boolean e;

   public cqc(String $$0, cpl $$1, cqd $$2, cmr $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cqc(String $$0, cpl $$1, cqd $$2, cmr $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cpz<?> ar_() {
      return cpz.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cpl d() {
      return this.d;
   }

   @Override
   public cmr a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cps> a() {
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

   public boolean a(cik $$0, cti $$1) {
      return this.a.a($$0);
   }

   public cmr a(cik $$0, iu $$1) {
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
      iq<cps> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cpz<cqc> {
      public static final Codec<cqc> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atq.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cpl.e.fieldOf("category").orElse(cpl.d).forGetter($$0x -> $$0x.d),
                  cqd.a.forGetter($$0x -> $$0x.a),
                  cmr.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  atq.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cqc::new)
      );

      @Override
      public Codec<cqc> a() {
         return x;
      }

      public cqc b(ug $$0) {
         String $$1 = $$0.s();
         cpl $$2 = $$0.b(cpl.class);
         cqd $$3 = cqd.b($$0);
         cmr $$4 = $$0.r();
         boolean $$5 = $$0.readBoolean();
         return new cqc($$1, $$2, $$3, $$4, $$5);
      }

      public void a(ug $$0, cqc $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
         $$0.a($$1.e);
      }
   }
}
