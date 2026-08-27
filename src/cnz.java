import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cnz implements cnn<bhu> {
   protected final cnk a;
   protected final ckj b;
   private final cnr<?> d;
   private final cnq<?> e;
   protected final String c;

   public cnz(cnr<?> $$0, cnq<?> $$1, String $$2, cnk $$3, ckj $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cnr<?> e() {
      return this.d;
   }

   @Override
   public cnq<?> aq_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public ckj a(ip $$0) {
      return this.b;
   }

   @Override
   public il<cnk> a() {
      il<cnk> $$0 = il.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public ckj a(bhu $$0, ip $$1) {
      return this.b.p();
   }

   public static class a<T extends cnz> implements cnq<T> {
      private static final MapCodec<ckj> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(jy.i.q().fieldOf("result").forGetter(ckj::d), Codec.INT.fieldOf("count").forGetter(ckj::L)).apply($$0, ckj::new)
      );
      final cnz.a.a<T> x;
      private final Codec<T> z;

      protected a(cnz.a.a<T> $$0) {
         this.x = $$0;
         this.z = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     asg.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cnk.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     y.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.z;
      }

      public T b(tl $$0) {
         String $$1 = $$0.s();
         cnk $$2 = cnk.b($$0);
         ckj $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(tl $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cnz> {
         T create(String var1, cnk var2, ckj var3);
      }
   }
}
