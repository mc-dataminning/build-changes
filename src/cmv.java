import com.mojang.serialization.Codec;
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
   public cjf a(hu $$0) {
      return this.b;
   }

   @Override
   public hp<cmg> a() {
      hp<cmg> $$0 = hp.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cjf a(bgr $$0, hu $$1) {
      return this.b.p();
   }

   public static class a<T extends cmv> implements cmm<T> {
      final cmv.a.a<T> x;
      private final Codec<T> y;

      protected a(cmv.a.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     arg.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cmg.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     jd.i.q().fieldOf("result").forGetter($$0xx -> $$0xx.b.d()),
                     Codec.INT.fieldOf("count").forGetter($$0xx -> $$0xx.b.L())
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      public T b(so $$0) {
         String $$1 = $$0.r();
         cmg $$2 = cmg.b($$0);
         cjf $$3 = $$0.q();
         return this.x.create($$1, $$2, $$3.d(), $$3.L());
      }

      public void a(so $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cmv> {
         T create(String var1, cmg var2, cja var3, int var4);
      }
   }
}
