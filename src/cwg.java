import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cwg implements cvs<bny> {
   protected final cvp a;
   protected final crs b;
   private final cvx<?> d;
   private final cvw<?> e;
   protected final String c;

   public cwg(cvx<?> $$0, cvw<?> $$1, String $$2, cvp $$3, crs $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cvx<?> e() {
      return this.d;
   }

   @Override
   public cvw<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public crs a(jb $$0) {
      return this.b;
   }

   @Override
   public iw<cvp> a() {
      iw<cvp> $$0 = iw.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public crs a(bny $$0, jb $$1) {
      return this.b.r();
   }

   public interface a<T extends cwg> {
      T create(String var1, cvp var2, crs var3);
   }

   public static class b<T extends cwg> implements cvw<T> {
      final cwg.a<T> x;
      private final Codec<T> y;
      private final yg<vt, T> z;

      protected b(cwg.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     awu.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cvp.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     crs.a.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = yg.a(ye.k, $$0x -> $$0x.c, cvp.b, $$0x -> $$0x.a, crs.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      @Override
      public yg<vt, T> b() {
         return this.z;
      }
   }
}
