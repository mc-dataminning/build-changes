import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cps implements cpc {
   final cpt a;
   final cmh b;
   final String c;
   final cpb d;
   final boolean e;

   public cps(String $$0, cpb $$1, cpt $$2, cmh $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cps(String $$0, cpb $$1, cpt $$2, cmh $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cpp<?> ar_() {
      return cpp.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cpb d() {
      return this.d;
   }

   @Override
   public cmh a(is $$0) {
      return this.b;
   }

   @Override
   public io<cpi> a() {
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

   public boolean a(cia $$0, csy $$1) {
      return this.a.a($$0);
   }

   public cmh a(cia $$0, is $$1) {
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
      io<cpi> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cpp<cps> {
      public static final Codec<cps> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atg.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cpb.e.fieldOf("category").orElse(cpb.d).forGetter($$0x -> $$0x.d),
                  cpt.a.forGetter($$0x -> $$0x.a),
                  cmh.c.fieldOf("result").forGetter($$0x -> $$0x.b),
                  atg.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cps::new)
      );

      @Override
      public Codec<cps> a() {
         return x;
      }

      public cps b(ue $$0) {
         String $$1 = $$0.s();
         cpb $$2 = $$0.b(cpb.class);
         cpt $$3 = cpt.b($$0);
         cmh $$4 = $$0.r();
         boolean $$5 = $$0.readBoolean();
         return new cps($$1, $$2, $$3, $$4, $$5);
      }

      public void a(ue $$0, cps $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
         $$0.a($$1.e);
      }
   }
}
