import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvq implements cva {
   final cvr a;
   final crj b;
   final String c;
   final cuz d;
   final boolean e;

   public cvq(String $$0, cuz $$1, cvr $$2, crj $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public cvq(String $$0, cuz $$1, cvr $$2, crj $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public cvn<?> ap_() {
      return cvn.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuz d() {
      return this.d;
   }

   @Override
   public crj a(iz $$0) {
      return this.b;
   }

   @Override
   public iu<cvg> a() {
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

   public boolean a(cnf $$0, cyx $$1) {
      return this.a.a($$0);
   }

   public crj a(cnf $$0, iz $$1) {
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
      iu<cvg> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   public static class a implements cvn<cvq> {
      public static final Codec<cvq> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.c),
                  cuz.e.fieldOf("category").orElse(cuz.d).forGetter($$0x -> $$0x.d),
                  cvr.a.forGetter($$0x -> $$0x.a),
                  crj.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  aws.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cvq::new)
      );
      public static final ye<vr, cvq> y = ye.a(cvq.a::a, cvq.a::a);

      @Override
      public Codec<cvq> a() {
         return x;
      }

      @Override
      public ye<vr, cvq> b() {
         return y;
      }

      private static cvq a(vr $$0) {
         String $$1 = $$0.p();
         cuz $$2 = $$0.b(cuz.class);
         cvr $$3 = cvr.b.decode($$0);
         crj $$4 = crj.f.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new cvq($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vr $$0, cvq $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         cvr.b.encode($$0, $$1.a);
         crj.f.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
