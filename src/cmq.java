import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cmq implements cme<bgm> {
   protected final cmb a;
   protected final cja b;
   private final cmi<?> d;
   private final cmh<?> e;
   protected final String c;

   public cmq(cmi<?> $$0, cmh<?> $$1, String $$2, cmb $$3, cja $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cmi<?> e() {
      return this.d;
   }

   @Override
   public cmh<?> ai_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cja a(hu $$0) {
      return this.b;
   }

   @Override
   public hp<cmb> a() {
      hp<cmb> $$0 = hp.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cja a(bgm $$0, hu $$1) {
      return this.b.p();
   }

   public static class a<T extends cmq> implements cmh<T> {
      final cmq.a.a<T> x;
      private final Codec<T> y;

      protected a(cmq.a.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     arb.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cmb.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
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

      public T b(sl $$0) {
         String $$1 = $$0.r();
         cmb $$2 = cmb.b($$0);
         cja $$3 = $$0.q();
         return this.x.create($$1, $$2, $$3.d(), $$3.L());
      }

      public void a(sl $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cmq> {
         T create(String var1, cmb var2, civ var3, int var4);
      }
   }
}
