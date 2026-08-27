import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cwu implements cwg<boj> {
   protected final cwd a;
   protected final csd b;
   private final cwl<?> d;
   private final cwk<?> e;
   protected final String c;

   public cwu(cwl<?> $$0, cwk<?> $$1, String $$2, cwd $$3, csd $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cwl<?> e() {
      return this.d;
   }

   @Override
   public cwk<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public csd a(jj $$0) {
      return this.b;
   }

   @Override
   public je<cwd> a() {
      je<cwd> $$0 = je.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public csd a(boj $$0, jj $$1) {
      return this.b.r();
   }

   public interface a<T extends cwu> {
      T create(String var1, cwd var2, csd var3);
   }

   public static class b<T extends cwu> implements cwk<T> {
      final cwu.a<T> x;
      private final Codec<T> y;
      private final yq<wd, T> z;

      protected b(cwu.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     axe.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cwd.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     csd.a.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = yq.a(yo.k, $$0x -> $$0x.c, cwd.b, $$0x -> $$0x.a, csd.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      @Override
      public yq<wd, T> b() {
         return this.z;
      }
   }
}
