import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cmx implements cml<bgt> {
   protected final cmi a;
   protected final cjh b;
   private final cmp<?> d;
   private final cmo<?> e;
   protected final String c;

   public cmx(cmp<?> $$0, cmo<?> $$1, String $$2, cmi $$3, cjh $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cmp<?> e() {
      return this.d;
   }

   @Override
   public cmo<?> an_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cjh a(hu $$0) {
      return this.b;
   }

   @Override
   public hp<cmi> a() {
      hp<cmi> $$0 = hp.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cjh a(bgt $$0, hu $$1) {
      return this.b.p();
   }

   public static class a<T extends cmx> implements cmo<T> {
      private static final MapCodec<cjh> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(jd.i.q().fieldOf("result").forGetter(cjh::d), Codec.INT.fieldOf("count").forGetter(cjh::L)).apply($$0, cjh::new)
      );
      final cmx.a.a<T> x;
      private final Codec<T> z;

      protected a(cmx.a.a<T> $$0) {
         this.x = $$0;
         this.z = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     arh.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cmi.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     y.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.z;
      }

      public T b(sq $$0) {
         String $$1 = $$0.r();
         cmi $$2 = cmi.b($$0);
         cjh $$3 = $$0.q();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(sq $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cmx> {
         T create(String var1, cmi var2, cjh var3);
      }
   }
}
