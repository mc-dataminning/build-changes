import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cmv implements cmj<bgr> {
   protected final cmg a;
   protected final cjf b;
   private final cmn<?> d;
   private final cmm<?> e;
   protected final String c;

   public cmv(cmn<?> $$0, cmm<?> $$1, String $$2, cmg $$3, cjf $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cmn<?> e() {
      return this.d;
   }

   @Override
   public cmm<?> an_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cjf a(hr $$0) {
      return this.b;
   }

   @Override
   public hn<cmg> a() {
      hn<cmg> $$0 = hn.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cjf a(bgr $$0, hr $$1) {
      return this.b.p();
   }

   public static class a<T extends cmv> implements cmm<T> {
      private static final MapCodec<cjf> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(jb.i.q().fieldOf("result").forGetter(cjf::d), Codec.INT.fieldOf("count").forGetter(cjf::L)).apply($$0, cjf::new)
      );
      final cmv.a.a<T> x;
      private final Codec<T> z;

      protected a(cmv.a.a<T> $$0) {
         this.x = $$0;
         this.z = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     arf.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cmg.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     y.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.z;
      }

      public T b(so $$0) {
         String $$1 = $$0.r();
         cmg $$2 = cmg.b($$0);
         cjf $$3 = $$0.q();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(so $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cmv> {
         T create(String var1, cmg var2, cjf var3);
      }
   }
}
